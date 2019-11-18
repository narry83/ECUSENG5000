package KW.CH08;

import java.util.ArrayList;
import java.util.List;
/*<listing chapter="8" number="6">*/
/**
 * A simplified version of the Timsort algorithm.
 *
 * @author Koffman & Wolfgang
 */
public class TimSort implements SortAlgorithm {

    /**
     * Sort the array using the Timsort algorithm.
     *
     * @pre table contains Comparable objects.
     * @post table is sorted.
     * @param table The array to be sorted
     */
    @Override
    public <T extends Comparable<T>> void sort(T[] table) {
        new TS(table).sort();
    }

    /**
     * Private inner class to hold the working state of the algorithm.
     *
     */
    private static class TS<T extends Comparable<T>> {

        /**
         * Private inner class to hold definitions of the runs
         */
        private static class Run {

            int startIndex;
            int length;

            Run(int startIndex, int length) {
                this.startIndex = startIndex;
                this.length = length;
            }
        }

        /**
         * Array of runs that are pending merging.
         */
        List<Run> runStack;

        /**
         * Reference to the array being sorted.
         */
        T[] table;

        /**
         * Constructor
         *
         * @param table array to be sorted
         */
        public TS(T[] table) {
            this.table = table;
            runStack = new ArrayList<>();
        }

        /**
         * Sort the array using the Timsort algorithm.
         *
         * @pre table contains Comparable objects.
         * @post table is sorted.
         */
        public void sort() {
            int nRemaining = table.length;
            if (nRemaining < 2) {
                return; // Single item array is already sorted.
            }
            int lo = 0;
            do {
                int runLength = nextRun(lo);
                runStack.add(new Run(lo, runLength));
                mergeCollapse();
                lo += runLength;
                nRemaining -= runLength;
            } while (nRemaining != 0);
            mergeForce();
        }

        /**
         * Method to find the length of the next run. A run is a sequence of
         * ascending items such that a[i] &lt;= a[i+1] or descending items such
         * that a[i] &gt; a[i+1]. If a descending sequence is found, it is
         * turned into an ascending sequence.
         *
         * @param table The table being sorted
         * @param lo The index where the sequence starts
         * @return the length of the sequence.
         */
        private int nextRun(int lo) {
            if (lo == table.length - 1) {
                return 1;
            }
            int hi = lo + 1;
            if (table[hi - 1].compareTo(table[hi]) <= 0) {
                while (hi < table.length && table[hi - 1].compareTo(table[hi]) <= 0) {
                    hi++;
                }
            } else {
                while (hi < table.length && table[hi - 1].compareTo(table[hi]) > 0) {
                    hi++;
                }
                swapRun(lo, hi - 1);
            }
            return hi - lo;
        }

        /**
         * Method to convert a descending sequence into an ascending sequence.
         *
         * @param table The table being sorted
         * @param lo The start index
         * @param hi The end index
         */
        private void swapRun(int lo, int hi) {
            while (lo < hi) {
                swap(lo++, hi--);
            }
        }

        /**
         * Swap the items in table[i] and table[j].
         *
         * @param table The array that contains the items
         * @param i The index of one item
         * @param j The index of the other item
         */
        private void swap(int i, int j) {
            T temp = table[i];
            table[i] = table[j];
            table[j] = temp;
        }

        /**
         * Merge adjacent runs until the following invariant is established. 
         * 1. runLength[top - 2] > runLenght[top - 1] + runLength[top] 
         * 2. runLength[top - 1] > runLength[top] 
         * This method is called each time a new run is added to the stack.
         * Invariant is true before a new run is added to the stack.
         */
        private void mergeCollapse() {
            while (runStack.size() > 1) {
                int top = runStack.size() - 1;
                if (top > 1 && runStack.get(top - 2).length <= 
                        runStack.get(top - 1).length + runStack.get(top).length) {
                    if (runStack.get(top - 2).length < runStack.get(top).length) {
                        mergeAt(top - 2);
                    } else {
                        mergeAt(top - 1);
                    }
                } else if (runStack.get(top - 1).length <= runStack.get(top).length) {
                    mergeAt(top - 1);
                } else {
                    break;
                }
            }
        }

        /**
         * Merge all remaining runs. This method is called to complete the sort.
         */
        private void mergeForce() {
            while (runStack.size() > 1) {
                int top = runStack.size() - 1;
                if (top > 1 && runStack.get(top - 2).length < runStack.get(top).length) {
                    mergeAt(top - 2);
                } else {
                    mergeAt(top - 1);
                }
            }
        }

        /**
         * Merge the two adjacent runs at i and i+1. i must be equal to
         * runStack.size() - 2 or runStack.size() - 3.
         */
        private void mergeAt(int i) {
            int base1 = runStack.get(i).startIndex;
            int len1 = runStack.get(i).length;
            int base2 = runStack.get(i + 1).startIndex;
            int len2 = runStack.get(i + 1).length;
            runStack.set(i, new Run(base1, len1 + len2));
            if (i == runStack.size() - 3) {
                runStack.set(i + 1, runStack.get(i + 2));
            }
            runStack.remove(runStack.size() - 1);
            int newBase1 = reduceLeft(base1, base2);
            len1 = len1 - (newBase1 - base1);
            if (len1 > 0) {
                len2 = reduceRight(newBase1, len1, base2, len2);
                if (len2 > 0) {
                    T[] run1 = (T[]) (new Comparable[len1]);
                    T[] run2 = (T[]) (new Comparable[len2]);
                    System.arraycopy(table, newBase1, run1, 0, len1);
                    System.arraycopy(table, base2, run2, 0, len2);
                    merge(newBase1, run1, run2);
                }
            }
        }

        /**
         * Adjust the start of run1 so that its first element is greater than or
         * equal the first element of run2
         *
         * @param base1 The index of the start of run1
         * @param base2 The index of the start of run2
         * @return the new start of run 1
         */
        int reduceLeft(int base1, int base2) {
            T base2Start = table[base2];
            while (table[base1].compareTo(base2Start) < 0) {
                base1++;
            }
            return base1;
        }

        /**
         * Adjust the end of run2 so that its last element is less than or equal
         * to the last element of run1
         *
         * @param base1 The start of run 1
         * @param len1 The length of run 1
         * @param base2 The start of run 2
         * @param len2 The length of run 2
         * @return the new length of run 2
         */
        int reduceRight(int base1, int len1, int base2, int len2) {
            T run1End = table[base1 + len1 - 1];
            while (table[base2 + len2 - 1].compareTo(run1End) > 0) {
                len2--;
            }
            return len2;
        }

        /**
         * Merge two runs into the table
         *
         * @param destIndex Index where the merged run is to be inserted
         * @param run1 Array containing one run
         * @param run2 Array containing the other run
         */
        private void merge(int destIndex, T[] run1, T[] run2) {
            int i = 0;
            int j = 0;
            while (i < run1.length && j < run2.length) {
                if (run1[i].compareTo(run2[j]) < 0) {
                    table[destIndex++] = run1[i++];
                } else {
                    table[destIndex++] = run2[j++];
                }
            }
            while (i < run1.length) {
                table[destIndex++] = run1[i++];
            }
            while (j < run2.length) {
                table[destIndex++] = run2[j++];
            }
        }

    }
}
/*</listing>*/
