package curs7;

import java.util.Scanner;

public class SwitchExample2 {
/*
 * Facem un program care verifica daca un student este elegibil pentru o bursa 
 * Conditiile sunt :
 * -sa fie anul 3
 * - sa aiba un punctaj de 80 pentru bursa 1
 * - sa aiba un punctaj de 50 pentru bursa 2
 * 
 * 
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce an esti :");
		int an =  scan.nextInt();

		
		
		switch(an) {
		case 1:
		case 2:
			System.out.println("Nu esti eligibil");
			break;
		case 3:
			System.out.println("Te rog introdu ce punctaj ai:");
			int punctaj =  scan.nextInt();
			switch(punctaj) {
				case 80:
					System.out.println("Eligibil pentru bursa 1");
					break;
				case 50:
					System.out.println("Eligibil pentru bursa 2");
					break;
				default:
					System.out.println("Te rog introdu un punctaj valid!");
			}
			break;
		default:
			System.out.println("Te rog sa introduci un an valid");
		}
		
		
		
	}

}
