package com.identiphy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identiphy.model.BiometricProviderSubscriptionDetail;

public interface BiometricProviderSubscriptionRepository extends JpaRepository<BiometricProviderSubscriptionDetail, Long> {

}

