package Ch07Solutions;

// Exercise 7.27 Solution: Sieve.java
// Sieve of Eratosthenes
public class Sieve
{
   public static void main(String[] args)
   {
      int count = 0; // the number of primes found

      boolean[] primes = new boolean[1000]; // array of primes

      // initialize all array values to true
      for (int index = 0; index < primes.length; index++)
         primes[index] = true;

      // starting at the third value, cycle through the array and put 0 
      // as the value of any greater number that is a multiple
      for (int i = 2; i < primes.length; i++)
         if (primes[i])
         {
            for (int j = i + i; j < primes.length; j += i)
               primes[j] = false;
         } 

      // cycle through the array one last time to print all primes
      for (int index = 2; index < primes.length; index++)
         if (primes[index])
         {
            System.out.printf("%d is prime.\n", index);
            ++count;
         } 

      System.out.printf("\n%d primes found.\n", count);
   } 
} // end class Sieve



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
