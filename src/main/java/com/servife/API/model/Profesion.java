package com.servife.API.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Profesion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int nombre;

    public Profesion() {}

}
