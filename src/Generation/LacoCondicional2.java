package Generation;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicional2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		
		if (a % 2 == 0 && a > 0) {
			System.out.println("O numero " + a + " é par e positivo!");
		}
		else if (a % 2 == 0 && a < 0) {
			System.out.println("O numero " + a + " é par e negativo");
		}
		else if (a % 2 != 0 && a > 0) {
			System.out.println("O numero " + a + " é impar e positivo ");
		}
		else {
			System.out.println("O numero " + a + " é impar e negativo");
		}		
		
		sc.close();

	}

}
