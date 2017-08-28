package com.identiphy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identiphy.model.TenantUserSubscription;

public interface TenantUserSubscriptionRepository extends JpaRepository<TenantUserSubscription, Long> {
	

}

