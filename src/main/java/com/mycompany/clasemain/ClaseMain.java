
package com.mycompany.clasemain;

import com.mycompany.classdao.*;
import com.mycompany.personaclass.Persona;
import com.mycompany.controlador.PersonaServicio;

public class ClaseMain {

    public static void main(String[] args) {

        PersonaDao objPersonaDao = new ImplePersonaDao();   
        PersonaServicio objPersonaServicio = new PersonaServicio(objPersonaDao);

        System.out.println("\n\t-------REGISTRO DE PERSONAS PARA UN CURSO DE NATACION-----------");
        System.out.println("\n--------AGREGANDO PERSONAS---------");
        objPersonaServicio.registrarPersona(new Persona(0, "William", "223453344", "wsdff", "  Masculino", 22));
        objPersonaServicio.registrarPersona(new Persona(0, "Licet", "0803807", "liset", " Femenino", 19));
        System.out.println("\n-----PERSONAS REGISTRADAS------------");
        objPersonaServicio.imprimirPersonas();
        System.out.println("\n----MODIFICANDO DATOS DE LAS PERSONAS--------");
        Persona nuevaPersona = (new Persona(1, "Mateo", "223456", "wsdff", "  Masculino", 22));
        objPersonaServicio.modificarPersona(nuevaPersona);
        objPersonaServicio.imprimirPersonas();
        System.out.println("\n-------ELIMINANDO PERSONA 2 DEL CURSO------");
        objPersonaServicio.eliminarPersona(2);
        System.out.println("-----PERSONAS QUE QUEDAN EN EL CURSO-----");
        objPersonaServicio.imprimirPersonas();

}
}