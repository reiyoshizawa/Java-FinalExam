package Etc;

import java.util.Scanner;

/**
 * Created by Derrick on 2018-04-11.
 */
public class Pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String nospace = sentence.toLowerCase().replace(" ", "");

        if (nospace.length() < 26) {
            System.out.println("not pangram");
            return;
        }

        // Bianca
        String[] alpha = {"a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int count = 0;
        for(int i = 0; i < nospace.length(); i++){
            if (nospace.contains(alpha[i])) {
                count += 1;
            }
        }
        if (count == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }

        // Derrick
//        char[] characters = nospace.toCharArray(); // "abc" -> {'a', 'b', 'c'}
//        boolean[] appeared = new boolean[26];
//        for(int i = 0; i < appeared.length; i++) {
//            appeared[i] = false;
//        }
//
//
//        for(int i = 0; i < characters.length; i++) {
//            int index = characters[i] - 'a';
//            appeared[index] = true;
//        }
//
//        for(int i = 0; i < appeared.length; i++) {
//            if (!appeared[i]) {
//                System.out.println("not pangram");
//                return;
//            }
//        }
//        System.out.println("pangram");


    }
}