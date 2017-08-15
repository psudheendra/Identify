package com.identiphy.service;

import java.util.List;

import com.identiphy.model.Tenant;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface TenantService {
//    public BiometricTypes findById(Long id);
//    public BiometricTypes findByUsername(String username);
    public List<Tenant> findAll ();
    public Tenant save(Tenant obj);
    public void delete(long id);
}
