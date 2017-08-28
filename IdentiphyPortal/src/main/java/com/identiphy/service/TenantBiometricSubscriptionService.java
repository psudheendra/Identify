package com.identiphy.service;

import java.util.List;

import com.identiphy.model.BiometricType;
import com.identiphy.model.TenantBiometricSubscription;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface TenantBiometricSubscriptionService {

	public List<TenantBiometricSubscription> findAll();
	
	TenantBiometricSubscription findById(Long id);

	void delete(long id);

	TenantBiometricSubscription save(TenantBiometricSubscription obj);

}
