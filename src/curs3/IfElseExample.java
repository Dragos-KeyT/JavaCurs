package curs3;

import java.util.Scanner;

/*
 * Facem un program care verifica daca autentificarea este corecta
 * User : Test
 * Pass : 1234
 * daca auth este corect, printam
 * --> login sucessfull
 * daca auth este gresit, printam
 * -->username sau parola este gresita
 * 
 */
public class IfElseExample {
	

	public static void main(String[] args) {
		String user = "Test";
		int pass = 1234;
		
		String inputUsername;
		int inputPassword;
		
		System.out.println("Te rog introdu username:");
		Scanner scan = new Scanner(System.in);
		inputUsername = scan.next();
		System.out.println("Te rog introdu o parola:");
		inputPassword =  scan.nextInt();
		
		// --> && --> operator AND
		// --> || --> operatorul OR
		//in java Stringurile se compara cu equals nu cu ==
		
		if((inputUsername.equals(user)) && (inputPassword==pass)) {
			System.out.println("Login sucessfull!");
		}else {
			System.out.println("Username or password is wrong!");
		}
		
		/*if(conditie booleana (true sau false)) {
			//codul din corpul lui if se executa daca conditia din if
			 * este indeplinita (adica rezulta pe True)
			 * daca conditia nu este indeplinita (adica rezulta pe false)
			 * se executa codul din else
			
		}else {
			
		}*/
		
		
	}

}
