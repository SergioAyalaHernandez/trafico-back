package com.al.trafico.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Infraccion {
  @Id
  private String numeroExpediente;

  @ManyToOne
  private Persona persona;

  @ManyToOne
  private Vehiculo vehiculo; // Puede ser null

  private LocalDate fecha;

  private String articuloInfringido;

  private String carretera;

  private String kilometro;

  private String direccion;

  @ManyToOne
  private Agente agente;

  @OneToOne(mappedBy = "infraccion", cascade = CascadeType.ALL)
  private Multa multa;
}

