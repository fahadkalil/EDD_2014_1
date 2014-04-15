package aula02;

public class VetorDinamico <T> {
	private T vet[];
	private int quantidade = 0;
	
	// Construtor padrão
	public VetorDinamico() {
		vet = (T[]) new Object[5];
	}
	
	public void add(T valor) {
		/*
		 * Declarar novo vetor com o dobro do tamanho
		 * Copiar itens do vetor antigo para o novo
		 * Incrementar a variável quantidade!
		 */
		
		if (quantidade < vet.length) {
			vet[quantidade++] = valor;
		} else {			
			T novo[] = (T[]) new Object[vet.length * 2];
			for (int i=0; i < vet.length; i++) {
				novo[i] = vet[i];
			}
			
			novo[quantidade++] = valor;			
			vet = novo;						
		}
	}
	
	public T getValor(int indice) {
		return vet[indice];
	}
	
	public void limpar() {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = null;
		}
		quantidade = 0;				
	}
	
	public T remover(int indice) {		
		// Verifica se o índice passado por parâmetro existe no vetor
		if (indice < vet.length) {
			if (indice < quantidade) {				
				// Guarda numa variável o valor armazenado na posição
				T valor = vet[indice];
				
				// Reorganiza o vetor.... (Observar no quadro)
				for (int i=indice; i<(vet.length-1); i++) {										
					vet[i] = vet[i+1];
				}
				
				// Decrementa o contador (quantidade)
				quantidade--;
				
				return valor;
			}
		} else {
			System.err.println("Posição não preenchida");			
		}
		
		return null;
				
	}
	
	
	
	
	public static void main(String[] args) {				
		VetorDinamico<String> v = new VetorDinamico<String>();		
		v.add("abc");
		v.add("def");			
		
		for (int i=0;i<10;i++) {
			if (v.getValor(i) != null) {
				System.out.println(v.getValor(i));
			}			
										
		}		
		
		VetorDinamico<Integer> v2 = new VetorDinamico<Integer>();
		v2.add(1111);
		
		System.out.println(v2.getValor(0));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
