package aula07;

public class NodoInteger implements INodo {
	private int element;
	private INodo next;
	
	public NodoInteger(int element) {
		this.element = element;
	}
	
	@Override
	public INodo getNext() {		
		return next;
	}

	@Override
	public void setNext(INodo next) {
		this.next = next;		
	}
	
	@Override
	public String toString() {
		return String.valueOf(element);
	}

}
