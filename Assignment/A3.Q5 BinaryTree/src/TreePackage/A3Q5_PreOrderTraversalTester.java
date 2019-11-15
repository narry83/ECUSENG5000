/**
 * Assignment 3 - Question 5
 * Driver Class to create a Binary Tree using the Tree Package 
 * and Print the PreOrder Traversal
 * 
 */

package TreePackage;

import java.util.Iterator;

public class A3Q5_PreOrderTraversalTester {

	/**
	 * Creates trees using BinaryTree classes from the TreePackage. Creates an
	 * object of the Binary Tree class and prints on screen the pictorial
	 * representation of the tree and the Pre Order Traversal
	 * 
	 * @param args[] No control parameters
	 */

	public static void main(String[] args)

	{
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

		// Pictorial Representation of the Tree
		System.out.println("\nTree 1:\n");
		System.out.println("     J      ");
		System.out.println("   /   \\   ");
		System.out.println("  F     K   ");
		System.out.println(" / \\   / \\");
		System.out.println("A   H  M   L");
		System.out.println("   / \\		");
		System.out.println("  B   C		");
		System.out.println();

		preOrderTraversal(tree.getRootNode());

	}

	/**
	 * Wrapper method for preorder traversal
	 * 
	 * @param Root Node of the Tree.
	 */
	public static void preOrderTraversal(BinaryNode<String> tree) {
		String answer = "J F A H B C K M L";
		System.out.println("PreOrder Traversal: ");
		preOrderTraversal(tree, answer);
	}

	/**
	 * Recursive method for preOrder traversal
	 * 
	 * @param tree   The Root Node of the Tree
	 * @param answer The answer to the preOrder Tree Traversal
	 */
	private static void preOrderTraversal(BinaryNode<String> tree, String answer) {

		if (!tree.isLeaf())
			System.out.printf("%s ", tree.getData());
		else {
			System.out.printf("%s ", tree.getData());
			return;
		}
		// Print the Left Child
		preOrderTraversal(tree.getLeftChild(), "");
		// Print the Right Child
		preOrderTraversal(tree.getRightChild(), "");

	}

}
