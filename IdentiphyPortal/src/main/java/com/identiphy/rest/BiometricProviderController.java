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
import com.identiphy.model.BiometricType;
import com.identiphy.model.Tenant;
import com.identiphy.service.BiometricProviderDetailService;
import com.identiphy.service.BiometricProviderService;
import com.identiphy.service.BiometricTypeService;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BiometricProviderController {

    @Autowired
    private BiometricProviderService biometricProviderService;

    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/biometricprovider/all")
    public List<BiometricProvider> loadAll() {
        return this.biometricProviderService.findAll();
    }
    
    @RequestMapping( method = GET, value = "/biometricprovider/{biometricProviderId}" )
    public BiometricProvider loadById( @PathVariable Long biometricProviderId ) {
        return this.biometricProviderService.findById( biometricProviderId );
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = POST, value= "/biometricprovider")
    public BiometricProvider save(@RequestBody BiometricProvider tenant) {
        return this.biometricProviderService.save(tenant);
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = DELETE, value= "/biometricprovider")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        this.biometricProviderService.delete(id);
        return new ResponseEntity<BiometricProviderDetail>(HttpStatus.NO_CONTENT);
    }

}
