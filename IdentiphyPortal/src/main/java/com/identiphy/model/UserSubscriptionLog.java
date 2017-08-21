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
   
}
