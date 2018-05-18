package Ch07Solutions;// Exercise 7.29 Part A Solution: Series1.java
// Program calculates the Fibonacci series iteratively
import java.util.Scanner;

public class Series1
{
   // finds elements in the Fibonacci series
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter n: (n < 0 to exit): ");
      int element = input.nextInt();
      
      while (element >= 0)
      {
         int value = fibonacci(element);
         System.out.printf("Fibonacci number is ");
         System.out.println(value);
         System.out.print("Enter n: (n < 0 to exit): ");
         element = input.nextInt();
      } 
   } 

   // returns fibonacci number of nth element
   public static int fibonacci(int nElement)
   {
      int temp = 1; // number to be added
      int fibNumber = 0; // fibonacci number

      if (nElement == 1)
         return 0;

      // find nth element
      for (int n = 2; n <= nElement; n++)
      {
         int last = fibNumber;
         fibNumber += temp;

         temp = last;
      } 

      return fibNumber;
   } 
} // end class Series1


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
