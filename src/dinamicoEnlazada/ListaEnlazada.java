package dinamicoEnlazada;

public class ListaEnlazada {
    private Nodo primero;
    private int numElementos;

    public ListaEnlazada() {
        primero = null;
        numElementos = 0;
    }

    public void add(Object dato) {
        Nodo nuevo = new Nodo(dato);
        Nodo ultimo = null;
        if (numElementos == 0) {
            primero = nuevo;
        } else {
            ultimo = obtenerNodo(numElementos - 1);
            ultimo.siguiente = nuevo;
        }
        numElementos++;
    }

    private Nodo obtenerNodo(int indice) {
        assert indice >= 0 && indice < numElementos;
        Nodo actual = primero;
        for (int i = 0; i < indice; i++)
            actual = actual.siguiente;
        return actual;
    }

    public Object get(int indice) {
        if (indice >= numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        return obtenerNodo(indice).dato;
    }

    public int indexOf(Object dato) {
        Nodo actual = primero;
        for (int i = 0; actual != null; i++) {
            if ((actual.dato != null && actual.dato.equals(dato)) || actual.dato == dato) {
                return i;
            }
            actual = actual.siguiente;
        }
        return -1;
    }

    public Object remove(int indice) {
        if (indice >= numElementos || indice < 0) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        if (indice == 0) {
            return removePrimero();
        } else {
            return removeIntermedio(indice);
        }
    }

    private Object removePrimero() {
        Nodo actual = primero;
        primero = primero.siguiente;
        numElementos--;
        return actual.dato;
    }

    private Object removeIntermedio(int indice) {
        Nodo anterior = obtenerNodo(indice - 1);
        Nodo actual = anterior.siguiente;
        anterior.siguiente = actual.siguiente;
        numElementos--;
        return actual.dato;
    }

    public int size() {
        return numElementos;
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
