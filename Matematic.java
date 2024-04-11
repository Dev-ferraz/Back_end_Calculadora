package Calculadora;

import java.util.Scanner;

public class Matematic {

	public static void main(String[] args) {
		
		
		Calculadora m = new Calculadora();
		Scanner s =  new Scanner(System.in);
			
				System.out.println("CALCULADORA");
				
				int soma = m.add(5, 5);
				System.out.println("Resultado Soma = " + soma);
				
				int sub0 = m.sub(100, 20);
				System.out.println("Resultado Subtração = " + sub0);
				
				int mult0 = m.mult(10, 2);
				System.out.println("Resultado Multiplicação = " + mult0);
				
				
				int dividir0 = m.dividir(10, 2);
				System.out.println("Resultado Divisão = " + dividir0);
				
				
				int raiz0 = m.raiz(16);
				System.out.println("Resultado Raiz quadrada: " + raiz0);
				
			
	      
	}

}
