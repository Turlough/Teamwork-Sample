package com.example.turlough.teamworksample.entity;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Created by turlough on 15/06/16.
 */
public class Projects {

    @NonNull
    @SerializedName("STATUS")
    private String status = "";
    @NonNull
    private Project[] projects = new Project[]{};

    @NotNull
    public String getStatus() {

        return status;
    }

    public void setStatus(@NotNull String status) {

        this.status = status;
    }

    @NotNull
    public Project[] getProjects() {

        return projects;
    }

    public void setProjects(@NotNull Project[] projects) {

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
