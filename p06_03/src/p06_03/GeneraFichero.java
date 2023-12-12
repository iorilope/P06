/**
 * 
 */
package p06_03;

/**
 * 
 * @author Ioritz Lopetegi
 */
/* Agenda.txt izeneko lerroz lerroko testu-fitxategia sortzea.
 * Lehenengo izena sartzen da eta gero telefonoa
 * Izen gisa enter sakatzen denean amaitzen da
Reader eta Writer-etik eratorritako klaseak erabiltzen dira.
16 biteko streamsa (UNICODE karaktereak) */

import java.io.*;
import java.util.*;

public class GeneraFichero {
	public static void main(String args[])
	{
		Scanner teklatua = new Scanner(System.in);
		String izena;

		try {
			FileWriter flS = new FileWriter ("agenda.txt",true);	// fluxua
			BufferedWriter fS = new BufferedWriter(flS);	// iragazkia

			do {
				System.out.println("sartu izena");
				izena = teklatua.nextLine();

				if (izena.length() > 0) {
					System.out.println("telefonoa");
					String telefonoa = teklatua.nextLine();
					fS.write(izena + "," + telefonoa);// idatzi testu-lerroak fitxategian
					fS.newLine();// linea-jauzia
				}

			} while (izena.length() > 0);

			fS.close();
			System.out.println("Fitxategia sortu da");

		} 
		catch (IOException e) {
			System.out.println("fitxategiko errorea");
		}
		teklatua.close();
	}
}

