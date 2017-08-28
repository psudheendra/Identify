package com.identiphy.service;

import java.util.List;

import com.identiphy.model.BiometricType;
import com.identiphy.model.Tenant;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface BiometricTypeService {
    public List<BiometricType> findAll ();
    public BiometricType save(BiometricType obj);
    public void delete(long id);
    public BiometricType findById(Long id);
}
