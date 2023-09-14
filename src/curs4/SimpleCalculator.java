package curs4;

import java.util.Scanner;

/*
 * Facem un calculcator care are operatiile +(adunare), -(scadere)
 * * (inmultire), /(impartire)
 * Intrebam userul primul numar
 * intrebam userul operatia matematica
 * intrebam userul al doilea numar
 * Printam rezultatul:
 * Ex: 2 + 2 = 4!
 * 
 */
public class SimpleCalculator {
	
	int num1, num2;
	char operator;
	int result;
	
	/*
	 * masina   masina.charAt(3) == i
	 * 012345	masina.lenght == 6
	 */
	
	private void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the operator:");
		operator = scan.next().charAt(0);
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
	}
		
	public void simpleCalculator() {
		askTheUser();
		boolean flag = true;
		
		if( operator == '+') {
		 result = num1 + num2;
		 	printResult();	 	
		}else if (operator == '-') {
			result = num1 - num2;
			printResult();
		}else if (operator == '*') {
			result = num1 * num2;
			printResult();
		}else if (operator == '/') {
			result = num1 / num2;
			printResult();
		}else {
			System.out.println("Wrong operation!");
			flag= false;
		}
		if(flag) {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result );
		}
	}

	public void printResult() {
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result );

	}
	
}
