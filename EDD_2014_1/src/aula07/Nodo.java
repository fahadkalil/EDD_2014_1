package aula07;

public class Nodo <T> {
	private T elemento;
	private Nodo<T> next;
	
	// Construtor
	public Nodo(T elemento) {
		this.elemento = elemento;
	}
	
	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}

	public static void main(String[] args) {
		Nodo<String> n = new Nodo<String>("abc");
		Nodo<String> n2 = new Nodo<String>("def");
		Nodo<String> n3 = new Nodo<String>("zyx");
		
		n.setNext(n2);
		n2.setNext(n3);
		n3.setNext(null);
		
		Nodo head = n;
		
		Nodo item = head;
		while (item != null) {
			System.out.println(item.getElemento());
			item = item.getNext();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
