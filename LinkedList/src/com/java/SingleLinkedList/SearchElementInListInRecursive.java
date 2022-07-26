package com.java.SingleLinkedList;

public class SearchElementInListInRecursive {
	Node head;

	static class Node {
		Node next;
		int data;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void add(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	public boolean searchByRecursive(Node n, int data) {
		if(n == null)
			return false;
		
		if(n.data == data)
			return true;
		
		return searchByRecursive(n.next, data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElementInListInRecursive llist = new SearchElementInListInRecursive();
		
		 /*Use add() to construct below list
        14->21->11->30->10  */	
		llist.add(10);
		llist.add(30);
		llist.add(11);
		llist.add(21);
		llist.add(14);
		
		if(llist.searchByRecursive(llist.head, 21)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
