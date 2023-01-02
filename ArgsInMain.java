//Import-Befehl muss sein, da die Klasse Arrays 
//aus dem Paket util genutzt wird.
import java.util.Arrays;

/**
 * Diese Klasse zeigt den Einsatz des Parameters von main,
 * sowie die Sortierung eiens Arrays
 * 
 * @author ProfSchmidt
 */
public class ArgsInMain {

	public static void main(String args[]) {

		if (args != null && args.length != 0) {

// Sortieren der Elemente eines Arrays.
// Da die Elemente call by referende �bergeben werden,
// ist die Sortierung nach dem Aufruf der Methode bei args
// durchgef�hrt */
			Arrays.sort(args);

			for (String element : args) {
				System.out.println(element);
			}

		} else
			System.out.println("Bitte geben Sie Parameter an!");

	}

}
