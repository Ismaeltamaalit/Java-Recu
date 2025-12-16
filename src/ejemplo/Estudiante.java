package ejemplo;

import java.lang.Comparable;
import java.util.Objects;

public class Estudiante implements Comparable<Estudiante> {

    private final String nombre;
    private final double notaEvaluacion;

    public Estudiante(String nombre, double notaEvaluacion) {
        this.nombre = nombre;
        this.notaEvaluacion = notaEvaluacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaEvaluacion() {
        return notaEvaluacion;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        return this.nombre.compareTo(otroEstudiante.nombre);
    }
    
    @Override
    public String toString() {
        return nombre + " (" + notaEvaluacion + ")";
    }
}