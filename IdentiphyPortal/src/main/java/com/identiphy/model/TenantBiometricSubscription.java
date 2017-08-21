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
@Table(name="TenantBiometricSubscriptions")
public class TenantBiometricSubscription  {
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "tenantid")
    public Long tenantid;
   
    @Column(name = "biometricproviderdetailsid")
    public Long biometricproviderdetailsid;
    
    @Column(name = "biometricproviderdetailsubscriptionid")
    public Long biometricproviderdetailsubscriptionid;
    
    @Column(name = "startdate")
    public DateTime planstartdate;
    
    @Column(name = "endenddate")
    public DateTime planendenddate;
    
    @Column(name = "status")
    public String status;
    
    @Column(name = "lastupdateddate")
    public DateTime lastupdateddate;
    
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

	public Long getBiometricproviderdetailsid() {
		return biometricproviderdetailsid;
	}

	public void setBiometricproviderdetailsid(Long biometricproviderdetailsid) {
		this.biometricproviderdetailsid = biometricproviderdetailsid;
	}

	public Long getBiometricproviderdetailsubscriptionid() {
		return biometricproviderdetailsubscriptionid;
	}

	public void setBiometricproviderdetailsubscriptionid(Long biometricproviderdetailsubscriptionid) {
		this.biometricproviderdetailsubscriptionid = biometricproviderdetailsubscriptionid;
	}

	public DateTime getPlanstartdate() {
		return planstartdate;
	}

	public void setPlanstartdate(DateTime planstartdate) {
		this.planstartdate = planstartdate;
	}

	public DateTime getPlanendenddate() {
		return planendenddate;
	}

	public void setPlanendenddate(DateTime planendenddate) {
		this.planendenddate = planendenddate;
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

	public DateTime getLastupdateduser() {
		return lastupdateduser;
	}

	public void setLastupdateduser(DateTime lastupdateduser) {
		this.lastupdateduser = lastupdateduser;
	}

	@Column(name = "lastupdateduser")
    public DateTime lastupdateduser;
    
    
}
