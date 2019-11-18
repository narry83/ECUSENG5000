package KW.CH07;

import java.util.Map;

public class Exercise_7_5_1 {

    /*<exercise chapter="7" section="5" type="programming" number="1">*/
    /**
     * Method to display the key-value pairs in a Map, one pair per line.
     * @param <K> The key type
     * @param <V> The value type
     * @param m The map
     */
    public static <K, V> void displayMap(Map<K, V> m) {
        // Using a for-each loop
        for (Map.Entry<K, V> e : m.entrySet()) {
            System.out.println(e.getKey() + "\t" + e.getKey());
        }
        // Using a Lambda Expression
        m.forEach((k, v) -> System.out.println(k + "\t" + v));
    }
    /*</exercise>*/
}


	
