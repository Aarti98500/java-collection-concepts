import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapJavaExample {
    public static void main(String[] args) {
        Map<String, Long> myPhoneBook = new HashMap<>();

        myPhoneBook.put("Aarti", 1010101010L);
        myPhoneBook.put("Komal", 2020202020L);
        myPhoneBook.put("Komal", 3030303030L);
        myPhoneBook.put("Vikram", 4040404040L);

        myPhoneBook.put(null, null);
        myPhoneBook.put("abc", null);
        myPhoneBook.put("Moin", 4040404040L);
        myPhoneBook.put("Moin", 5050505050L);

        myPhoneBook.remove(null);

        System.out.println(myPhoneBook);
        System.out.println("--------keys-------");
        for(String key : myPhoneBook.keySet()){
            System.out.println("key = " + key);
        }
        System.out.println("--------values--------");

        for (Long value : myPhoneBook.values()){
            System.out.println("v = "+ value);


        }
        System.out.println("----------Entries---------");
        for (Map.Entry<String, Long> entry : myPhoneBook.entrySet()){
            System.out.println("K = " + entry.getKey() + "V = " + entry.getValue());
        }
        System.out.println("--------------");

        Iterator<String> iterator = myPhoneBook.keySet().iterator();
        //iterator is a pointer that will iterate over set elements.

        System.out.println("------------Iterator-----------");

        while (iterator.hasNext()){
            System.out.println("key = " + iterator.next());
        }
    }
}
