package KW.CH07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 * Class to build an index.
 *  @author Koffman and Wolfgang
 **/
public class IndexGenerator {
    
    private static final Pattern wordPattern = Pattern.compile("[\\p{L}\\p{N}']+");

    // Data Fields
    /** Tree for storing the index. */
    private final SortedMap<String, List<Integer>> index;

    // Methods
    public IndexGenerator() {
        index = new TreeMap<>();
    }

    /*<listing chapter="7" number="2">*/
    /**
     * Reads each word in data file and stores it in a Map
     * along with an ArrayList of line numbers (a value).
     * @pre  index in an empty Map.
     * @post Lowercase form of each word with line
     *       numbers is stored in index.
     * @param scan A Scanner object
     */
    public void buildIndex(Scanner scan) {
        int lineNum = 0; // Line number
        // Keep reading lines until done.
        while (scan.hasNextLine()) {
            lineNum++;
            // Extract each token and store it in index.
            String token;
            while ((token = scan.findInLine(wordPattern)) != null) {
                token = token.toLowerCase();
                List<Integer> lines = index.getOrDefault(token, new ArrayList<>());
                lines.add(lineNum);
                index.put(token, lines);  //Store new list
            }
            scan.nextLine();
        }
    }
    /*</listing>*/

    /*<exercise chapter="7" section="5" type="programming" number="4">*/
    /** Displays the index, one word per line. */
    public void showIndex() {
        index.forEach((word, refs) -> {
            System.out.print(word);
            System.out.print(":\t");
            StringJoiner sj = new StringJoiner(", ");
            refs.forEach(ref -> sj.add(ref.toString()));
            System.out.println(sj.toString());
        });
    }
    /*</exercise>*/

    /*<exercise chapter="6" section="4" type="programming" number="4">*/
    public static void main(String args[]) {
        if (args.length < 1) {
            System.err.println("Usage: IndexGenerator <file>");
            System.exit(1);
        }
        try (Scanner scan = new Scanner(new FileReader(args[0]))) {           
            IndexGenerator indexGenerator = new IndexGenerator();
            indexGenerator.buildIndex(scan);
            indexGenerator.showIndex();
        } catch (FileNotFoundException ioex) {
            System.err.println("Cannot open file " + args[0]);
            System.exit(1);
        }
    }
    /*</exercise>*/
}
