package TextBook;

public class Text231 {

    public static void main(String[] args) {
        tableFormat();
    }

    public static void tableFormat() {

        System.out.printf("%-7s %-7s %-7s%n", "number", "square", "cube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-7s %-7s %-7s%n", i , i * i , i * i * i);
        }

    }

}
