package Ch07Solutions;// Exercise 7.20 Solution: Sales2.java
// Program totals sales for salespeople and products.
import java.util.Scanner;

public class Sales2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      // sales array holds data on number of each product sold
      // by each salesperson
      double[][] sales = new double[5][4];

      System.out.print("Enter salesperson number (-1 to end): ");
      int person = input.nextInt();

      while (person != -1)
      {
         System.out.print("Enter product number: ");
         int product = input.nextInt();
         System.out.print("Enter sales amount: ");
         double amount = input.nextDouble();

         // error-check the input
         if (person >= 1 && person < 5 &&
               product >= 1 && product < 6 && amount >= 0)
            sales[product - 1][person - 1] += amount;
         else
            System.out.println("Invalid input!");
         
         System.out.print("Enter salesperson number (-1 to end): ");
         person = input.nextInt();
      } 

      // total for each salesperson
      double[] salesPersonTotal = new double[4];

      // display the table      
      for (int column = 0; column < 4; column++)
         salesPersonTotal[column] = 0;

      System.out.printf("%8s%14s%14s%14s%14s%10s\n",
            "Product", "Salesperson 1", "Salesperson 2",
            "Salesperson 3", "Salesperson 4", "Total");

      // for each column of each row, print the appropriate
      // value representing a person's sales of a product
      for (int row = 0; row < 5; row++)
      {
         double productTotal = 0.0;
         System.out.printf("%8d", (row + 1));

         for (int column = 0; column < 4; column++) {
            System.out.printf("%14.2f", sales[row][column]);
            productTotal += sales[row][column];
            salesPersonTotal[column] += sales[row][column];
         } 

         System.out.printf("%10.2f\n", productTotal);
      } 

      System.out.printf("%8s", "Total");

      for (int column = 0; column < 4; column++)
         System.out.printf("%14.2f", salesPersonTotal[column]);
      
      System.out.println();
   } 
} // end class Sales2



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
