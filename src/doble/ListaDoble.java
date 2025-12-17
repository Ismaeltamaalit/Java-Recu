package doble;

public class ListaDoble {
    private Nodo primero;
    private Nodo ultimo;
    private int numElementos;

    public ListaDoble() {
        primero = null;
        ultimo = null;
        numElementos = 0;
    }

    public void add(Object dato) {
        addUltimo(dato);
    }

    private void addUltimo(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (numElementos == 0) {
            ultimo = nuevo;
            primero = nuevo;
        } else {
            Nodo actual = ultimo;
            actual.siguiente = nuevo;
            nuevo.anterior = actual;
            ultimo = nuevo;
        }
        numElementos++;
    }

    public void add(int indice, Object dato) {
        if (indice < 0 || indice >= numElementos) {
            throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
        }
        if (indice == 0) {
            insertarPrimero(dato);
        } else {
            insertarIntermedio(indice, dato);
        }
    }

    private void insertarPrimero(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (numElementos == 0) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            Nodo actual = primero;
            actual.anterior = nuevo;
            nuevo.siguiente = actual;
            primero = nuevo;
        }
        numElementos++;
    }

    private void insertarIntermedio(int indice, Object dato) {
        Nodo nuevo = new Nodo(dato);
        Nodo actual = obtenerNodo(indice);
        Nodo anterior = actual.anterior;
        
        nuevo.siguiente = actual;
        nuevo.anterior = anterior;
        anterior.siguiente = nuevo;
        actual.anterior = nuevo;
        
        numElementos++;
    }

    private Nodo obtenerNodo(int indice) {
        Nodo actual = primero;
        for (int i = 0; i < indice; i++)
            actual = actual.siguiente;
        return actual;
    }

    public int size() {
        return numElementos;
    }
}

class Nodo {
    Object dato;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(Object dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}
