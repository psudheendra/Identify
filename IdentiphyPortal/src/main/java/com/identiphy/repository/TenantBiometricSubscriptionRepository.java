package com.identiphy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identiphy.model.TenantBiometricSubscription;

public interface TenantBiometricSubscriptionRepository extends JpaRepository<TenantBiometricSubscription, Long> {

}