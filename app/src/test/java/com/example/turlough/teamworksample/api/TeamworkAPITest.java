package com.example.turlough.teamworksample.api;

import android.support.annotation.NonNull;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by turlough on 15/06/16.
 * NB: Depends on external resources
 */
public class TeamworkAPITest {

    @NonNull
    private String key = "wood305tree";
    @NonNull
    private String url = "http://turlough.teamwork.com/";
    TeamworkAPI api;

    @Before
    public void setUp(){
        api = new TeamworkAPI(key, url);
    }

    @Test
    public void testGet() throws Exception {

        String s = api.get("projects.json");
        assertTrue(s.length() > 0);
    }

}