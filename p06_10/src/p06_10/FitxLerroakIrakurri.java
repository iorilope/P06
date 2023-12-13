/**
 * 
 */
package p06_10;

/**
 * 
 * @author Ioritz Lopetegi
 */
import java.io.*;
import java.util.*;

public class FitxLerroakIrakurri
{
	public static void main(String args[])
	{
		String  fitxIzena = null;
		String  textuLerroa;
		int     nL        = 0;
		int     nE        = 0;
		Scanner teclado   = new Scanner(System.in);

		try
		{
			System.out.println("Fitxategi izena");
			fitxIzena = teclado.nextLine();

			//jatorrizko fitxategia non dagoen zehaztu
			File             c1  = new File(fitxIzena); //Helbide absolutua

			//Fitxategi berria non dagoen zehaztu
			File             c2  = new File("C:\\Users\\1ag3.iorilope\\git\\repository11\\p06_10\\agenda.txt");
			FileOutputStream f   = new FileOutputStream(c2);
			DataOutputStream fls = new DataOutputStream(f);

			if (c1.canRead())
			{
				FileReader     fle = new FileReader(c1);
				BufferedReader fl  = new BufferedReader(fle);

				while (fl.ready() == true)
				{
					textuLerroa = fl.readLine();

					//Lehenengo karakterea + bada lerro hori inprimatuko du,ez da oso eraginkorra baina telefono zenbakiak formatu internazionalean eskuratzeko balio du
					if (textuLerroa.charAt(0) == '+')
					{
						fls.writeBytes(textuLerroa + '\r' + '\n');
						System.out.println(textuLerroa);
						nE++;
					}
					nL++;
				}
				fl.close();
			}
			fls.close();
		} 
		catch (Exception e)
		{
			System.out.println("Fitxategia irakurtzean akatsa:" + e.getMessage());
		}

		System.out.println(nL + " lerro irakurrita");
		System.out.println(nE + " lerro idatzita");
		System.out.println("Exekuzio amaiera");
	}
}