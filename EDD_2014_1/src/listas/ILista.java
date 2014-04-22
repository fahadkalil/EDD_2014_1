package listas;

import aula07.Nodo;

public interface ILista {
	public void inserirInicio(Nodo elemento);
	public void inserirFim(Nodo elemento);
	public Nodo removerInicio();
	public Nodo removerFim();
	
	public void imprimir();
}
