package com.al.trafico.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UnidadTransito {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;

  @OneToMany(mappedBy = "unidad")
  private List<Agente> agentes;
}

