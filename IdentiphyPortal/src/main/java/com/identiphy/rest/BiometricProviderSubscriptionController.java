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
import com.identiphy.service.BiometricProviderDetailService;
import com.identiphy.service.BiometricProviderService;
import com.identiphy.service.BiometricProviderSubscriptionDetailService;
import com.identiphy.service.BiometricTypeService;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BiometricProviderSubscriptionController {

    @Autowired
    private BiometricProviderSubscriptionDetailService biometricProviderSubscriptionService;

    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/biometricprovidersubscription/all")
    public List<BiometricProviderSubscriptionDetail> loadAll() {
        return this.biometricProviderSubscriptionService.findAll();
    }
    
    @RequestMapping( method = GET, value = "/biometricprovidersubscription/{biometricProviderSubscriptionId}" )
    public BiometricProviderSubscriptionDetail loadById( @PathVariable Long biometricProviderSubscriptionId ) {
        return this.biometricProviderSubscriptionService.findById( biometricProviderSubscriptionId );
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = POST, value= "/biometricprovidersubscription")
    public BiometricProviderSubscriptionDetail save(@RequestBody BiometricProviderSubscriptionDetail tenant) {
        return this.biometricProviderSubscriptionService.save(tenant);
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = DELETE, value= "/biometricprovidersubscription")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        this.biometricProviderSubscriptionService.delete(id);
        return new ResponseEntity<BiometricProviderDetail>(HttpStatus.NO_CONTENT);
    }

}
