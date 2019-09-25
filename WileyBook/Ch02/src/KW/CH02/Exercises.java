package KW.CH02;

import java.util.ArrayList;

/**
 * Class to contain static method exercise solutions
 */
public class Exercises {

    /*<exercise chapter="2" section="2" type="programming" number="1">*/
    /**
     * Method to replace each occurrence of oldItem with newItem
     * in an ArrayList&lt;String&gt;
     * @param aList The ArrayList in which items are to be replaced
     * @param oldItem The item to be replaced
     * @param newItem The item to replace oldItem
     * @post All occurrences of oldItem have been replaced with newItem
     */
    public static void replace(ArrayList<String> aList,String oldItem,String newItem) {
        int index = aList.indexOf(oldItem);
        while (index != -1) {
            aList.set(index, newItem);
            index = aList.indexOf(oldItem);
        }
    }
    /*</exercise>*/

    /*<exercise chapter="2" section="2" type="programming" number="2">*/
    /**
     * Method to delete the first occurrence of target from an
     * ArrayList&lt;String&gt;
     * @param aList The array list to remove target from
     * @param target The object to be removed
     * @post First occurrence of target is no longer in aList
     */
    public static void delete(ArrayList<String> aList, String target) {
        int index = aList.indexOf(target);
        if (index != -1) {
            aList.remove(index);
        }
    }
    // Note this could also be written as
    // public static delete(ArrayList<String> aList, String target) {
    //     aList.remove(target);
    // }
    /*</exercise>*/
}
