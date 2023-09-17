import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentModificationExceptionExample2 {
    public static void main(String[] args) {
        Map<String, Long> phoneBook = new ConcurrentHashMap<>();

        phoneBook.put("Nanon", 1010101010L);
        phoneBook.put("First", 2020202020L);
        phoneBook.put("Krist", 3030303030L);
        System.out.println(phoneBook);

        Iterator<String> keyIterator = phoneBook.keySet().iterator();//3 elements

        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            System.out.println("key = " + key);
            if ("Nanon".equals(key)){
                keyIterator.remove();//this works and remove ele from map
                phoneBook.remove("Krist");//remove element from map is allowed
            }

        }
        System.out.println(phoneBook);

    }
}