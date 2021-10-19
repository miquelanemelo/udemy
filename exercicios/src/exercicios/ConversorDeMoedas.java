package exercicios;

public class ConversorDeMoedas {
	
	public double dolar;
	public double dolarDia;
	public double real;
	public static final double IMPOSTO = 6;
	
	public double real() {
		return dolarDia * dolar + IMPOSTO / 100;
		
	}
	public String toString() {
		return "Valor Real" + String.format("  $ %.2f",real);
	}
	

}
