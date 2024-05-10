package com.springcore.DSA;

class DNode {
	int data;
	DNode prev;
	DNode next;

	public DNode(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList {

	DNode head; // head of list

	// Method to insert a new node at the front
	public void insertAtFront(int data) {
		DNode newNode = new DNode(data);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	// Method to insert a new node at the end
	public void insertAtEnd(int data) {
		DNode newNode = new DNode(data);
		if (head == null) {
			head = new DNode(data);
			return;
		}

		newNode.next = null;
		DNode last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		newNode.prev = last;
	}

	// Method to insert after a given node
	public void insertAfterNode(int existingData, int Newdata) {
		if (head == null) {
			System.out.println("List does not exist! ");
			return;
		}

		DNode newNode = new DNode(Newdata);
		newNode.next = null;
		newNode.prev = null;
		DNode p = head;

		while (p.next != null && p.data != existingData) {
			p = p.next;

		}
		System.out.println("got " + p.data);
		if (p.data == existingData) {

			// System.out.println("got " + p.data);

			if (p.next == null) {
				p.next = newNode;
				newNode.prev = p;
			} else {
				newNode.next = p.next;
				p.next = newNode;
				newNode.prev = p;
				newNode.next.prev = newNode.next;
			}
		}

		else {
			System.out.println("given does not exits");
			return;
		}

	}

	// Method to delete a node by key
	public void deleteByKey(int key) {
		DNode temp = head, prev = null;

		while (temp.data != key && temp.next != null) {
			prev = temp;
			temp = temp.next;

		}

		if (temp == head ) {
			

			if (temp.next == null) {
				head = null;
			}else {
				head = head.next;
				temp.next = null;
				head.prev = null;
			}
		}

		else if (temp.next == null) {
			prev.next = null;
			temp.prev = null;
		}

		else {
			prev.next = temp.next;
			temp.next.prev = prev;
		}

		

	}

	// Method to print the LinkedList
	public void printList() {

		DNode tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public void reverse1() {
		DNode temp = head, p = null;

		while (temp.next != null) {
		
			temp = temp.next;
			

		}
		temp.next = null;
		head = temp;

	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();

		list.insertAtEnd(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtEnd(4);
		list.printList();
		list.insertAfterNode(4, 8);
		list.printList();
		System.out.println("Linked list: ");
		list.printList();

		list.deleteByKey(3);
		System.out.println("\nLinked list after deletion ");
		list.printList();
		
		System.out.println("\nafter reverse");
		list.reverse1();
		list.printList();

	}

}
