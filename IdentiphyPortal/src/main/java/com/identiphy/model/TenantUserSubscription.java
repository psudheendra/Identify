package com.identiphy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.joda.time.DateTime;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tenant_user_subscription")
public class TenantUserSubscription  {
	
	// tenant user id
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenant_user_id")
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
    
//    @ManyToOne
//    @JoinColumn(name = "tenant_user_id")
//    private TenantUser tenantUser;
//    
//    public TenantUser getTenantUser() {
//        return tenantUser;
//    }
//
//    public void setTenantUser(TenantUser tenantUser) {
//        this.tenantUser = tenantUser;
//    }   

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
