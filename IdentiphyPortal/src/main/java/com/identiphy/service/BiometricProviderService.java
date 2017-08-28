package com.identiphy.service;

import java.util.List;

import com.identiphy.model.BiometricProvider;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface BiometricProviderService {

	public List<BiometricProvider> findAll(); 
	
	BiometricProvider save(BiometricProvider obj);

	void delete(long id);

	BiometricProvider findById(Long id);

}
