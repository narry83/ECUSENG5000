package KW.CH09;

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
		
		System.out.println(avlTree.toString());
		
		
	}

}
