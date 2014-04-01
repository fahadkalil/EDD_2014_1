package ordenacao;

public class QuickSort{
	public int[] sort (int v[]) {
		quick_sort(v, 0, v.length-1);
		return v;
	}
	
	private void quick_sort(int[] v, int ini, int fim) {
		int meio;

		if (ini < fim) {
			meio = partition(v, ini, fim);
			quick_sort(v, ini, meio);
			quick_sort(v, meio + 1, fim);
		}	
	}
	
	private int partition(int[] v, int ini, int fim) {
		int pivo, k, i;
		pivo = v[ini];
		k = ini;

		for (i = ini + 1; i <= fim; i++) {			
			if (v[i] < pivo) {				
				v[k] = v[i];				
				v[i] = v[k + 1];		
				k++;			
			}			
		}
		
		v[k] = pivo;
		return k;

	}
}
