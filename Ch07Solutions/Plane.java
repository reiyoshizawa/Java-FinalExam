package Ch07Solutions;// Exercise 7.19 Solution: Plane.java
// Program reserves airline seats.
import java.util.Scanner;

public class Plane
{
   // checks customers in and assigns them a boarding pass
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      boolean[] seats = new boolean[10]; // array of seats
      int firstClass = 0; // next available first class seat
      int economy = 5; // next available economy seat      
      
      while ((firstClass < 5) || (economy < 10))
      {
         System.out.println("Please type 1 for First Class");
         System.out.println("Please type 2 for Economy");
         System.out.print("choice: ");
         int section = input.nextInt();
      
         if (section == 1) // user chose first class
         {
            if (firstClass < 5)
            {
               firstClass++;
               System.out.printf("First Class. Seat #%d\n", firstClass);
            }  
            else if (economy < 10) // first class is full
            {
               System.out.println(
                  "First Class is full, Economy Class?");
               System.out.print("1. Yes, 2. No. Your choice: ");
               int choice = input.nextInt();

               if (choice == 1)
               {
                  economy++;
                  System.out.printf("Economy Class. Seat #%d\n",
                     economy);
               }
               else
                  System.out.println("Next flight leaves in 3 hours.");
            } 
         } 
         else if (section == 2) // user chose economy
         {
            if (economy < 10) 
            {
               economy++;
               System.out.printf("Economy Class. Seat #%d\n", economy);
            }  
            else if (firstClass < 5) // economy class is full
            {
               System.out.println(
                  "Economy Class is full, First Class?");
               System.out.print("1. Yes, 2. No. Your choice: ");
               int choice = input.nextInt();

               if (choice == 1)
               {
                  firstClass++;
                  System.out.printf("First Class. Seat #%d\n",
                     firstClass);
               } 
               else
                  System.out.println("Next flight leaves in 3 hours.");
            } 
         } 
         
         System.out.println();
      } 
      
      System.out.println("The plane is now full.");      
   } 
} // end class Plane


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
