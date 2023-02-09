package com.example.projectapirest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    // incrementa el id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Que no sea null -> vacio
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(length = 9)
    private String telefono;

    @Column(nullable = false)
    private String direccion;
}
