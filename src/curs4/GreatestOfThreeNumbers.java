package curs4;

import java.util.Scanner;

/*
 * Facem un program in care intrebam utilizatorul 3 numere
 * verificam care dintre cele 3 numere este cel mai mare
 * si printam corespunzator
 * EX: First number is the greatest
 * Daca 2 numere sunt egale si au valorile cele mai mari
 * printam : Some numbers are equal
 */
public class GreatestOfThreeNumbers {

	int num1, num2, num3;
	// int num1;
	// int num2;
	// int num3;

	public void askTheUserForThreeNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
		System.out.println("Please enter third number:");
		num3 = scan.nextInt();
		scan.close();
	}

	public void compareThreeNumbers() {
		askTheUserForThreeNumbers();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("First number is the greatest!");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("Second number is the greatest!");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("Third number is the greatest!");
	//	}else if( (num1 == num2 && num1>num3) || (num2 ==num3 && num2>num1)|| (num1 ==num3 && num1>num2)) {
		}else {
			System.out.println("Some numbers are equal!");
		}
			
	}

}
