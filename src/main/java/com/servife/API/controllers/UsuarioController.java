package com.servife.API.controllers;

import com.servife.API.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class UsuarioController implements Serializable {

    @Autowired
    private DBService db;

    // public Usuario registrarUsuario() {...}
}
