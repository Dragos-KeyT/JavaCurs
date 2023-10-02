package curs8;

import curs9.MethodOverload;

public class TestShape {

	public static void main(String[] args) {
		
		Square patrat = new Square("Rosu", "Cerc");
		
		System.out.println(patrat.culoare);
		System.out.println(patrat.nume);

		
		patrat.printDetails();
		
	}

}
