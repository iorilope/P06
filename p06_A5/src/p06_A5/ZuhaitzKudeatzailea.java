/**
 * 
 */
package p06_A5;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Ioritz Lopetegi
 */
public class ZuhaitzKudeatzailea {

	
	public static void main(String[] args) {
		ArrayList<Zuhaitza> ZuhaitzZerrenda = new ArrayList<Zuhaitza>();
		
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
		for (Zuhaitza auto : ZuhaitzZerrenda) {
			System.out.println(auto);
		}
			
			
		}
		
		
		
		
		
		
		

	}

}
