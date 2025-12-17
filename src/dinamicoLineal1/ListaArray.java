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
    
    public void eliminar(int indice) {
        if (indice < 0 || indice >= contador) {
            System.out.println("Error: Índice no válido");
            return;
        }
        for (int i = indice; i < contador - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[contador - 1] = null;
        contador--;
    }
    
    
    public int buscar(Object obj) {
        for (int i = 0; i < contador; i++) {
            
            if (elementos[i].equals(obj)) {
                return i; 
            }
        }
        return -1; 
    }

    
    public int tamaño() {
        return contador;
    }
}