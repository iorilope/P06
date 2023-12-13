/**
 * 
 */
package p06_07;

/**
 * 
 * @author Ioritz Lopetegi
 */
import java.io.*;
import java.util.*;

public class FitxIrakurri
{
	public static void main(String args[])
	{
		String  fitxIzena;
		Scanner t = new Scanner(System.in);
		String  c;
		try
		{
			System.out.println("Fitx izena:");
			fitxIzena    = t.nextLine();
			File kanala1 = new File(fitxIzena);

			FileInputStream fluxua = null;

			if (kanala1.canRead())
			{
				fluxua   = new FileInputStream(kanala1);
				byte[] a = new byte[1];

				while (fluxua.read(a) != -1)
				{
					c = new String(a);
					System.out.print(c);
				}
				fluxua.close();

			}
		} catch (Exception e)
		{
			System.out.println("Fitxategia irakurtzean akatsa");
		}
	}
}
