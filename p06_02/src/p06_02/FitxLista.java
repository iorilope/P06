/**
 * 
 */
package p06_02;

/**
 * 
 * @author Ioritz Lopetegi
 */
import java.io.File;

public class FitxLista {
	
	public static void main(String args[]) {
		
		File f = new File("C:\\Eclipse");
		File[] lista = f.listFiles();
		
		for (int i = 0; i < lista.length; i++)
			System.out.println(lista[i]);
	}
}

//Lista null da C\\ eclipse ez baita existitzen helbidea c/Users/"Username"\Eclipse izango beharko luke
