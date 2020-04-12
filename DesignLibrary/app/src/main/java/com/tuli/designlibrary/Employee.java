package com.tuli.designlibrary;

import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {
    private String employeeName;
    private String employeeId;
    private String employeeDesignation;
    private EmployeeAddress employeeAddress;
 private ArrayList<EmployeeProjects> projects;

    public Employee() {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDesignation = employeeDesignation;
        this.employeeAddress = employeeAddress;
        this.projects = projects;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public ArrayList<EmployeeProjects> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<EmployeeProjects> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeAddress=" + employeeAddress +
                ", projects=" + projects +
                '}';
    }
}
