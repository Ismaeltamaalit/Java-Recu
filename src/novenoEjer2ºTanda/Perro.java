package novenoEjer2ºTanda;

public class Perro extends Animales {

	public Perro(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String hacerSonido() {
		return "guau";
	}

	

}
