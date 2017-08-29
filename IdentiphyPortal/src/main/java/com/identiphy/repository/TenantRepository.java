package com.identiphy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.identiphy.model.Tenant;
import com.identiphy.model.TenantUser;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface TenantRepository extends JpaRepository<Tenant, Long> {
	
	@Query(value = "SELECT id, email, employee_alias as employeealias, lastupdateddate, lastupdateduserid, password, phone, role, status, tenant_id as tenantid, user_name as username FROM tenant_user WHERE tenant_id = ?1", nativeQuery=true)
	List<Object> findTenantUsersById( Long id );
	
	@Query(value = "SELECT id, email, employee_alias as employeealias, lastupdateddate, lastupdateduserid, password, phone, role, status, tenant_id as tenantid, user_name as username FROM tenant_user WHERE tenant_id = ?1", nativeQuery=true)
	List<Object> findTenantSubscriptionsById( Long id );

}

