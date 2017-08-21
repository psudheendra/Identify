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
@Table(name="TenantUserSubscription")
public class TenantUserSubscription  {
	
	// tenant user id
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenantuserid")
    private Long tenantuserid;
    
    @Column(name = "tenantbiometricsubscriptionid")
    private Long tenantbiometricsubscriptionid;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private String status;

    @Column(name = "enrolldate")
    private DateTime enrolldate;
    
    @Column(name = "enrollerrorreason")
    private String enrollerrorreason;
    
    @Column(name = "userstatus")
    private String userstatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTenantuserid() {
		return tenantuserid;
	}

	public void setTenantuserid(Long tenantuserid) {
		this.tenantuserid = tenantuserid;
	}

	public Long getTenantbiometricsubscriptionid() {
		return tenantbiometricsubscriptionid;
	}

	public void setTenantbiometricsubscriptionid(Long tenantbiometricsubscriptionid) {
		this.tenantbiometricsubscriptionid = tenantbiometricsubscriptionid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DateTime getEnrolldate() {
		return enrolldate;
	}

	public void setEnrolldate(DateTime enrolldate) {
		this.enrolldate = enrolldate;
	}

	public String getEnrollerrorreason() {
		return enrollerrorreason;
	}

	public void setEnrollerrorreason(String enrollerrorreason) {
		this.enrollerrorreason = enrollerrorreason;
	}

	public String getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}
    
}
