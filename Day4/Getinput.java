package Day4;

import java.util.Scanner;

public class Getinput {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scan = new Scanner(System.in);

        // Get nextline as String
        String firstLine = scan.nextLine();

        // Split the firstline into an array
        String[] arr = firstLine.split(" ");
        int id = Integer.valueOf(arr[0]); // first

        String name = arr[1]; // second
        System.out.println(id + ": " + name);

    }
}
