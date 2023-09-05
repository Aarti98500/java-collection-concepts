import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsDequeJavaExample {
    public static void main(String[] args) throws InterruptedException {
        //deque
        //addFront - dec front
        //addLast - inc rear
        //removeFirst - inc front
        //removedLast - dec rear
        Deque<Integer> integerArrayDeque = new ArrayDeque<>();


        integerArrayDeque.addFirst(10);
        print(integerArrayDeque);
        integerArrayDeque.addFirst(20);
        print(integerArrayDeque);
        integerArrayDeque.addLast(30);
        print(integerArrayDeque);
        integerArrayDeque.addLast(40);
        print(integerArrayDeque);

        integerArrayDeque.removeFirst();
        print(integerArrayDeque);
        integerArrayDeque.removeFirst();
        print(integerArrayDeque);

        integerArrayDeque.addFirst(50);
        print(integerArrayDeque);
        integerArrayDeque.addLast(60);
        print(integerArrayDeque);

    }
    static void print(Deque<Integer> integerQueue) throws InterruptedException{
        System.out.println(integerQueue);
        Thread.sleep(2000);
    }

}
