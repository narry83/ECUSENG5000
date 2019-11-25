
/**
 * Assignment 4 - Question 7
 * Trace Quick Sort Operation and Display first, pivIndex, 
 * and last and the array after call to each partition
 *  
 */

import java.util.*;

/** Implements the quicksort algorithm. */
public class QuickSort {
	/**
	 * Sort the table using the quicksort algorithm.
	 * 
	 * @pre table contains Comparable objects.
	 * @post table is sorted.
	 * @param table The array to be sorted
	 */
	public static <T extends Comparable<T>> void sort(T[] table) {
		// Sort the whole table.
		quickSort(table, 0, table.length - 1);
	}

	/**
	 * Sort a part of the table using the quicksort algorithm.
	 * 
	 * @post The part of table from first through last is sorted.
	 * @param table The array to be sorted
	 * @param first The index of the low bound
	 * @param last  The index of the high bound
	 */

	private static <T extends Comparable<T>> void quickSort(T[] table, int first, int last) {
		System.out.printf("sort array(%d, %d, %s)%n%n", first, last, toString(table));
		if (first < last) { // There is data to be sorted.
			// Partition the table.
			int pivIndex = partition(table, first, last);
			System.out.println("pivotIndex: " + pivIndex);
			// Sort the left half.
			quickSort(table, first, pivIndex - 1);
			System.out.printf("	lefttable: %s%n", toString(table));
			// Sort the right half.
			quickSort(table, pivIndex + 1, last);
			System.out.printf("	righttable: %s%n", toString(table));
		}
	}
	// Insert partition method. See Listing 8.9

	/**
	 * Partition the table so that values from first to pivIndex are less than or
	 * equal to the pivot value, and values from pivIndex to last are greater than
	 * the pivot value.
	 * 
	 * @param table The table to be partitioned
	 * @param first The index of the low bound
	 * @param last  The index of the high bound
	 * @return The location of the pivot value
	 */
	private static <T extends Comparable<T>> int partition(T[] table, int first, int last) {
		// Select the first item as the pivot value.

		T pivot = table[first];
		System.out.println("pivotData: " + pivot);
		int up = first;
		int down = last;
		do {
			/*
			 * Invariant: All items in table[first . . . up ‐ 1] <= pivot All items in
			 * table[down + 1 . . . last] > pivot
			 */
			while ((up < last) && (pivot.compareTo(table[up]) >= 0)) {
				up++;
			}
			// assert: up equals last or table[up] > pivot.
			while (pivot.compareTo(table[down]) < 0) {
				down--;

			}
			// assert: down equals first or table[down] <= pivot.
			if (up < down) { // if up is to the left of down.
				// Exchange table[up] and table[down].
				swap(table, up, down);
				System.out.println("	Swap: " + table[up] + " " + table[down]);
			}
		} while (up < down); // Repeat while up is left of down.
		// Exchange table[first] and table[down] thus putting the
		// pivot value where it belongs.
		System.out.println("Swap Pivot: " + table[first] + " " + table[down]);
		swap(table, first, down);
		// Return the index of the pivot value.
		return down;

	}

	/**
	 * Swap Contents in an array by passing the old and new positions using a
	 * temporary Variable
	 * 
	 * @param table The array to be added to the list
	 * @param i     The index of the old position
	 * @param j     The index of the new position
	 */
	private static <T> void swap(T[] table, int i, int j) {
		T temp = table[i];
		table[i] = table[j];
		table[j] = temp;
	}

	/**
	 * Creates a Integer ArrayList of the table for printing the contents of the
	 * Array on the screen
	 * 
	 * @param table The array to be added to the list
	 */
	private static <T> String toString(T[] array) {
		StringBuilder stb = new StringBuilder("[");
		for (int i = 0; i < array.length; i++) {
			stb.append(array[i]);
			if (i < array.length - 1) {
				stb.append(", ");
			} else {
				stb.append("]");
			}
		}
		return stb.toString();
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
		// Starting QuickSort Operations
		System.out.println("Start Quick Sort \n");
		sort(array);
	}

}
