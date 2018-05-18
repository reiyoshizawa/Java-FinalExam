package Ch07Solutions;// Exercise 7.24 Solution: EightQueens.java
// EightQueens - heuristic version
import java.util.Random;

public class EightQueens
{
   private static final Random randomNumbers = new Random();
   
   private static boolean[][] board; // gameboard

   // accessibility values for each board position
   private static int[][] access = 
      {{22, 22, 22, 22, 22, 22, 22, 22},
       {22, 24, 24, 24, 24, 24, 24, 22},
       {22, 24, 26, 26, 26, 26, 24, 22},
       {22, 24, 26, 28, 28, 26, 24, 22},
       {22, 24, 26, 28, 28, 26, 24, 22},
       {22, 24, 26, 26, 26, 26, 24, 22},
       {22, 24, 24, 24, 24, 24, 24, 22},
       {22, 22, 22, 22, 22, 22, 22, 22}};
   private static int maxAccess = 99; // dummy value to indicate a queen has been placed

   private static int queens; // number of queens placed on the board

   // attempts to place eight queens on a chessboard
   public static void main(String[] args)
   {
      int currentRow; // the row position on the chessboard
      int currentColumn; // the column position on the chessboard
      
      board = new boolean[8][8];

      // initialize board to false
      for (int i = 0; i < board.length; i++)
      {
         for (int j = 0; j < board[i].length; j++)
            board[i][j] = false;
      } 

      // randomize initial first queen position
      currentRow = randomNumbers.nextInt(8);
      currentColumn = randomNumbers.nextInt(8);

      board[currentRow][currentColumn] = true;
      ++queens;

      updateAccess(currentRow, currentColumn); // update access

      boolean done = false;

      // continue until finished traversing
      while (!done)
      {
         // the current lowest access number
         int accessNumber = maxAccess;

         // find square with the smallest elimination number
         for (int row = 0; row < board.length; row++)
         {
            for (int col = 0; col < board.length; col++)
            {
               // obtain access number
               if (access[row][col] < accessNumber)
               {
                  accessNumber = access[row][col];
                  currentRow = row;
                  currentColumn = col;
               } 
            } 
         }

         // traversing done
         if (accessNumber == maxAccess)
            done = true;
         // mark the current location
         else
         {
            board[currentRow][currentColumn] = true;
            updateAccess(currentRow, currentColumn);
            queens++;
         } 
      } 

      printBoard();
   } 

   // update access array
   public static void updateAccess(int row, int column)
   {
      for (int i = 0; i < 8; i++)
      {
         // set elimination numbers to 99
         // in the row occupied by the queen
         access[row][i] = maxAccess;

         // set elimination numbers to 99
         // in the column occupied by the queen
         access[i][column] = maxAccess;
      } 

      // set elimination numbers to 99 in diagonals occupied by the queen
      updateDiagonals(row, column);
   } 

   // place 99 in diagonals of position in all 4 directions
   public static void updateDiagonals(int rowValue, int colValue)
   {
      int row = rowValue; // row postion to be updated
      int column = colValue; // column position to tbe updated

      // upper left diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(--row, --column); diagonal++)
         access[row][column] = maxAccess;

      row = rowValue;
      column = colValue;

      // upper right diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(--row, ++column); diagonal++)
         access[row][column] = maxAccess;

      row = rowValue;
      column = colValue;

      // lower left diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(++row, --column); diagonal++)
         access[row][column] = maxAccess;

      row = rowValue;
      column = colValue;

      // lower right diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(++row, ++column); diagonal++)
         access[row][column] = maxAccess;
   } 

   // check for valid move
   public static boolean validMove(int row, int column)
   {
      return (row >= 0 && row < 8 && column >= 0 && column < 8);
   } 

   // display the board
   public static void printBoard()
   {
      // display numbers for column
      for (int k = 0; k < 8; k++)
         System.out.printf("\t%d", k);

      System.out.print("\n\n");
      
      for (int row = 0; row < board.length; row++)
      {
         System.out.print (row);
         
         for (int column = 0; column < board[row].length; column++)
         {
            System.out.print("\t");
            
            if (board[row][column])
               System.out.print("Q");
            else
               System.out.print(".");
         } 

         System.out.println();
      } 

      System.out.printf ("\n%d queens placed on the board.\n", queens);
   } 
} // end class EightQueens


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
