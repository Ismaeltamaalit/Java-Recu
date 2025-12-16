package novenoEjer2ºTanda;

public class Gato extends Animales {

	public Gato(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hacerSonido() {
		return "miau";
	}


}
