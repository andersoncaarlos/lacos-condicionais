package Generation;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicional4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do colaborador: ");
		String nome = sc.nextLine();
		System.out.print("\nCargo: ");
		int cargo = sc.nextInt();
		System.out.print("\nSalário: ");
		float salario = sc.nextFloat();
		
		double reajuste, novoSalario;
		
		switch(cargo) {
		case 1: 			
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Gerente" );
			reajuste = 0.10;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Salário: " + String.format("%.2f", novoSalario));
			break;
		case 2: 			
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor" );
			reajuste = 0.07;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Salário: " + String.format("%.2f", novoSalario));
			break;
		case 3: 			
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor" );
			reajuste = 0.09;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Salário: " + String.format("%.2f", novoSalario));
			break;
		case 4: 			
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Motorista" );
			reajuste = 0.06;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Salário: " + String.format("%.2f", novoSalario));
			break;
		case 5: 			
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista" );
			reajuste = 0.05;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Salário: " + String.format("%.2f", novoSalario));
			break;
		case 6: 			
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI" );
			reajuste = 0.08;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Salário: " + String.format("%.2f", novoSalario));
			break;
		}
		
		
		sc.close();
	}

}
