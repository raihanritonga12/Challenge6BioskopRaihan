package com.binarchallenge4.demo.service;

import com.binarchallenge4.demo.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> cariSemuaUser();
    Optional<UserEntity> cariDariID(Long id);
    UserEntity simpanUser(UserEntity userEntity);
    UserEntity updateUser(Long id, UserEntity userEntity);
    String deleteUser(Long id);



}
