package Quiz0406;

public class Q16 {

    public static void main(String[] args) {
        System.out.println(mystery(8));
    }

    public static int mystery(int n) {

        if (n <= 1) {
            return 0;
        } else {
            return 1 + mystery(n / 2);
        }
    }

}
