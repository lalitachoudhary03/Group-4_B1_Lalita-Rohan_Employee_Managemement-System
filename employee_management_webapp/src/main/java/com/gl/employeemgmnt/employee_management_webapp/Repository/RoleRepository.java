package com.gl.employeemgmnt.employee_management_webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.employeemgmnt.employee_management_webapp.model.Role;
@Repository
public interface RoleRepository extends JpaRepository <Role, Integer>{
	Role findByName(String name);
	
}
