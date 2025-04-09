package Projetos_LPA.aula10;

import java.util.Scanner;

public class username {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu username: ");
		String user = scanner.nextLine();
		
		int i = 1;
		
		while (i <= 10) {
			System.out.println(user);
			i++;
		}
		
		scanner.close();

	}

}
