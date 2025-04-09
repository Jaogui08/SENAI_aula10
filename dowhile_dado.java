package Projetos_LPA.aula10;

import java.util.Random;
import java.util.Scanner;

public class dowhile_dado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int esc, facedado;
        
        System.out.println("Bem-vindo ao dado virtual em Java, siga as instruções abaixo: ");

        while (true) {
            System.out.print("\n1 - jogar dado, 2 - parar o jogo: ");
            esc = scanner.nextInt();

            if (esc == 1) {
                facedado = random.nextInt(6) + 1;
                System.out.println("O lado jogado foi: " + facedado);
            } else if (esc == 2) {
                System.out.println("Fechando o sistema...");
                break;  
            } else {
                System.out.println("Número inválido");
            }
        }

        scanner.close();
	}
}
