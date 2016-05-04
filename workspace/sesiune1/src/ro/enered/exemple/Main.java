package ro.enered.exemple;

public class Main {
//pentru afisare pe ecran
	public static void main(String[]args){
		System.out.println("CEVA");
		//pentru definirea variabil
		int a=4;
		int b=3;
		int c;
		c = adunare(a,b);
		//afisare c
		System.out.println(c);
		//afisare scadere
		c= scadere(a,b);
		System.out.println(c);
		//este void nu afiseaza cu print ln ii scriu 
		initializareStudent ();
		initializareNota ();
		initializareStoc ();
		
	}
	private static int adunare(int a1, int b1){
		return a1+b1;
	}
	private static int scadere(int a1, int b1){
		return a1-b1;
	}
	

private static void initializareStudent (){
	//student nou nume clasa
	Student s= new Student();
	//atribuim un nume studentului
	s.nume = " Vlad ";
	//atrib o grupa
	s.grup = 4;
	// aplicam metoda invata
	System.out.println(s.invata("Java",5));
}
public static void initializareNota(){
	
	//sa atribiuim studentului numele ion din grupa 2 nota 8
	
	Student s = new Student();
	s.nume= "Ion";
	s.grup= 2;
	Nota n = new Nota();
	//n.atribuie(s,8);
	System.out.println(n.atribuie(s,8));
	
}
 public static void initializareStoc(){
 Stoc s= new Stoc();
 System.out.println(s.calcNr());
 }
}