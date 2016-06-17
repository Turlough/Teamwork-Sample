package com.example.turlough.teamworksample.entity;

/**
 * Created by turlough on 15/06/16.
 */

public class Project {


    private int id;
    private Company company;
    private String name;
    private String description;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Company getCompany() {

        return company;
    }

    public void setCompany(Company company) {

        this.company = company;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

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
