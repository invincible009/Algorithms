package com.sdl.LinkedList;

public class LinkedListExample {
    static class  Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node insertEndNode(Node head, int val){

        if(head == null){
            Node newNode = new Node(val);
            head = newNode;
            return head;
        }
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }

        Node newNode = new Node(val);
        tempNode.next = newNode;
        return head;
    }


    public static Node deleteNodeIn(Node head, Node del){
        if(head != null && head == del){
            head = head.next;
            return head;
        }

        Node tempNode = head;
        while (tempNode.next != null){

            if(tempNode.next == del){
                tempNode.next = tempNode.next.next;
                return head;
            }
            tempNode = tempNode.next;
        }
        return head;
    }

    public static void middleNode(Node head){
        int length = 0;
        if(head == null){
            System.out.println("Head node :"+ head);
        }

        Node tempNode = head;
        while (tempNode != null){
            length ++;
            tempNode = tempNode.next;
        }

        Node newTemp = head;
        int middleLength = length/2;
        while (middleLength !=  0){
            newTemp = newTemp.next;
            middleLength--;
        }

        System.out.println("Middle element is "+ newTemp.val);
    }
}
