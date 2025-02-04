package com.fifi.apihrassociation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fifi.apihrassociation.models.User;
import com.fifi.apihrassociation.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    
    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    public  List<User> getUsers(){
        return userRepository.findAll();
    }
}
