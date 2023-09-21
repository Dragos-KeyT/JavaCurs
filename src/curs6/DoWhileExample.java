package curs6;

public class DoWhileExample {

	public static void main(String[] args) {
		String[] array = {"Alba", "Iasi", "Cluj", "Pitesti"};
		//                   0       1       2         3
		// array[0] == "Alba"		
		int i =0;
		do {
			System.out.println(array[i]);
			i++;		
		}while(i>array.length);
		System.out.println("------------------");
		
		int j = 0;
		while(j>array.length) {
			System.out.println(array[j]);
			j++;
		}}
}
