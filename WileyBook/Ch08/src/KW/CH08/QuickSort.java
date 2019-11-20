/*<listing chapter="8" number="8">*/
package KW.CH08;

/**
 * Implements the quicksort algorithm.
 *  @author Koffman and Wolfgang
 **/
public abstract class QuickSort implements SortAlgorithm {

    /**
     * Sort the table using the quicksort algorithm.
     * @pre table contains Comparable objects.
     * @post table is sorted.
     * @param table The array to be sorted
     */
    @Override
    public <T extends Comparable<T>>  void sort(T[] table) {
        // Sort the whole table.
        quickSort(table, 0, table.length - 1);
    }

    /**
     * Sort a part of the table using the quicksort algorithm.
     * @post The part of table from first through last is sorted.
     * @param table The array to be sorted
     * @param first The index of the low bound
     * @param last The index of the high bound
     */
    protected <T extends Comparable<T>>  void quickSort(T[] table,
            int first,
            int last) {
        if (first < last) { // There is data to be sorted.
            // Partition the table.
            int pivIndex = partition(table, first, last);
            // Sort the left half.
            quickSort(table, first, pivIndex - 1);
            // Sort the right half.
            quickSort(table, pivIndex + 1, last);
        }
    }

    /**
     * Partition the table so that values from first to pivIndex
     * are less than or equal to the pivot value, and values from
     * pivIndex to last are greater than the pivot value.
     * @param table The table to be partitioned
     * @param first The index of the low bound
     * @param last  The index of the high bound
     * @return The location of the pivot value
     */
    protected abstract <T extends Comparable<T>>  int partition(T[] table,
            int first,
            int last);

    /**
     * Swap the items in table[i] and table[j].
     * @param table The array that contains the items
     * @param i The index of one item
     * @param j The index of the other item
     */
    protected <T extends Comparable<T>>  void swap(T[] table,
            int i, int j) {
        T temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }
}
