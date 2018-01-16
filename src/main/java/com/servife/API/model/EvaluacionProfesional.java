package com.servife.API.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EvaluacionProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int calidadTrabajo;
    private int cumplimientoPlazos;
    private int prolijidad;
    private int precio;
    private String comentarios;

    public EvaluacionProfesional() {}

}
