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

import com.identiphy.model.BiometricProviderDetail;
import com.identiphy.model.BiometricType;
import com.identiphy.model.Tenant;
import com.identiphy.service.BiometricProviderDetailService;
import com.identiphy.service.BiometricTypeService;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class BiometricProviderDetailController {

    @Autowired
    private BiometricProviderDetailService biometricProviderDetailService;

    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/biometricproviderdetail/all")
    public List<BiometricProviderDetail> loadAll() {
        return this.biometricProviderDetailService.findAll();
    }
    
    @RequestMapping( method = GET, value = "/biometricproviderdetail/{biometricProviderDetailId}" )
    public BiometricProviderDetail loadById( @PathVariable Long biometricProviderDetailId ) {
        return this.biometricProviderDetailService.findById( biometricProviderDetailId );
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = POST, value= "/biometricproviderdetail")
    public BiometricProviderDetail save(@RequestBody BiometricProviderDetail tenant) {
        return this.biometricProviderDetailService.save(tenant);
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = DELETE, value= "/biometricproviderdetail")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        this.biometricProviderDetailService.delete(id);
        return new ResponseEntity<BiometricProviderDetail>(HttpStatus.NO_CONTENT);
    }

}
