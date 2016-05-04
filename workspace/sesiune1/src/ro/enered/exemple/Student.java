package ro.enered.exemple;

public class Student {
	// prop studentului
	String nume;
	int grup ;

	public String invata(String numeCurs,int ore) {
		//ai grija la spatii pentru sintgmele dintre "
		String rezultat = "Studentul" + nume + " a invatat la " + numeCurs +  " timp de ore " + ore;
		return rezultat;
//studentul "nume "din grupa "grup" a invatat " numeCurs " timp de 5 ore
	}
}
