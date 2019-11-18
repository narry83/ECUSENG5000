package KW.CH07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

/**
 * Alternate solution to programming exercises 7.2.1 and 7.2.2
 *
 * @author Koffman & Wolfgang
 */
public class WordCount2 {

    /*<exercise chapter="7" section="2" type="programming" number="1">*/
    // This exercise is no longer relevant when using Streams
    /*</exercise>*/

    /*<exercise chapter="7" section="2" type="programming" number="2">*/
    /**
     * Method to read each word in a data file and compute the number of times
     * it occurs
     *
     * @param br A BufferedReader object that references the file
     * @return A TreeMap that maps each word to the count of its occurrence.
     */
    public static Map<String, Long> buildWordCounts(BufferedReader br) {
        Pattern notWord = Pattern.compile("[^\\p{L}\\p{N}']+");
        return br.lines()
                .flatMap(line -> notWord.splitAsStream(line))
                .map(String::toLowerCase)
                .collect(groupingBy(w -> w, TreeMap::new, counting()));
    }
    /*</exercise>*/
    
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Long> counts = buildWordCounts(br);
            counts.forEach((k, v) -> System.out.printf("%-15s%5d%n", k, v));
        } catch (IOException ioex) {
            System.err.println("Problem opening or closing " + args[0]);
        }
    }
}
