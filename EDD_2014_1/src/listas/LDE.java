package listas;

import aula07.Nodo;

// Lista Duplamente Encadeada
public class LDE<T> implements ILista {
	private DNodo<T> header;
	private DNodo<T> trailer;
	
	public LDE() {
		header = new DNodo<T>(null);
		trailer = new DNodo<T>(null);		
		header.setPrev(null);
		trailer.setNext(null);
	}

	@Override
	public void inserirInicio(Nodo elemento) {
			
	}

	@Override
	public void inserirFim(Nodo elemento) {
		if (elemento instanceof DNodo) {
			// Lista vazia
			if (header.getNext() == null || trailer.getPrev() == null) {
				header.setNext(elemento);
				trailer.setPrev((DNodo)elemento);
				((DNodo) elemento).setPrev(header);
				elemento.setNext(trailer);
			} else {
				// Já temos item na lista
				if (trailer.getPrev() != null) {
					DNodo aux = trailer.getPrev();
					aux.setNext(elemento);
					elemento.setNext(trailer);
					((DNodo) elemento).setPrev(aux);
					trailer.setPrev((DNodo)elemento);
					
				}
			}
		}
	}
	
	@Override
	public Nodo removerInicio() {		
		DNodo a = null;
		
		// Lista vazia não estiver vazia
		if (header.getNext() != null || trailer.getPrev() != null) {		
			a = (DNodo) header.getNext(); /* alvo */
			
			/* Se não tivermos mais elementos */
			if (a.getNext() == null) {				
				return null;
			}
			
			DNodo b = (DNodo) a.getNext(); /* segundo elemento */
			header.setNext(b);			
			b.setPrev(header);
			
			// Elimina os ponteiros do elemento
			a.setNext(null);
			a.setPrev(null);			
		}				
		return a;
	}

	@Override
	public Nodo removerFim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nodo buscar(Nodo elemento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimir() {
		DNodo item = (DNodo) header.getNext();
		while (item != null && item != trailer) {
			System.out.println(item.getElemento());
			item = (DNodo) item.getNext();
		}
	}
	
	public void imprimirReverso() {
		DNodo item = (DNodo) trailer.getPrev();
		while (item != null && item != header) {
			System.out.println(item.getElemento());
			item = (DNodo) item.getPrev();
		}
	}
	
	public static void main(String[] args) {
		LDE<String> lista = new LDE<String>();
		lista.inserirFim(new DNodo<String>("abc"));		
		lista.inserirFim(new DNodo<String>("def"));
				
		lista.imprimir();		
	}
	
}
