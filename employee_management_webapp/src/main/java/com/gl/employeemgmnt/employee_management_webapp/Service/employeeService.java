package com.gl.employeemgmnt.employee_management_webapp.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.gl.employeemgmnt.employee_management_webapp.model.Employee;

public interface employeeService {
	public interface EmployeeService {
		List<Employee> getAllEmployees();
		void saveEmployee(Employee employee);
		Employee getEmployeeById(long id);
		void deleteEmployeeById(long id);
		Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	}
}
