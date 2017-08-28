package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.Tenant;
import com.identiphy.model.TenantUser;
import com.identiphy.model.TenantUserSubscription;
import com.identiphy.model.User;
import com.identiphy.repository.TenantRepository;
import com.identiphy.repository.TenantUserSubscriptionRepository;
import com.identiphy.service.TenantService;
import com.identiphy.service.TenantUserSubscriptionService;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Service
public class TenantUserSubscriptionServiceImpl implements TenantUserSubscriptionService {
	@Autowired
	private TenantUserSubscriptionRepository tenantUserSubscriptionRepository;

	@PreAuthorize("hasRole('ADMIN')")
	public List<TenantUserSubscription> findAll() throws AccessDeniedException {
		List<TenantUserSubscription> result = tenantUserSubscriptionRepository.findAll();
		return result;
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public TenantUserSubscription save(TenantUserSubscription obj) {
		if (obj != null)
			obj = tenantUserSubscriptionRepository.save(obj);

		return obj;
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public void delete(long id) {
		if ( id > 0 )
			tenantUserSubscriptionRepository.delete(id);

	}
	
	@PreAuthorize("hasRole('ADMIN')")
    public TenantUserSubscription findById( Long id ) throws AccessDeniedException {

		TenantUserSubscription u = tenantUserSubscriptionRepository.findOne( id );
        return u;
		
    }
	
}
