package com.example.customerregister.company;

public class CompanyInput {
    private String name;
    private int taxNumber;

    public CompanyInput( String name, int taxNumber) {

        this.name = name;
        this.taxNumber = taxNumber;
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
