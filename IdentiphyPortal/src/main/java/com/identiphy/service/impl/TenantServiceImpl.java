package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.Tenant;
import com.identiphy.repository.TenantRepository;
import com.identiphy.service.TenantService;

import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Service
public class TenantServiceImpl implements TenantService {
	@Autowired
	private TenantRepository tenantRepository;

	@PreAuthorize("hasRole('ADMIN')")
	public List<Tenant> findAll() throws AccessDeniedException {
		List<Tenant> result = tenantRepository.findAll();
		return result;
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public Tenant save(Tenant obj) {
		if (obj != null)
			obj = tenantRepository.save(obj);

		return obj;
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public void delete(long id) {
		if ( id > 0 )
			tenantRepository.delete(id);

	}
}
