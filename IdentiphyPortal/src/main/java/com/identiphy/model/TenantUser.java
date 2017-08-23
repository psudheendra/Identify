package com.identiphy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.joda.time.DateTime;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Entity
@Table(name="TenantUser")
public class TenantUser  {
	
	// tenant user id
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenantid")
    private Long tenantid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "employeealias")
    private String employeealias;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "email")
    private String email;

	@Column(name = "role")
    private String role;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "lastupdateddate")
    private DateTime lastupdateddate;
    
    @Column(name = "lastupdateduserid")
    private String lastupdateduserid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTenantid() {
		return tenantid;
	}

	public void setTenantid(Long tenantid) {
		this.tenantid = tenantid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmployeealias() {
		return employeealias;
	}

	public void setEmployeealias(String employeealias) {
		this.employeealias = employeealias;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DateTime getLastupdateddate() {
		return lastupdateddate;
	}

	public void setLastupdateddate(DateTime lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
	}

	public String getLastupdateduserid() {
		return lastupdateduserid;
	}

	public void setLastupdateduserid(String lastupdateduserid) {
		this.lastupdateduserid = lastupdateduserid;
	}

	
}
