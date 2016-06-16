package com.example.turlough.teamworksample.ui.activity;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.turlough.teamworksample.R;
import com.example.turlough.teamworksample.api.RemoteEntity;
import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.entity.Projects;
import com.example.turlough.teamworksample.ui.adapter.ProjectAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectsActivity extends AppCompatActivity {

    TextView tvMessage;
    Spinner projectsSpinner;
    ProjectAdapter dataAdapter;
    List<Project> projectArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamwork);


        tvMessage = (TextView)findViewById(R.id.tvMessage);
        projectsSpinner = (Spinner)findViewById(R.id.projects_spinner);

        dataAdapter = new ProjectAdapter(this,  projectArray);
        dataAdapter.setDropDownViewResource(R.layout.project_spinner_item);
        projectsSpinner.setAdapter(dataAdapter);

        new FetcherTask().execute((Void) null);
    }

    class FetcherTask extends AsyncTask<Void, Void, Projects>{

        @Override
        protected Projects doInBackground(Void... params) {
            Projects p = new RemoteEntity().fetchProjects();
            projectArray = Arrays.asList(p.getProjects());
            return p;
        }

        @Override
        protected void onPostExecute(Projects p) {
            tvMessage.setText(p.getSTATUS());
            dataAdapter.clear();
            dataAdapter.addAll(projectArray);
            dataAdapter.notifyDataSetChanged();
        }
    }
}
