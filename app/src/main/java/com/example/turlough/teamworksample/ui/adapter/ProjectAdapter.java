package com.example.turlough.teamworksample.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.turlough.teamworksample.R;
import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.ui.activity.ProjectButtonListener;

import java.util.List;

/**
 * Created by turlough on 16/06/16.
 */
public class ProjectAdapter extends ArrayAdapter<Project> {

    ProjectButtonListener projectButtonListener;

    public ProjectAdapter(Context context, @NonNull List<Project> projects, ProjectButtonListener projectButtonListener) {
        super(context, 0, R.id.tvName, projects);
        this.projectButtonListener = projectButtonListener;
    }

    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {

        Project project = getItem(position);

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.project_spinner_item, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.description = (TextView) convertView.findViewById(R.id.tvDescription);
            viewHolder.messageButton = (ImageButton) convertView.findViewById(R.id.messageButton);
            viewHolder.taskButton = (ImageButton) convertView.findViewById(R.id.taskButton);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name.setText(project.getName());
        viewHolder.description.setText(project.getDescription());
        viewHolder.messageButton.setOnClickListener(View -> projectButtonListener.onMessagesClicked(project.getId()));
        viewHolder.taskButton.setOnClickListener(View -> projectButtonListener.onTasksClicked(project.getId()));

        return convertView;
    }

    // View lookup cache
    private static class ViewHolder {
        TextView name;
        TextView description;
        ImageButton messageButton;
        ImageButton taskButton;

    }
}
