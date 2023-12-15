/**
 * 
 */
package p06_10_1;

/**
 * 
 * @author Ioritz Lopetegi
 */
import java.io.*;

public class TestuFitxKopiatu {

	public static void main(String args[]) 
	{
		try {
			File             inFile  = new File(args[0]);
			File             outFile = new File(args[1]);
			FileInputStream  in      = new FileInputStream(inFile);
			FileOutputStream out     = new FileOutputStream(outFile);
			int c;

			//C beti 0 denez beti errorea emango du, baina kopia ondo egin da catch-etik kanpo dagoenez gure kopia "ondo" egin dela esango du beti nahiz eta kopiarik ez egin
			while ((c = in.read()) != -1) {
				out.write(c);
				System.out.print((char) c);
			}
			in.close();
			out.close();

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}

		//Catch-etik kanpo dagoenez mezu hau beti bistaratuko da kopia egin edo ez bada egin
		System.out.println("Kopia ondo egin da");
	}
}
