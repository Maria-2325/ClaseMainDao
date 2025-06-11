
package com.mycompany.clasemain;

import com.mycompany.classdao.*;
import com.mycompany.personaclass.Persona;

public class ClaseMain {

    public static void main(String[] args) {
        PersonaDao objPersonaDao = new ImplePersonaDao();
        System.out.println("\n\t-------REGISTRO DE PERSONAS PARA UN CURSO DE NATACION-----------");
        System.out.println("\n--------AGREGANDO PERSONAS---------");
        objPersonaDao.agregarPersona(new Persona(0, "William", "223453344", "wsdff", "  Masculino", 22));
        objPersonaDao.agregarPersona(new Persona(0, "Licet", "0803807", "liset", " Femenino", 19));
        System.out.println("\n-----PERSONAS REGISTRADAS------------");
        objPersonaDao.imprimirPersonas();
        System.out.println("\n----MODIFICANDO DATOS DE LAS PERSONAS--------");
        Persona nuevaPersona = (new Persona(1, "Mateo", "223456", "wsdff", "  Masculino", 22));
        objPersonaDao.modificarPersona(1, nuevaPersona);
        objPersonaDao.imprimirPersonas();
        System.out.println("\n-------ELIMINANDO PERSONA 2 DEL CURSO------");
        objPersonaDao.eliminarPersona(2);
        System.out.println("-----PERSONAS QUE QUEDAN EN EL CURSO-----");
        objPersonaDao.imprimirPersonas();

}
}