package Ch07Solutions;// Exercise 7.23 Part A Solution: Knight4.java
// Knights tour - Brute Force Approach. Uses random number
// generation to move around the board.
import java.util.Random;

public class Knight4
{
   private static final Random randomNumbers = new Random();
   
   private static int[][] board; // gameboard
   
   // moves
   private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
   private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

   // runs a tour
   public static void main(String[] args)
   {
      int currentRow; // the row position on the chessboard
      int currentColumn; // the column position on the chessboard
      int moveNumber = 0; // the current move number

      board = new int[8][8]; // gameboard

      int testRow; // row position of next possible move
      int testColumn; // column position of next possible move
      
      // randomize initial board position
      currentRow = randomNumbers.nextInt(8);
      currentColumn = randomNumbers.nextInt(8);

      board[currentRow][currentColumn] = ++moveNumber;      
      boolean done = false;

      // continue until knight can no longer move
      while (!done)
      {
         boolean goodMove = false;
         
         // start with a random move
         int moveType = randomNumbers.nextInt(8);
         
         // check all possible moves until we find one that's legal
         for (int count = 0; count < 8 && !goodMove;
            count++)
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

      System.out.printf("The tour ended with %d moves.\n", moveNumber);

      if (moveNumber == 64)
         System.out.println("This was a full tour!");
      else
         System.out.println("This was not a full tour.");

      printTour();
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

   // display Knight's tour path
   public static void printTour()
   {
      // display numbers for column
      for (int k = 0; k < 8; k++)
         System.out.printf("\t%d", k);

      System.out.print("\n\n");

      for (int row = 0; row < board.length; row++)
      {
         System.out.print (row);

         for (int column = 0; column < board[row].length; column++)
            System.out.printf("\t%d", board[row][column]);

         System.out.println();
      } 
   } 
} // end class Knight4


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
