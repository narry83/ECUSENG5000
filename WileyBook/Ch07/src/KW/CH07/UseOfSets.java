/*<listing chapter="7" number="1">*/
/**
 * Listing 7.1
 * @author Koffman & Wolfgang
 */
package KW.CH07;

import java.util.HashSet;
import java.util.Set;

public class UseOfSets {

	public static void main(String[] args) {
		// Create the sets.
		String[] listA = { "Ann", "Sally", "Jill", "Sally" };
		String[] listB = { "Bob", "Bill", "Ann", "Jill" };
		Set<String> setA = new HashSet<>();
		Set<String> setAcopy = new HashSet<>(); // Copy of setA
		Set<String> setB = new HashSet<>();
		// Load sets from arrays.
		for (String s : listA) {
			setA.add(s);
			setAcopy.add(s);
		}
		for (String s : listB) {
			setB.add(s);
		}
		//setAcopy=setA;
		System.out.println("The 2 sets are: " + "\n" + setA + "\n" + setB);
		// Display the union and intersection.
		setA.addAll(setB); // Set union
		setAcopy.retainAll(setB); // Set intersection
		System.out.println("Items in set union are: " + setA);
		System.out.println("Items in set intersection are: " + setAcopy);

	}

	/* <exercise chapter="7" section="1" type="programming" number="1"*> */
	public static <E> Set<E> union(Set<E> a, Set<E> b) {
		Set<E> c = new HashSet<>(a);
		c.addAll(b);
		return c;
	}

	public static <E> Set<E> intersection(Set<E> a, Set<E> b) {
		Set<E> c = new HashSet<>(a);
		c.retainAll(b);
		return c;
	}

	public static <E> Set<E> difference(Set<E> a, Set<E> b) {
		Set<E> c = new HashSet<>(a);
		c.removeAll(b);
		return c;
	}

	public static <E> Set<E> setMin(Set<E> a, Set<E> b) {
		if (b.containsAll(a)) {
			return b;
		} else {
			return a;
		}
	}
	/* </exercise> */
}
/* </listing> */
