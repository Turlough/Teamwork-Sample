package com.example.turlough.teamworksample.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.turlough.teamworksample.R;
import com.example.turlough.teamworksample.entity.Project;

import java.util.List;

/**
 * Created by turlough on 16/06/16.
 */
public class ProjectAdapter extends ArrayAdapter<Project> {
    public ProjectAdapter(Context context, List<Project> projects) {
        super(context, 0, R.id.tvName, projects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Project project = getItem(position);

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.project_spinner_item, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.description = (TextView) convertView.findViewById(R.id.tvDescription);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name.setText(project.getName());
        viewHolder.description.setText(project.getDescription());

        return convertView;
    }

    // View lookup cache
    private static class ViewHolder {
        TextView name;
        TextView description;
    }
}
