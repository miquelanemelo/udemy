package exercicios;
/*Esse programa realiza a convers?o de dolar para real e */
import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMoedasTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		ConversorDeMoedas c = new ConversorDeMoedas();
		System.out.println("Digite o valor do dolar: ");
		c.dolarDia = s.nextDouble();
		System.out.println("Digite quantos dolares voc? quer converter para real: ");
		c.dolar = s.nextDouble();
		
		System.out.printf("Valor em real R$: "+ c.real());
			
		
		
		 
		
		
		
		
		
		
	}

}
