package org.example;

public class LinkedList {
    private  Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.getNext()!= null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
}
