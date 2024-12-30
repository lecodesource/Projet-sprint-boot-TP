package com.fifi.apihrassociation.services;

import java.util.List;

import com.fifi.apihrassociation.models.Employe;

public interface IEmployeService {
    public List<Employe> showEmploye();

    public Employe saveEmploye(Employe employe);

    public Employe getOneEmploye(Long id);

    public void deleteEmploye(Long id);

    public Employe updateEmploye(Long id, Employe employe);
}

