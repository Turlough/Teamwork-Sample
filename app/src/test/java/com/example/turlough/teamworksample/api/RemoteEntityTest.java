package com.example.turlough.teamworksample.api;

import com.example.turlough.teamworksample.entity.Project;
import com.example.turlough.teamworksample.entity.Projects;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by turlough on 15/06/16.
 * NB: This test depends on external resources
 */
public class RemoteEntityTest {

    RemoteEntity remote = new RemoteEntity();

    @Test
    public void testFetchProjectsStatusOk() throws Exception {
        Projects projects = remote.fetchProjects();
        assertEquals("OK", projects.getSTATUS());
    }

    @Test
    public void testFetchProjectsArray() throws Exception {
        Projects projects = remote.fetchProjects();
        assertNotEquals(0, projects.getProjects().length);
    }


}