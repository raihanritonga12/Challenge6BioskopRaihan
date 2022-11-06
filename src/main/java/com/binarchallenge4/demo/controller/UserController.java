package com.binarchallenge4.demo.controller;

import com.binarchallenge4.demo.entity.UserEntity;
import com.binarchallenge4.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pengguna")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/buat")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity create(@RequestBody UserEntity user){
        return userService.simpanUser(user);
    }
    @GetMapping("/ambilSemua")
    public List<UserEntity> getall(){
        return userService.cariSemuaUser();
    }
    @PutMapping("/perbaharui/{id}")
    public UserEntity update(@PathVariable Long id, @RequestBody UserEntity user){
        return userService.updateUser(id,user);
    }
    @DeleteMapping("/hapus/{id}")
    public String delete(@PathVariable Long id){
        return userService.deleteUser(id);
    }




}
