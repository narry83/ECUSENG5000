import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex1_Read_Write_File {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner console = new Scanner(System.in);
		System.out.print("Please Enter Input File Name: ");
		String inputFilename = console.next();

		System.out.print("Please Enter Output File Name: ");
		String outputFilename = console.next();

		// File inputFile = new File("input.txt");
		File inputFile = new File(inputFilename);
		Scanner in = new Scanner(inputFile);

		// File outputFile = new File("output.txt");
		File outputFile = new File(outputFilename);
		PrintWriter out = new PrintWriter(outputFile);

		double total = 0;
		double value = 0;

		while (in.hasNextDouble()) {

			value = in.nextDouble();
			System.out.println(value);
			out.printf("%20.2f\n", value);
			total = total + value;

		}

		// System.out.println(total);
		out.printf("Total: %13.2f\n", total);

		in.close();
		out.close();
		console.close();

	}

}
