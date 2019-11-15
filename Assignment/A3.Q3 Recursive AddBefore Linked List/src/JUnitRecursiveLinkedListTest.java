import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author nsnaraya
 *
 */
public class JUnitRecursiveLinkedListTest {

	@Test
	public void RecursiveLinkedListTest() {
		RecursiveLinkedList<String> jUnit = new RecursiveLinkedList<String>();
		//Populate Linked List using the addBefore Method
		jUnit.addBefore("a","");
		jUnit.addBefore("a","v");
		jUnit.addBefore("v","a");
		jUnit.addBefore("a","j");
		
		//Test adding character s before v in the Linked List 		
		jUnit.addBefore("v", "s");
		//assertEquals("jasva",jUnit.toString());	
		
	}
	
	@Test
	public void RecursiveLinkedListTest2() {
		RecursiveLinkedList<String> jUnit = new RecursiveLinkedList<String>();
		//Populate Linked List using the addBefore Method
		jUnit.addBefore("o","");
		jUnit.addBefore("o","l");
		jUnit.addBefore("l","l");
		jUnit.addBefore("l","e");
		jUnit.addBefore("e","H");
		
		//Test adding character s before target not in the Linked List 		
		jUnit.addBefore("t", "s");		
		assertEquals("Hellos",jUnit.toString());	
		
	}
	
	
}
