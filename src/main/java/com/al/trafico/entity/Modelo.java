package com.al.trafico.entity;

import jakarta.persistence.*;

@Entity
public class Modelo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;

  private Integer potencia;

  @ManyToOne
  @JoinColumn(name = "marca_id")
  private Marca marca;
}

