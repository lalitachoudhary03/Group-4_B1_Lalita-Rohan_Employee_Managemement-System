package com.gl.employeemgmnt.employee_management_webapp.Service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService<UserRegistrationDto> extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
