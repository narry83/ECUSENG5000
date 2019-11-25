import java.util.ArrayList;
import java.util.List;

/**
 * Implements the recursive merge sort algorithm. In this version, copies of the
 * subtables are made, sorted, and then merged.
 */
public class MergeSort {
	/**
	 * Sort the array using the merge sort algorithm. pre: table contains Comparable
	 * objects. post: table is sorted.
	 * 
	 * @param table The array to be sorted
	 */
	public static void sort(int[] table) {
		// A table with one element is sorted already.
		if (table.length > 1) {
			// Split table into halves.
			int halfSize = table.length / 2;
			System.out.printf("halfSize = %d%n", halfSize);
			int[] leftTable = new int[halfSize];
			int[] rightTable = new int[table.length - halfSize];
			System.arraycopy(table, 0, leftTable, 0, halfSize);
			System.arraycopy(table, halfSize, rightTable, 0, table.length - halfSize);
			System.out.printf("leftTable = %s", toString(leftTable));
			System.out.println();
			System.out.printf("rightTable = %s", toString(rightTable));
			System.out.println("\n");
			// Sort the halves.
			sort(leftTable);
			sort(rightTable);
			// Merge the halves.
			merge(table, leftTable, rightTable);
			System.out.printf("merge(%s, %s) = %s", toString(leftTable), toString(rightTable), toString(table));
			System.out.println();
		}
	}

	/**
	 * Merge two sequences.
	 * 
	 * @pre leftSequence and rightSequence are sorted.
	 * @post outputSequence is the merged result and is sorted.
	 * @param outputSequence The destination
	 * @param leftSequence   The left input
	 * @param rightSequence  The right input
	 */
	private static void merge(int[] outputSequence, int[] leftSequence, int[] rightSequence) {
		int i = 0;
		// Index into the left input sequence.
		int j = 0;
		// Index into the right input sequence.
		int k = 0;
		// Index into the output sequence.
		// While there is data in both input sequences
		while (i < leftSequence.length && j < rightSequence.length) {
			// Find the smaller and
			// insert it into the output sequence.
			if (leftSequence[i] < rightSequence[j]) {
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

	public static String toString(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int x : a) {
			l.add(x);
		}
		return l.toString();
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
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
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		System.out.println(toString(array));
		sort(array);

		System.out.println(toString(array));
	}
}