package com.example.turlough.teamworksample.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.turlough.teamworksample.R;
import com.example.turlough.teamworksample.entity.Project;

public class MessagesActivity extends AppCompatActivity {

    int projectId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        projectId = getIntent().getExtras().getInt(Project.PROJECT_ID_EXTRA);
    }
}
