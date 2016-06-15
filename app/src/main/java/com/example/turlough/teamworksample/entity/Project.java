package com.example.turlough.teamworksample.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by turlough on 15/06/16.
 */
@EqualsAndHashCode
public class Project {

    @Getter @Setter
    int id;

    @Getter @Setter
    Company company;

    @Getter @Setter
    String name;

    @Getter @Setter
    String description;


}
