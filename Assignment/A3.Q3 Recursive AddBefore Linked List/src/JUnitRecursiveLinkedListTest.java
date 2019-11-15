/**
 * Assignment 3 - Question 3 JUnit Method to test the Recursive Linked List to add
 * a node before the target node.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit Test class to test the Recursive Linked List to add
 * a node before the target node.
 *
 */
public class JUnitRecursiveLinkedListTest {

	/**
	 * Test 1 - Test adding character s before v in the Linked List with data "java" 
	 */	
	@Test
	public void recursiveLinkedListTest() {
		RecursiveLinkedList<String> jUnit = new RecursiveLinkedList<String>();
		//Populate Linked List using the addBefore Method
		jUnit.addBefore("a","");
		jUnit.addBefore("a","v");
		jUnit.addBefore("v","a");
		jUnit.addBefore("a","j");
		
		//Test adding character s before v in the Linked List 		
		jUnit.addBefore("v", "s");
		assertEquals("jasva",jUnit.toString());	
		
	}
	
	/**
	 * Test 2 - Test adding character s before target which is not in the Linked List
	 */		
	@Test
	public void recursiveLinkedListTest2() {
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
