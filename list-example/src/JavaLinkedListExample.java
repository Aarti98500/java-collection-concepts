import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/*
  Iterable
  ^
  |
  collection
  ^
  |
  List
  ^
  |
  LinkedList
 */
public class JavaLinkedListExample {
    public static void main(String[] args) {

        List<String> guestList = new LinkedList<>();

        guestList.add("Aarti");
        guestList.add("Bhagyashree");
        guestList.add("Komal");
        guestList.add("Vikram");

        for (String name : guestList){
            System.out.println(name);
        }

        guestList.forEach(System.out::println);
        System.out.println("-----------------");
        guestList.add(0, "Karan");

        guestList.forEach(System.out::println);
        System.out.println("-----------------");
        guestList.add(2, "Pratik");

        guestList.forEach(System.out::println);
        System.out.println("-----------------");
        guestList.remove(0);

        guestList.forEach(System.out::println);
        System.out.println("-----------------");
        guestList.remove(2);

        guestList.forEach(System.out::println);
        System.out.println("------------------");
    }

}
