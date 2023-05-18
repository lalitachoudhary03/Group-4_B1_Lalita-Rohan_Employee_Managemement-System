package com.gl.employeemgmnt.employee_management_webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.employeemgmnt.employee_management_webapp.model.user;
@Repository
public interface UserRepository extends JpaRepository<user, Integer>{
user findByEmail(String email);

}
