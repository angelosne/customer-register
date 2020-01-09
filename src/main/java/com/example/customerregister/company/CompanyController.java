package com.example.customerregister.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
    private CompanyService service;

    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @GetMapping(path = "/companies")
    public ResponseEntity getAllCompanies() {
        return new ResponseEntity(service.getAllCompanies(), HttpStatus.OK);
    }

    @PostMapping(path = "/companies")
    public ResponseEntity createCompany(@RequestBody CompanyInput input){
        return new ResponseEntity(service.createCompany(input),HttpStatus.OK);
    }
//    @PatchMapping(path = "/companies/{id}")
//    public ResponseEntity updateCompany(){
//        return new ResponseEntity(service.updateCompany(),HttpStatus.OK);
//    }
//    @DeleteMapping(path = "/companies/{id}")
//    public ResponseEntity deleteCompany(){
//        return new ResponseEntity(service.deleteCompany(),HttpStatus.OK);
//    }
}
