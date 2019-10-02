import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2_DataReader {

	public void OpenFile() throws FileNotFoundException {

		boolean found = false;

		while (!found) {

			try {

				Scanner console = new Scanner(System.in);

				System.out.print("Please enter Input File name ");
				String inputFile = console.next();
				// String inputFile="input.txt";

				Scanner in = new Scanner(new File(inputFile));
				
				try {
					readData(in);
				}
				catch(Ex2_BadDataException) {
					System.out.print("Expected data not found in file  ");
					
				}

				in.close();

			} catch (FileNotFoundException Exception) {
				System.out.print("File not found, Please try again  ");

			}

			finally {

				found = true;

			}

		}
	}

	public void readData(Scanner in) throws Ex2_BadDataException {

		while (!in.hasNextDouble()) {

			throw new Ex2_BadDataException();
			// System.out.println(in.nextDouble());

		}

	}

}
