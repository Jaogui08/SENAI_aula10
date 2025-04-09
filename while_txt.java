package Projetos_LPA.aula10;

import java.util.Scanner;

public class while_txt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma frase aleatória: ");
		String txt = scanner.nextLine();
		
		System.out.print("Informe a quantia de vezes que a frase vai ser repetida: ");
		int n = scanner.nextInt();
		
		int i = 1;
		
		while (i <= n) {
			System.out.println(txt);
			i++;
		}
		
		scanner.close();

	}

}
