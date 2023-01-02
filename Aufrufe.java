/** Diese Klasse zeigt in der main-Methode den Unterschied zwischen einer call-by value 
 * und eines call-by-reference Aufrufes.
 * 
 * @author ProfSchmidt
 *
 */

public class Aufrufe {

	public static void main(String[] args) {
		int number = 9;
		
		int [] numbers = {1,2,3};
		
		aendereZahl(number); //call by value
		
		aendereZahlen(numbers); //call by reference
		
		System.out.println(number);
		
		System.out.println(numbers); //Ausgabe der Speicheradresse
		
		for(int n : numbers){
			System.out.println(n);
			System.out.println(numbers.toString());
		}

	}

	
	public static void aendereZahl(int zahl) {
		zahl = 999;
	}

	public static void aendereZahlen(int [] zahlen) {
		System.out.println("Speicheradresse von zahlen: ");
		System.out.println(zahlen); //Ausgabe der Speicheradresse
		
		
		//Prüfung!!!
		for(int i = 0; i < zahlen.length; i++){
			zahlen[i]= i + 4;
		}
	
	}

}
