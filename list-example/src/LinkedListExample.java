import org.w3c.dom.Node;

import java.io.IOException;

public class LinkedListExample {
    Node head;

    LinkedListExample(){
        head = null;

    }
    static class Node{
        int data;
        Node next;

         Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    void addNode (Node newNode) throws InterruptedException {
        if (head == null){
            head = newNode;
        }else {
            Node temp = head;
            while (temp.next!= null){
                temp = temp.next;//move to next node
            }
            temp.next = newNode;
        }
        printNode();

    }

    void deleteNode(int index) throws InterruptedException{
        if(index == 0){
            if (head!= null)
                head = head.next;
        }else{
            Node temp = head;
            Node previous = head;
            int count = 0;
            while (count < index) {
                previous = temp;
                temp = temp.next;//move to next code
                count++;
            }
            previous.next = temp.next;
        }
        printNode();
    }
    void printNode() throws InterruptedException {
        Node temp = head;
        while (temp!= null){
            System.out.println("[ " +temp.data + (temp.next!= null ? temp.next.hashCode(): null) + "] -->");
            temp = temp.next;
            Thread.sleep(3000);
        }
    }

}
