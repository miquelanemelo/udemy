package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Funcionario funcionario = new Funcionario();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		funcionario.nome = s.nextLine();
		System.out.println("Digite o salario bruto:  ");
		funcionario.salarioBruto = s.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		funcionario.imposto = s.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + funcionario);
		System.out.println();
		System.out.println("Qual porcetagem aumentar no salario? ");
		double porcetagem = s.nextDouble();
		funcionario.incrementarSalario(porcetagem);
		
		System.out.println();
		System.out.println("Dados atualizado: " + funcionario);
		
		
		s.close();
		
		
	}

}
