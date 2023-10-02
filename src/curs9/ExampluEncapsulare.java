package curs9;

public class ExampluEncapsulare {
	
	private int numar;
	
	public ExampluEncapsulare(int numar) {
		//this.numar = numar;
		setNumar(numar);
	}
	

	public int getNumar() {
		return numar;
	}
	
	private void setNumar(int numar) {
		if(numar >0) {
			this.numar = numar;
		}else {
			//System.out.println("Valoarea trebuie sa fie mai mare ca zero!");
			throw new IllegalArgumentException("Valoarea trebuie sa fie mai mare ca zero!");
		
		}
	}
	
	
}
