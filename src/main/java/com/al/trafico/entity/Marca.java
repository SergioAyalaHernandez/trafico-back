package com.al.trafico.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Marca {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;

  private String direccionSocial;

  @OneToMany(mappedBy = "marca")
  private List<Modelo> modelos;
}

