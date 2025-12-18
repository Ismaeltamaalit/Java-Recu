package listasDinamicas;

/**
 * Implementación del TDA Pila (Stack) basada en un array dinámico.
 * Sigue el comportamiento LIFO: el último elemento en entrar es el primero en salir.
 * Basada en la estructura de ListaArray del manual.
 */
public class PilaArray {
    // Atributos basados en ListaArray
    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMAÑO_INICIAL = 4;

    /**
     * Constructor que inicializa la pila con el tamaño por defecto.
     */
    public PilaArray() {
        this.arrayElementos = new Object[TAMAÑO_INICIAL];
        this.numElementos = 0;
    }

    /**
     * Añade un elemento a la cima de la pila.
     * Equivale al método add() de una lista.
     * @param elemento El objeto a insertar.
     */
    public void push(Object elemento) {
        comprobarLlenado(); // Asegura que haya espacio
        arrayElementos[numElementos] = elemento;
        numElementos++;
    }

    /**
     * Retira y devuelve el elemento situado en la cima de la pila.
     * @return El elemento de la cima.
     * @throws RuntimeException si la pila está vacía.
     */
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        
        // El elemento de la cima está en la posición numElementos - 1
        Object elementoCima = arrayElementos[numElementos - 1];
        
        // Limpieza de la referencia y actualización del contador
        arrayElementos[numElementos - 1] = null;
        numElementos--;
        
        return elementoCima;
    }

    /**
     * Consulta el elemento de la cima sin retirarlo.
     * @return El elemento en la cima.
     */
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return arrayElementos[numElementos - 1];
    }

    /**
     * Comprueba si la pila no contiene elementos.
     * @return true si está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return numElementos == 0;
    }

    /**
     * Devuelve el número de elementos actuales.
     */
    public int size() {
        return numElementos;
    }

    /**
     * Elimina todos los elementos de la pila.
     */
    public void clear() {
        arrayElementos = new Object[TAMAÑO_INICIAL];
        numElementos = 0;
    }

    /**
     * Comprueba si el array interno está lleno y duplica su capacidad si es necesario.
     * Lógica extraída de la implementación original de ListaArray.
     */
    private void comprobarLlenado() {
        if (numElementos == arrayElementos.length) {
            Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
            System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
            arrayElementos = arrayAmpliado;
        }
    }
}
