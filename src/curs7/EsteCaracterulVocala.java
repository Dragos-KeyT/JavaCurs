package curs7;

import java.util.Scanner;

public class EsteCaracterulVocala {

	/*
	 * Facem un program care citeste o litera de la tastatura
	 * verifica daca este vocala sau consoana
	 * 
	 */
	
	public static void main(String[] args) {

		System.out.println("Introdu o litera :");
		Scanner scan  =  new Scanner(System.in);
		char litera = scan.next().charAt(0);
		
		//rezolvare cu IF
		
		if(litera == 'a' || litera == 'A' || litera == 'e' || 
				litera == 'E' || litera == 'i' || litera == 'I' ||
				litera == 'o' || litera == 'O' || litera == 'u' || litera == 'U' ) {
			
			System.out.println(litera + " Este vocala");
		}else {
			System.out.println(litera + " Nu este vocala");

		}
		
		//rezlovare cu switch
		switch(litera) {
			case 'a':			
			case 'A':
			case 'e':			
			case 'E':
			case 'i':			
			case 'I':
			case 'o':			
			case 'O':
			case 'u':			
			case 'U':
				System.out.println(litera + " Este vocala");
				break;
			default:
				System.out.println(litera + " Nu este vocala");

				
		}
		
	}

}
