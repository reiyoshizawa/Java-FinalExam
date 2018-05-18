package Day5;

import Day3.Die;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]); // last element

        int[] arr2 = new int[5]; // num of elements (size)
        // {0, 0 , 0, 0, 0}
        System.out.println(arr2[0]);
        arr2[0] = 7;

        Die[] arr3 = new Die[2]; // alt + return : import (shortcut)
        // {null, null}
        // arr3[0].roll(); NullPointerException
        arr3[0] = new Die();
        arr3[1] = new Die();

        arr3[0].roll();
        System.out.println(arr3[0]);
        arr3[0].roll();
        System.out.println(arr3[1]);
        // what if I want to roll every die in my arr.
        // loop
        for (int i = 0; i < arr3.length; i++) {
            arr3[i].roll();
            System.out.println(arr3[i]);
        }
        // loop (for each loop)
        for (Die elem: arr3) {
            elem.roll();
            System.out.println(elem);
        }

        System.out.println(Arrays.toString(arr3));

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
    }
}
