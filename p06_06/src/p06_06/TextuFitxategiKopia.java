/*
 * 2023(e)ko abe. 13(a)
 * Ioritz Lopetegi
 */
package p06_06;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Ioritz Lopetegi
 */
public class TextuFitxategiKopia {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String args []) 
	{

		String DirLekuBerria ="";	//Helbide absolutoa
		String fitxategiZaharra = "";

		Scanner teklatua = new Scanner(System.in);

		System.out.println("Sartu Fitxategiaren helbide absolutua");
		fitxategiZaharra = teklatua.nextLine();

		System.out.println("Nora mugitu nahi dituzu datuak (Direktorioa):");

		DirLekuBerria = teklatua.nextLine();

		Path DirekLekuZaharra = Path.of(fitxategiZaharra);

		Path DirekLekuBerria =  Path.of(DirLekuBerria);

		try {
			Files.copy(DirekLekuZaharra, DirekLekuBerria);
		} catch (IOException e) {
			System.out.println("Errorea fitxategia mugitzerakoan: " + e.getMessage());
		}

		teklatua.close();


	}

}
