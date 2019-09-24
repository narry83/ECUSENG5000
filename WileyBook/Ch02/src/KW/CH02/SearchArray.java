/*<exercise chapter="2" section="11" type="programming" number="3">*/
package KW.CH02;

/**
 * Class to encapsulate searchArray method and its test
 */
public class SearchArray {

    /**
     * Method to search part of an array for a target value
     * @param array The array to search
     * @param target The target value
     * @param minIndex The index to start the search
     * @param maxIndex The index to end the search
     * @param <T> The type of data in the array.
     * @return The index of the target or -1 if not found
     * @throws ArrayIndexOutOfBoundsException if minIndex is &lt; 0
     * or if the target is not found and maxIndex &gt; array.length-1
     * @throws IllegalArgumentException if maxIndex &lt; minIndex
     * @throws NullPointerException if array or target are null
     */
    public static <T> int search(T[] array, T target, int minIndex, int maxIndex) {
        if (maxIndex < minIndex) {
            throw new IllegalArgumentException();
        }
        for (int i = minIndex; i <= maxIndex; i++) {
            if (target.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

}
/*</exercise>*/
