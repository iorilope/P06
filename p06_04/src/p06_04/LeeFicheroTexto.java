/**
 * 
 */
package p06_04;

/**
 * 
 * @author Ioritz Lopetegi
 */

import java.io.*;

public class LeeFicheroTexto {
	public static void main (String args []) 
	{
		String testua = "";
		try {
			FileReader flE = new FileReader ("Agenda.txt"); // fluxua
			BufferedReader fE = new BufferedReader (flE);	// iragazkia

			while (testua != null) 
			{
				testua = fE.readLine (); // irakurri testu-lerro bat
				if (testua != null) 
				{
					int posi = testua.indexOf (",");		// komaren kokapena
					String iz= testua.substring (0, posi);	        // atera izena
					String telefonoa = testua.substring (posi + 1); // atera telefonoa
					System.out.print ("Izena: " + iz);
					System.out.println (" Telefonoa: " + telefonoa);
				}
			}
			fE.close ();
		} 
		catch (IOException e) {
			System.out.println ("fitxategian errorea");
		}
	}
}
