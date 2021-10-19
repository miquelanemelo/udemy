package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Product produto = new Product();
		System.out.println("Insira os dados do Produto");
		System.out.print("Nome: ");
		produto.nome = s.nextLine();
		System.out.println("Preço: ");
		produto.preco = s.nextDouble();
		System.out.println("Quantidade em estoque");
		produto.quantidade = s.nextInt();
		
		System.out.println();
		System.out.println("Informações do produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para serem adicionados no estoque: ");
		int quantidade = s.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Informações atualizadas: " + produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para serem removidos do estoque: ");
		quantidade = s.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Informações atualizadas: " + produto);
		
		s.close();
	}

}
