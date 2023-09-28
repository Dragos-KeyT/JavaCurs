package curs8;

public class TestMostenire {

	public static void main(String[] args) {

		//Angajat --> Tester --> TesterAutomat
		
		TesterAutomat  testerAutomat = new TesterAutomat();
		
		testerAutomat.setProgrammingLanguage("Java");//clasa TesterAutomat()
		testerAutomat.setDepartament("QA"); //clasa Tester()
		testerAutomat.setSeniority("Juniro");//clasa Tester()
		testerAutomat.setEmail("bob@bob.com"); // clasa Angajat()
		testerAutomat.setNume("Bob");//clasa Angajat()
		
	}

}
