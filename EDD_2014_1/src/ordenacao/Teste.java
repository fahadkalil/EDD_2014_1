package ordenacao;

public class Teste {
	
	public static void main(String[] args) {
		IOrdenador ordenadores[] = {
				new InsertionSort(),
				new SelectionSort(),
				new BubbleSort()		
		};
		
		int[] vet = {34,121,232,11,3};
		for (IOrdenador ordenador : ordenadores) {
					
			int[] ordenado = ordenador.sort(vet);			
			System.out.println("Nome do algoritmo: "+ordenador);			
			for (int item : ordenado) {
				System.out.println(item);
			}
		}
		
		
	}

}
