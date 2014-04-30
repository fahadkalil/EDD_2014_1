package listas;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import aula07.Nodo;

public class DNodo<T> extends Nodo<T> {
	private DNodo<T> prev;
	private T elemento;
	
	public DNodo(T elemento) {
		super(elemento);
		this.elemento = elemento;		
		super.setNext(null);
		prev = null;
	}
	public DNodo<T> getPrev() {
		return prev;
	}

	public void setPrev(DNodo<T> prev) {
		this.prev = prev;
	}
	
	public T getElemento() {		
		return this.elemento;
	}	
}