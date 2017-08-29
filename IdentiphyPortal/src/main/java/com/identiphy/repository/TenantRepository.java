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
	
	@Query(value = "select biometric_provider.providername, biometric_type.biometricname, biometric_provider.contactperson, biometric_provider_detail.subscriptioncurrency, biometric_provider_detail.subscriptiontype from biometric_provider inner join biometric_provider_detail on biometric_provider_detail.providerid = biometric_provider.id inner join biometric_type on biometric_type.id = biometric_provider_detail.biometrictypeid inner join biometric_provider_subscription_details on biometric_provider_subscription_details.biometricproviderdetailid = biometric_provider_detail.id inner join tenant_biometric_subscriptions on tenant_biometric_subscriptions.biometricproviderdetailsubscriptionid = biometric_provider_subscription_details.id where tenant_biometric_subscriptions.tenantid = ?1", nativeQuery=true)
	List<Object> findTenantSubscriptionsById( Long TenantId );

}

