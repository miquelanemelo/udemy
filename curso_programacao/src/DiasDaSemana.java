import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o dia da semana para verificar: ");
		int x = s.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia ="Domingo";
			break;
		case 2:
			dia ="Segunda-feira";
			break;
		case 3:
			dia ="Terça-feira";
			break;
		case 4:
			dia ="Quarta-feira";
			break;
		case 5:
			dia ="Quinta-feira";
			break;
		case 6:
			dia ="Sexta-feira";
			break;
		case 7:
			dia ="Sabado";
			break;
		default:
			dia ="Dia invalido";
			break;	
	}
		System.out.println("Dia da semana: " + dia);
}
}
