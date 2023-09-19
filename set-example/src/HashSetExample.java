import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruitNames = new HashSet<>();

        fruitNames.add("Apple");
        fruitNames.add("Mango");
        fruitNames.add("Orange");
        fruitNames.add("Grapes");

        System.out.println("------------------------------");
        System.out.println("isEmpty set ? " + fruitNames.isEmpty());
        System.out.println("-----------------------------");
        System.out.println("size : " + fruitNames.size());
        System.out.println("-------------------------------");

        for (String fruitName : fruitNames){
            System.out.println("Name : " + fruitName);
        }

        System.out.println("-----------------------");
        fruitNames.forEach(item -> System.out.println());
        System.out.println("----------------------");
        System.out.println("size : " + fruitNames.size());
        System.out.println("----------------------");


    }
}
