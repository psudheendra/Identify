package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.BiometricProviderSubscriptionDetail;
import com.identiphy.model.TenantBiometricSubscription;
import com.identiphy.repository.BiometricProviderSubscriptionRepository;
import com.identiphy.repository.TenantBiometricSubscriptionRepository;
import com.identiphy.service.BiometricProviderSubscriptionDetailService;
import com.identiphy.service.TenantBiometricSubscriptionService;

import java.util.List;

@Service
public class TenantBiometricSubscriptionServiceImpl implements TenantBiometricSubscriptionService {
    @Autowired
    private TenantBiometricSubscriptionRepository tenantBiometricSubscriptionRepository;

    @PreAuthorize("hasRole('ADMIN')")
    public List<TenantBiometricSubscription> findAll() throws AccessDeniedException {
        List<TenantBiometricSubscription> result = tenantBiometricSubscriptionRepository.findAll();
        return result;
    }

	@Override
	public TenantBiometricSubscription save(TenantBiometricSubscription obj) {
		if (obj != null)
			obj = tenantBiometricSubscriptionRepository.save(obj);

		return obj;
	}

	@Override
	public void delete(long id) {
		if ( id > 0 )
			tenantBiometricSubscriptionRepository.delete(id);		
	}

	@Override
	public TenantBiometricSubscription findById(Long id) {
		TenantBiometricSubscription u = tenantBiometricSubscriptionRepository.findOne( id );
        return u;
	}
}
