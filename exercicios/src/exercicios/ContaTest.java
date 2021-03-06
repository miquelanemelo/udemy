package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ContaTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta;
		
		System.out.print("Digite o numero da conta: ");
		Integer numero = s.nextInt();
		System.out.println("Titular da conta: ");
		s.nextLine();
		String nome = s.nextLine();
		System.out.println("Deseja fazer deposito inicial? (s/n)");
		char resposta = s.next().charAt(0);
		if(resposta == 's') {
			System.out.println("Digite o deposito inicial: ");
			double depositoInicial = s.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}else {
			conta = new Conta(numero, nome);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		double valorDeposito = s.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Informações da conta atualizada: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = s.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Informações da conta atualizada: ");
		System.out.println(conta);

		
		s.close();
	}

}
