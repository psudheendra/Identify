package com.identiphy.service;

import java.util.List;

import com.identiphy.model.TenantUser;
import com.identiphy.model.TenantUserSubscription;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface TenantUserSubscriptionService {
    public List<TenantUserSubscription> findAll ();
    public TenantUserSubscription save(TenantUserSubscription obj);
    public void delete(long id);
    public TenantUserSubscription findById(Long id);    
}
