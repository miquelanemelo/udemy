package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlturaTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de alturas: ");
		int n = s.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i<n ; i++) {
			System.out.println("Digite a altura: " + i);
			vect[i] = s.nextDouble();
		}
		double soma = 0.0;
		for(int i = 0; i<n ; i++) {
			soma += vect[i];
		}
		double media = soma / n;
		
		System.out.printf("A Media das Alturas digitadas é: %.2f", media);
		
		
		s.close();

	}

}
