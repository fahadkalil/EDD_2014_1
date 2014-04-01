package desafio;

public class Velha {
	private int[][] matriz = new int[][]{ {1,2,3}, {4,5,6}, {7,8,9} };
	
	public void vertical() {
	// Saída: 1 4 7 2 5 8 3 6 9	
	}
	
	public void horizontal() {
	// Saída: 1 2 3 4 5 6 7 8 9	
	}
	
	public void diagonal1() {
	// Saída: 1, 5, 9
	}
	
	public void diagonal2() {
	// Saída: 3, 5, 7	
	}
	
	public static void main(String[] args) {
		Velha v = new Velha();
		v.vertical();
	}

}
