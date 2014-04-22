package listas;

import aula07.Nodo;

public class LSE implements ILista {
	private int tamanho = 0;
	private Nodo head = null;
	private Nodo tail = null;
	
	@Override
	public void inserirInicio(Nodo elemento) {
		// A lista está vazia!
		if (tamanho == 0) {			
			tail = elemento;
		} 
		// Se a lista tiver 1 ou mais elementos
		else {			
			elemento.setNext(head);
		}
		// Redefine quem é o primeiro da lista
		head = elemento;
		tamanho++;
	}

	@Override
	public void inserirFim(Nodo elemento) {
		if (tamanho == 0) {
			tail = elemento;
			head = elemento;
		} 
		// Se a lista tiver 1 ou mais elementos
		else {
			Nodo antigo = tail;
			antigo.setNext(elemento);
			// Redefine o último item da lista
			tail = elemento;
		}
	}

	@Override
	public Nodo removerInicio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nodo removerFim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimir() {
		Nodo item = head;
		while (item != null) {
			System.out.println(item);
			item = item.getNext();
		}		
	}
	
	public static void main(String[] args) {
		ILista lista = new LSE();
		lista.inserirInicio(new Nodo<String>("abc"));
		lista.inserirInicio(new Nodo<String>("xyz"));
		lista.inserirFim(new Nodo<String>("123"));
		lista.inserirInicio(new Nodo<String>("eee"));
		lista.imprimir();
	}	
}
