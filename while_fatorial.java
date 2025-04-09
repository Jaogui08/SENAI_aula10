package Projetos_LPA.aula10;

import java.util.Scanner;

public class while_fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número para saber o fatorial: ");
		int num = scanner.nextInt();
		
		long fat = 1;
		int i = num;
		
		while (i >= 1) {
			fat = fat*i;
			i--;
		}
		
		System.out.println("O fatorial de " + num + " é igual a: " + fat);
		
		scanner.close();

	}

}
