package com.mycompany.classdao;

import com.mycompany.personaclass.Persona;

public class ImplePersonaDao implements PersonaDao {

    // Persona objPersona = new Persona();
    int contador = 0;
    int idContador = 001;

    Persona[] personas = new Persona[3];

    @Override
    // AGREGAR PERSONAS AL CURSO
    public void agregarPersona(Persona persona) {
        System.out.println("Agregando personas...");

        if (contador < personas.length) {
            persona.setId(idContador++);
            personas[contador++] = persona;
        } else {
            System.out.println("Error....sus datos son invalidos, vuelva a nacer");
        }
    }

    @Override
    // MODIFICAR PERSONAS DEL CURSO
    public void modificarPersona(int id, Persona personaModificada) {
        for (int i = 0; i < contador; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                personaModificada.setId(id);
                personas[i]= personaModificada;
                break;
            }
        }
    }

    @Override
    // ELIMINAR PERSONAS DEL CURSO
    public void eliminarPersona(int id) {
        for (int i = 0; i < contador; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                personas[i] = null;
                break;
            }
        }
    }

    @Override
    public Persona[] obtenerDatosPersonas() {

        int cantidadPersonas = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                cantidadPersonas++;
            }
        }

        Persona[] totalPersonas = new Persona[cantidadPersonas];

        int indicePersona = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                totalPersonas[indicePersona] = personas[i];
                indicePersona++;
            }
        }
        return totalPersonas;
    }


}