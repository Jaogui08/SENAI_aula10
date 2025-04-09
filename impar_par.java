package Projetos_LPA.aula10;

import java.util.Scanner;

public class impar_par {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int impar = 0, par = 0, i = 1;
		
		while (i <= 10) {
			System.out.print("Informe o " + i + " número: ");
			int num = scanner.nextInt();
			i++;
			
			if (num % 2 == 0) {
				par = par+1;
			} else {
				impar = impar+1;
			}
			
		}
		System.out.println("A quantia de números pares é: " + par);
		System.out.println("A quantia de números ímpares é: " + impar);
		
		scanner.close();
		
	}

}
