package com.al.trafico.entity;

import jakarta.persistence.*;

@Entity
public class Multa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Double importe;

  private String estado;

  @OneToOne
  @JoinColumn(name = "infraccion_id", unique = true)
  private Infraccion infraccion;
}
