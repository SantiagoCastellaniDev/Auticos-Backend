
// Clase AUTOMOVIL

package com.auticos.auticos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Automovil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String modelo;
    
    private String marca;
    
    private String motor;

    private String patente;
    
    private String color;
    
    private int cantPuertas;
    
    // Agrego Imagen
    private String imagen;
    //Constructor

    public Automovil() {
    }

    public Automovil(Long id, String modelo, String marca, String motor, String patente, String color, int cantPuertas, String imagen) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.patente = patente;
        this.color = color;
        this.cantPuertas = cantPuertas;
        this.imagen = imagen;
    }

    
    
}
