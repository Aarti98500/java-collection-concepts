import java.util.Set;
import java.util.TreeSet;

//elements are stored in sorted order.
public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> fruitNames = new TreeSet<>();

        fruitNames.add("Apple");
        fruitNames.add("Grapes");
        fruitNames.add("Mango");
        fruitNames.add("Orange");

        System.out.println("---------------------------");
        System.out.println("isEmpty set ? " + fruitNames.isEmpty());
        System.out.println("-----------------------------");
        System.out.println("size : " + fruitNames.size());
        System.out.println("-----------------------------");
        for (String fruitName : fruitNames){
            System.out.println("Name : " + fruitName);
        }
        System.out.println("-----------------");
        fruitNames.remove("Mango");

        for (String fruitName : fruitNames){
            System.out.println("Name : " + fruitName);
        }

        System.out.println("--------------------");
        System.out.println("size : " + fruitNames.size());
        System.out.println("----------------------");
    }
}
