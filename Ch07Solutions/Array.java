// Exercise 7.9 Solution: Array.java
import java.util.Scanner;

public class Array
{   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // a)
      int[][] t = new int[2][3];
      
      // g)
      t[0][1] = 0;
      
      // h)
      t[0][0] = 0;
      t[0][1] = 0;
      t[0][2] = 0;
      t[1][0] = 0;
      t[1][1] = 0;
      t[1][2] = 0;
      
      // i)
      for (int j = 0; j < t.length; j++)
	   for (int k = 0; k < t[j].length; k++)
	      t[j][k] = 0;
      
      // j)
      for (int j = 0; j < t.length; j++)
	   for (int k = 0; k < t[j].length; k++)
	      t[j][k] = input.nextInt();
      
      // k)
      int small = t[0][0];

      for (int j = 0; j < t.length; j++)
         for (int k = 0; k < t[j].length; k++)
            if (t[j][k] < small)
               small = t[j][k];

      System.out.println(small);
      
      // l)
      System.out.printf(
         "%d %d %d\n", t[0][0], t[0][1], t[0][2]);
      
      // m
      int total = t[0][2] + t[1][2];
      
      // n
      System.out.println("\t0\t1\t2\n");
      for (int e = 0; e < t.length; e++)
      {
         System.out.print(e);

         for (int r = 0; r < t[e].length; r++)
            System.out.printf("\t%d", t[e][r]);

         System.out.println();
      } 
   } 
} // end class Array


/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/