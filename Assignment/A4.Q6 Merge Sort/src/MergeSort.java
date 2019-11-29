/**
 * Assignment 4 - Question 6
 * Trace Merge Sort Operation and Display Left & Right Tables after each step
 *  
 */

import java.util.ArrayList;
import java.util.List;

/*<listing chapter="8" number="5"*/

/**
 * Implements the recursive merge sort algorithm. In this version, copies of the
 * subtables are made, sorted, and then merged.
 * 
 * @author Koffman and Wolfgang
 */
public class MergeSort {

	/**
	 * Sort the array using the merge sort algorithm.
	 * 
	 * 
	 * @pre table contains Comparable objects.
	 * @post table is sorted.
	 * @param table The array to be sorted
	 */

	public static <T extends Comparable<T>> void mergeSort(T[] table) {
		// A table with one element is sorted already.
		if (table.length > 1) {
			// Split table into halves.
			int halfSize = table.length / 2;
			System.out.printf("halfSize = %d%n", halfSize);

			T[] leftTable = (T[]) new Comparable[halfSize];
			T[] rightTable = (T[]) new Comparable[table.length - halfSize];
			System.arraycopy(table, 0, leftTable, 0, halfSize);
			System.arraycopy(table, halfSize, rightTable, 0, table.length - halfSize);

			// Print Left & Right Table
			System.out.printf("	leftTable = %s", toString(leftTable));
			System.out.println();
			System.out.printf("	rightTable = %s", toString(rightTable));
			System.out.println("\n");

			// Sort the halves.
			mergeSort(leftTable);
			mergeSort(rightTable);

			// Merge the halves.
			merge(table, leftTable, rightTable);
			// Print Table after Merge Operation
			System.out.printf("merge(%s, %s) = %s", toString(leftTable), toString(rightTable), toString(table));
			System.out.println();

		}
	}

	/* <listing chapter="8" number="4"> */
	/**
	 * Merge two sequences.
	 * 
	 * @pre leftSequence and rightSequence are sorted.
	 * @post outputSequence is the merged result and is sorted.
	 * @param outputSequence The destination
	 * @param leftSequence   The left input
	 * @param rightSequence  The right input
	 */
	private static <T extends Comparable<T>> void merge(T[] outputSequence, T[] leftSequence, T[] rightSequence) {

		int i = 0; // Index into the left input sequence.

		int j = 0; // Index into the right input sequence.

		int k = 0; // Index into the output sequence.

		// While there is data in both input sequences
		while (i < leftSequence.length && j < rightSequence.length) {
			// Find the smaller and
			// insert it into the output sequence.
			if (leftSequence[i].compareTo(rightSequence[j]) < 0) {
				outputSequence[k++] = leftSequence[i++];
			} else {
				outputSequence[k++] = rightSequence[j++];
			}
		}
		// assert: one of the sequences has more items to copy.
		// Copy remaining input from left sequence into the output.
		while (i < leftSequence.length) {
			outputSequence[k++] = leftSequence[i++];
		}
		// Copy remaining input from right sequence into output.
		while (j < rightSequence.length) {
			outputSequence[k++] = rightSequence[j++];
		}
	}
	/* </listing> */

	/**
	 * Creates a Integer ArrayList of the table for printing the contents of the
	 * Array on the screen
	 * 
	 * @param table The array to be added to the list
	 */
	public static <T> String toString(T[] array) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			l.add((Integer) array[i]);
		}
		return l.toString();
	}

	/**
	 * Driver method to Test class mergeSort. Creates an object of the class and
	 * prints on screen the array contents after each step of the merge sort method.
	 * 
	 * @param args[] No control parameters
	 */

	public static void main(String[] args) {

		// Create a Array List object of Type Integer
		List<Integer> list = new ArrayList<Integer>();
		list.add(55);
		list.add(50);
		list.add(10);
		list.add(40);
		list.add(80);
		list.add(90);
		list.add(60);
		list.add(100);
		list.add(70);
		list.add(80);
		list.add(20);
		list.add(50);
		list.add(22);
		for (String s : args) {
			list.add(new Integer(s));
		}
		Integer[] array = list.toArray(new Integer[list.size()]);
		
		//Starting MergeSort Operations
		System.out.println("Start Merge Sort \n");
		System.out.println(toString(array));
		mergeSort(array);
		//Print Sorted Array after Merge Sort Operation
		System.out.println("\nSorted Array using Merge Sort");
		System.out.println(toString(array));

	}
}
