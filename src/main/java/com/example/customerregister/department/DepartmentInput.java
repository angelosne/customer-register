package com.example.customerregister.department;

import com.example.customerregister.company.Company;


public class DepartmentInput {
    private String name;
    private Sector sector;
    private Long companyId;

    public DepartmentInput(String name, Sector sector, Long companyId) {
        this.name = name;
        this.sector = sector;
        this.companyId = companyId;
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
