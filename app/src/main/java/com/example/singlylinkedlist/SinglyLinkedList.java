package com.example.singlylinkedlist;

public class SinglyLinkedList {
    public Node head;



    private void printValues() {
    }

    private void remove( ) {


    }

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }


}
