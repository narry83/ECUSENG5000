/**
 * Assignment 4 - Question 9 
 * Driver Class to test the AVL Tree 
 * 
 */
package KW.CH09;

/**
 * Tests class AVLTree. Creates an object of the class and
 * prints on screen the tree after each operation.
 * 
 * @param args[] No control parameters
 */

public class AVLTreeDriver {
	public static void main(String[] args)
	{
		AVLTree<Integer> avlTree = new AVLTree<Integer>();
		avlTree.add(55);
		avlTree.add(50);
		avlTree.add(10);
		avlTree.add(40);
		avlTree.add(80);
		avlTree.add(90);
		avlTree.add(60);
		avlTree.add(100);
		avlTree.add(70);
		avlTree.add(80);
		avlTree.add(20);
		avlTree.add(50);
		avlTree.add(22);
		System.out.println("Print Tree");
		System.out.println(avlTree.toString());
		
		avlTree.delete(100);
		System.out.println("Print Tree after deleting 100");
		System.out.println(avlTree.toString());
		
		avlTree.delete(50);
		System.out.println("Print Tree after deleting 50");
		System.out.println(avlTree.toString());
		
		avlTree.add(65);
		System.out.println("Print Tree after deleting 50");
		System.out.println(avlTree.toString());
				
				
	}

}
