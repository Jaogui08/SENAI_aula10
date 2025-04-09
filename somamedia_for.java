package Projetos_LPA.aula10;

import java.util.Scanner;

public class somamedia_for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double media = 0, soma = 0, num;
		
		for (int i = 1; i <=5; i++) {
			System.out.print("Informe o " + i + " número: ");
			num = scanner.nextDouble();
			soma = soma+num;
		}
		
		media = soma/5;
		System.out.println("A soma foi: " + soma);
		System.out.println("A média foi: " + media);
		
		scanner.close();

	}

}
