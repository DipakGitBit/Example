package com.springcore.DSA;



class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinklist {
	Node head; // head of list

	// Method to insert a new node at the front
	public void insertAtFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// Method to insert a new node at the end
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = new Node(data);
			return;
		}

		newNode.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

	// Method to insert after a given node
	public void insertAfterNode(int existingData, int Newdata) {
		if (head == null) {
			System.out.println("List does not exist! ");
			return;
		}

		Node newNode = new Node(Newdata);
		newNode.next = null;
		Node p = head;

		while (p.next != null && p.data != existingData) {
			p = p.next;

		}
		if (p.data == existingData) {
			newNode.next = p.next;
			p.next = newNode;
		}

		else {
			System.out.println("given does not exits");
			return;
		}

	}

	// Method to delete a node by key
	public void deleteByKey(int key) {
		Node temp = head, prev = null;

		while (temp.data != key && temp.next != null) {
			prev = temp;
			temp = temp.next;

		}

		if (temp.next == null) {
			System.out.println("given does not exits");
			return;
		}
		if (temp == head)
			head = head.next;
		else
			prev.next = temp.next;

		temp.next = null;

	}

	// Method to detect a loop in the linked list
	public void detectLoop() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.print("looop exist");
				return;
			}
		}
		System.out.print("looop not exist");
		return;
	}

	// Method to print the LinkedList
	public void printList() {

		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public int getNthNode(int index) {
		Node current = head;
		int count = 0;
		while (current != null) {
			if (count == index) {
				return current.data;
			}
			count++;
			current = current.next;
		}
		throw new IndexOutOfBoundsException("Index out of bounds");
	}

	public int getMiddleNode() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
//imp reverse linklist
	public void reverse() {
		Node prev = null;
		Node current = head;
		
		while (current != null) {
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		head = prev;
	}

	
	public void  findMiddle()
    {
        Node temp=head,p=head;

        while(temp!=null){
            //System.out.println(p.data);
            temp=temp.next;
            temp=temp.next;
            p=p.next;

        }
        head=p;
    }
	// Main method to run the example
	public static void main(String[] args) {
		SinglyLinklist list = new SinglyLinklist();

		list.insertAtEnd(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtEnd(4);
		list.printList();
		list.insertAfterNode(44, 8);

		System.out.println("Linked list: ");
		list.printList();

		//list.deleteByKey(99);
		// System.out.println("\nLinked list after deletion of 4:");
		// list.printList();

		// merge two list
		// collect only even / odd / alternative

		// Get Nth Node
		// list.getNthNode(2);

		// Get Middle Node
		// int t=list.getMiddleNode();
		// System.out.println(t);

		// Reverse
		//list.reverse();

		// check if direct loop exist or not
		// list.detectLoop();
		 System.out.println();
		list.findMiddle();
		list.printList();
		
		System.out.println((7/2)*2);
	}
}
