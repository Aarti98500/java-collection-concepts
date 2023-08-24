public class CircularQueueDriver {
    public static void main(String[] args) throws InterruptedException {
        CircularQueue queue = new CircularQueue(4);

        queue.dequeue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.dequeue();
        queue.enQueue(40);
        queue.enQueue(50);
        queue.dequeue();


    }
}
