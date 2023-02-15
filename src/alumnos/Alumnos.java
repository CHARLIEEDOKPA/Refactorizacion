package alumnos;

import Alumno.Alumno;
import static alumnos.AnyadirAlumnos.añadirAlumno;
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
        Alumno[] alumnos = new Alumno[5];

        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

        /**
         * 
         */
        for (int i = 0; i < alumnos.length; i++) {

            añadirAlumno(alumnos, i, entrada);
            sumaDeMedias += alumnos[i].getNota();
        } // for i

        // Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alumnos[i].getNombre());
            System.out.println("Nota : " + alumnos[i].getNota());
            System.out.println("----------------------------");

        } // for i

        System.out.println("La media global de la clase es " + sumaDeMedias / alumnos.length);
    }

}
