package com.mycompany.personaclass;

public class Persona {

    // Atributos de la clase Persona
    private int id;
    private String nombre;
    private String cedula;
    private String correo;
    private String genero;
    private int edad;

    // constructor de la clase Persona

    public Persona(int id, String nombre, String cedula, String correo, String genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.genero = genero;
        this.edad = edad;
    }
    
    
    // Setters y Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}