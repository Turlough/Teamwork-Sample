package com.example.turlough.teamworksample.api;

import com.example.turlough.teamworksample.entity.Posts;
import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.entity.Projects;
import com.example.turlough.teamworksample.entity.TaskResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

/**
 * Created by turlough on 15/06/16.
 */
public class RemoteEntity {

    TeamworkAPI api;
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public RemoteEntity(String key, String url) {
        api = new TeamworkAPI(key, url);
    }

    public Projects fetchProjects(){
        try {

            String s = api.get("projects.json");
            return gson.fromJson(s, Projects.class);

        } catch (final IOException e) {
            e.printStackTrace();
            return new Projects(){{
                setStatus("Error: " + e.getMessage());
                setProjects(new Project[]{});
            }};
        }

    }

    public TaskResponse fetchTasklists(int projectId){
        try {
            String endpoint = String.format("projects/%d/tasklists.json", projectId);
            String s = api.get(endpoint);
            return gson.fromJson(s, TaskResponse.class);

        } catch (final IOException e) {
            e.printStackTrace();
            return new TaskResponse();
        }
    }

    public void sendPosts(int projectId, Posts posts){
        try {
            String endpoint = String.format("projects/%d/posts.json", projectId);
            api.post(endpoint, gson.toJson(posts));

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
