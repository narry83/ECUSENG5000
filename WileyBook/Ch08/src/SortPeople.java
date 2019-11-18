package KW.CH08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPeople {

    /*<exercise chapter="8" section="1" type="programming" number="1">*/
    /**
     * Method to sort the last half of an array of Person objects
     * @param people The array of Person objects to be sorted
     * @post the second half of the array is sorted by the natural
     * ordering of the Person class
     */
    public static void sortSecondHalfNatural(Person[] people) {
        Arrays.sort(people, people.length / 2, people.length);
    }
    /*</exercise>*/

    /*<exercise chapter="8" section="1" type="programming" number="2">*/
    /**
     * Method to sort the last half of an array of Person objects
     * @param people The array of Person objects to be sorted
     * @post the second half of the array is sorted based on the
     * Comparator ComparePerson
     */
    public static void sortSecondHalfComparePerson(Person[] people) {
        Arrays.sort(people, people.length / 2, people.length,
                new ComparePerson());
    }
    /*</exercise>*/

    /*<exercise chapter="8" section="1" type="programming" number="3">*/
    /**
     * Method to sort a List of Person objects
     * @param peopleList The list of Person objects to be sorted
     * @post The list is sorted according to the natural
     * ordering of the Person class
     */
    public static void sort(List<Person> peopleList) {
        Collections.sort(peopleList);
    }
    /*</exercise>*/
    
    /*<example chapter="8" number="3">*/
    /**
     * Method to sort a List of Person objects
     * @param peopleList The list of Person objects to be sorted
     * @post The list is sorted according the the lambda expression
     */
    public static void sortWithLambda(List<Person> peopleList) {
        peopleList.sort((p1, p2) -> p1.getBirthDay() - p2.getBirthDay());
    }
    /*</example>*/
}
