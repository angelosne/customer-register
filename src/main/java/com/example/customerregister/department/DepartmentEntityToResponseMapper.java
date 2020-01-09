package com.example.customerregister.department;

import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class DepartmentEntityToResponseMapper implements Function<Department, DepartmentResponse> {
    @Override
    public DepartmentResponse apply(Department department) {
        return new DepartmentResponse(
                department.getId(),
                department.getName(),
                department.getSector(),
                department.getCompany()
        );
    }
}
