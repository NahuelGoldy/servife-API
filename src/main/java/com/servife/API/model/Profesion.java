package com.servife.API.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "profesiones")
public class Profesion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int nombre;

    public Profesion() {}

}
