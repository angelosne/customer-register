package com.example.customerregister;

import com.example.customerregister.company.Company;
import com.example.customerregister.company.CompanyRepository;
import com.example.customerregister.company.CompanyResponse;
import com.example.customerregister.department.Department;
import com.example.customerregister.department.DepartmentRepository;
import com.example.customerregister.department.Sector;
import com.example.customerregister.employee.Employee;
import com.example.customerregister.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.ManyToOne;

@SpringBootApplication
public class CustomerRegisterApplication implements CommandLineRunner {


	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	CompanyRepository companyRepository;
	public static void main(String[] args) {
		SpringApplication.run(CustomerRegisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Company com1 = new Company("HAEC", 123465);

		Department dep1 = new Department("Finance", Sector.FINANCE, com1);

		Employee kostas = new Employee("paras", "giorgos","test 15", 1234569, "Jan 2020", "Jan 2025", "Manager", dep1);

		companyRepository.save(com1);
		departmentRepository.save(dep1);
		employeeRepository.save(kostas);


	}


}


	/*private long id;
	private String lastname;
	private String firstname;
	private String address;
	private long phone;
	private String hireDate;
	private String leaveDate;
	private String position;
	@ManyToOne
	private Department department;*/