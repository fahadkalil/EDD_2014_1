package listas;

import aula07.Nodo;

/* Implementação usando Encadeamento Simples */

public class LSE implements ILista, IFila {
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
			tail.setNext(null);
		}
		
		tamanho++;
	}

	@Override
	public Nodo removerInicio() {
		// Testar se a lista eestá vazia ou não
		if (tamanho == 0) {
			System.err.println("A lista está vazia!");
			return null;
		} else {
			Nodo aux = head;
			
			Nodo proximo = aux.getNext();
			head = proximo;
			
			// Desconectar o head antigo ( usando setNext(null) )
			aux.setNext(null);
			
			tamanho--;
			
			return aux;			
		}
	}

	@Override
	public Nodo removerFim() {
		if (tamanho > 0) {
			Nodo item = head;
			Nodo ultimo = null;
			Nodo penultimo = null;
			
			// Percorre a lista
			while (item != null) {
				
				// Testa se um nodo possui próximo
				if (item.getNext() != null) {
					penultimo = item;
					ultimo = item.getNext();
					
					// Verifica se o nodo é o último da lista
					if (ultimo.getNext() == null) {
						tail = penultimo;
						penultimo.setNext(null);
						ultimo.setNext(null);
						tamanho--;
						return ultimo;
					}
				} 
				// Temos apenas um nodo na lista
				else {
					head = null;
					tail = null;
					tamanho--;
					
					return item;
				}
				
			item = item.getNext();
			}
		}
		else {
			System.out.println("Lista está vazia!");
		}
		
		return null;
		
	}
	
	@Override
	public Nodo buscar(Nodo elemento) {
		Nodo achou = null;
		
		Nodo item = head;
		while (item != null) {
			if ( ((String)item.getElemento())
					.equalsIgnoreCase(
							(String)elemento.getElemento()) 
				) {				 
					achou = item;
					break;
			}
			else {
				// Senão 
				item = item.getNext();
			} 
			
		}
		return achou;
	}

	@Override
	public void imprimir() {		
		if (tamanho > 0) {
			Nodo item = head;
			while (item != null) {
				System.out.println(item);
				item = item.getNext();
			}		
		} else {
			System.out.println("A lista está vazia!");			
		}
		System.out.println("Tamanho = " + tamanho);
	}
	
	public static void main(String[] args) {
		ILista lista = new LSE();
		lista.inserirInicio(new Nodo<String>("abc"));		
		lista.inserirFim(new Nodo<String>("123"));
		lista.inserirInicio(new Nodo<String>("eee"));
		lista.inserirFim(new Nodo<String>("321"));
		lista.imprimir();
		System.out.println("-- Após removerFim() --");
		lista.removerFim();
		lista.removerFim();
		lista.removerInicio();	
		lista.imprimir();
		
			
		
		
		
		//Nodo achou = lista.buscar(new Nodo<String>("xyz"));
		//System.out.println("Achou o elemento: "+ achou);		
	}
	
	
	
	
	
	
	

	@Override
	public void enfileirar(Nodo elemento) {
		inserirInicio(elemento);
	}

	@Override
	public Nodo desenfileirar() {
		return removerFim();
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}