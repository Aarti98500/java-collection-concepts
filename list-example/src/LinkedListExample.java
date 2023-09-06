import org.w3c.dom.Node;

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

}
