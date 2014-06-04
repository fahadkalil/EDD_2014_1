package colecoes.conta;

import java.util.List;
import java.util.ListIterator;

public class TestaContas {
	public static void main(String[] args) {
		// Vetor estático que só aceita objetos da
		// classe Conta
		Conta[] contas = new Conta[2];
		// conta1
		Conta conta1 = new ContaCorrente();
		conta1.setTitular("João");
		conta1.setSaldo(100.00);
		conta1.setLimite(50.00);
		conta1.setNumeroDaConta("1234-5");
		
		// conta2
		Conta conta2 = new ContaCorrente();
		conta2.setTitular("Ronaldo");
		conta2.setSaldo(200.00);
		conta2.setLimite(100.00);
		conta2.setNumeroDaConta("9876-5");
		
		contas[0] = conta1;
		contas[1] = conta2;
		
		// ArrayList é um vetor dinâmico
		// LinkedList é uma lista encadeada
		List<Conta> contas2 = new java.util.LinkedList<Conta>();
		contas2.add(conta1);
		contas2.add(conta2);
		
		ListIterator<Conta> it = contas2.listIterator();
		
		// No sentido next 
		System.out.println("Sentido next");
		while (it.hasNext()) {
			Conta c = it.next();
			System.out.println("Nome do titular: "+ c.getTitular() );
		}
		
		// No sentido prev	
		System.out.println("Sentido prev");
				
		while (it.hasPrevious()) {
			Conta c = it.previous();
			System.out.println("Nome do titular: "+ c.getTitular());
		}
		
	}
	
	
	
}
