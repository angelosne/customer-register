package com.example.customerregister.company;

import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class CompanyEntityToResponseMapper implements Function<Company, CompanyResponse> {
    @Override
    public CompanyResponse apply(Company company) {
        return new CompanyResponse(
                company.getId(),
                company.getName(),
                company.getTaxNumber()
        );
    }
}
