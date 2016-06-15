package com.example.turlough.teamworksample.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by turlough on 15/06/16.
 */
public class ProjectTest {

    Project project;
    Company company;
    Gson gson;

    public ProjectTest(){

        gson = new GsonBuilder().setPrettyPrinting().create();
        company = new Company(1, 1, "testCompany");

        project = new Project();
        project.setName("testProject");
        project.setCompany(company);
        project.setDescription("desc");

    }

    @Test
    public void testToFromJson(){

        String s = gson.toJson(project);
        Project result = gson.fromJson(s, Project.class);
        assertEquals(result, project);
    }

}