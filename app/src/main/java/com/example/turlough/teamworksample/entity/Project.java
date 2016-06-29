package com.example.turlough.teamworksample.entity;

import android.support.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

/**
 * Created by turlough on 15/06/16.
 */

public class Project {

    public final static String PROJECT_ID_EXTRA = "PROJECT_ID";

    private int id = 0;
    @NonNull
    private Company company = new Company();
    @NonNull
    private String name = "";
    @NonNull
    private String description = "";

    @NotNull
    public int getId() {

        return id;
    }

    public void setId(@NotNull int id) {

        this.id = id;
    }

    @NotNull
    public Company getCompany() {

        return company;
    }

    public void setCompany(@NotNull Company company) {

        this.company = company;
    }

    @NotNull
    public String getName() {

        return name;
    }

    public void setName(@NotNull String name) {

        this.name = name;
    }

    @NotNull
    public String getDescription() {

        return description;
    }

    public void setDescription(@NotNull String description) {

        this.description = description;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Project)) return false;

        Project project = (Project) o;

        if (id != project.id) return false;
        if (!company.equals(project.company)) return false;
        if (!name.equals(project.name)) return false;
        return description.equals(project.description);

    }

    @Override
    public int hashCode() {

        int result = id;
        result = 31 * result + company.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }
}
