package practice.strings;

public class LinkedList {

	private Node head;
	
	public void insertHead(int data) {
		Node newNode = new Node(data);
		newNode.next =  head;
		head = newNode;
	}
}
