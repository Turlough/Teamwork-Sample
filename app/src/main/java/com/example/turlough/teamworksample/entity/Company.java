package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by turlough on 15/06/16.
 */


public class Company {


    private String name;
    @SerializedName("is-owner") private int isOwner;
    private int id;

    public Company() {
    }

    public Company(int id, int isOwner, String name) {
        this.id = id;
        this.isOwner = isOwner;
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getIsOwner() {

        return isOwner;
    }

    public void setIsOwner(int isOwner) {

        this.isOwner = isOwner;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Company)) return false;

        Company company = (Company) o;

        if (isOwner != company.isOwner) return false;
        if (id != company.id) return false;
        return name.equals(company.name);

    }

    @Override
    public int hashCode() {

        int result = name.hashCode();
        result = 31 * result + isOwner;
        result = 31 * result + id;
        return result;
    }
}
