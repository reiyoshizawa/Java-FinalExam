package Map;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        // template
        // List<String>
        Map<String, String> phoneBook = new HashMap<>();
        HashMap<String, String> phoneBook2 = new HashMap<>();
        phoneBook.put("Derrik", "1");
        phoneBook.put("Derrik2", "2");
        phoneBook.put("Derrik3", "3");
        phoneBook.put("Derrik3", "4");

        // size
        System.out.println(phoneBook.size());

        phoneBook.put("Derrik4", "5");

        System.out.println(phoneBook.get("Derrik3"));
        System.out.println(phoneBook.size());

        // keys have to be unique
        phoneBook.remove("Derrik2");
        System.out.println(phoneBook.size());

        Set<String> keys = phoneBook.keySet();
        Iterator<String> names = keys.iterator();
        while (names.hasNext()) {
            phoneBook.get(names.next());
        }

        Collection<String> numbers = phoneBook.values();
        for (String num : numbers) {
            System.out.println(num);
        }



        List<String> arrList = new ArrayList<>();

        arrList.add("Minami");
        arrList.add("Bianca");
        arrList.add("Victor");
        arrList.add("Marcelo");
        arrList.add("Nagisa");
        arrList.add("Alex");
        arrList.add("Emre");
        arrList.add("Juan");
        arrList.add("Sue");
        arrList.add("Marla");

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        for (String name: arrList) {
            System.out.println(name);
        }

        Iterator<String> iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
