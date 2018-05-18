package Ch07Solutions;// Exercise 7.14 Solution: VarargsTest.java
// Using variable-length argument lists.

public class VarargsTest
{
   // multiply numbers
   public static int product(int... numbers)
   {
      int product = 1;
      
      // process variable-length argument list
      for (int number : numbers)
         product *= number;

      return product;
   } 

   public static void main(String[] args) 
   {
      // values to multiply
      int a = 1;
      int b = 2;
      int c = 3;
      int d = 4;
      int e = 5;

      // display integer values
      System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %d%n%n",
         a, b, c, d, e); 

      // call product with different number of arguments in each call
      System.out.printf("The product of a and b is: %d%n", 
         product(a, b));
      System.out.printf("The product of a, b and c is: %d%n", 
         product(a, b, c));
      System.out.printf("The product of a, b, c and d is: %d%n",  
         product(a, b, c, d));
      System.out.printf("The product of a, b, c, d and e is: %d%n",
         product(a, b, c, d, e));
   } 
} // end class VarargsTest

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
