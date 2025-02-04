package com.fifi.apihrassociation.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fifi.apihrassociation.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
    
}
