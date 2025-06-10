
package com.mycompany.clasemain;

import com.mycompany.classdao.*;
import com.mycompany.personaclass.Persona;
public class ClaseMain {

    public static void main(String[] args) {
        PersonaDao objPersonaDao = new ImplePersonaDao();
        Persona[] personas = objPersonaDao.obtenerDatos();
        System.out.println();
        
        objPersonaDao.agregarPersona(new Persona(001, "Licet", "08232", "liset@gmail.com", "Femenino", 19));
        
        System.out.println(objPersonaDao.obtenerDatos());
    }
}