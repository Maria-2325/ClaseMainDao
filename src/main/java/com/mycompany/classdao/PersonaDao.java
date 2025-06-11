package com.mycompany.classdao;

import com.mycompany.personaclass.Persona;


public interface PersonaDao {

    // Métodos de la clase Persona Dao
    void agregarPersona(Persona persona);
    void modificarPersona(int id, Persona personaModificada); 
    void eliminarPersona(int id);
    Persona[] obtenerDatosPersonas();
    void imprimirPersonas();
}