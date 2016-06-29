package com.example.turlough.teamworksample.ui.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turlough.teamworksample.R;
import com.example.turlough.teamworksample.api.RemoteEntity;
import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.entity.Projects;
import com.example.turlough.teamworksample.ui.adapter.ProjectAdapter;

import java.util.ArrayList;
import java.util.Arrays;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ProjectsActivity extends AppCompatActivity implements ProjectButtonListener {

    private TextView tvStatus;
    private ListView projectsSpinner;
    private ProjectAdapter dataAdapter;
    private ProgressDialog progress;

    private String key;
    private String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        init();
        loadProjects();
    }

    private void init() {

        key = getString(R.string.api_key);
        url = getString(R.string.api_url);

        tvStatus = (TextView) findViewById(R.id.tvStatus);
        projectsSpinner = (ListView) findViewById(R.id.projects_spinner);

        dataAdapter = new ProjectAdapter(this, new ArrayList<>(), this);
        dataAdapter.setDropDownViewResource(R.layout.project_spinner_item);
        projectsSpinner.setAdapter(dataAdapter);

        progress = new ProgressDialog(this);
        progress.setMessage(getString(R.string.please_wait));
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.refresh_button);
        fab.setOnClickListener( View -> refreshProjectList() );
    }

    private void refreshProjectList() {

        progress.show();
        tvStatus.setText(getString(R.string.please_wait));
        dataAdapter.clear();
        dataAdapter.notifyDataSetChanged();

        loadProjects();
    }

    private void loadProjects() {

        Observable.fromCallable(() -> new RemoteEntity(key, url).fetchProjects())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Projects>() {

                    @Override
                    public void onCompleted() {
                        progress.hide();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(@NonNull Projects projects) {

                        tvStatus.setText(projects.getStatus());

                        dataAdapter.clear();
                        dataAdapter.addAll(Arrays.asList(projects.getProjects()));
                        dataAdapter.notifyDataSetChanged();
                    }
                });
    }

    @Override
    public void onTasksClicked(int projectId) {

        Intent intent = new Intent(this, TasksActivity.class);
        Bundle b = new Bundle();
        b.putInt(Project.PROJECT_ID_EXTRA, projectId);
        intent.putExtras(b);
        startActivity(intent);
    }

    @Override
    public void onMessagesClicked(int projectId) {

        Intent intent = new Intent(this, MessagesActivity.class);
        Bundle b = new Bundle();
        b.putInt(Project.PROJECT_ID_EXTRA, projectId);
        intent.putExtras(b);
        startActivity(intent);
    }
    void toast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}
