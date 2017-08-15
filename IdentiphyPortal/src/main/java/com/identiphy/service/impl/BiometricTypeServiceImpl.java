package com.identiphy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.identiphy.model.BiometricType;
import com.identiphy.repository.BiometricTypeRepository;
import com.identiphy.service.BiometricTypeService;

import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Service
public class BiometricTypeServiceImpl implements BiometricTypeService {
    @Autowired
    private BiometricTypeRepository biometricTypeRepository;

    @PreAuthorize("hasRole('ADMIN')")
    public List<BiometricType> findAll() throws AccessDeniedException {
        List<BiometricType> result = biometricTypeRepository.findAll();
        return result;
    }
}
