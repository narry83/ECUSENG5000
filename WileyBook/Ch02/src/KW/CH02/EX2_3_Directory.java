package KW.CH02;

/**
 * This is an implementation of the PhoneDirectoryInterface
 * that uses an ArrayList to store the data.
 * @author Koffman and Wolfgang
 */
import java.util.ArrayList;
import java.util.Arrays;

public class EX2_3_Directory {

	// Data fields
	/** The ArrayList to contain the directory data */
	private ArrayList<EX2_3_Directory_Entry> theDirectory = new ArrayList<>();

	// Insert solution to programming exercise 1, section 3, chapter 2 here
	/**
	 * Add an entry to theDirectory or change an existing entry.
	 * 
	 * @param aName     The name of the person being added or changed
	 * @param newNumber The new number to be assigned
	 * @return The old number, or if a new entry, null
	 */
	public String addOrChangeEntry(String aName, String newNumber) {
		int index =0;
		String perName = theDirectory.get(index).getName();
		
		theDirectory.add(new EX2_3_Directory_Entry(aName, newNumber));
		
		while(index<theDirectory.size() && perName==aName) {
			//theDirectory.set
		
		
		}
		
		

		if (index == 1) {
			// EX2_3_Directory_Entry.setNumber(newNumber);
			//System.out.println("Found Entry");
		} else {
			theDirectory.add(new EX2_3_Directory_Entry(aName, newNumber));
		}
		
		System.out.println(Arrays.deepToString(theDirectory.toArray()));
		
		return "Yes";
		
	}

// Insert solution to programming exercise 2, section 3, chapter 2 here
}
