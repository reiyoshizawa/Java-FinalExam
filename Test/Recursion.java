package Test;

public class Recursion {

    public static void main(String[] args) {
        recursionMystery1(6,3);
    }

    public static void recursionMystery1(int x, int y) {
        if (y <= 0) {
            System.out.println("0 ");
        } else if (x > y) {
            System.out.println(x + " ");
            recursionMystery1(x - y, y);
        } else {
            recursionMystery1(x, y - x);
            System.out.println(y + " ");
        }
    }
}
