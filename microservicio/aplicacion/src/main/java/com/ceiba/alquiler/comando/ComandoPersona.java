package com.ceiba.alquiler.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoPersona {

    private Integer idPersona;
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
}
