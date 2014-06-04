package colecoes.conta;

public class ContaCorrente extends Conta {
	private Double tarifaPacote = 0.0;

	public Double getTarifaPacote() {
		return tarifaPacote;
	}

	public void setTarifaPacote(Double tarifaPacote) {
		this.tarifaPacote = tarifaPacote;
	}
}
