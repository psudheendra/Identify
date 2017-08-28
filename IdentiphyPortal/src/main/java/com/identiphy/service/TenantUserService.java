package com.identiphy.service;

import java.util.List;

import com.identiphy.model.TenantUser;

public interface TenantUserService {
    public List<TenantUser> findAll ();
    public TenantUser save(TenantUser obj);
    public void delete(long id);
    public TenantUser findById(Long id);    
}
