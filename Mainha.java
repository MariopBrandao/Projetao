package Faeterjao;

import java.util.Scanner;

public class Mainha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculante calc=new Calculante();
		
		System.out.println("Digite a Primeira Variavel.");
		int var1 = sc.nextInt();
		
		System.out.println("Digite a Segunda Variavel.");
		int var2 = sc.nextInt();
		
		System.out.println("Valores Digitados. A var1 é : " + var1 + " e a var2 é : " + var2 );

		int result = calc.Soma(var1, var2);
		System.out.println("Resultado: " + result );

		
	}
}
