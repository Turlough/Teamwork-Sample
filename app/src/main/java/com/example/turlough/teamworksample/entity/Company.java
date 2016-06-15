package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.SerializedName;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by turlough on 15/06/16.
 */

@EqualsAndHashCode
public class Company {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @SerializedName("is-owner")
    private int isOwner;

    @Getter
    @Setter
    private int id;

    public Company() {
    }

    public Company(int id, int isOwner, String name) {
        this.id = id;
        this.isOwner = isOwner;
        this.name = name;
    }
}
