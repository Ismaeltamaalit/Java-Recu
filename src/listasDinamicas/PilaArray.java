package listasDinamicas;


public class PilaArray {
    // Atributos basados en ListaArray
    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMAÑO_INICIAL = 4;

    
    public PilaArray() {
        this.arrayElementos = new Object[TAMAÑO_INICIAL];
        this.numElementos = 0;
    }

   
    public void push(Object elemento) {
        comprobarLlenado(); 
        arrayElementos[numElementos] = elemento;
        numElementos++;
    }

   
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        
        Object elementoCima = arrayElementos[numElementos - 1];
        arrayElementos[numElementos - 1] = null;
        numElementos--;
        
        return elementoCima;
    }

   
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return arrayElementos[numElementos - 1];
    }

    
    public boolean isEmpty() {
        return numElementos == 0;
    }

    
    public int size() {
        return numElementos;
    }

    
    public void clear() {
        arrayElementos = new Object[TAMAÑO_INICIAL];
        numElementos = 0;
    }

    
    private void comprobarLlenado() {
        if (numElementos == arrayElementos.length) {
            Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
            System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
            arrayElementos = arrayAmpliado;
        }
    }
}
