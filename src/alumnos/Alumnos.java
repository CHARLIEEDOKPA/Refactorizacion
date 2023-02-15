package alumnos;

import Alumno.Alumno;
import static alumnos.AñadirAlumnos.añadirAlumno;
import java.util.Scanner;

/**
 * 
 * @author Charlie Jnr Onosetale Edokpaa Aigbiremhon
 * @version 1
 */

public class Alumnos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sumaDeMedias = 0;

        // Define la estructura, un array de 5 alumnos
        // pero no crea los objetos
        Alumno[] alum = new Alumno[5];

        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

        String nombreIntroducido;
        double notaIntroducida;
        
        /**
         *Dentro del for llamar la funcion anyadir alumnos que estara en otra clase 
         */

        for (int i = 0; i < alum.length; i++) {

            añadirAlumno(alum, i, entrada);
            sumaDeMedias += alum[i].getNota();
        } // for i

        // Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");

        for (int i = 0; i < alum.length; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alum[i].getNombre());
            System.out.println("Nota media: " + alum[i].getNota());
            System.out.println("----------------------------");


        } // for i

        System.out.println("La media global de la clase es " + sumaDeMedias / alum.length);
    }

}