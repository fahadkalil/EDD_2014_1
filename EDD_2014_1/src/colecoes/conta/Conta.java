package colecoes.conta;

public abstract class Conta {
	private String titular;
	private String numeroDaConta;
	private Double saldo;
	private Double limite;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	// Operações	
	public void deposito(Double valor) {
		saldo += valor;
	}
	
	public void saque(Double valor) {
		if ((saldo+limite) >= valor) {
			saldo -= valor;
		}
	}	
}
