package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstudantesTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner (System.in);
		Estudantes a = new Estudantes();
		int[] quartos = new int[10];
		System.out.println("Quantos quartos você deseja alugar? ");
		int n = s.nextInt();
		
		for (int i = 0; i < quartos.length; i++) {
			quartos[0] = s.nextInt();
		}

	}

}
