package com.example.turlough.teamworksample.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by turlough on 15/06/16.
 * NB: Depends on external resources
 */
public class TeamworkAPITest {

    TeamworkAPI api;

    @Before
    public void setUp(){
        api = new TeamworkAPI();
    }

    @Test
    public void testGet() throws Exception {
        String s = api.get("projects.json");
        assertFalse(s.startsWith("Error Received:"));
    }
}