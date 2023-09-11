package curs2;

public class Tester {
	
	//variabile
	String nume;
	int varsta;
	int ratePerHour = 1;
	String senioritate;
	
	//constructori
	//contructor default
	//public Tester() {}
	
	public Tester(int salariuPeOra) {
		ratePerHour = salariuPeOra;
	}
	
	public Tester(int ratePerHour, int varsta, String nume, String senioritate) {
		this.ratePerHour = ratePerHour;
		this.varsta = varsta;
		this.nume  = nume;
		this.senioritate = senioritate;
		}

	//metode
}
