package curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	
	
	
	public void division() {
		
		int num1, num2, result;
		Scanner scan = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println("Please enter number1 :");
				try {
					num1 = Integer.parseInt(scan.next());
					
				}catch(NumberFormatException e) {
					System.out.println("Please enter only numeric values");
					continue;
				}
				System.out.println("Please enter number2 :");
				try {
					num2 = Integer.parseInt(scan.next());
					
				}catch(NumberFormatException e) {
					System.out.println("Please enter only numeric values");
					continue;
				}
				
				if(num2 ==0) {
					throw new ArithmeticException("num2 is zero. try again");
				}
				
				
				result =  num1/num2;
				System.out.println("Result : " + result);
				break;
				
				
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				scan.reset();

			}
			
			
	
			
			
		}while(true);
		

		
	}
	
	
	
	
	
	public static void main(String[] args) {

		ExceptionExample2 obj = new ExceptionExample2();
		
		obj.division();
	}

}
