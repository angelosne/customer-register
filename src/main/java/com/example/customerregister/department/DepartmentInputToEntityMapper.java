package com.example.customerregister.department;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class DepartmentInputToEntityMapper implements Function<DepartmentInput, Department> {

    @Override
    public Department apply(DepartmentInput departmentInput) {
        return new Department(
                departmentInput.getName(),
                departmentInput.getSector(),
                null
        );
    }
}
