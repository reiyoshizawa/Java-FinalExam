package Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("Hello");
        mySet.add("Hello2");
        mySet.add("Hello3");
        mySet.add("Hello4");
        mySet.add("Hello5");
        mySet.add("Hello6");
        mySet.add("Hello7");
        mySet.add("Hello8");
        mySet.add("Hello9");
        mySet.add("Hello9");

        String word = "ABCDEAAA";
        String word2 = "ABCDEAAA";
        Arrays.asList(word);

        HashSet<String> unique = new HashSet<String>(Arrays.asList(word));
        for (int i = 0; i < word.length(); i++) {
            System.out.println(unique.add(word.substring(i, i+1)));
        }

        HashSet<String> unique2 = new HashSet<>();
        for (int i = 0; i < word2.length(); i++) {
            System.out.println(unique2.add(word2.substring(i, i+1)));
        }

        System.out.println(mySet.size());
    }

}