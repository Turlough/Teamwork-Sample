package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * Created by turlough on 15/06/16.
 */
public class Projects {

    @SerializedName("STATUS")
    private String status;
    private Project[] projects;

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public Project[] getProjects() {

        return projects;
    }

    public void setProjects(Project[] projects) {

        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Projects)) return false;

        Projects projects1 = (Projects) o;

        if (!status.equals(projects1.status)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(projects, projects1.projects);

    }

    @Override
    public int hashCode() {

        int result = status.hashCode();
        result = 31 * result + Arrays.hashCode(projects);
        return result;
    }
}
