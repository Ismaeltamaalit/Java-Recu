package practicaSuelta;

public class Trabajador extends Persona {

    private double salarioHora;
    private int horas;

    public Trabajador(String nombre, String apellidos, double salarioHora, int horas) {
        super(nombre, apellidos);
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    @Override
    public double calcularDato() {
        return salarioHora * horas;
    }

    @Override
    public String toString() {
        return "Trabajador: " + getNombre() + " " + getApellidos() +
               " | Salario total: " + calcularDato();
    }
}
