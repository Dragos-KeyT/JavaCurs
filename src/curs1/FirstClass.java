package curs1;

//one line comment

/*
 * multiple
 * line
 * comment
 */


//CamelCase
//UpperCamelCase --> clase
//lowerCamelCase --> metode si variabile
public class FirstClass {
	
	public static void main(String[] args) {

		System.out.println("Test");
		
		FirstClass obiect = new FirstClass();
		obiect.trimiteMesaj();
		
		trimiteSMS();
	}
	
	public static void trimiteSMS() {
		System.out.println("SMS");

	}
	
	
	public void trimiteMesaj() {
		System.out.println("mesaj");

	}
	
	/*
	 * CLASA Tester() --> Obiect1, Obiect2, Obiect3 etc
	 * 
	 * public class Tester(){
	 * 	
	 * 	String nume;
	 *  
	 *  static String prenume = "alina";
	 * 	
	 * }
	 * 
	 * Tester ion =  new Tester();
	 * ion.nume = "Ion"
	 * ion.prenume = "Ionut"
	 * 
	 * Tester maria = new Tester();
	 * maria.nume = "Maria"
	 * maria.prenume = "Elena" 
	 * 
	 * 
	 */
	
	
	

}

