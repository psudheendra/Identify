package com.identiphy.service;

import java.util.List;

import com.identiphy.model.TenantUser;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface TenantUserService {
//    public BiometricTypes findById(Long id);
//    public BiometricTypes findByUsername(String username);
    public List<TenantUser> findAll ();
    public TenantUser save(TenantUser obj);
    public void delete(long id);
}
