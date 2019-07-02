package com.diego.apispringbd.dominio;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Empleado {
    private @Id @GeneratedValue Long id;
    private String nombre;
    private String cargo;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }
}
