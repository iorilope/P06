/**
 * 
 */
package p06_A5;

/**
 * 
 * @author Ioritz Lopetegi
 */
import java.io.*;
import java.util.*;

public class SerializableTest
{
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		String testua;
		int    altuera;

		Scanner teklatua = new Scanner(System.in);
		System.out.println("Izen arrunta: ");
		testua = teklatua.nextLine();

		Zuhaitza p = new Zuhaitza(testua);

		System.out.println("Izen zientifikoa: ");
		testua = teklatua.nextLine();
		p.setIzenZientifikoa(testua);

		System.out.println("Altuera batazbestekoa: ");
		altuera = teklatua.nextInt();
		p.setBatazbestekoAltuera(altuera);

		// tmp fitxategia sortuko dugu bertan gordetzeko (tmp = tenporala)
		// Zuhaitza
		FileOutputStream   f   = new FileOutputStream("tmp"); // fluxua
		ObjectOutputStream fis = new ObjectOutputStream(f);   // filtroa
		fis.writeObject(p); 
		fis.close(); 

		// tmp fitxategia ireki
		FileInputStream   fe  = new FileInputStream("tmp");
		ObjectInputStream fie = new ObjectInputStream(fe);  
		Zuhaitza          z   = (Zuhaitza) fie.readObject(); 

		System.out.println(z.erakutsiZuhaitza()); // pantaila erakutsi irakurritakoa


	}
}
