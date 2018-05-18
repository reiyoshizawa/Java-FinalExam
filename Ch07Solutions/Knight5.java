package Ch07Solutions;// Exercise 7.23 Part B Solution: Knight5.java
// Knights tour program - Brute Force Approach. Use random
// number generation to traverse the board. (1000 tours)
import java.util.Random;

public class Knight5
{
   private static final Random randomNumbers = new Random();
   
   private static int[][] board = new int[8][8]; // gameboard
   
   // moves
   private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
   private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

   private static int[] moveTotals = new int[65]; // total number of tours per move
   
   // runs a tour
   public static void main(String[] args)
   {
      int currentRow; // the row position on the chessboard
      int currentColumn; // the column position on the chessboard

      int testRow; // row position of next possible move
      int testColumn; // column position of next possible move
      
      for (int k = 0; k < 1000; k++)
      {
         clearBoard();
         int moveNumber = 0; // the current move number

         // randomize initial board position
         currentRow = randomNumbers.nextInt(8);
         currentColumn = randomNumbers.nextInt(8);

         board[currentRow][currentColumn] = ++moveNumber;      
         boolean done = false;

         // continue until knight can no longer move
         while (!done)
         {
            boolean goodMove = false;

            int moveType = randomNumbers.nextInt(8);

            // check all possible moves until we find one that's legal
            for (int count = 0; count < 8 && !goodMove; count++)
            {
               testRow = currentRow + vertical[moveType];
               testColumn = currentColumn + horizontal[moveType];
               goodMove = validMove(testRow, testColumn);

               // test if new move is valid
               if (goodMove)
               {
                  currentRow = testRow;
                  currentColumn = testColumn;
                  board[currentRow][currentColumn] = ++moveNumber;
               } 

               moveType = (moveType + 1) % 8;
            } 

            // if no valid moves, knight can no longer move
            if (!goodMove)
               done = true;
            // if 64 moves have been made, a full tour is complete
            else if (moveNumber == 64)
               done = true;
         } 
         
         ++moveTotals[moveNumber]; // update the statistics         
      } 

      printResults();
   } 

   // checks for valid move
   public static boolean validMove(int row, int column)
   {
      // returns false if the move is off the chessboard, or if
      // the knight has already visited that position
      // NOTE: This test stops as soon as it becomes false
      return (row >= 0 && row < 8 && column >= 0 && column < 8
         && board[row][column] == 0);
   } 

   // display results on applet window
   public static void printResults()
   {
      System.out.print("# tours having # moves  ");
      System.out.print("# tours having # moves\n\n");

      // display results in tabulated columns
      for (int row = 1; row < 33; row++)
      {
         System.out.printf("%-15d%-9d%-15d%d\n", moveTotals[row], row,
            moveTotals[row + 32], (row + 32));
      } 
   } 
   
   // resets board
   public static void clearBoard()
   {
      for (int j = 0; j < board.length; j++)
         for (int k = 0; k < board[j].length; k++)
            board[j][k] = 0;
   } 
} // end class Knight5


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
