package listasDinamicas;


public class ColaArray {
    
    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMAÑO_INICIAL = 4;

    
    public ColaArray() {
        this.arrayElementos = new Object[TAMAÑO_INICIAL];
        this.numElementos = 0;
    }

    
    public void offer(Object elemento) {
        comprobarLlenado(); // Asegura el crecimiento dinámico
        arrayElementos[numElementos] = elemento;
        numElementos++;
    }

    
    public Object poll() {
        if (isEmpty()) {
            return null;
        }

       
        Object cabeza = arrayElementos[0];

        
        System.arraycopy(arrayElementos, 1, arrayElementos, 0, numElementos - 1);

        
        arrayElementos[numElementos - 1] = null;
        numElementos--;

        return cabeza;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return arrayElementos[0];
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
        
        if (numElementos + 1 == arrayElementos.length) {
            Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
            System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
            arrayElementos = arrayAmpliado;
        }
    }
}
