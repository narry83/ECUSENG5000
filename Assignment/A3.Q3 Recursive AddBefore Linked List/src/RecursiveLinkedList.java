/**
 * Assignment 3 - Question 3 Recursive Linked List to add
 * a node before the target node.
 * 
 **/

/**
 * A recursive linked list class with recursive methods.
 * 
 * @param <E> The element type
 * @author Koffman and Wolfgang
 **/
public class RecursiveLinkedList<E> {

	private Node<E> head;

	/** A Node is the building block for a single-linked list. */
	private static class Node<E> {
		// Data Fields

		/** The reference to the data. */
		private E data;
		/** The reference to the next node. */
		private Node<E> next;

		// Constructors
		/**
		 * Creates a new node with a null next field.
		 * 
		 * @param dataItem The data stored
		 * @author Koffman and Wolfgang
		 */
		private Node(E dataItem) {
			data = dataItem;
			next = null;
		}

		/**
		 * Creates a new node that references another node.
		 * 
		 * @param dataItem The data stored
		 * @param nodeRef  The node referenced by new node
		 * @author Koffman and Wolfgang
		 */
		private Node(E dataItem, Node<E> nodeRef) {
			data = dataItem;
			next = nodeRef;
		}
	} // end class Node

	
	/**
	 * Helper addBefore Linked list Method to add Object before the target node
	 * 
	 * @param target The node before which the new node is to be inserted
	 * @param inData The new node to be inserted.
	 */

	public void addBefore(E target, E inData) {
		if (head == null) {
			head = new Node<>(target, null);
			return;
		}
		if (head.data.equals(target)) {
			head = new Node<>(inData, head);
			return;
		}
		addBefore(target, inData, head);

	}

	/**
	 * Linked List addBefore Method to add Object before the target node
	 * 
	 * @param target The node before which the new node is to be inserted
	 * @param inData The new node to be inserted.
	 * @param node   The Current node of Type Node.
	 */

	private void addBefore(E target, E inData, Node<E> node) {
		if (node.next == null) {
			node.next = new Node<>(inData, null);
			return;
		}
		if (target.equals(node.next.data)) {
			node.next = new Node<>(inData, node.next);
			return;
		}
		addBefore(target, inData, node.next);
	}
	
	
	/**
	 * Returns the string representation of a list.
	 * 
	 * @param head The head of the current list
	 * @return The state of the current list
	 * @author Koffman and Wolfgang
	 */
	private String toString(Node<E> head) {
		if (head == null) {
			return "";
		} else {
			return head.data + toString(head.next);
		}
	}

	/**
	 * Wrapper method for returning the string representation of a list.
	 * 
	 * @return The string representation of the list
	 * @author Koffman and Wolfgang
	 */
	@Override
	public String toString() {
		return toString(head);
	}

	/**
	 * Linked List equals Method to check if two Linked List objects are equal.
	 * 
	 * @param inputNode   The current node in this list
	 * @param compareNode The current node in the other list
	 */

	private boolean equals(Node<E> inputNode, Node<E> compareNode) {
		if (inputNode == null && compareNode == null) {
			return true;
		}
		if (inputNode == null) {
			return false;
		}
		if (compareNode == null) {
			return false;
		}
		if (inputNode.data.equals(compareNode.data)) {
			return equals(inputNode.next, compareNode.next);
		}
		return false;
	}

	/**
	 * Helper Method to check if two Linked List objects are equal.
	 * 
	 * @param inputObject The other object
	 * @return true of the other obj is equal to this.
	 */

	@Override
	public boolean equals(Object inputObject) {
		if (this == inputObject) {
			return true;
		}
		if (inputObject == null) {
			return false;
		}
		RecursiveLinkedList<E> compareTo = (RecursiveLinkedList<E>) inputObject;
		return equals(head, compareTo.head);
	}
	
}