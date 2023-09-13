import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapJavaExample {
    public static void main(String[] args) {
        Map<String, Long> myPhoneBook = new LinkedHashMap<>();

        myPhoneBook.put("Aarti", 1010101010L);
        myPhoneBook.put("Komal", 2020202020L);
        myPhoneBook.put("Karan", 3030303030L);
        myPhoneBook.put("Vikram", 4040404040L);

        myPhoneBook.put(null, null);
        myPhoneBook.put("abc", null);

        myPhoneBook.remove(null);

        System.out.println(myPhoneBook);

        for (String key : myPhoneBook.keySet()){
            System.out.println("key = " + key);
        }

        for (Map.Entry<String, Long> entry : myPhoneBook.entrySet()){
            System.out.println("K = " + entry.getKey() + "V = " + entry.getValue());
        }
    }
}
