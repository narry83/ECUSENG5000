package KW.CH08;
/*<exercise chapter="8" section="3" type="programming" number="2">*/


import java.util.*;

public class InsertionSortWithTrace {

    public static <T extends Comparable<T>>  void sort(T[] table) {
        CountingComparator<T> c = new CountingComparator<>();
        int pass = 0;
        c.clear();
        int numExchanges = 0;
        boolean exchanges = false;
        System.out.print(pass + "\t");
        printArray(table);
        System.out.println("\t" + c.getCount() + "\t" + numExchanges);
        pass++;
        for (int nextPos = 1; nextPos < table.length; nextPos++) {
            numExchanges = 0;
            T nextVal = table[nextPos];
            int j = nextPos;
            while (j > 0 && c.compare(nextVal, table[j - 1]) < 0) {
                ++numExchanges;
                table[j] = table[j - 1];
                j--;
            }
            table[j] = nextVal;
            System.out.print(pass + "\t");
            printArray(table);
            System.out.println("\t" + c.getCount() + "\t" + numExchanges);
            pass++;
            c.clear();
        }
    }

    private static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length + 1) {
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
