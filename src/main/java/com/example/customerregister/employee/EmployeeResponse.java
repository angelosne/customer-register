package com.example.customerregister.employee;

import com.example.customerregister.department.Department;


public class EmployeeResponse {
    private long id;
    private String fullName;
    private String address;
    private long phone;
    private String workingPeriod;
    private boolean status;
    private String position;
    private Department department;


    public EmployeeResponse(long id, String fullName, String address, long phone, String workingPeriod, boolean status, String position, Department department) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.workingPeriod = workingPeriod;
        this.status = status;
        this.position = position;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getWorkingPeriod() {
        return workingPeriod;
    }

    public void setWorkingPeriod(String workingPeriod) {
        this.workingPeriod = workingPeriod;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
