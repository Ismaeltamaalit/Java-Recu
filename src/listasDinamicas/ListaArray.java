package listasDinamicas;

public class ListaArray {
    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMAÑO_INICIAL = 4;

    // Constructor
    public ListaArray() {
        this.arrayElementos = new Object[TAMAÑO_INICIAL];
        this.numElementos = 0;
    }

    
    public void add(Object elemento) {
        comprobarLlenado();
        arrayElementos[numElementos] = elemento;
        numElementos++;
    }

   
    public void add(int indice, Object elemento) {
        if (indice < 0 || indice > numElementos) throw new IndexOutOfBoundsException();
        comprobarLlenado();

        
        for (int i = numElementos; i > indice; i--) {
            arrayElementos[i] = arrayElementos[i - 1];
        }
        arrayElementos[indice] = elemento;
        numElementos++;
    }

   

    public Object remove(int indice) {
        if (indice < 0 || indice >= numElementos) throw new IndexOutOfBoundsException();
        
        Object eliminado = arrayElementos[indice];

       
        for (int i = indice; i < numElementos - 1; i++) {
            arrayElementos[i] = arrayElementos[i + 1];
        }

        arrayElementos[numElementos - 1] = null; // Limpieza
        numElementos--;
        return eliminado;
    }

   

    public Object get(int indice) {
        if (indice < 0 || indice >= numElementos) throw new IndexOutOfBoundsException();
        return arrayElementos[indice];
    }

    public void set(int indice, Object nuevoElemento) {
        if (indice < 0 || indice >= numElementos) throw new IndexOutOfBoundsException();
        arrayElementos[indice] = nuevoElemento;
    }

   

    public int indexOf(Object elemento) {
        for (int i = 0; i < numElementos; i++) {
            if (arrayElementos[i].equals(elemento)) return i;
        }
        return -1;
    }

   

    public int size() {
        return numElementos;
    }

    public boolean isEmpty() {
        return numElementos == 0;
    }

    private void comprobarLlenado() {
        if (numElementos == arrayElementos.length) {
            Object[] nuevoArray = new Object[arrayElementos.length * 2];
            for (int i = 0; i < arrayElementos.length; i++) {
                nuevoArray[i] = arrayElementos[i];
            }
            arrayElementos = nuevoArray;
        }
    }
}
