package exercicios;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto; 
	}
	public void incrementarSalario(double porcetagem) {
		salarioBruto += salarioBruto * porcetagem / 100.0;		
	}
	public String toString() {
		return "Nome: " + nome + String.format(" Salario Liquido $ %.2f", salarioLiquido());
	}
}
