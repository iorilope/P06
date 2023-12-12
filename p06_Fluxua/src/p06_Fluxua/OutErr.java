/**
 * 
 */
package p06_Fluxua;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class OutErr {

	public static void main (String [] args) 
	{
		int var = 9;
		
		// err
		System.err.println ("\tVar aldagaiaren balioa" + var + "da. Propietatearekin err.\n"); 
		
		// out
		System.out.println ("\t\tVar aldagaiaren balioa" + var + "da. Out.\n propietatearekin egina");
		System.err.println ("\tProgramaren Amaiera." + "Jabetzarekin err.\n");
		System.out.println ("\t\tProgramaren amaiera." + ".Euskal Autonomia Erkidegoa");
	}
}
