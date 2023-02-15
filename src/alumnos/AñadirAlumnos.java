/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

import Alumno.Alumno;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class AñadirAlumnos {

    /**
     *
     * @param alum Sera la tabla de alumnos
     * @param i Sera el indice para añadir los alumnos a la tabla
     * @param entrada Sera para escribir en teclado;
     */
    static void añadirAlumno(Alumno[] alum, int i, Scanner entrada) {
        String nombreIntroducido;
        double notaIntroducida;
        System.out.println("Alumno " + i);
        System.out.print("Nombre: ");
        nombreIntroducido = entrada.nextLine();
        do {
            System.out.print("Nota: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
        } while (notaIntroducida > 10 || notaIntroducida < 0);

        alum[i] = new Alumno(nombreIntroducido, notaIntroducida);
    }

}
