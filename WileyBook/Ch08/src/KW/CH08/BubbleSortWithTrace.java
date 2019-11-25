/*<exercise chapter="8" type="programming" number="1">*/
package KW.CH08;

import java.util.*;

public class BubbleSortWithTrace {

    public static <T extends Comparable<T>>  void sort(T[] table) {
        CountingComparator<T> c = new CountingComparator<>();
        int pass = 0;
        c.clear();

        int numExchanges = 0;
        boolean exchanges;
        System.out.print(pass + "\t");
        printArray(table);
        System.out.println("\t" + c.getCount() + "\t" + numExchanges);
        pass++;

        do {
            exchanges = false;
            numExchanges = 0;
            c.clear();

            for (int i = 0; i < (table.length - pass); i++) {
                if (c.compare(table[i], table[i + 1]) > 0) {
                    ++numExchanges;

                    T temp = table[i];
                    table[i] = table[i + 1];
                    table[i + 1] = temp;
                    exchanges = true;
                }
            }

            System.out.print(pass + "\t");
            printArray(table);
            System.out.println("\t" + c.getCount() + "\t"
                    + numExchanges);
            pass++;
        } while (exchanges);
    }

    private static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < (array.length + 1)) {
                System.out.print(" ");
            }
        }
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

        Integer[] array = list.toArray(new Integer[list.size()]);
        sort(array);
    }
}
/*</exercise>*/
