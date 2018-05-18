package Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {

    public static void main(String[] args) {

        String email = "reiyoshizawa0418@gmail.com";
        System.out.println(email.matches("\\w+[0-9]+@+\\w+\\.+\\w+"));

        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        // * -> ^
        firstString = firstString.replaceAll("\\*", "^");
        System.out.println(firstString);

        firstString = firstString.replaceAll("stars", "carets");
        System.out.println(firstString);

        firstString = firstString.replaceAll("\\w+", "word");
        System.out.println(firstString);

        // "digit, digit, digit, 4, 5, 6, 7, 8";
        for (int i = 0; i < 3; i++) {
            secondString.replaceFirst("\\d", "digit");
        }
        System.out.println(secondString);

        // ["digit", "digit", "digit", "4", "5", "6", "7", "8"];
        String[] words = secondString.split(",\\s*");
        System.out.println(Arrays.toString(words));

        // java.util.regex

        // Pattern - represents a regular expression
        // Matcher - contains both a regular-expression pattern and
        // a CharSequence in which to search for the pattern
        // CharSequence - an interface that allows read access to
        // a seq of chars.

        String s = "Javier's birthday is 12-25-90\nMinami's birthday is 09-28-88\nKen's birthday is 12-25-90";

        // create regular expression
        Pattern exp1 = Pattern.compile("M.*\\d{2}-\\d{2}-\\d{2}");
        Pattern exp2 = Pattern.compile("J.*\\d{2}-\\d{2}-\\d{2}");

        Matcher matcher1 = exp1.matcher(s);
        Matcher matcher2 = exp2.matcher(s);

        while (matcher1.find() && matcher2.find()) {
            System.out.println(matcher1.group());
            System.out.println(matcher2.group());
        }

    }

}
