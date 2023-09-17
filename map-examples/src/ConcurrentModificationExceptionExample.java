import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        Map<String, Long> phoneBook = new HashMap<String, Long>();

        phoneBook.put("Bright", 1010101010L);
        phoneBook.put("Win", 2020202020L);
        phoneBook.put("Gulf", 3030303030L);
        System.out.println(phoneBook);

        Iterator<String> keyIterator = phoneBook.keySet().iterator();//3 elements

        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            System.out.println("key = " + key);
            if ("Bright".equals(key)){
                keyIterator.remove();//this works and remove ele from map
 //               phoneBook.remove("Gulf");//remove element from map is not allowed
 //               phoneBook.put("Ohm", 4040404040L);
            }
        }
        System.out.println(phoneBook);
    }
}
