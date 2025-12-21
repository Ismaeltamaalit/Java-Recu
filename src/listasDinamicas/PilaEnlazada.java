package listasDinamicas;

public class PilaEnlazada {
    private Nodo cima;
    private int numElementos;

    public PilaEnlazada() {
        cima = null;
        numElementos = 0;
    }

    public void push(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        numElementos++;
    }

    public Object pop() {
        if (cima == null) return null;
        Object dato = cima.dato;
        cima = cima.siguiente;
        numElementos--;
        return dato;
    }

    public Object peek() {
        if (cima != null) {
            return cima.dato;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    class Nodo {
        Object dato;
        Nodo siguiente;

        public Nodo(Object dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
}
