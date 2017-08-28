package com.identiphy.service;

import java.util.List;

import com.identiphy.model.BiometricType;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserSubscriptionLogService {
//    public BiometricTypes findById(Long id);
//    public BiometricTypes findByUsername(String username);
    public List<BiometricType> findAll ();
}
