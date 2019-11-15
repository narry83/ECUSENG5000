package TreePackage;
//package TreePackage;

import java.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A class that implements the ADT binary tree.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 4.0
 */
public class BinaryTree<T> implements BinaryTreeInterface<T> {
	private BinaryNode<T> root;

	public BinaryTree() {
		root = null;
	} // end default constructor

//......................................
	public BinaryTree(T rootData) {
		root = new BinaryNode<>(rootData);
	} // end constructor

	// ......................................

	public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		privateSetTree(rootData, leftTree, rightTree);
	} // end constructor

	// ......................................

	public void setTree(T rootData) {
		root = new BinaryNode<>(rootData);
	} // end setTree

	// ......................................
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
		privateSetTree(rootData, (BinaryTree<T>) leftTree, (BinaryTree<T>) rightTree);
	} // end setTree

	// ......................................

	private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		root = new BinaryNode<>(rootData);

		if ((leftTree != null) && !leftTree.isEmpty())
			root.setLeftChild(leftTree.root);

		if ((rightTree != null) && !rightTree.isEmpty()) {
			if (rightTree != leftTree)
				root.setRightChild(rightTree.root);
			else
				root.setRightChild(rightTree.root.copy());
		} // end if

		if ((leftTree != null) && (leftTree != this))
			leftTree.clear();

		if ((rightTree != null) && (rightTree != this))
			rightTree.clear();
	} // end privateSetTree

//......................................

	public T getRootData() {
//		if (isEmpty())
//			System.out.println("Tree is empty"); //throw new EmptyTreeException();
//		else
		return root.getData();
	} // end getRootData

	// ......................................

	public boolean isEmpty() {
		return root == null;
	} // end isEmpty

	// ......................................

	public void clear() {
		root = null;
	} // end clear

	// ......................................

	protected void setRootData(T rootData) {
		root.setData(rootData);
	} // end setRootData

	// ......................................

	protected void setRootNode(BinaryNode<T> rootNode) {
		root = rootNode;
	} // end setRootNode

	// ......................................

	protected BinaryNode<T> getRootNode() {
		return root;
	} // end getRootNode

	// ......................................

	public int getHeight() {
		return root.getHeight();
	} // end getHeight

	// ......................................

	public int getNumberOfNodes() {
		return root.getNumberOfNodes();
	} // end getNumberOfNodes

	// ......................................

	

} // end BinaryTree