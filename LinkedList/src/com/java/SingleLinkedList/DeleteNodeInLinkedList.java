package com.java.SingleLinkedList;

public class DeleteNodeInLinkedList {
	Node head;
	
	static class Node {
		Node next;
		int data;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	 /* This function prints contents of linked list starting
    from the given node */
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	/* Inserts a new Node at front of the list. */
	public void add(int newData) {
		Node newNode = new Node (newData);
		newNode.next= head;
		head = newNode;
	}
	
	  /* Given a key, deletes the first
    occurrence of key in
  * linked list */
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		
		// If head node itself holds the key to be deleted
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		// Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
		//delete last node
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		 // If key was not present in linked list
        if (temp == null)
            return;
		prev.next = temp.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNodeInLinkedList llist = new DeleteNodeInLinkedList();
		
		llist.add(7);
		llist.add(1);
		llist.add(3);
		llist.add(2);
		
		System.out.println("\nCreated Linked list is:");
        llist.printList();
		
        llist.deleteNode(1); // Delete node with data 1
        
        System.out.println("\nLinked List after Deletion of 1:");
        llist.printList();

	}

}