package com.java.SingleLinkedList;

public class GetNthNode {
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
	
	public int GetNth(int index) {
		Node temp = head;
		int count = 0;
		
		while(temp != null) {
			if(count == index)
				return temp.data;
			temp = temp.next;
			count++;
		}
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetNthNode llist = new GetNthNode();
		
		 /*Use add() to construct below list
        14->21->11->30->10  */	
		llist.add(10);
		llist.add(30);
		llist.add(11);
		llist.add(21);
		llist.add(14);
		
		 /* Check the count function */
        System.out.println("Element at index 3 is " + llist.GetNth(3));

	}

}
