package com.fifi.apihrassociation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fifi.apihrassociation.models.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    
}
