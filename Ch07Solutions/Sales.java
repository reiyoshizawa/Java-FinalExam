package Ch07Solutions;// Exercise 7.10 Solution: Sales.java
// Program calculates the amount of pay for a salesperson and counts the 
// number of salespeople that earned salaries in given ranges.
import java.util.Scanner;

public class Sales
{
   // counts the number of people in given salary ranges
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int[] total = new int[9]; // totals for the various salaries

      // initialize the values in the array to zero
      for (int counter = 0; counter < total.length; counter++)
         total[counter] = 0;
      
      // read in values and assign them to the appropriate range
      System.out.print("Enter sales amount (negative to end): ");
      double dollars = input.nextDouble();

      while (dollars >= 0)
      {
         double salary = dollars * 0.09 + 200;
         int range = (int) (salary / 100);

         if (range > 10)
            range = 10;

         ++total[range - 2];
         
         System.out.print("Enter sales amount (negative to end): ");
         dollars = input.nextDouble();
      } 
      
      // print chart
      System.out.println("Range\t\tNumber");

      for (int range = 0; range < total.length - 1; range++)
         System.out.printf("$%d-$%d\t%d\n",
            (200 + 100 * range), (299 + 100 * range), total[range]);

      // special case for the last range
      System.out.printf("$1000 and over\t%d\n",
         total[total.length - 1]);
   } 
} // end class Sales



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
