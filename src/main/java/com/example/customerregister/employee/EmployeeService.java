package com.example.customerregister.employee;

import com.example.customerregister.department.Department;
import com.example.customerregister.department.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository repository;
    private DepartmentRepository departmentRepository;
    private EmployeeInputToEntityMapper employeeInputToEntityMapper;
    private EmployeeEntityToResponseMapper employeeEntityToResponseMapper;

    public EmployeeService(EmployeeRepository repository, DepartmentRepository departmentRepository, EmployeeInputToEntityMapper employeeInputToEntityMapper, EmployeeEntityToResponseMapper employeeEntityToResponseMapper) {
        this.repository = repository;
        this.departmentRepository = departmentRepository;
        this.employeeInputToEntityMapper = employeeInputToEntityMapper;
        this.employeeEntityToResponseMapper = employeeEntityToResponseMapper;
    }

    public List<EmployeeResponse> getEmployeesPerDepartment(long id){
        List<EmployeeResponse> employeesToReturn = new ArrayList<>();
        Iterable<Employee> retrievedEmployees = repository.findAll();
        Optional<Department> retrievedDepartment = departmentRepository.findById(id);
        for (Employee employee: retrievedEmployees){
            if (id == employee.getDepartment().getId()) {
                EmployeeResponse mappedEmployee = employeeEntityToResponseMapper.apply(employee);
                employeesToReturn.add(mappedEmployee);
            }
        }
        return employeesToReturn;
    }
}
