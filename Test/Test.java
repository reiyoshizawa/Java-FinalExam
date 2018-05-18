package Test;

import DiceRolling.Random;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        int i = 0, n = 10;

        for (i++; i < n; n--) {
            ++i;
        }

        // 1
        // 2 10
        // 3 9
        // 4 8
        // 5 7
        // 6 ここでループを外れる

        System.out.println(i);

        i = 1;
        int j = 0;
        j = ++i;

        System.out.println(i);
        System.out.println(j);


    }

    private int[][] mat = new int [5][5];

    public void mark(int loc, int val) {

        for (int k = 0; k < mat.length; k++) {

            mat[k][loc] = val;
            //  0  3    = 1;
            //  1  3    = 1;
            //  2  3    = 1;
            //  3  3    = 1;
            //  4  3    = 1;

            mat[loc][k] = val;
            //  3    0  = 1;
            //  3    1  = 1;
            //  3    2  = 1;
            //  3    3  = 1;
            //  3    4  = 1;

        }

    }


}
