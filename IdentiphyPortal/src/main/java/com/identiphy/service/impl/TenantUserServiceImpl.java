package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.TenantUser;
import com.identiphy.model.User;
import com.identiphy.repository.TenantUserRepository;
import com.identiphy.service.TenantUserService;

import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Service
public class TenantUserServiceImpl implements TenantUserService {
	@Autowired
	private TenantUserRepository tenantUserRepository;

	@PreAuthorize("hasRole('ADMIN')")
	public List<TenantUser> findAll() throws AccessDeniedException {
		List<TenantUser> result = tenantUserRepository.findAll();
		return result;
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public TenantUser save(TenantUser obj) {
		if (obj != null)
			obj = tenantUserRepository.save(obj);

		return obj;
	}

	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public void delete(long id) {
		if ( id > 0 )
			tenantUserRepository.delete(id);

	}

	@Override
	public TenantUser findById(Long id) {
		TenantUser u = tenantUserRepository.findOne( id );
        return u;
	}
}
