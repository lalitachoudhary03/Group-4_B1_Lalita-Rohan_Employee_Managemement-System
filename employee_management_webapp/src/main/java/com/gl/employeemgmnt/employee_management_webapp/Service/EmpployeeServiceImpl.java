package com.gl.employeemgmnt.employee_management_webapp.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.gl.employeemgmnt.employee_management_webapp.Repository.EmployeeRepository;
import com.gl.employeemgmnt.employee_management_webapp.model.Employee;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
@Service
public class EmpployeeServiceImpl implements employeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
	}

	
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}


	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
}

	
	public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.employeeRepository.findAll(pageable);
	}
}