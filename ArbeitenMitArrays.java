//Import-Befehl muss sein, da die Klasse Arrays 
//aus dem Paket util genutzt wird.

import java.util.Arrays; 
//Die Klasse ArbeitenMitArrays dient als Beispiel für das Arbeiten
//mit Arrays
//Daher sind die Kommentare programmiertechnischer Art
//und KEINE üblichen Entwicklerkommentare

public class ArbeitenMitArrays {

	
	public static void main(String[] args) {
		
		char cArray [] = {'a','b','c'}; //Deklaration und Initialisierung
		
		int [] array1 = new int [3]; //Deklaration und Erzeugung
		int [] array2 = new int [3]; //Deklaration und Erzeugung
		// finalArray wird als konstanter Array deklariert
		// Achtung final verhindert nicht wie bei einfachen Datentypen
		// alle schreibenden Zugriffen: Elemente können verändert werden
		// nur die Adresse kann NICHT verändert werden.
		final int [] finalArray = {31,32,33}; //Deklaration und Initialisierung
		int [] array3;
			
			
		//array1 initalisieren
		Arrays.fill(array1, 1);
		
		// Arrays ausgeben
		System.out.println("Array1 ausgeben:");
		System.out.println("Array1:");
		for(int e : array1)	//Wie wurde array1 initialisiert?
			System.out.println(e);
		System.out.println("Array2:");
		for(int e : array2) //Ist array2 initialisiert?
			System.out.println(e);
		
		System.out.print("Array2: "); 
		System.out.println(array2); //Was wird ausgegeben?
		// toString kommt von der Klasse Object
		// Es wird die Referenzvariable beschrieben: 
		// z. B. [I für einen Integer-Array
		// und die Adresse hexadezimal ausgegeben.
		System.out.print("array2.toString(): "); 
		System.out.println(array2.toString()); //Was wird ausgegeben?
		System.out.println("finalArray: " + finalArray);
		
		// Ein Charakter-Array verhält sich anders
		// Er verhält sich wie ein String, da Strings über
		// Charakter-Array umgesetzt werden.
		// In Java ist ein String darüberhinaus eine Klasse,
		// die zahlreiche Methoden bietet.
		System.out.print("cArray: ");
		System.out.println(cArray); //Was wird ausgegeben?
		System.out.println("cArray.toString(): " + cArray.toString());
		
//		System.out.println(array3.toString());

		//Arrayinhalte ändern
		//Wo werden echte Kopien erzeugt?
		//Wo werde nur Adressen kopiert?
		
		
		//finalArray = array1;
		
		
		System.out.println("\nArrayinhalte ändern bei finalArray:");
		Arrays.fill(finalArray, 3);
		finalArray[0] = 4;
		//Adressen ändern bei finalArray
	//	finalArray = array2;
		
		for(int e : finalArray)
			System.out.println(e);
		
		//Arrays kopieren
		array2 = array1;
		
		for(int i = 0; i < finalArray.length; i++)
			finalArray[i] = array1[i];
		
		array3 = array1.clone();
		
		
		// Arrays vergleichen
		// Die Methode equals verhält sich wie
		// der Vergleichsoperator ==
		// Es werden Adressen verglichen
		// Arrays.equals() vergleicht dagegen Inhalte
		System.out.println("\nArrayinhalte vergleichen:");
		System.out.println("array2 und array1 (Zuweisung)");
		System.out.println(array2.equals(array1));
		System.out.println(array2 == array1);
		System.out.println(Arrays.equals(array2,array1));
		
		System.out.println("finalArray und array1 (mit for kopiert)");
		System.out.println(finalArray.equals(array1));
		System.out.println(finalArray == array1);
		System.out.println(Arrays.equals(finalArray,array1));
		
		System.out.println("array3 und array1 (geklont)");
		System.out.println(array3.equals(array1));
		System.out.println(array3 == array1);
		System.out.println(Arrays.equals(array3,array1));
		
		
	}

}
