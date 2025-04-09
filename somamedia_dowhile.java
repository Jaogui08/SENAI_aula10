package Projetos_LPA.aula10;

import java.util.Scanner;

public class somamedia_dowhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soma = 0, media = 0, num;
		int i = 1;
				
		do {
			System.out.print("Informe o " + i + " número: ");
			num = scanner.nextInt();
			soma = soma+num;
			i++;
		} while (i <= 5);
		
		media = soma/5;
		System.out.println("A soma foi: " + soma);
		System.out.println("A média foi: " + media);
		
		scanner.close();

	}

}
