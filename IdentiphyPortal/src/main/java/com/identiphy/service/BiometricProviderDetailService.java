package com.identiphy.service;

import java.util.List;

import com.identiphy.model.BiometricProviderDetail;
import com.identiphy.model.BiometricType;

public interface BiometricProviderDetailService {

    public List<BiometricProviderDetail> findAll ();
    public BiometricProviderDetail save(BiometricProviderDetail obj);
    public void delete(long id);
    public BiometricProviderDetail findById(Long id);
}
