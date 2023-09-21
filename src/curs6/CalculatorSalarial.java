package curs6;

import java.util.Scanner;

public class CalculatorSalarial {

	/*facem un program care calculeaza salariul pe o saptamana
	 * intrebam utilizatorul cate ore a lucrat
	 * calculam daca a lucrat maxim 40 de ore sau minim 1 ore
	 * daca introduce un nr invalid de ore il rugam sa introduca din nou
	 * rate per hour = 15
	 * 
	 */
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu cate ore ai lucrat:");
		
		int oreLucrate = scan.nextInt();
		
		while(oreLucrate < 1 || oreLucrate > 40) {
			System.out.println("Nr invalid de ore.");
			System.out.println("Introdu intre 1 si 40");
			oreLucrate = scan.nextInt();
		}
		
		System.out.println("Salariul tau este :" + oreLucrate*15);

		
	}

}
