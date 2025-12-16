package dinamicoLinealEj;

public class List {
	
    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMAÑO_INICIAL = 4;

    public List() {
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

    private void comprobarLlenado() {
       
        if (numElementos == arrayElementos.length) {
            Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
            System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
            arrayElementos = arrayAmpliado;
        }
    }

    public void add(int indice, Object elemento) {
        if (indice > numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        
        comprobarLlenado();

        // Desplazamos elementos a la derecha para hacer hueco
        if (indice < numElementos) {
            System.arraycopy(arrayElementos, indice, arrayElementos, indice + 1, numElementos - indice);
        }
        
        arrayElementos[indice] = elemento;
        numElementos++;
    }

    public int indexOf(Object elem) {
        if (elem == null) {
            for (int i = 0; i < numElementos; i++) { // Cambiado a numElementos
                if (arrayElementos[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < numElementos; i++) { // Cambiado a numElementos
                if (elem.equals(arrayElementos[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void clear() {
        arrayElementos = new Object[TAMAÑO_INICIAL];
        numElementos = 0;
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

    public Object remove(int indice) {
        if (indice >= numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        
        Object elem = arrayElementos[indice];
        
        // Desplazamos elementos a la izquierda para cerrar el hueco
        int numMovidos = numElementos - indice - 1;
        if (numMovidos > 0) {
            System.arraycopy(arrayElementos, indice + 1, arrayElementos, indice, numMovidos);
        }

        arrayElementos[numElementos - 1] = null; // Limpieza para el GC
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
}