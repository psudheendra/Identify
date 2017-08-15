package com.identiphy.service;

import java.util.List;

import com.identiphy.model.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
    public User findById(Long id);
    public User findByUsername(String username);
    public List<User> findAll ();
}
