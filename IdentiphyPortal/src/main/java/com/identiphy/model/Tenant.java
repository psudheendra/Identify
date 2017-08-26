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
@Table(name="tenant")
public class Tenant  {
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "tenantname")
    public String tenantname;
   
    @Column(name = "address1")
    public String address1;

    @Column(name = "address2")
    public String address2;

    @Column(name = "city")
    public String city;
    
    @Column(name = "country")
    public String country;
    
    @Column(name = "pin")
    public String pin;
    
    @Column(name = "email")
    public String email;
    
    @Column(name = "phone")
    public String phone;
    
    @Column(name = "contactperson")
    public String contactperson;
    
    @Column(name = "contactpersonphone")
    public String contactpersonphone;
    
    @Column(name = "contactpersonemail")
    public String contactpersonemail;
    
    @Column(name = "clientwebsite")
    public String clientwebsite;
    
    @Column(name = "active")
    public boolean active;
    
    @Column(name = "lastupdateddate")
    public DateTime lastupdateddate;
    
    @Column(name = "lastupdateduserid")
    public String lastupdateduserid;
    
    @OneToMany(mappedBy = "tenant")    
    public List<TenantUser> tenantUsers;       
   
    public List<TenantUser> getTenantUsers() {
        return tenantUsers;
    }

    public void setTenantUsers(List<TenantUser> tenantUsers) {
        this.tenantUsers = tenantUsers;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenantname() {
		return tenantname;
	}

	public void setTenantname(String tenantname) {
		this.tenantname = tenantname;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getContactpersonphone() {
		return contactpersonphone;
	}

	public void setContactpersonphone(String contactpersonphone) {
		this.contactpersonphone = contactpersonphone;
	}

	public String getContactpersonemail() {
		return contactpersonemail;
	}

	public void setContactpersonemail(String contactpersonemail) {
		this.contactpersonemail = contactpersonemail;
	}

	public String getClientwebsite() {
		return clientwebsite;
	}

	public void setClientwebsite(String clientwebsite) {
		this.clientwebsite = clientwebsite;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
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
