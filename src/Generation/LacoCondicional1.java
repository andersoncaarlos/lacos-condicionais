package Generation;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicional1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		int a = sc.nextInt();
		System.out.print("\nDigite o número B: ");
		int b = sc.nextInt();
		System.out.print("\nDigite o número C: ");
		int c = sc.nextInt();
		
		int soma = a + b;
		
		if (soma > c) {
			System.out.println("A Soma de A + B é maior do que C");
		}
		else if (soma < c) {
			System.out.println("A soma de A + B é menor do que C");
		}
		else {
			System.out.println("A soma de A + B é igual a C");
		}
		
		sc.close();
	}

}
