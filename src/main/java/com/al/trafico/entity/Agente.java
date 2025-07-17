package com.al.trafico.entity;

import jakarta.persistence.*;

@Entity
public class Agente {
  @Id
  private String numeroRegistro;

  private String nombre;

  private String apellidos;

  private String calle;

  private String numero;

  private String municipio;

  private String provincia;

  private String codigoPostal;

  @ManyToOne
  private UnidadTransito unidad;
}

