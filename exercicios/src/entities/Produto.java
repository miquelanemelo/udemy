package entities;

public class Produto {
	
	private String nome;
	private double preco;
	
	
	public Produto(String name, double preco) {
		this.nome = name;
		this.preco = preco;
	}
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
