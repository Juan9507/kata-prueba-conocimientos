package org.example.model;

import java.util.Objects;

public class Usuario {

    private String nombre;
    private String apellido;
    private Integer edad;
    private String correo;

    public Usuario(String nombre, String apellido, Integer edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getNombre(), usuario.getNombre()) && Objects.equals(getApellido(), usuario.getApellido()) && Objects.equals(getEdad(), usuario.getEdad()) && Objects.equals(getCorreo(), usuario.getCorreo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getEdad(), getCorreo());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }
}
