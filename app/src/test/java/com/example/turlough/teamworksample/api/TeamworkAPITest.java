package com.example.turlough.teamworksample.api;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by turlough on 15/06/16.
 * NB: Depends on external resources
 */
public class TeamworkAPITest {

    String key = "wood305tree";
    String url = "http://turlough.teamwork.com/";
    TeamworkAPI api;

    @Before
    public void setUp(){
        api = new TeamworkAPI(key, url);
    }

    @Test
    public void testGet() throws Exception {
        //exception on failure
        String s = api.get("projects.json");
        assertTrue(s.length() > 0);
    }
}