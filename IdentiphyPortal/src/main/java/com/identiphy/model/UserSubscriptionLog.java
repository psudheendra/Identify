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
@Table(name="UserSubscriptionLog")
public class UserSubscriptionLog  {
	
	// tenant user id
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenantuserid")
    private Long tenantuserid;
    
    @Column(name = "tenantbiometricsubscriptionid")
    private Long tenantbiometricsubscriptionid;

    @Column(name = "logintime")
    private DateTime logintime;
    
    @Column(name = "logouttime")
    private DateTime logouttime;
    
    @Column(name = "verificationstarttime")
    private DateTime verificationstarttime;
    
    @Column(name = "verificationendtime")
    private DateTime verificationendtime;
    
    @Column(name = "status")
    private String status;

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

	public DateTime getLogintime() {
		return logintime;
	}

	public void setLogintime(DateTime logintime) {
		this.logintime = logintime;
	}

	public DateTime getLogouttime() {
		return logouttime;
	}

	public void setLogouttime(DateTime logouttime) {
		this.logouttime = logouttime;
	}

	public DateTime getVerificationstarttime() {
		return verificationstarttime;
	}

	public void setVerificationstarttime(DateTime verificationstarttime) {
		this.verificationstarttime = verificationstarttime;
	}

	public DateTime getVerificationendtime() {
		return verificationendtime;
	}

	public void setVerificationendtime(DateTime verificationendtime) {
		this.verificationendtime = verificationendtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
   
}
