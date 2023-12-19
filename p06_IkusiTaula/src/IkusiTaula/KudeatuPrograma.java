/**
 * 
 */
package IkusiTaula;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.*; 


/**
 * 
 * @author Ioritz Lopetegi
 */
public class KudeatuPrograma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		TaulaDB t      = new TaulaDB("datuak.dat");







		String         izena;
		int            adina;
		double         pisua;



		System.out.println("==================================================================");
		System.out.println("    Sartu zure aukera");
		System.out.println("    	1-Fitxategia Zerrendatu");
		System.out.println("    	2-Erregistro bat gehitu");
		System.out.println("    	3-Izenaren araberako erregistro bat bilatu");
		System.out.println("	4-Irten");
		System.out.println("==================================================================");



		int Aukera = sc.nextInt();

		try {
			switch (Aukera) {

			case 1: {

				try {
					System.out.println("Fitxategia Zerrendatu Aukeratu Duzu");

					int nR = t.getErregistroaKop();
					for (int i = 1; i <= nR; i++)
					{
						Erregistroa r = t.irakurriErregistroa(i);
						System.out.println(r.erakutsiErregistroa());
					}

				} catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				t.itxiTaula();
				sc.close();
				break;
			}

			case 2: {

				try {
					System.out.println("Erregistro bat gehitu aukeratu duzu.Sartu ondorengo datuak:");

					Scanner        kontsolaTeklatua = new Scanner(System.in);

					System.out.println("izena: ");

					izena = kontsolaTeklatua.nextLine();

					System.out.println("adina: ");

					adina = sc.nextInt();

					System.out.println("pisua: ");
					pisua = sc.nextDouble();

					int nR = t.getErregistroaKop();
					nR++;
					t.idatziErregistroa(izena, adina, pisua, nR);

					for (int i = 1; i <= nR; i++)
					{
						Erregistroa r = t.irakurriErregistroa(i);
						System.out.println(r.erakutsiErregistroa());
					}

					t.itxiTaula();
					sc.close();
					kontsolaTeklatua.close();
					break;


				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());

				}
			}

			case 3: {
				Scanner        kontsolaTeklatua = new Scanner(System.in);

				System.out.println("Sartu bilatu nahi duzun izena: ");
				String izenaString = kontsolaTeklatua.nextLine();

				int nR = t.getErregistroaKop();
				for (int i = 1; i <= nR; i++)
				{
					Erregistroa r = t.irakurriErregistroa(i);
					if (izenaString.equalsIgnoreCase(r.getIzena().trim())) {

						System.out.println("Bilatu da: ");

					}

				}




			}
			break;



			}

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}










	}

}
