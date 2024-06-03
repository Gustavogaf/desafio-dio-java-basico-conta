package desafio_contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int maior = ler.nextInt();
		int menor = ler.nextInt();
		try {
			int resultado = TestaNumeros(maior, menor);
			for (int i = 1; i < resultado; i++) {
				System.out.println(menor+1);
			}
		} catch (ParametrosInvalidosException e) {
			System.out.println("O primeiro valor deve ser maior que o segundo!!!");
		}
		
	}
		static int TestaNumeros (int maior,int menor) throws ParametrosInvalidosException {
			if (maior<menor) {
				throw new ParametrosInvalidosException();
			} else {
				return maior-menor;
			}
				
			}
		}

