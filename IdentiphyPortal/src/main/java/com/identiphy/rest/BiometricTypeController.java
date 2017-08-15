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

import com.identiphy.model.BiometricType;
import com.identiphy.service.BiometricTypeService;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by fan.jin on 2016-10-15.
 */

@RestController
public class BiometricTypeController {

    @Autowired
    private BiometricTypeService biometricTypeService;

    
    @PreAuthorize("hasRole('USER')")
    @RequestMapping( method = GET, value= "/biometrictype/all")
    public List<BiometricType> loadAll() {
        return this.biometricTypeService.findAll();
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
