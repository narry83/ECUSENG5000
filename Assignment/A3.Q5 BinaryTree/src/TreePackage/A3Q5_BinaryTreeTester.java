package TreePackage;

import java.util.Iterator;

public class A3Q5_BinaryTreeTester {

	public static void main(String[] args)

	{
		BinaryTree<String> tree = new BinaryTree<>();

		// Leaves
		BinaryTree<String> aTree = new BinaryTree<>("A");
		BinaryTree<String> bTree = new BinaryTree<>("B");
		BinaryTree<String> cTree = new BinaryTree<>("C");
		BinaryTree<String> lTree = new BinaryTree<>("L");
		BinaryTree<String> mTree = new BinaryTree<>("M");

		// Subtrees:
		BinaryTree<String> hTree = new BinaryTree<>("H", bTree, cTree);
		BinaryTree<String> fTree = new BinaryTree<>("F", aTree, hTree);
		BinaryTree<String> kTree = new BinaryTree<>("K", mTree, lTree);

		// set Root:
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

		preOrder(tree.getRootNode());

		// showTreeStats(aTree, "A", 3, 7);
		// testTraversals(aTree, "A B D E C F G", "D B E A F C G", "D E B F G C A", "A B
		// C D E F G");
	}

	/**
	 * Java method to print tree nodes in PreOrder traversal
	 */
	public static void preOrder(BinaryNode<String> tree) {
		// BinaryTree<String> tree = new BinaryTree<>();
		// BinaryNode<String> root= tree.getRootNode();
		String answer = "Yes";
		preOrder(tree, answer);
	}

	public static void preOrder(BinaryNode<String> tree, String answer) {

		if (!tree.isLeaf()) {

			System.out.printf("%s ", tree.getData());
		} else {
			System.out.printf("%s ", tree.getData());

			return;

		}
		preOrder(tree.getLeftChild(), "Yes");
		preOrder(tree.getRightChild(), "Yes");

	} 

}
