import java.util.Map;
import java.util.TreeMap;

public class TreeMapJavaExample {
    public static void main(String[] args) {
        Map<String, Long> myPhoneBook = new TreeMap<>();

        myPhoneBook.put("Aarti", 1010101010L);
        myPhoneBook.put("Komal", 2020202020L);
        myPhoneBook.put("Karan", 3030303030L);
        myPhoneBook.put("Vikram", 4040404040L);
        myPhoneBook.put("Moin", null);

        System.out.println(myPhoneBook);

        for (String key : myPhoneBook.keySet()){
            System.out.println("key = " + key);

        }
        for (Map.Entry<String, Long> entry : myPhoneBook.entrySet()){
            System.out.println("K = " + entry.getKey() + "V = " + entry.getValue());
        }

    }
}
