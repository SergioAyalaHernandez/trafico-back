package com.al.trafico.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Vehiculo {
  @Id
  private String bastidor;

  private String matricula;

  private LocalDate fechaMatriculacion;

  @ManyToOne
  @JoinColumn(name = "marca_id")
  private Marca marca;

  @ManyToOne
  @JoinColumn(name = "modelo_id")
  private Modelo modelo;

  @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
  private List<PropiedadVehiculo> propietarios;
}

