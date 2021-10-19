import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double renda = 10.5686;
		String nome = "Maria";
		int idade = 35;
		/*Marcadores %f ponto flutuante
		 * %d inteiro 
		 * %s texto
		 * %n quebra de linha
		 * %.2f casas decimais */
		
		System.out.printf("%s tem %d anos e ganha R$%.4f%n",nome, idade, renda );

	}

}
