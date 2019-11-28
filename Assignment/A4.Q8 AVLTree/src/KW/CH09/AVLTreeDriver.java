/**
 * Assignment 4 - Question 9 
 * Driver Class to test the AVL Tree 
 * 
 */
package KW.CH09;

/**
 * Tests class AVLTree. Creates an object of the class and prints on screen the
 * tree after each operation.
 * 
 * @param args[] No control parameters
 */

public class AVLTreeDriver {
	public static void main(String[] args) {

		// Test a Integer AVL Tree
		AVLTree<Integer> avlTree = new AVLTree<Integer>();
		int[] intArray = { 55, 50, 10, 40, 80, 90, 60, 100, 70, 80, 20, 50, 22 };
		for (int i : intArray) {
			avlTree.add(i);
		}

		System.out.println("Print Tree");
		System.out.println(avlTree.toString());

		System.out.println("Print Tree after adding 65");
		avlTree.add(65);
		System.out.println(avlTree.toString());

		System.out.println("Print Tree after adding 0");
		avlTree.add(0);
		System.out.println(avlTree.toString());
		
		System.out.println("Print Tree after removing 20");
		avlTree.remove(20);
		System.out.println(avlTree.toString());
		
		System.out.println("Print Tree after removing 50");
		avlTree.remove(50);
		System.out.println(avlTree.toString());
		
		System.out.println("Print Tree after removing 51");
		avlTree.remove(51);
		System.out.println(avlTree.toString());
		
		System.out.println("Print Tree after adding 75");
		avlTree.add(75);
		System.out.println(avlTree.toString());
		
		
		/*
		 * // Test a String AVL Tree AVLTree<String> avlTreeString = new
		 * AVLTree<String>(); String[] stringArray = { "Tell", "me", "and", "I",
		 * "forget", "Teach", "me", "and", "I", "remember", "Involve", "me", "and", "I",
		 * "learn" };
		 * 
		 * for (String i : stringArray) { avlTreeString.add(i); }
		 * 
		 * System.out.println("Print Tree");
		 * System.out.println(avlTreeString.toString());
		 * 
		 * System.out.println("Print Tree after adding 0");
		 * avlTreeString.add("history"); System.out.println(avlTreeString.toString());
		 */
	}

}
