package com.fifi.apihrassociation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fifi.apihrassociation.models.Employe;
import com.fifi.apihrassociation.repository.EmployeRepository;

@Service
public class EmployeService implements IEmployeService {
    @Autowired
    private EmployeRepository employeRepository;
    @Override
    public List<Employe> showEmploye() {
        return employeRepository.findAll();
    }

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getOneEmploye(Long id) {
        return employeRepository.findById(id).get();
    }

    @Override
    public void deleteEmploye(Long id) {
       employeRepository.deleteById(id);
    }

    @Override
    public Employe updateEmploye(Long id, Employe employe) {
        Employe emp = employeRepository.findById(id).get();
        emp.setNom(employe.getNom());
        emp.setPrenom(employe.getPrenom());
        emp.setDnaisance(employe.getDnaisance());
        emp.setSexe(employe.getSexe());
        return employeRepository.save(emp);
    }
    


    
}
