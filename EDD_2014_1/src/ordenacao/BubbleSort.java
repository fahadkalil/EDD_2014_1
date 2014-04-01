package ordenacao;

/*
 * Implementação do método bolha
 */
public class BubbleSort implements IOrdenador {

	public int[] sort(int[] vet) {
		// implementar
		
		return vet;
	}
	
	@Override
	public String toString() {	
		return "BubbleSort";
	}
	
	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int[] v = b.sort(new int[]{33, 40, 8, 22, 30});
		for (int item : v) {
			System.out.println(item);
		}
		
	}
}