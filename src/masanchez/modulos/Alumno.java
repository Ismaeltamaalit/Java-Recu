package masanchez.modulos;

public class Alumno {

    private int id;
    private String nombre;
    private String apellidos;
    private String nif;
    private String correo;
    private String direccion;
    private int telefono;

    public Alumno(int id, String nombre, String apellidos, String nif, String correo, String direccion, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
	}
        
	
}
