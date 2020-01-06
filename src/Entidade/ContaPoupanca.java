package Entidade;

public class ContaPoupanca extends Conta {

	private Double taxaDeJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizacaoSaldo (double montante) {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override  		
	public void saque(double montante) {	//Sobreposi��o de fun��o
		saldo -= montante;
	}
}
