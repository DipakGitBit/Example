package com.springcore.DSA;

class CNode {
	int data;
	CNode next;

	public CNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class CircularLinkedList {
	CNode head;

	public void insert(int data) {
		CNode newNode = new CNode(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;

		} else {
			CNode p = head;
			while (p.next != head)
				p = p.next;
			newNode.next = head;
			p.next = newNode;

		}

	}

	public void insertAfterNode(int existingData, int Newdata) {
		if (head == null) {
			System.out.println("List does not exist! ");
			return;
		}

		CNode newNode = new CNode(Newdata);
		newNode.next = null;
		CNode p = head;

		while (p.next != head && p.data != existingData) {
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
		CNode temp = head, prev = null;

		while (temp.data != key && temp.next != head) {
			prev = temp;
			temp = temp.next;

		}

		if (temp.next == head && temp.data==key) {
			
				prev.next=temp.next;
			
			
		}
		else if (temp == head) {
			CNode p=head;
			while (p.next!=head) {
				p=p.next;
				
			}
			head=head.next;
			p.next=head;
			
		
		}
		else if(temp.data==key) {
			prev.next=temp.next;
		}else {
			System.out.println("ket does not exits for delete");
			return;
		}
			

		temp.next = null;

	}

	public void print() {

		CNode p = head;
		if (head == null) {
			System.out.println("Head is null");
			return;
		}
		do {
			System.out.print(p.data + "-");
			p = p.next;
		} while (p != head);
		System.out.println();

	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		list.print();

		list.insertAfterNode(4, 99);
		list.print();
		list.deleteByKey(98);
		list.print();

	}

}
