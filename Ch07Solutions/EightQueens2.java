package Ch07Solutions;// Exercise 7.25 Part B Solution: EightQueens2.java
// Uses an exhaustive technique to solve the eight queens problem
import java.util.Random;

public class EightQueens2 
{
   private static char[][] board = new char[8][8]; // chess board
   private static int queens; // number of queens placed

   // place queens on board
   public static void main(String[] args)
   {
      for (int firstQueenRow = 0; 
         firstQueenRow < board[0].length && queens < 8;
         firstQueenRow++)
      {
         for (int firstQueenCol = 0;
            firstQueenCol < board[0].length && queens < 8;
            firstQueenCol++)
         { 
            // reset the board
            board = new char[8][8];
            queens = 0;

            // place first queen at starting position
            board[firstQueenRow][firstQueenCol] = 'Q';
            xConflictSquares(firstQueenRow, firstQueenCol);
            ++queens;
            
            // remaining queens will be placed in board

            boolean done = false;   // indicates if all squares filled

            // try all possible locations on board
            for (int rowMove = 0;
               rowMove < board[0].length && !done; rowMove++)
            {
               for (int colMove = 0; 
                  colMove < board[0].length && !done; colMove++)
               {
                  // if valid move, place queen
                  // and mark off conflict squares
                  if (queenCheck(rowMove, colMove))
                  {
                     board[rowMove][colMove] = 'Q';
                     xConflictSquares(rowMove, colMove);
                     ++queens;
                  } 

                  // done when no more squares left
                  if (!availableSquare())
                     done = true;
               }  
            }  
         }  
      }  
      
      printBoard();
   }  
   
   // check for valid move
   public static boolean validMove(int row, int column)
   {
      return (row >= 0 && row < 8 && column >= 0 && column < 8);
   } 

   // check if any squares left
   public static boolean availableSquare()
   {
      for (int row = 0; row < board.length; row++)
         for (int col = 0; col < board[row].length; col++)
            if (board[row][col] == '\0')
               return true; // at least one available square

      return false; // no available squares

   } 

   // conflicting square marked with *
   public static void xConflictSquares(int row, int col)
   {
      for (int i = 0; i < 8; i++) {

         // place a '*' in the row occupied by the queen
         if (board[row][i] == '\0')
            board[row][i] = '*';

         // place a '*' in the col occupied by the queen
         if (board[i][col] == '\0')
            board[i][col] = '*';
      } 

      // place a '*' in the diagonals occupied by the queen
      xDiagonals(row, col);
   } 

   // check if queens can "attack" each other
   public static boolean queenCheck(int rowValue, int colValue)
   {
      int row = rowValue, column = colValue;

      // check row and column for a queen
      for (int position = 0; position < 8; position++)
         if (board[row][position] == 'Q' ||
            board[position][column] == 'Q')

            return false;

      // check upper left diagonal for a queen
      for (int square = 0; square < 8 &&
         validMove(--row, --column); square++)
         
         if (board[row][column] == 'Q')
            return false;

      row = rowValue;
      column = colValue;

      // check upper right diagonal for a queen
      for (int diagonal = 0; diagonal < 8 &&
         validMove(--row, ++column); diagonal++)

         if (board[row][column] == 'Q')
            return false;

      row = rowValue;
      column = colValue;

      // check lower left diagonal for a queen
      for (int diagonal = 0; diagonal < 8 &&
         validMove(++row, --column); diagonal++)

         if (board[row][column] == 'Q')
            return false;

      row = rowValue;
      column = colValue;

      // check lower right diagonal for a queen
      for (int diagonal = 0; diagonal < 8 &&
         validMove(++row, ++column); diagonal++)

         if (board[row][column] == 'Q')
            return false;

      return true;   // no queen in conflict
   }  

   // place * in diagonals of position in all 4 directions
   public static void xDiagonals(int rowValue, int colValue)
   {
      int row = rowValue, column = colValue;

      // upper left diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(--row, --column); diagonal++)
         board[row][column] = '*';

      row = rowValue;
      column = colValue;

      // upper right diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(--row, ++column); diagonal++)
         board[row][column] = '*';

      row = rowValue;
      column = colValue;

      // lower left diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(++row, --column); diagonal++)
         board[row][column] = '*';

      row = rowValue;
      column = colValue;

      // lower right diagonal
      for (int diagonal = 0; diagonal < 8 &&
         validMove(++row, ++column); diagonal++)
         board[row][column] = '*';
   } 
   
   // prints the chessboard
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
            System.out.printf("\t%c", board[row][column]);

         System.out.println();
      } 

      System.out.printf ("\n%d queens placed on the board.\n", queens);
   }    
} // end class EightQueens2


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
