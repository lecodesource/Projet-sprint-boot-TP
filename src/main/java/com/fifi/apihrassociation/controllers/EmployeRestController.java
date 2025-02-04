package com.fifi.apihrassociation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fifi.apihrassociation.models.Employe;
import com.fifi.apihrassociation.services.EmployeService;

@RestController
public class EmployeRestController {
    @Autowired
    private EmployeService employeService;

    @GetMapping("/employes")
    public List<Employe> showEmploye() {
        return employeService.showEmploye();
    }

    @GetMapping("/employes/{id}")
    public Employe getOneEmploye(@PathVariable Long id) {
        return employeService.getOneEmploye(id);
    }

    @PostMapping("/employes")
    public Employe saveEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    // pour mettre a jour plusieurs enployes on utilise un patch
    @PutMapping("/employes/{id}")
    public Employe updateEmploye(@PathVariable Long id, @RequestBody  Employe employe) {
        return employeService.updateEmploye(id, employe);
    }

    @DeleteMapping("/employes/delete/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}

