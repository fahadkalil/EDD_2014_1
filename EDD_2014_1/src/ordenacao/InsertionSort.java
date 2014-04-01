package ordenacao;

public class InsertionSort implements IOrdenador {
	@Override
	public int[] sort(int[] vet) {
		int i, j, novo;
		for (i = 1; i < vet.length; i++) {
			novo = vet[i];
			j = i;
			
			while (j > 0 && vet[j - 1] > novo) {
				vet[j] = vet[j - 1];
				j--;
			}
			vet[j] = novo;
		}
		return vet;
	}
	
	@Override
	public String toString() {
		return "InsertionSort";
	}
}
