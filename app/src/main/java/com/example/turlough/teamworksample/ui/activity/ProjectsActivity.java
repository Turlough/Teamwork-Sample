package com.example.turlough.teamworksample.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.turlough.teamworksample.R;
import com.example.turlough.teamworksample.api.RemoteEntity;
import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.entity.Projects;
import com.example.turlough.teamworksample.ui.adapter.ProjectAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ProjectsActivity extends AppCompatActivity {

    TextView tvStatus;
    Spinner projectsSpinner;
    ProjectAdapter dataAdapter;

    String key;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamwork);

        init();
        loadProjects();
    }

    private void init() {

        key = getString(R.string.api_key);
        url = getString(R.string.api_url);

        tvStatus = (TextView)findViewById(R.id.tvMessage);
        projectsSpinner = (Spinner)findViewById(R.id.projects_spinner);

        dataAdapter = new ProjectAdapter(this,  new ArrayList<Project>());
        dataAdapter.setDropDownViewResource(R.layout.project_spinner_item);
        projectsSpinner.setAdapter(dataAdapter);
    }

    private void loadProjects() {

        Observable<Projects> projectObservable = Observable.fromCallable(new Callable<Projects>() {
            @Override
            public Projects call() {
                return new RemoteEntity(key, url).fetchProjects();
            }
        });

        projectObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Projects>() {

            @Override
            public void onCompleted() { }

            @Override
            public void onError(Throwable e) { }

            @Override
            public void onNext(Projects projects) {

                tvStatus.setText(projects.getStatus());

                dataAdapter.clear();
                dataAdapter.addAll(Arrays.asList(projects.getProjects()));
                dataAdapter.notifyDataSetChanged();
            }
        });
    }

}
