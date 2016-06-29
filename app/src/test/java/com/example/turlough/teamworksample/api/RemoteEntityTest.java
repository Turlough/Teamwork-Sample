package com.example.turlough.teamworksample.api;

import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.entity.Projects;
import com.example.turlough.teamworksample.entity.TaskResponse;
import com.example.turlough.teamworksample.entity.Tasklist;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by turlough on 15/06/16.
 * NB: This test depends on external resources
 */
public class RemoteEntityTest {

    String key = "wood305tree";
    String url = "http://turlough.teamwork.com/";

    RemoteEntity remote = new RemoteEntity(key, url);

    @Test
    public void testFetchProjectsStatusOk() throws Exception {
        Projects projects = remote.fetchProjects();
        assertEquals("OK", projects.getStatus());
    }

    @Test
    public void testFetchProjectsArray() throws Exception {
        Projects projects = remote.fetchProjects();
        assertNotEquals(0, projects.getProjects().length);
    }

    @Test
    public void testFetchTaskResponse(){
        Projects projects = remote.fetchProjects();
        Project project = projects.getProjects()[0];
        TaskResponse taskResponse = remote.fetchTasklists(project.getId());
        assertNotNull("Response was null", taskResponse);
        assertEquals("Error response", "OK", taskResponse.getStatus());
    }

    @Test
    public void testFetchTasklist(){
        Projects projects = remote.fetchProjects();
        Project project = projects.getProjects()[0];
        TaskResponse taskResponse = remote.fetchTasklists(project.getId());
        List<Tasklist> tasklist = taskResponse.getTasklists();
        assertNotNull("Tasklist was null", tasklist);
    }


}