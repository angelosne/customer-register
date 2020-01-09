package com.example.customerregister.company;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {
    private CompanyRepository repository;
    private CompanyEntityToResponseMapper companyEntityToResponseMapper;
    private CompanyInputToEntityMapper companyInputToEntityMapper;

    public CompanyService(CompanyRepository repository, CompanyEntityToResponseMapper companyEntityToResponseMapper, CompanyInputToEntityMapper companyInputToEntityMapper) {
        this.repository = repository;
        this.companyEntityToResponseMapper = companyEntityToResponseMapper;
        this.companyInputToEntityMapper = companyInputToEntityMapper;
    }

    public List<CompanyResponse> getAllCompanies(){
        Iterable<Company> companies = repository.findAll();
        List<CompanyResponse> companiesToReturn = new ArrayList<>();
        for (Company company: companies){
            companiesToReturn.add(companyEntityToResponseMapper.apply(company));
        }
        return companiesToReturn;
    }

    public CompanyResponse createCompany(CompanyInput input){
        Company companyToBeSaved = companyInputToEntityMapper.apply(input);
        return companyEntityToResponseMapper.apply(repository.save(companyToBeSaved));

    }

//    public CompanyResponse updateCompany(CompanyInput input, long id){
//
//    }
//
//    public CompanyResponse deleteCompany(){
//
//    }
}
