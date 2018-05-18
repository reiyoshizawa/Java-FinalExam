package Ch07Solutions;// Exercise 7.15 Solution: InitArray.java
// Creating an array with size specified by the command-line argument.

public class InitArray 
{
   public static void main(String[] args) 
   {
      int[] array; // declare array
      int size = 10; // default size of the array

      // get size
      if (args.length == 1)
         size = Integer.parseInt(args[0]);

      array = new int[size]; // create array with specified size

      System.out.printf("%s%8s\n", "Index", "Value");

      // display array elements
      for (int count = 0; count < array.length; count++)
         System.out.printf("%5d%8d\n", count, array[count]);
   } 
} // end class InitArray


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
