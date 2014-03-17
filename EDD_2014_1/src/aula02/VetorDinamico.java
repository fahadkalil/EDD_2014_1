package aula02;

public class VetorDinamico {
	private int vet[] = new int[5];
	private int quantidade = 0;
	
	// Construtor padrão
	public VetorDinamico() {
		
	}
	
	public void add(int valor) {
		/*
		 * Declarar novo vetor com o dobro do tamanho
		 * Copiar itens do vetor antigo para o novo
		 * Incrementar a variável quantidade!
		 */
		
		if (quantidade < vet.length) {
			vet[quantidade++] = valor;
		} else {			
			int novo[] = new int[vet.length * 2];
			for (int i=0; i < vet.length; i++) {
				novo[i] = vet[i];
			}
			
			novo[quantidade++] = valor;			
			vet = novo;						
		}
	}
	
	public int getValor(int indice) {
		return vet[indice];
	}
	
	public static void main(String[] args) {
		VetorDinamico v = new VetorDinamico();
		v.add(298);
		v.add(2443);
		v.add(27);
		v.add(1212);
		v.add(2992);
		v.add(999);
		
		for (int i=0; i<10; i++) {
			System.out.println(v.getValor(i));
		}
	}
}
