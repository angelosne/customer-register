package com.example.customerregister.employee;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EmployeeInputToEntityMapper implements Function<EmployeeInput, Employee> {

    @Override
    public Employee apply(EmployeeInput employeeInput) {
        return new Employee(
                employeeInput.getLastname(),
                employeeInput.getFirstname(),
                employeeInput.getAddress(),
                employeeInput.getPhone(),
                employeeInput.getHireDate(),
                employeeInput.getLeaveDate(),
                employeeInput.getPosition(),
                null
        );
    }
}
