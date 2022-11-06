package com.binarchallenge4.demo.service.impl;

import com.binarchallenge4.demo.entity.UserEntity;
import com.binarchallenge4.demo.service.UserService;
import org.springframework.stereotype.Service;
import com.binarchallenge4.demo.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<UserEntity> cariSemuaUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> cariDariID(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public UserEntity simpanUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(Long id,UserEntity userEntity) {
        UserEntity userEntityUpdate=userRepository.findById(id).get();
        userEntityUpdate.setUsername(userEntity.getUsername());
        userEntityUpdate.setPassword(userEntity.getPassword());
        userEntityUpdate.setEmail(userEntity.getEmail());
        return userRepository.save(userEntityUpdate);
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User Has Been Deleted";
    }
}
