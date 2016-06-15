package com.example.turlough.teamworksample.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by turlough on 15/06/16.
 */
public class CompanyTest {

    Company company;
    Gson gson;

    public CompanyTest(){

        gson = new GsonBuilder().setPrettyPrinting().create();
        company = new Company(1, 1, "test");
    }

    @Test
    public void testToFromJson(){

        String s = gson.toJson(company);
        Company result = gson.fromJson(s, Company.class);
        assertEquals(result, company);
    }

    @Test
    public void testAnnotatedField(){
        String s = gson.toJson(company);
        assertTrue(s.contains("is-owner"));
    }
}