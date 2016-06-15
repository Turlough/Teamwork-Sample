package com.example.turlough.teamworksample.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by turlough on 15/06/16.
 */
public class Projects {

    @Getter @Setter
    String STATUS;

    @Getter @Setter
    Project[] projects;
}
