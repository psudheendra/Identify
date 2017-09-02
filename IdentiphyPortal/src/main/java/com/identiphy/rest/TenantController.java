package com.identiphy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.identiphy.model.Tenant;
import com.identiphy.service.TenantService;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
public class TenantController {

    @Autowired
    private TenantService tenantService;
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/tenant/all")
    public List<Tenant> loadAll() {
        return this.tenantService.findAll();
    }
    
    @RequestMapping( method = GET, value = "/tenant/{tenantId}" )
    public Tenant loadById( @PathVariable Long tenantId ) {
        return this.tenantService.findById( tenantId );
    }
    
    @RequestMapping( method = GET, value = "/tenantusers/{tenantId}" )
    public List<Object> loadTenantUsersById( @PathVariable Long tenantId ) {
        return this.tenantService.findTenantUsersById( tenantId );
    }
    
    @RequestMapping( method = GET, value = "/tenantsubscriptions/{tenantId}" )
    public List<Object> loadTenantSubscriptionsById( @PathVariable Long tenantId ) {
        return this.tenantService.findTenantSubscriptionsById( tenantId );
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = POST, value= "/tenant")
    public Tenant save(@RequestBody Tenant tenant) {
    	System.out.println(tenant.tenantname);
        return this.tenantService.save(tenant);
    }
    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = DELETE, value= "/tenant/{tenantId}")
    public ResponseEntity<?> delete(@PathVariable("tenantId") long tenantId) {
    	//Tenant obj = this.tenantService.findAll();
        this.tenantService.delete(tenantId);
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
