package com.servife.API.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String email;
    private String password;

    // agregar stats, ubicacion, etc

    public Profesional() {}

}
