package com.identiphy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="BiometricProviderDetail")
public class BiometricProviderDetails {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "providerid")
    private Long providerid;
    
    @Column(name = "biometrictypeid")
    private Long biometrictypeid;
    
    @Column(name = "subscriptiontype")
    public String subscriptiontype;

    @Column(name = "subscriptioncurrency")
    public String subscriptioncurrency;

    @Column(name = "apisecret")
    public String apisecret;
    
    @Column(name = "apikey")
    public String apikey;
    
    @Column(name = "website")
    public String website;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProviderid() {
		return providerid;
	}

	public void setProviderid(Long providerid) {
		this.providerid = providerid;
	}

	public Long getBiometrictypeid() {
		return biometrictypeid;
	}

	public void setBiometrictypeid(Long biometrictypeid) {
		this.biometrictypeid = biometrictypeid;
	}

	public String getSubscriptiontype() {
		return subscriptiontype;
	}

	public void setSubscriptiontype(String subscriptiontype) {
		this.subscriptiontype = subscriptiontype;
	}

	public String getSubscriptioncurrency() {
		return subscriptioncurrency;
	}

	public void setSubscriptioncurrency(String subscriptioncurrency) {
		this.subscriptioncurrency = subscriptioncurrency;
	}

	public String getApisecret() {
		return apisecret;
	}

	public void setApisecret(String apisecret) {
		this.apisecret = apisecret;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
    
}
