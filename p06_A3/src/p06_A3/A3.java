/*
 * 2023(e)ko abe. 15(a)
 * Ioritz Lopetegi
 */
package p06_A3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Ioritz Lopetegi
 */
public class A3 {



	public static void main(String[] args) {

		Scanner sc   = new Scanner(System.in);


		//Gure fitxategiak listatu

		String  dirString = "C:\\Users\\1ag3.iorilope\\Desktop\\AriketaA3";
		String  fitxIzena = null;

		File            direktorioaFile = new File(dirString);
		System.out.println("Direktorioko fitxategiak");

		String[] fileList = direktorioaFile.list();
		for(String name:fileList){
			System.out.println(name);
		}

		System.out.println("Aukeratu fitxategi bat");
		fitxIzena = sc.nextLine();
		System.out.println("Zein izenarekin gorde nahi duzu");

		String  fitxIzenaBerria = sc.nextLine();


		if (fitxIzenaBerria.isEmpty()) {



			//Izena aldatu gure fitxategiari
			String fitxizenberriaString = "kopia_" + fitxIzena;

			Path fitxategiazarraFilePath = Path.of(dirString, fitxIzena);
			Path fitxizenberriaFilePath = Path.of(dirString + "\\" + fitxizenberriaString);


			//Fitxategia kopiatu errore kontrola eginez
			try {
				Files.copy(fitxategiazarraFilePath, fitxizenberriaFilePath);
				System.out.println("Fitxategia kopiatu da");
			} catch (IOException e) {
				System.out.println("Errorea fitxategia kopiatzerakoan: " + e.getMessage());
			}
			finally {
				sc.close();

			}

		}
		else {

			String fitxizenberriaString = fitxIzena;

			Path fitxategiazarraFilePath = Path.of(dirString, fitxIzena);
			Path fitxizenberriaFilePath = Path.of(dirString + "\\" + fitxizenberriaString);


			//Fitxategia kopiatu errore kontrola eginez
			try {
				Files.copy(fitxategiazarraFilePath, fitxizenberriaFilePath);
				System.out.println("Fitxategia kopiatu da");
			} catch (IOException e) {
				System.out.println("Errorea fitxategia kopiatzerakoan: " + e.getMessage());
			}
			finally {
				sc.close();
			}

		}
	}








}


