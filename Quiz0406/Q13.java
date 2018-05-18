package Quiz0406;

public class Q13 {

    public static void main(String[] args) {

        mystery(1234);

    }

    public static void mystery(int x) {

        System.out.println(x % 10);

        if ((x / 10) != 0) {
            mystery(x / 10);
        }
        System.out.println( x % 10);

    }

}
