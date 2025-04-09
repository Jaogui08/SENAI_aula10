package Projetos_LPA.aula10;

import java.util.Random;

public class dowhile_dadoex {

	public static void main(String[] args) {
		Random random = new Random();
		int facedado;
		
		do {
			facedado = random.nextInt(7);
			System.out.println("Face do dado foi: " + facedado);
		} while (facedado != 6);

	}

}
