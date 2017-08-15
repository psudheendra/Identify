package com.identiphy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identiphy.model.BiometricType;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface BiometricTypeRepository extends JpaRepository<BiometricType, Long> {

}

