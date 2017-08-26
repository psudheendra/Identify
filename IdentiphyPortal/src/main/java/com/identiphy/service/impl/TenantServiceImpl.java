package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.Tenant;
import com.identiphy.model.TenantUser;
import com.identiphy.model.User;
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
	
	@PreAuthorize("hasRole('ADMIN')")
    public Tenant findById( Long id ) throws AccessDeniedException {
		try {
		Tenant u = tenantRepository.findOne( id );
        return u;
		}
		catch ( Exception e) {
			System.out.println(e.toString());
		}
		return null;
    }
	
	@PreAuthorize("hasRole('ADMIN')")
    public List<TenantUser> findTenantUsersById( Long id ) throws AccessDeniedException {
		try {
		Tenant u = tenantRepository.findOne( id );
		if ( u != null ) {
			return u.getTenantUsers();
		}
        
		}
		catch ( Exception e) {
			System.out.println(e.toString());
		}
		return null;
    }
}
