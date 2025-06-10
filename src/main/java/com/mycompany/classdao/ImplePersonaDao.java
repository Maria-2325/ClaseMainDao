package com.mycompany.classdao;

import com.mycompany.personaclass.Persona;

public class ImplePersonaDao implements PersonaDao {

    // Persona objPersona = new Persona();
    int contador = 0;
    int idContador = 001;

    Persona[] personas = new Persona[3];

    @Override
    public void agregarPersona(Persona persona) {
        System.out.println("Agregando personas...");

        if (contador > personas.length) {
            persona.setId(idContador++);
            personas[contador++] = persona;
        } else {
            System.out.println("Error....sus datos son invalidos, vuelva a nacer");
        }
    }

    @Override
    public void modificarPersona(int id) {

    }

    @Override
    public void eliminar(int id) {
        personas[id] = null;
    }

    @Override
    public void imprimir(Persona persona) {

        for (int i = 0; i < contador; i++) {
            
            // personas [persona1(nombre,edad), persona2(nombre,edad)]
            System.out.println("Persona: " + (i + 1));
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Cedula: " + personas[i].getCedula());
            System.out.println("Correo: " + personas[i].getCorreo());
            System.out.println("Genero: " + personas[i].getGenero());
            System.out.println("Edad: " + personas[i].getEdad());
        }
    }
    
    public Persona[] obtenerDatos(){
        Persona[] resultado = new Persona[contador];
        
        for (int i = 0; i < contador; i++){
            resultado[i] = personas[i];
        }
        return resultado;
    }
}
