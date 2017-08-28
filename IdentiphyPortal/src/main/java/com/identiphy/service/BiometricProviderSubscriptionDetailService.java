package com.identiphy.service;

import java.util.List;

import com.identiphy.model.BiometricProviderSubscriptionDetail;

public interface BiometricProviderSubscriptionDetailService {

    public List<BiometricProviderSubscriptionDetail> findAll ();

    BiometricProviderSubscriptionDetail save(BiometricProviderSubscriptionDetail obj);

	void delete(long id);

	BiometricProviderSubscriptionDetail findById(Long id);
}
