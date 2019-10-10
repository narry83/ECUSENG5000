import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author nsnaraya
 *
 */
public class Ex2_Data_Analyze {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		boolean found = false;

		while (!found) {

			try {

				Scanner console = new Scanner(System.in);

				System.out.print("Please enter Input File name ");
				String inputFile = console.next();
				// String inputFile="input.txt";

				Scanner in = new Scanner(new File(inputFile));

				Ex2_DataReader readFile = new Ex2_DataReader();
				readFile.readData(in);

				found = true;
				in.close();

			} catch (FileNotFoundException Exception) {
				System.out.print("File not found, Please try again  ");

			} catch (Ex2_BadDataException Exception) {
				System.out.print("Expected data not found in file  ");

			}

			finally {

			}

		}

	}

}
