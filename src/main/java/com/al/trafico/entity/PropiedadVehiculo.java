package com.al.trafico.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PropiedadVehiculo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Vehiculo vehiculo;

  @ManyToOne
  private Persona propietario;

  private LocalDate fechaInicio;

  private LocalDate fechaFin;
}

