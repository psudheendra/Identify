package com.identiphy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identiphy.model.BiometricProviderDetails;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface BiometricProviderDetailRepository extends JpaRepository<BiometricProviderDetails, Long> {

}

