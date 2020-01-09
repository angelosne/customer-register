package com.example.customerregister.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeService service;
    private EmployeeEntityToResponseMapper employeeEntityToResponseMapper;
    private EmployeeInputToEntityMapper employeeInputToEntityMapper;

    public EmployeeController(EmployeeService service, EmployeeEntityToResponseMapper employeeEntityToResponseMapper, EmployeeInputToEntityMapper employeeInputToEntityMapper) {
        this.service = service;
        this.employeeEntityToResponseMapper = employeeEntityToResponseMapper;
        this.employeeInputToEntityMapper = employeeInputToEntityMapper;
    }

    @GetMapping(path = "employees/department/{id}")
    public ResponseEntity getEmployeesPerDepartment(@PathVariable long id){
        return new ResponseEntity(service.getEmployeesPerDepartment(id), HttpStatus.OK);

    }
}
