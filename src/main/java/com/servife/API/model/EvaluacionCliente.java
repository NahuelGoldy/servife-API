package com.servife.API.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EvaluacionCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int cumplimientoPago;
    private int cumplimientoTerminos;
    private String comentarios;

    public EvaluacionCliente() {}
}
