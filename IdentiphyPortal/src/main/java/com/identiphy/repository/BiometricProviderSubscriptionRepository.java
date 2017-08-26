package com.identiphy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identiphy.model.BiometricProviderSubscriptionDetails;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface BiometricProviderSubscriptionRepository extends JpaRepository<BiometricProviderSubscriptionDetails, Long> {

}

