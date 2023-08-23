public class QueueDriver {
    public static void main(String[] args) {
        Queue queue = new Queue(4);

        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.dequeue();
    }
}
