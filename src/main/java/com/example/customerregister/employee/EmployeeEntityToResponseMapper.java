package com.example.customerregister.employee;

import java.util.function.Function;

public class EmployeeEntityToResponseMapper implements Function<Employee, EmployeeResponse> {
    @Override
    public EmployeeResponse apply(Employee employee) {
        return new EmployeeResponse(
                employee.getId(),
                mapToFullName(employee),
                employee.getAddress(),
                employee.getPhone(),
                mapWorkingPeriod(employee),
                mapStatus(employee),
                employee.getPosition(),
                employee.getDepartment()
        );
    }
    private String mapToFullName(Employee employee){
        return employee.getFirstname() + " " + employee.getLastname();
    }

    private String mapWorkingPeriod(Employee employee){
        if (employee.getLeaveDate() == null)
            return employee.getHireDate() + " - Present";
        else
            return employee.getHireDate() + " - " + employee.getLeaveDate();
    }

    private boolean mapStatus(Employee employee){
        if (employee.getLeaveDate() == null)
            return true;
        else
            return false;
    }
}
