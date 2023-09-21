package curs6;

import java.util.Scanner;

/*
 * Facem un program care valideaza o parola pe baza unor reguli :
 * Reguli:
 * 1. parola trebuie sa fie minim 10 caractere
 * 2. parola trebuie sa contina un upper case
 * 3. parola nu trebuie sa fie la fel ca username 
 * 
 * Intrebam utilizatorul un username si o parola
 * il informam care sunt regulile parolei
 * 
 * Daca parola este valida atunci printam "Parola valida!"
 * Daca parola nu este valida, il intrebam din nou si il informam care 
 * sunt regulie care nu au fost respectate
 * 
 * 
 * Metode:
 * -Introducere user X
 * -Introducere parola X
 * -Printare reguli X
 * -Validare reguli
 * -Validare parola
 * 
 */

public class PasswordValidator {
	
	String username;
//	String password;
	Scanner scan  = new Scanner(System.in);
	boolean valid = true;

	public void getUsername() {
		System.out.println("Introdu username:");
		username = scan.next();	
	}
	
	public String getPassword() {
		System.out.println("Introdu password:");
		String password = scan.next();
		return password;
	}
	
	
	public void printPasswordRules() {
		System.out.println("Reguli parola: ");
		System.out.println("parola trebuie sa fie minim 10 caractere");
		System.out.println("parola trebuie sa contina un upper case");
		System.out.println("parola nu trebuie sa fie la fel ca username");
	}
	
	
	public void checkPasswordRules(String password) {
		valid =true;
		
		if(password.length() < 10) {
			System.out.println("Parola trebuie sa fie minim 10 caractere ");
			valid = false;
		}
		
		if(password.equals(password.toLowerCase())) {
			System.out.println("Parola trebuie sa contina cel putin un upper case");
			valid = false;
		}
		
		if(password.equals(username)) {
			System.out.println("Parola nu trebuie sa fie la fel ca username");
			valid = false;

		}
		
	}
	
	public void validatePassword() {
		
		do {
			
			checkPasswordRules(getPassword());
			
		}while(!valid);
		
		
		
		
	}
	

}
