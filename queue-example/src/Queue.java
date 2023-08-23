public class Queue {
    int capacity;
    int front;//points to first element and use to remove elements from front.
    int rear;//points to last element and use to insert element to end of queue.
    int[] queue;//array that will be used to store elements.


    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[capacity];
    }
    /*
        Enqueue
        Dequeue
        isFull
        isEmpty
        Peek
     */

    /*
    Add/insert an item to the end of queue.
     */

    void enqueue(int item){
        if (isFull()){
            System.out.println("Queue is full, cannot add new element at the end of queue.");
        }else {
            if (front == -1) {
                front = 0;//make fronts equal to 0 when it is first element.
            }
            queue[++rear] = item;
            System.out.println("Element " + item + " is added to end of queue at index " + rear);
            printQueue();
        }
    }
    /*
    remove an item from front of queue.
     */

    int dequeue(){
        int removedItem = 0;
        if (isEmpty()){
            System.out.println("Queue is already empty cannot remove element from queue.");
        }else {
            removedItem = queue[front];
            queue[front] = 0;
            if (front == (capacity -1)){
                front = -1;
                rear = -1;
            }else {
                front++;
            }
            System.out.println("Element " + removedItem + " is removed.");
        }
        return removedItem;
    }
    boolean isFull(){
        return rear == (capacity -1);
    }
    boolean isEmpty(){
        return front == -1;
    }
    int peek(){
        return queue[front];
    }
    void printQueue(){
        System.out.println("---------" +
                "queue content is : " +
                "-----------");
        for (int j : queue){
            System.out.println(j + "/t");
        }
        System.out.println("/n------------------");
    }

}
