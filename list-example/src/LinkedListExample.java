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

    }

}
