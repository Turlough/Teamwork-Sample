package com.example.turlough.teamworksample.api;

import com.example.turlough.teamworksample.entity.Projects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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


}