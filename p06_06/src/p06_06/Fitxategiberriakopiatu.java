/**
 * 
 */
package p06_06;

import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Fitxategiberriakopiatu {
	 public static void main(String[] args) throws Exception {
		 
		 Scanner teklatua = new Scanner(System.in);

			System.out.println("Sartu Fitxategiaren helbide absolutua");
			String fitxategiZaharra = teklatua.nextLine();

			System.out.println("Nora mugitu nahi dituzu datuak (Direktorioa):");

			String	DirLekuBerria = teklatua.nextLine();
			try {
				FileInputStream inputStream = new FileInputStream(fitxategiZaharra);
				FileOutputStream outputStream = new FileOutputStream(DirLekuBerria);

				byte[] buffer = new byte[1024];
				int bytesRead;

				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}

				inputStream.close();
				outputStream.close();
				teklatua.close();
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

	    }
	}

