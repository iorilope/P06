/**
 * 
 */
package p06_A5;

/**
 * 
 * @author Ioritz Lopetegi
 */
import java.io.*;

/**
 * Serializatu nahi dugunez
 */


public class Zuhaitza implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 19876685958L;
	/**
	 * 
	 */
	private String izenArrunta;
	private String izenZientifikoa;
	private int    batazbestekoAltuera;

	public Zuhaitza(String izena)
	{
		izenArrunta = izena;
	}

	public void setIzenZientifikoa(String nombre) {
		izenZientifikoa = nombre;
	}

	public void setBatazbestekoAltuera(int altura) {
		batazbestekoAltuera = altura;
	}

	public String erakutsiZuhaitza() {
		return izenArrunta + " " + izenZientifikoa + " " + batazbestekoAltuera;
	}

@Override
public String toString() {
    return "Zuhaitza {izena='" + izenArrunta + "', altuera=" + batazbestekoAltuera + "}";
}
}
