package Ch07Solutions;// Exercise 7.17 Solution: Roll36.java
// Program simulates rolling two six-sided dice 36,000,000 times.
import java.util.Random;

public class Roll36
{
   // simulate rolling of dice 36000 times
   public static void main(String[] args)
   {
      Random randomNumbers = new Random();
      
      int face1; // number on first die
      int face2; // number on second die
      int[] totals = new int[13]; // frequencies of the sums

      // initialize totals to zero
      for (int index = 0; index < totals.length; index++)
         totals[index] = 0;

      // roll the dice
      for (int roll = 1; roll <= 36000000; roll++) {
         face1 = 1 + randomNumbers.nextInt(6);
         face2 = 1 + randomNumbers.nextInt(6);
         totals[face1 + face2]++;
      } 

      // print the table
      System.out.printf("%3s%12s%12s\n",
         "Sum", "Frequency", "Percentage");

      // ignore subscripts 0 and 1
      for (int k = 2; k < totals.length; k++)
      {
         int percent = totals[k] / (360000);
         System.out.printf("%3d%12d%12d\n", k, totals[k], percent);
      } 
   } 
} // end class Roll36



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
