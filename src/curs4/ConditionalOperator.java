package curs4;
/*
 * Citim 2 numere de la tastatura
 * vericam fiecare numar daca este pozitiv sau negativ
 * verificam daca ambele numere sunt pozitive
 * verifica care dintre cele 2 numere este cel mai mic tinand cont ca
 * ar putea fi egale
 * Printam ; Este pozitiv sau este negativ
 */

import java.util.Scanner;

public class ConditionalOperator {

	int num1, num2;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
		scan.close();
	}
	
	public void verifyTheNumbers() {
		
		if(num1>0) {
			System.out.println("Este poztiv");
		}else {
			System.out.println("Este negativ");
		}
		
		String result = (num1>0)? "Este poztiv" :"Este negativ";
		System.out.println(result);
		//verific num2
		result = (num2>0)? "Este poztiv" :"Este negativ";
		System.out.println(result);
		//verific daca ambele sunt pozitive sau negative
		result = (num1>0 && num2>0)? "Numbers are positive" :"Numbers are negative";
		System.out.println(result);
	}
	
}
