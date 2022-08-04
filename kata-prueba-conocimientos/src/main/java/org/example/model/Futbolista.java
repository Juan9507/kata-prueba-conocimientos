package org.example.model;

import java.util.List;

public class Futbolista {

    private String nombre;
    private String apellido;
    private Integer edad;
    private List<Copas> copas;

    public Futbolista(String nombre, String apellido, Integer edad, List<Copas> copas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.copas = copas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<Copas> getCopas() {
        return copas;
    }

    public void setCopas(List<Copas> copas) {
        this.copas = copas;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", copas=" + copas +
                '}';
    }
}
