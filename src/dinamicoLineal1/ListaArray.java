package dinamicoLineal1;

/**
 * Implementación de una lista basada en array estático que crece dinámicamente.
 * Basado en el Capítulo 9 del Manual de Java.
 */
public class ListaArray {
    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMAÑO_INICIAL = 4;

   
    public ListaArray() {
        arrayElementos = new Object[TAMAÑO_INICIAL];
        numElementos = 0;
    }

    
    public int size() {
        return numElementos;
    }

    
    public void add(Object elemento) {
        comprobarLlenado();
        arrayElementos[numElementos] = elemento;
        numElementos++;
    }

    /**
     * Inserta un elemento en la posición especificada.
     */
    public void add(int indice, Object elemento) {
        if (indice > numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        comprobarLlenado();
        // Desplaza los elementos a la derecha para hacer sitio
        System.arraycopy(arrayElementos, indice, arrayElementos, indice + 1, numElementos - indice);
        arrayElementos[indice] = elemento;
        numElementos++;
    }

    /**
     * Duplica la capacidad del array interno si está lleno.
     */
    private void comprobarLlenado() {
        if (numElementos == arrayElementos.length) {
            Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
            System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
            arrayElementos = arrayAmpliado;
        }
    }

    /**
     * Busca la posición de la primera ocurrencia de un elemento.
     */
    public int indexOf(Object elem) {
        for (int i = 0; i < numElementos; i++) {
            if (elem == null) {
                if (arrayElementos[i] == null) return i;
            } else if (elem.equals(arrayElementos[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object elem) {
        return indexOf(elem) != -1;
    }

    public Object get(int indice) {
        if (indice >= numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        return arrayElementos[indice];
    }

    /**
     * Elimina el elemento en la posición indicada y desplaza los restantes.
     */
    public Object remove(int indice) {
        if (indice >= numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        Object elem = arrayElementos[indice];
        System.arraycopy(arrayElementos, indice + 1, arrayElementos, indice, numElementos - (indice + 1));
        arrayElementos[numElementos - 1] = null; // Evita fugas de memoria
        numElementos--;
        return elem;
    }

    public int remove(Object elem) {
        int indice = indexOf(elem);
        if (indice != -1) {
            remove(indice);
        }
        return indice;
    }

    public void clear() {
        arrayElementos = new Object[TAMAÑO_INICIAL];
        numElementos = 0;
    }
}
