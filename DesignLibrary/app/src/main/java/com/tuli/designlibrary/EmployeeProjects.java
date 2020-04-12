package com.tuli.designlibrary;

import java.io.Serializable;

public class EmployeeProjects implements Serializable {
    private String projectName;
    private String noOfProjects;
    private String projectDuration;

    public EmployeeProjects(String projectName, String noOfProjects, String projectDuration) {
        this.projectName = projectName;
        this.noOfProjects = noOfProjects;
        this.projectDuration = projectDuration;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getNoOfProjects() {
        return noOfProjects;
    }

    public void setNoOfProjects(String noOfProjects) {
        this.noOfProjects = noOfProjects;
    }

    public String getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(String projectDuration) {
        this.projectDuration = projectDuration;
    }

    @Override
    public String toString() {
        return "EmployeeProjects{" +
                "projectName='" + projectName + '\'' +
                ", noOfProjects='" + noOfProjects + '\'' +
                ", projectDuration='" + projectDuration + '\'' +
                '}';
    }
}
