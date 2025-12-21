package practicaSuelta;

public class Estudiante extends Persona {

    private String nre;
    private double notaMedia;

    public Estudiante(String nombre, String apellidos, String nre, double notaMedia) {
        super(nombre, apellidos);
        this.nre = nre;
        this.notaMedia = notaMedia;
    }

    // SOBRECARGA DE MÉTODOS
    public void calcularNota(double n1, double n2) {
        notaMedia = (n1 + n2) / 2;
    }

    public void calcularNota(double n1, double n2, double n3) {
        notaMedia = (n1 + n2 + n3) / 3;
    }

    // Implementación del método abstracto
    @Override
    public double calcularDato() {
        return notaMedia;
    }

    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + " " + getApellidos() +
               " | NRE: " + nre +
               " | Nota media: " + notaMedia;
    }
}
