package lacofor;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primeiro,segundo,intervalo,numero;
		Scanner captura = new Scanner(System.in);
		System.out.println("Digite o primeiro número do intervalo:");
		primeiro=captura.nextInt();
		System.out.println("Digite o segundo número do intervalo:");
		segundo=captura.nextInt();
		
		if(primeiro >= segundo) {
			System.out.println("Intervalo é inválido!");
			
		}
		  if(primeiro <= segundo) {
			for(intervalo = primeiro;intervalo <= segundo;intervalo++) {
				 if(intervalo %3 == 0 && intervalo %5 == 0) {
		         numero = intervalo;
		   System.out.println( numero + " é múltiplo de 3 e 5");
				 }
			}
		}
	}
}

