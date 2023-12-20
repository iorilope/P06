/**
 * 
 */
package p06_A5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Ioritz Lopetegi
 */
public class ZuhaitzKudeatzailea {


	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Zuhaitza> ZuhaitzZerrenda = new ArrayList<Zuhaitza>();

		String direktorioaString="C:\\Users\\1ag3.iorilope\\git\\repository11\\p06_A5\\";
		String fitxategiaString="datuak.txt";

		File fitxategia=new File(direktorioaString+fitxategiaString); 

		int zenbatKop= 0;
		String IzenArrunta;
		String IzenZientifikoa;
		int BBAltuera= 0;

		Scanner sc = new Scanner(System.in); 
		Scanner teklatua = new Scanner(System.in); 

		System.out.println("Zenbat zuhaitz sartu nahi dituzu?");

		try {
			zenbatKop = sc.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Sartu duzun balioa ez da zenbaki bat. Programa itxiko da.");
			System.exit(0);
		}

		for (int i = 1; i <= zenbatKop; i++) {

			System.out.println("Sartu zuhaitzaren izena");
			IzenArrunta = sc.next();
			Zuhaitza zuhaitz = new Zuhaitza(IzenArrunta);

			System.out.println("Sartu zuhaitzaren izen zientifikoa");
			IzenZientifikoa = teklatua.nextLine();
			zuhaitz.setIzenZientifikoa(IzenZientifikoa);

			System.out.println("Sartu zuhaitzaren bataz besteko altuera");
			BBAltuera = sc.nextInt();
			zuhaitz.setBatazbestekoAltuera(BBAltuera);

			ZuhaitzZerrenda.add(zuhaitz);
			System.out.println("zuhaitza gehitu da");

//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datuak.txt"));

			//Fitxategia idatzi
		}
		try (final FileOutputStream fout = new FileOutputStream(fitxategia);
				final ObjectOutputStream out = new ObjectOutputStream(fout)) {
			out.writeObject(ZuhaitzZerrenda);
			out.flush();
			System.out.println("Datuak ondo idatzi dira");
		} catch (IOException e) {
			e.printStackTrace();
		}


		for (Zuhaitza auto : ZuhaitzZerrenda) {
			System.out.println(auto.toString());
		}

	}

}
