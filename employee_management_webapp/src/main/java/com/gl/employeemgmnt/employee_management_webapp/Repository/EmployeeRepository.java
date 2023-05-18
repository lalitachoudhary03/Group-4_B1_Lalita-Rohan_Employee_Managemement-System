package com.gl.employeemgmnt.employee_management_webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.employeemgmnt.employee_management_webapp.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
