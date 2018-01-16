package com.servife.API.services;

import com.servife.API.repositories.AcuerdoTrabajoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private AcuerdoTrabajoRepository acuerdoTrabajoRepo;

    // TODO agregar todos los repos y hacer los metodos que se necesiten: findAll(), save(), etc
}
