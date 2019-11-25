

/**
 * Class to test the AVL Tree implementation
 * 
 * @author Jacob
 *
 */
public class AVLTreeDriver {

	public static void main(String[] args) {
		AVLTree<String> testOne = new AVLTree<String>();
		testOne.add("The");
		testOne.add("quick");
		testOne.add("brown");
		testOne.add("fox");
		testOne.add("apple");
		testOne.add("cat");
		testOne.add("hat");
		//System.out.println(testOne.toString());

		AVLTree<Integer> testTwo = new AVLTree<Integer>();
		testTwo.add(30);
		testTwo.add(40);
		testTwo.add(15);
		testTwo.add(25);
		testTwo.add(90);
		testTwo.add(80);
		testTwo.add(70);
		testTwo.add(85);
		testTwo.add(15);
		testTwo.add(72);
		//System.out.println(testTwo.toString());

		AVLTree<String> testThree = new AVLTree<String>();
		testThree.add("Now");
		testThree.add("is");
		testThree.add("time");
		testThree.add("for");
		testThree.add("all");
		testThree.add("good");
		testThree.add("men");
		testThree.add("to");
		testThree.add("come");
		testThree.add("to");
		testThree.add("the");
		testThree.add("aid");
		testThree.add("of");
		testThree.add("the");
		testThree.add("party");
		//System.out.println(testThree.toString());

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

		//System.out.println(avlTree.toString());
		
		
		AVLTree<Integer> list = new AVLTree<Integer>();

		System.out.println(list.toString());
		list.add(30);
		list.add(40);
		list.add(15);
		list.add(25);
		list.add(90);
		list.add(80);
		list.add(70);
		list.add(85);
		list.add(15);
		list.add(72);
		System.out.println(list.toString());
	}

}