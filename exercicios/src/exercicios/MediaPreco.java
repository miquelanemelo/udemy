package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class MediaPreco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos para tirar a media");
		int n = s.nextInt();
		
		Produto [] vect = new Produto[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite o nome do produto " + i + ":" );
			s.nextLine();		
			String nome = s.nextLine();
			System.out.println("Digite o valor do " + i + " produto");
			double preco = s.nextDouble();
			vect[i] = new Produto (nome, preco);
			
		}
		
		double soma = 0.0;
		for(int i = 0; i<vect.length ; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;
		
		System.out.printf("Media preço = %.2f", media);
		
		
		
		s.close();
	}

}
