package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.BiometricProvider;
import com.identiphy.model.BiometricProviderDetail;
import com.identiphy.model.BiometricType;
import com.identiphy.model.Tenant;
import com.identiphy.repository.BiometricProviderDetailRepository;
import com.identiphy.repository.BiometricProviderRepository;
import com.identiphy.repository.BiometricTypeRepository;
import com.identiphy.service.BiometricProviderDetailService;
import com.identiphy.service.BiometricProviderService;
import com.identiphy.service.BiometricTypeService;

import java.util.List;

@Service
public class BiometricProviderServiceImpl implements BiometricProviderService {
    @Autowired
    private BiometricProviderRepository biometricProviderTypeRepository;

    @PreAuthorize("hasRole('ADMIN')")
    public List<BiometricProvider> findAll() throws AccessDeniedException {
        List<BiometricProvider> result = biometricProviderTypeRepository.findAll();
        return result;
    }

	@Override
	public BiometricProvider save(BiometricProvider obj) {
		if (obj != null)
			obj = biometricProviderTypeRepository.save(obj);

		return obj;
	}

	@Override
	public void delete(long id) {
		if ( id > 0 )
			biometricProviderTypeRepository.delete(id);		
	}

	@Override
	public BiometricProvider findById(Long id) {
		BiometricProvider u = biometricProviderTypeRepository.findOne( id );
        return u;
	}
}
