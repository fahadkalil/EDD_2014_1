package aula07;

public class NodoString implements INodo {
	private String element;
	private INodo next;
	
	public NodoString(String element) {
		this.element = element;
	}
	
	@Override
	public INodo getNext() {
		return this.next;
	}

	@Override
	public void setNext(INodo next) {
		this.next = next;		
	}

	@Override
	public String toString() {		
		return element;
	}
	
	public static void main(String[] args) {
		INodo nodo = new NodoString("abc");
		INodo nodo2 = new NodoString("def");
		INodo nodo3 = new NodoInteger(123);
		
		nodo.setNext(nodo2);
		nodo2.setNext(nodo3);
		
		System.out.println(nodo);
		System.out.println(nodo.getNext());
		System.out.println(nodo.getNext().getNext());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
