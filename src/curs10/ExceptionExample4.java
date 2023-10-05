package curs10;

public class ExceptionExample4 {

	public static void main(String[] args) {
		
		try {
			
			String nume = null;
			System.out.println(nume.length());
			
		}catch(Exception e) {
			
			System.out.println("Error occured");
			System.out.println(4/0);
			
			
		}finally {
			
			System.out.println("Finnaly block of code!");
			
		}
		
		
		System.out.println("Code after try-catch");
		
		
	}

}
