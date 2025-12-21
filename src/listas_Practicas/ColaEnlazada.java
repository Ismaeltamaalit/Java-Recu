package listas_Practicas;

public class ColaEnlazada {
	
	private Nodo primero;
	private Nodo ultimo;
	private int numElementos;
	
	public ColaEnlazada() {
		primero=null;
		ultimo=null;
		numElementos=0;
	}
	
	public void enqueue(Object dato) {
		Nodo nuevo=new Nodo(dato);
		if(primero==null) {
			primero=nuevo;
			ultimo=nuevo;
		}else {
			ultimo.siguiente=nuevo;
			ultimo=nuevo;
		}
		numElementos++;
	}
	
	public Object dequeue() {
		if(primero==null)return null;
		Object dato=primero.dato;
		
		primero=primero.siguiente;
		
		if(primero==null) {
			ultimo=null;
		}
		numElementos--;
		
		
		return dato;
	}
	
	
	 public int size() {
	        return numElementos;
	    }
	

	class Nodo{
		Object dato;
		Nodo siguiente;
		
		public Nodo(Object dato) {
			this.dato=dato;
			this.siguiente=null;
		}
	}
}
