package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by turlough on 15/06/16.
 */
public class Projects {

    @Getter @Setter
    @SerializedName("STATUS")
    String status;

    @Getter @Setter
    Project[] projects;
}
