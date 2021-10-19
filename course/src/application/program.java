package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite 3 numeros para o triagulo x: ");
		x.a = s.nextDouble();
		x.b = s.nextDouble();
		x.c = s.nextDouble();
		System.out.println("Digite 3 numeros para o triagulo y: ");
		y.a = s.nextDouble();
		y.b = s.nextDouble();
		y.c = s.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p*(p- x.a)*(p-x.b)*(p - x.c));
		double areaY = Math.sqrt(p*(p- y.a)*(p-y.b)*(p - y.c));
		
		System.out.printf("Area triangulo X:  %.4f%n",areaX);
		System.out.printf("Area triangulo Y:  %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area: X");
		}else {
			System.out.println("Maior area: Y");
		}
		
	}

}
