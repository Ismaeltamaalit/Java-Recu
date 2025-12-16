package novenoEjer2ºTanda;

public abstract class Animales {

	private int edad;
	private String nombre;
	private String sexo;
	
	public Animales(int edad, String nombre, String sexo) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public abstract String hacerSonido();
	
	public String toString() {
        // Formato legible que puedes usar en el Main
        return String.format("%s (Edad: %d, Sexo: %s)", this.nombre, this.edad, this.sexo);
    }

	
	
}
