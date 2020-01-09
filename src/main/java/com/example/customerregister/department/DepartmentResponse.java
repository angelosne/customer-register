package com.example.customerregister.department;

import com.example.customerregister.company.Company;

public class DepartmentResponse {
    private long id;
    private String name;
    private Sector sector;
    private Company company;

    public DepartmentResponse(long id, String name, Sector sector, Company company) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
