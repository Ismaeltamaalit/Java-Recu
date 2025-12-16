package dinamicoLineal1;

public class PruebaSimple {
    public static void main(String[] args) {
        ListaArray miLista = new ListaArray();

        System.out.println("--- Añadiendo elementos ---");
        miLista.añadir("Manzana");
        miLista.añadir("Pera");
        miLista.añadir("Plátano"); // Aquí la lista crecerá porque el tamaño inicial era 2

        System.out.println("\n--- Contenido de la lista ---");
        for (int i = 0; i < miLista.tamaño(); i++) {
            System.out.println("Posición " + i + ": " + miLista.obtener(i));
        }

        System.out.println("\n--- Probando errores ---");
        System.out.println(miLista.obtener(10)); // Índice que no existe
    }
}