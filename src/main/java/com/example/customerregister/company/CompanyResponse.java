package com.example.customerregister.company;

public class CompanyResponse {
    private long id;
    private String name;
    private int taxNumber;

    public CompanyResponse(long id, String name, int taxNumber) {
        this.id = id;
        this.name = name;
        this.taxNumber = taxNumber;
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

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }
}
