package com.identiphy.service;

import java.util.List;

import com.identiphy.model.Tenant;
import com.identiphy.model.TenantUser;
import com.identiphy.model.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface TenantService {
    public List<Tenant> findAll ();
    public Tenant save(Tenant obj);
    public void delete(long id);
    public Tenant findById(Long id);
    public List<Object> findTenantUsersById( Long id );
    public List<Object> findTenantSubscriptionsById( Long id );
}
