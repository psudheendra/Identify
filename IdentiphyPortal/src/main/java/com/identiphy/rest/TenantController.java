package com.identiphy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.identiphy.model.Tenant;
import com.identiphy.service.TenantService;

import org.springframework.web.bind.annotation.RequestBody;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * Created by fan.jin on 2016-10-15.
 */

@RestController
public class TenantController {

    @Autowired
    private TenantService tenantService;

    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/tenant/all")
    public List<Tenant> loadAll() {
        return this.tenantService.findAll();
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = POST, value= "/tenant")
    public Tenant save(@RequestBody Tenant tenant) {
    	System.out.println(tenant.tenantname);
        return this.tenantService.save(tenant);
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = DELETE, value= "/tenant")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
    	//Tenant obj = this.tenantService.findAll();
        this.tenantService.delete(id);
        return new ResponseEntity<Tenant>(HttpStatus.NO_CONTENT);
    }


    /*
     *  We are not using userService.findByUsername here(we could),
     *  so it is good that we are making sure that the user has role "ROLE_USER"
     *  to access this endpoint.
     */
//    @RequestMapping("/whoami")
//    @PreAuthorize("hasRole('USER')")
//    public User user() {
//        return (User)SecurityContextHolder
//                .getContext()
//                .getAuthentication()
//                .getPrincipal();
//    }
}
