package com.example.turlough.teamworksample.api;

import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.entity.Projects;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by turlough on 15/06/16.
 */
public class RemoteEntity {

    TeamworkAPI api = new TeamworkAPI();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public Projects fetchProjects(){
        String s = api.get("projects.json");
        return gson.fromJson(s, Projects.class);
    }
}
