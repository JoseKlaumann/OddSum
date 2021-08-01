//URI 1158 - 01/08/2021

package application;

import java.util.Locale;
import java.util.Scanner;

import test.Odds;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Odds odds = new Odds();
		
		odds.setN(sc.nextInt()); //entra com o numero de repeticoes
		
		for (int i = 0; i < odds.getN(); i++) {
			odds.setX(sc.nextInt()); //valor do x
			odds.setY(sc.nextInt()); //valor do y			
			odds.setCont(odds.getX()); //coloca o valor de 'X' no atributo 'cont'
			
			while (odds.getAux() < odds.getY()) { //executa as repeticoes de 'X' ate 'Y' 
				
				if (odds.getCont() % 2 != 0) { //testa se o valor de 'X' que esta no atributo 'cont' é impar
					odds.addSum(odds.getCont()); //se sim, adiciona o valor ao atributo 'sum'
					odds.addAux(); //adiciona 1 no atributo 'aux' 
				}
				
				odds.addCont(); //adiciona 1 ao atributo 'cont', alem do valor de 'X' que ja esta nele
				
			}		
			
			System.out.println(odds.toString());
			odds.resetCont(); //reseta o atributo 'cont'
			odds.setSum(); //reseta 'sum'
			odds.setAux(); //reseta 'aux'
		}
		
		sc.close();
	}

}
