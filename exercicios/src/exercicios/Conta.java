package exercicios;

public class Conta {
	private Integer conta;
	private String nome;
	private double saldo;
	
	public Conta(Integer conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	public Conta(Integer conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	public Integer getConta() {
		return conta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ conta
				+ ", Nome: "
				+ nome
				+ ", Saldo: $"
				+ String.format("%.2f", saldo);
				
	}
	
}
