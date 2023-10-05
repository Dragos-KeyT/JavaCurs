package curs10;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		String[]  days = {"L", "M", "Mi", "J", "V", "S", "D"};
		//                 0    1    2     3    4    5    6
		System.out.println(days.length);
		
		try {
			System.out.println(days[9]);
			
		}catch(ArrayIndexOutOfBoundsException error) {
			
			System.out.println("Exception occured");
			
		}
		
		System.out.println("Alta linie de cod");
		
		
		
	}

}
