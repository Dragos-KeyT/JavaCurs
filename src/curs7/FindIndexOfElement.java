package curs7;

public class FindIndexOfElement {

	/*
	 * Avem un array
	 * si facem o metoda prin care vrem sa aflam indexul unui element 
	 * 
	 * Ex de print : index pentru element 8 este 3
	 */

	//int[] numbers = {3, 5, 7, 8, 9, 22, 4};
	
	
	public static void main(String[] args) {
		FindIndexOfElement obj = new FindIndexOfElement();
		obj.rezolvareCuFor(8);
		obj.rezolvareCuForEach(8);

	}
	
	
	public void rezolvareCuFor(int element) {
		
		for(int i =0; i < numbers.length; i++) {
			
			if(numbers[i] == element) {
				
				System.out.println("Index pentru element " + element + " este " + i);
			}
		}
		
	}
	
	/*
	 * while(numbers.hasNext()){}
	 * 
	 */
	
	int[] numbers = {3, 5, 7, 8, 9, 22, 4};

	public void rezolvareCuForEach(int element) {
		int counter = 0;
		
		for(int numar : numbers) {
			
			if(numar == element) {
				System.out.println("Index pentru element " + element + " este " + counter);

			}
			counter++;
		}
		
		
	}
	
	
	public void rezolvareCuWhile(int element) {
		int i = 0;
		
		while (i < numbers.length) {

		if(numbers[i] == element) {
			System.out.println("Index pentru element " + element + " este " + i);

		}
			i++;
			
		}
	
	

	}
}