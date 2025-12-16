package dinamicoLineal1;

public class ListaArray {
    private Object[] elementos;
    private int contador;

    
    public ListaArray() {
        elementos = new Object[2];
        contador = 0;
    }

   
    public void añadir(Object obj) {
        if (contador == elementos.length) {
            redimensionar();
        }
        elementos[contador] = obj;
        contador++;
    }

    
    public Object obtener(int indice) {
        if (indice < 0 || indice >= contador) {
            return "Error: Índice fuera de rango";
        }
        return elementos[indice];
    }

    
    private void redimensionar() {
        Object[] nuevoArray = new Object[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            nuevoArray[i] = elementos[i];
        }
        elementos = nuevoArray;
        System.out.println("...Lista llena. Aumentando espacio a: " + elementos.length);
    }

    
    public int tamaño() {
        return contador;
    }
}