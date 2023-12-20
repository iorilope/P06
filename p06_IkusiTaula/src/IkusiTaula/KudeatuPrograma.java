/**
 * 
 */
package IkusiTaula;

import java.util.Scanner;


import java.io.FileNotFoundException;



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
		/**
		//Gure datuak dauden fitxategia aukeratu
		 * @param Izena,Adina eta Pisua 
		 * */

		TaulaDB t      = new TaulaDB("datuak.dat");


		String         izena;
		int            adina;
		double         pisua;
		boolean 	jarraitu;

		do {

			System.out.println("==================================================================");
			System.out.println("    Sartu zure aukera");
			System.out.println("    	1-Fitxategia Zerrendatu");
			System.out.println("    	2-Erregistro bat gehitu");
			System.out.println("    	3-Izenaren araberako erregistro bat bilatu");
			System.out.println("	4-Irten");
			System.out.println("==================================================================");

			jarraitu = false;
			int Aukera = sc.nextInt();

			try {
				switch (Aukera) {

				case 1: {

					//TaulaDBko metodoak erabiliz gure fitxategiko pertsonak zerrendatzen ditugu
					//@Returns Pertsona guztien zerrenda
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
					break;
				}
				case 4: {

					System.out.println("Agur! ");
					jarraitu = true;
					break;
					
					

				}
				}

			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		} while (!jarraitu);
		sc.close();
		
	}

}
