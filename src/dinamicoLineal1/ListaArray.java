package dinamicoLineal1;

public class ListaArray {
    private Object[] elementos;
    private int contador;

    // Constructor: empezamos con un espacio pequeño (ej. 2)
    public ListaArray() {
        elementos = new Object[2];
        contador = 0;
    }

    // Añadir un elemento al final
    public void añadir(Object obj) {
        if (contador == elementos.length) {
            redimensionar();
        }
        elementos[contador] = obj;
        contador++;
    }

    // Obtener un elemento por su posición
    public Object obtener(int indice) {
        if (indice < 0 || indice >= contador) {
            return "Error: Índice fuera de rango";
        }
        return elementos[indice];
    }

    // Doblar el tamaño del array cuando se llena
    private void redimensionar() {
        Object[] nuevoArray = new Object[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            nuevoArray[i] = elementos[i];
        }
        elementos = nuevoArray;
        System.out.println("...Lista llena. Aumentando espacio a: " + elementos.length);
    }

    // Cuántos elementos hay realmente
    public int tamaño() {
        return contador;
    }
}