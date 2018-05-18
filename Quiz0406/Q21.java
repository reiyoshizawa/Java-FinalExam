package Quiz0406;

public class Q21 {

    public static void main(String[] args) {
        Q21 a = new Q21();
        System.out.println(a.partialSum());
    }

    private int[] arr = {1, 4, 1, 3};

    public int[] partialSum() {
        int [] sum = new int [arr.length];
        for (int j = 0; j < sum.length; j++) {
            sum[j] = 0;
        }
//
//        for (int j = 0; j < arr.length; j++) {
//            sum[j] = sum[j - 1] + arr[j];
//        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k <= j; k++) {
                sum[j] = sum[j] + arr[k];
            }
        }

        return sum;

    }

}
