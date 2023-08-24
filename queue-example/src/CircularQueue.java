public class CircularQueue {
    int capacity;
    int front;
    int rear;
    int[] circularQueue;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.circularQueue = new int[capacity];
    }

    void enQueue(int item){
        if (isFull()){
            System.out.println("Circular queue is full, no more element can added.");
        }else {
            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % capacity;
            circularQueue[rear] = item;
            System.out.println("Element" + item + "is added to the end of queue ai index" + rear);
            printQueue();
        }


    }
    int dequeue(){
        int removedItem = -1;
        if (isEmpty()){
            System.out.println("Circular queue is empty, hence we cannot remove item.");
        }else {
            removedItem = circularQueue[front];
            front = (front + 1) % capacity;
        }
        System.out.println("Element" + removedItem + "is removed.");
        return removedItem;
    }
    boolean isFull(){
        //whenever you find circular operations, do mod operations(%), it always returns remainder value.
        //so x%8 --> 0 to 7
        //queue full condition.
        //front == 0 & rear == 7;
        //front == 1 & rear == 0
        //front == 2 & rear == 1;
        //front == 3 & rear == 2
        //front == 4 & rear == 3;
        //front == 5 & rear == 4
        //front == 6 & rear == 5;
        //front == 7 & rear == 6
        //front == 0 & rear == 7;
        return front % capacity == ((rear + 1) % capacity);
    }
    boolean isEmpty(){
        return front == -1;
    }
    int peek(){
        return circularQueue[front];
    }
    void printQueue(){
        System.out.println("-------------" +
                "Queue content is : " +
                "---------------");
        for (int j : circularQueue){
            System.out.println(j + "\t");
        }
        System.out.println("\n--------------------");
    }
}
