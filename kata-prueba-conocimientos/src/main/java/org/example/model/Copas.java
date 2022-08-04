package org.example.model;

public class Copas {

    private String nombre;
    private Integer numero;

    public Copas(String nombre, Integer numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Copas{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                '}';
    }
}
