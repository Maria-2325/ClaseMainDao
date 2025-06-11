package com.mycompany.controlador;


import com.mycompany.interfazdao.PersonaDao;
import com.mycompany.personaclass.Persona;;;

public class PersonaServicio {
    // Atributos
    private PersonaDao personaDao;

    // constructor
    public PersonaServicio(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    // Setters y Getters
    public PersonaDao getPersonaDao() {
        return personaDao;
    }

    public void setPersonaDao(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    // Métodos
    public void registrarPersona(Persona registrarPersona) {
        personaDao.agregarPersona(registrarPersona);
    }

    public void modificarPersona(Persona nuevaPersona) {
        personaDao.modificarPersona(nuevaPersona.getId(), nuevaPersona);
    }

    public void eliminarPersona(int id) {
        personaDao.eliminarPersona(id);
    }

    // IMPRIMIR DATOS DE LAS PERSONAS
    public void imprimirPersonas() {

        Persona[] mostrarPersonas = personaDao.obtenerDatosPersonas();
        for (int i = 0; i < mostrarPersonas.length; i++) {

            Persona varPersona = mostrarPersonas[i];
            if (varPersona != null) {
                System.out.println("Id: " + varPersona.getId());
                System.out.println("Nombre: " + varPersona.getNombre());
                System.out.println("Cedula: " + varPersona.getCedula());
                System.out.println("Correo: " + varPersona.getCorreo());
                System.out.println("Genero: " + varPersona.getGenero());
                System.out.println("Edad: " + varPersona.getEdad());
            }
        }
    }

}
