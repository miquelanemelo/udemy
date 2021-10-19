package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Digite a largura do retangulo: ");
		retangulo.largura = s.nextDouble();
		System.out.println("Digite a altura do retangulo");
		retangulo.altura = s.nextDouble();
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimetro = %.2f%n",retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n",retangulo.diagonal());
		
	}

}
