package Projetos_LPA.aula10;

import java.util.Scanner;

public class dowhile_ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Digite um número: ");
			num = scanner.nextInt();
		} while (num != 0);
		
		System.out.println("Você digitou: " + num + " para terminar");
		
		scanner.close();

	}

}
