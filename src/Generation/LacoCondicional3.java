package Generation;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicional3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o código do Produto: ");
		int op = sc.nextInt();
		System.out.print("\nDigite a quantidade: ");
		int qntd = sc.nextInt();
		
		switch(op) {
		case 1: 			
			double p1 = 10.00; 			
			System.out.println("\nProduto: Cachorro Quente");
			System.out.println("\nValor total: " + String.format("%.2f", (p1 * qntd)));
			break;
		case 2:
			double p2 = 15.00; 			
			System.out.println("\nProduto: X-Salada");
			System.out.println("\nValor total: " + String.format("%.2f", (p2 * qntd)));	
			break;
		case 3:
			double p3 = 18.00; 			
			System.out.println("\nProduto: X-Bacon");
			System.out.println("\nValor total: " + String.format("%.2f", (p3 * qntd)));			
			break;
		case 4:
			double p4 = 12.00; 			
			System.out.println("\nProduto: Bauru");
			System.out.println("\nValor total: " + String.format("%.2f", (p4 * qntd)));	
			break;	
		case 5:
			
			double p5 = 8.00; 			
			System.out.println("\nProduto: Refrigerante");
			System.out.println("\nValor total: " + String.format("%.2f", (p5 * qntd)));	
			break;	
		case 6:
			
			double p6 = 13.00; 			
			System.out.println("\nProduto: Suco de Laranja" );
			System.out.println("\nValor total: " + String.format("%.2f", (p6 * qntd)));	
			break;				
		}				
		
		sc.close();
	}

}
