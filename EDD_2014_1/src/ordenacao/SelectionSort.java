package ordenacao;

public class SelectionSort implements IOrdenador {

	@Override
	public int[] sort(int[] vet) {
		int index_min, aux;

		for (int i = 0; i < vet.length; i++) {
			index_min = i;
			for (int j = i + 1; j < vet.length; j++) {
				if (vet[j] < vet[index_min]) {
					index_min = j;
				}
			}
			if (index_min != i) {
				aux = vet[index_min];
				vet[index_min] = vet[i];
				vet[i] = aux;
			}
		}
		
		return vet;
	}
	
	@Override
	public String toString() {
		return "SelectionSort";
	}

}
