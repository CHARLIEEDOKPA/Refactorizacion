package Alumno;

/**
 * Alumno.java
 * Definición de la clase Alumno
 * @author Charlie Onosetale Edokpaa Aigbiremhon
 */

public class Alumno {


  private String nombre;
  private double nota;
  
  public Alumno (String nombre, double notaMedia) {
      this.nombre = nombre;
      this.nota = notaMedia;
  }

    public double getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }
  
  
  
}
