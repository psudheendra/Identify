package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.BiometricProviderSubscriptionDetail;
import com.identiphy.repository.BiometricProviderSubscriptionRepository;
import com.identiphy.service.BiometricProviderSubscriptionDetailService;
import java.util.List;

@Service
public class BiometricProviderSubscriptionDetailServiceImpl implements BiometricProviderSubscriptionDetailService {
    @Autowired
    private BiometricProviderSubscriptionRepository biometricProviderSubscriptionRepository;

    @PreAuthorize("hasRole('ADMIN')")
    public List<BiometricProviderSubscriptionDetail> findAll() throws AccessDeniedException {
        List<BiometricProviderSubscriptionDetail> result = biometricProviderSubscriptionRepository.findAll();
        return result;
    }

	@Override
	public BiometricProviderSubscriptionDetail save(BiometricProviderSubscriptionDetail obj) {
		if (obj != null)
			obj = biometricProviderSubscriptionRepository.save(obj);

		return obj;
	}

	@Override
	public void delete(long id) {
		if ( id > 0 )
			biometricProviderSubscriptionRepository.delete(id);		
	}

	@Override
	public BiometricProviderSubscriptionDetail findById(Long id) {
		BiometricProviderSubscriptionDetail u = biometricProviderSubscriptionRepository.findOne( id );
        return u;
	}
}
