package com.java.SingleLinkedList;

public class LengthOfLinkedList {

	Node head;

	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public void add(int newData) {
		Node newNode = new Node(newData);

		newNode.next = head;
		head = newNode;
	}

	public int getLength() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLinkedList llist = new LengthOfLinkedList();
		llist.add(7);

		llist.add(1);
		llist.add(3);
		llist.add(2);
		llist.add(8);

		System.out.println("\nCreated Linked list is: ");
		llist.printList();


		System.out.println("\nLength of Linked list is: "+ llist.getLength());
	}

}
