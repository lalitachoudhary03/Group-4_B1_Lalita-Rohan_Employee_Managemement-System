package com.gl.employeemgmnt.employee_management_webapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String name;
	private String email;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER,cascade =CascadeType.ALL)
	@JoinTable (
			name="users_roles",
			joinColumns = @JoinColumns(name="USER_ID", referencedColumnName="ID"),
			inverseJoinColumns= @JoinColumns(Name="ROLE_ID", referencedColumnName="ID"))
	
	private java.util.List<Role>roles = new ArrayList<>();
	
	
	
	
	public java.util.List<Role> getRoles() {
		return roles;
	}

	public void setRoles(java.util.List<Role> roles) {
		this.roles = roles;
	}

	public user(String name, String email, String password, List<Role> roles) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	}
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}