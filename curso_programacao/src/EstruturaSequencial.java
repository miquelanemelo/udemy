import java.util.Scanner;
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos*/

public class EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int num1 = s.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = s.nextInt();
		int soma = num1 + num2;
		System.out.println("Os numeros digitados foram : " + num1 + " e " + num2 + " a soma é igual a : " + soma);
		

	}

}
