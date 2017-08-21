package com.identiphy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.joda.time.DateTime;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="BiometricProviderSubscriptionDetails")
public class BiometricProviderSubscriptionDetails {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "biometricproviderdetailid")
    private Long biometricproviderdetailid;
    
    @Column(name = "plantype")
    public String plantype;

    @Column(name = "plancost")
    public double plancost;

    @Column(name = "validity")
    public int validtiy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiometricproviderdetailid() {
		return biometricproviderdetailid;
	}

	public void setBiometricproviderdetailid(Long biometricproviderdetailid) {
		this.biometricproviderdetailid = biometricproviderdetailid;
	}

	public String getPlantype() {
		return plantype;
	}

	public void setPlantype(String plantype) {
		this.plantype = plantype;
	}

	public double getPlancost() {
		return plancost;
	}

	public void setPlancost(double plancost) {
		this.plancost = plancost;
	}

	public int getValidtiy() {
		return validtiy;
	}

	public void setValidtiy(int validtiy) {
		this.validtiy = validtiy;
	}
    
}
