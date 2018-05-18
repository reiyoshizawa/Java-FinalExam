package Ch07Solutions;// Exercise 7.12 Solution: Unique.java
// Reads in 5 unique numbers.
import java.util.Scanner;

public class Unique
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int[] numbers = new int[5]; // list of unique numbers
      int count = 0; // number of uniques read
      
      while(count < numbers.length)
      {
         System.out.print("Enter number: ");
         int number = input.nextInt();
         
         // validate the input
         if (10 <= number && number <= 100)
         {
            // flags whether this number already exists
            boolean containsNumber = false;
            
            // compare input number to unique numbers in array
            for (int i = 0; i < count; i++)
               // if new number is duplicate, set the flag
               if (number == numbers[i])
                  containsNumber = true;
            
            // add only if the number is not there already
            if (!containsNumber)
            {
               numbers[count] = number;
               count++;
            } 
            else 
               System.out.printf("%d has already been entered\n",
                  number);
         } 
         else
            System.out.println("number must be between 10 and 100");
         
         // print the list
         for (int i = 0; i < count; i++)
            System.out.printf("%d ", numbers[i]);
         System.out.println();
      }       
   } 
} // end class Unique



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
