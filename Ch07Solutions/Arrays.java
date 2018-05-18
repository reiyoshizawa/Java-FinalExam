package Ch07Solutions;

// Exercise 7.11 Solution: Arrays.java
public class Arrays
{   
   public static void main(String[] args)
   {
      int[] counts = new int[5];
      int[] bonus = new int[6];
      int[] bestScores = new int[11];
      
      // a)
      for (int u = 0; u < counts.length; u++)
         counts[u] = 0;
      
      // b)
      for (int v = 0; v < bonus.length; v++)
         bonus[v]++;
      
      // c)
      for (int w = 0; w < bestScores.length; w++)
         System.out.println(bestScores[w]);
   } 
} // end class Arrays


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