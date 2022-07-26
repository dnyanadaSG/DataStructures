package com.java.SingleLinkedList;

public class CreateLinkedList {
	Node head;  // head of list

    /* Linked list Node.  This inner class is made static so that
      main() can access it */
    static class Node {
        Node next;
        int data;

         Node(int data) {
             this.data = data;
             next = null;
         }

    }
    //To print linkedlist
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateLinkedList newList = new CreateLinkedList();
        newList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        newList.head.next=second;
        second.next=third;
       /* Type 1 to print LinkedList
        Node temp =  newList.head;
        while(temp != null) {
           System.out.print(temp.data);
            temp = temp.next;
            if(temp != null) {
                System.out.print("->");
            }
        }*/

        //Type 2 to print LinkedList
        newList.printList();


	}

}
