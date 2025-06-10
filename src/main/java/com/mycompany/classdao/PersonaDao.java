package com.mycompany.classdao;

import com.mycompany.personaclass.Persona;


public interface PersonaDao {

    // Métodos de la clase Persona Dao
    public void agregarPersona(Persona persona);

    public void modificarPersona(int id); 

    public void eliminar(int id);

    public void imprimir(Persona persona);
    public Persona[] obtenerDatos();
    
    

}