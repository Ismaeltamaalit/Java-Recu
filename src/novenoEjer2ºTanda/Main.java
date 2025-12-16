package novenoEjer2ºTanda;

public class Main {

	public static void main(String[] args) {
		
		// Instancias ya existentes
		Gato g = new Gato(5, "Gatico", "hembra");
		Perro p = new Perro(1, "Perrico", "macho");
		
		// ¡Nuevas Instancias solicitadas!
		Rana r = new Rana(2, "Rana Saltarín", "macho");
		Tigre t = new Tigre(8, "Tigre Rayas", "macho");
		
		
		System.out.println("--- PRUEBA DE POLIMORFISMO Y TOSTRING ---");
		
		// Gato
		System.out.println("Mascota: " + g + ". Sonido: " + g.hacerSonido());
		
		// Perro
		System.out.println("Mascota: " + p + ". Sonido: " + p.hacerSonido());
		
		// Rana
		System.out.println("Mascota: " + r + ". Sonido: " + r.hacerSonido());
		
		// Tigre
		System.out.println("Mascota: " + t + ". Sonido: " + t.hacerSonido());
        
	}

}