package Alumno;

/**
 * Alumno.java Definición de la clase Alumno
 *
 * @author Charlie Onosetale Edokpaa Aigbiremhon
 * @version 1
 */
public class Alumno {

    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    /**
     * 
     * @return Devuelve la nota del alumno
     */
    public double getNota() {
        return nota;
    }
    /**
     * 
     * @return Devuelve el nombre del usuario; 
     */
    public String getNombre() {
        return nombre;
    }

}
