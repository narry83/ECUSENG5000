
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
		 */
		private Node(E dataItem, Node<E> nodeRef) {
			data = dataItem;
			next = nodeRef;
		}
	} // end class Node

	/**
	 * Returns the string representation of a list.
	 * 
	 * @param head The head of the current list
	 * @return The state of the current list
	 */
	private String toString(Node<E> head) {
		if (head == null) {
			return "";
		} else {
			return head.data + "\n" + toString(head.next);
		}
	}

	/**
	 * Wrapper method for returning the string representation of a list.
	 * 
	 * @return The string representation of the list
	 */
	@Override
	public String toString() {
		return toString(head);
	}

	private boolean equals(Node<E> node1, Node<E> node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null) {
			return false;
		}
		if (node2 == null) {
			return false;
		}
		if (node1.data.equals(node2.data)) {
			return equals(node1.next, node2.next);
		}
		return false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		RecursiveLinkedList<E> other = (RecursiveLinkedList<E>) obj;
		return equals(head, other.head);
	}

	private void add(Node<E> head, E data) {
		// If the list has just one element, add to it.
		if (head.next == null) {
			head.next = new Node<>(data);
		} else {
			add(head.next, data); // Add to rest of list.
		}
	}

	public void add(E data) {
		if (head == null) {
			head = new Node<>(data); // List has 1 node.
		} else {
			add(head, data);
		}
	}

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

	private void addBefore(E target, E inData, Node<E> node) {
		// If the list has just one element, add to it.
		if (node.next == null) {
			node.next = new Node<>(inData, null);
			return;
		}
		if (target.equals(node.next.data)) {
			node.next = new Node<>(inData, node.next);
			return;
		}
		addBefore(target, inData, node.next); // Add to rest of list.
	}

}