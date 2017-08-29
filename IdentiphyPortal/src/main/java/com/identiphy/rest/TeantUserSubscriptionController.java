package com.identiphy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.identiphy.model.BiometricProvider;
import com.identiphy.model.BiometricProviderDetail;
import com.identiphy.model.BiometricProviderSubscriptionDetail;
import com.identiphy.model.BiometricType;
import com.identiphy.model.Tenant;
import com.identiphy.model.TenantBiometricSubscription;
import com.identiphy.model.TenantUser;
import com.identiphy.model.TenantUserSubscription;
import com.identiphy.service.BiometricProviderDetailService;
import com.identiphy.service.BiometricProviderService;
import com.identiphy.service.BiometricProviderSubscriptionDetailService;
import com.identiphy.service.BiometricTypeService;
import com.identiphy.service.TenantBiometricSubscriptionService;
import com.identiphy.service.TenantUserService;
import com.identiphy.service.TenantUserSubscriptionService;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class TeantUserSubscriptionController {

    @Autowired
    private TenantUserSubscriptionService tenantUserSubscriptionService;

    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/tenantusersubscription/all")
    public List<TenantUserSubscription> loadAll() {
        return this.tenantUserSubscriptionService.findAll();
    }
    
    @RequestMapping( method = GET, value = "/tenantusersubscription/{tenantid}" )
    public TenantUserSubscription loadById( @PathVariable Long tenantid ) {
        return this.tenantUserSubscriptionService.findById( tenantid );
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = POST, value= "/tenantusersubscription")
    public TenantUserSubscription save(@RequestBody TenantUserSubscription tenant) {
        return this.tenantUserSubscriptionService.save(tenant);
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = DELETE, value= "/tenantusersubscription/{tenantid}")
    public ResponseEntity<?> delete(@PathVariable("tenantid") long tenantid) {
        this.tenantUserSubscriptionService.delete(tenantid);
        return new ResponseEntity<BiometricProviderDetail>(HttpStatus.NO_CONTENT);
    }

}
