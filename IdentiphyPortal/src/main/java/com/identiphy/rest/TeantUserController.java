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
import com.identiphy.service.BiometricProviderDetailService;
import com.identiphy.service.BiometricProviderService;
import com.identiphy.service.BiometricProviderSubscriptionDetailService;
import com.identiphy.service.BiometricTypeService;
import com.identiphy.service.TenantBiometricSubscriptionService;
import com.identiphy.service.TenantUserService;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class TeantUserController {

    @Autowired
    private TenantUserService tenantUserService;

    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/tenantuser/all")
    public List<TenantUser> loadAll() {
        return this.tenantUserService.findAll();
    }
    
    @RequestMapping( method = GET, value = "/tenantuser/{tenantid}" )
    public TenantUser loadById( @PathVariable Long tenantid ) {
        return this.tenantUserService.findById( tenantid );
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = POST, value= "/tenantuser")
    public TenantUser save(@RequestBody TenantUser tenant) {
        return this.tenantUserService.save(tenant);
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = DELETE, value= "/tenantuser")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        this.tenantUserService.delete(id);
        return new ResponseEntity<BiometricProviderDetail>(HttpStatus.NO_CONTENT);
    }

}
