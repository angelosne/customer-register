package com.example.customerregister.company;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CompanyInputToEntityMapper implements Function<CompanyInput, Company> {
    @Override
    public Company apply(CompanyInput companyInput) {
        return new Company(
                companyInput.getName(),
                companyInput.getTaxNumber()
        );
    }
}
