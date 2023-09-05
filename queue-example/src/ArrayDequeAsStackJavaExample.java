import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsStackJavaExample {
    public static void main(String[] args) throws InterruptedException {

        Deque<Integer> integerArrayDeque = new ArrayDeque<>();

        integerArrayDeque.push(10);
        print(integerArrayDeque);
        integerArrayDeque.push(20);
        print(integerArrayDeque);
        integerArrayDeque.push(30);
        print(integerArrayDeque);
        integerArrayDeque.push(40);
        print(integerArrayDeque);


    }
}
