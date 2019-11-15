/**
 * Assignment 3 - Question 5
 * JUnit Class to create a Binary Tree using the Tree Package 
 * and Print the PreOrder Traversal
 * 
 */

package TreePackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A3Q5_JUnitPreOrderTraversalTester {
	
	/**
	 * Test 1 - Checks for preOrder Traversal of the Tree is as per Order 
	 */	
	@Test
	public void preOrderTraversalTest() {
		BinaryTree<String> tree = new BinaryTree<>();

		// Create Leaves
		BinaryTree<String> aTree = new BinaryTree<>("A");
		BinaryTree<String> bTree = new BinaryTree<>("B");
		BinaryTree<String> cTree = new BinaryTree<>("C");
		BinaryTree<String> lTree = new BinaryTree<>("L");
		BinaryTree<String> mTree = new BinaryTree<>("M");

		// Create Subtrees:
		BinaryTree<String> hTree = new BinaryTree<>("H", bTree, cTree);
		BinaryTree<String> fTree = new BinaryTree<>("F", aTree, hTree);
		BinaryTree<String> kTree = new BinaryTree<>("K", mTree, lTree);

		// Set the Root of the Tree:
		tree.setTree("J", fTree, kTree);
		String output = preOrderTraversal(tree.getRootNode());
		output = output.substring(1);
		
		assertEquals("J F A H B C K M L", output);		
	}

	/**
	 * Wrapper method for preOrder traversal
	 * 
	 * @param tree The Root Node of the Tree.
	 * @return output The preOrder Traversal Output of the Tree
	 */
	public static String preOrderTraversal(BinaryNode<String> tree) {
		String dummy = "";		
		String output = preOrderTraversal(tree, dummy);
		return output;
	}

	/**
	 * Recursive method for preOrder traversal
	 * 
	 * @param tree   The Root Node of the Tree
	 * @param answer The answer to the preOrder Tree Traversal
	 * @return answer The preOrder Traversal Output of the Tree
	 */
	private static String preOrderTraversal(BinaryNode<String> tree, String answer) {

		if (!tree.isLeaf())
			answer = answer + " " + tree.getData();
		else {
			answer = answer + " " + tree.getData();
			return answer;
		}

		answer = preOrderTraversal(tree.getLeftChild(), answer);
		answer = preOrderTraversal(tree.getRightChild(), answer);

		return answer;
	}

}
