import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char resp;
		do {
		System.out.println("Digite a temperatura em celsius: ");
		double c = s.nextDouble();
		double f = 9.0 * c / 5.0 + 32.0;
		System.out.printf("Equivalente a fahrenheit: %.1f%n", f);
		System.out.println("Deseja repetir(S/N)? ");
		resp = s.next().charAt(0);}
		while(resp != 'n');
			System.out.println("Programa finalizado");
		
	}

}
