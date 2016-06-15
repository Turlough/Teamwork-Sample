package com.example.turlough.teamworksample.activity;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.turlough.teamworksample.R;
import com.example.turlough.teamworksample.api.TeamworkAPI;

public class TeamworkActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamwork);
        tvMessage = (TextView)findViewById(R.id.tvMessage);
        new FetcherTask().execute((Void)null);
    }

    class FetcherTask extends AsyncTask<Void, Void, String>{

        @Override
        protected String doInBackground(Void... params) {
            String s = new TeamworkAPI().get("projects.json");
            return s;
        }

        @Override
        protected void onPostExecute(String s) {
            tvMessage.setText(s);
        }
    }
}
