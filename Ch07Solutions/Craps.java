package Ch07Solutions;// Exercise 7.18 Solution: Craps.java
// Program plays 1,000,000 games of craps and displays winning
// and losing statistics.
import java.util.Random;

public class Craps 
{
   // create random number generator for use in method rollDice
   private static final Random randomNumbers = new Random(); 

   // enumeration with constants that represent the game status
   private enum Status { CONTINUE, WON, LOST };

   private static int[] wins; // number of wins, by rolls
   private static int[] losses; // number of losses, by rolls
   private static int winSum = 0; // total number of wins
   private static int loseSum = 0; // total number of losses
   
   // plays one game of craps
   public static void main(String[] args)
   {
      int sumOfDice = 0; // sum of the dice
      int myPoint = 0; // point if no win or loss on first roll
      
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int roll; // number of rolls for the current game      

      wins = new int[22]; // frequency of wins
      losses = new int[22]; // frequency of losses

      for (int i = 1; i <= 1000000; i++)
      {
         sumOfDice = rollDice(); // first roll of the dice
         roll = 1;

         // determine game status and point based on sumOfDice
         switch (sumOfDice) 
         {
            case 7:  // win with 7 on first roll
            case 11: // win with 11 on first roll           
               gameStatus = Status.WON;
               break;
            case 2:  // lose with 2 on first roll
            case 3:  // lose with 3 on first roll
            case 12: // lose with 12 on first roll
               gameStatus = Status.LOST;
               break;
            default: // did not win or lose, so remember point         
               gameStatus = Status.CONTINUE; // game is not over
               myPoint = sumOfDice; // store the point
               break; // optional for default case at end of switch
         } 

         // while game is not complete ...
         while (gameStatus == Status.CONTINUE) 
         { 
            sumOfDice = rollDice(); // roll dice again
            roll++;

            // determine game status
            if (sumOfDice == myPoint) // win by making point
               gameStatus = Status.WON;
            else if (sumOfDice == 7) // lose by rolling 7 
               gameStatus = Status.LOST;
         }  
         
         // all roll results after 20th roll placed in last element
         if (roll > 21)
            roll = 21;
         
         // increment number of wins in that roll
         if (gameStatus == Status.WON)
         {
            ++wins[roll];
            ++winSum;
         } 
         else // increment number of losses in that roll
         {
            ++losses[roll];
            ++loseSum;
         } 
      } 
      
      printStats();
   } 

   // print win/loss statistics
   public static void printStats()
   {
      int totalGames = winSum + loseSum; // total number of games
      int length = 0; // total length of the games
      
      // display number of wins and losses on all rolls
      for (int i = 1; i <= 21; i++)
      {
         if (i == 21)
            System.out.printf("%d %s %d %s\n",
               wins[i], "games won and", losses[i],
               "games lost on rolls after the 20th roll");
         else
            System.out.printf("%d %s %d %s%d\n",
               wins[i], "games won and", losses[i],
               "games lost on roll #", i);

         // for calculating length of game
         // number of wins/losses on that roll multiplied
         // by the roll number, then add them to length
         length += wins[i] * i + losses[i] * i;
      } 

      // calculate chances of winning
      System.out.printf("\n%s %d / %d = %.2f%%\n",
         "The chances of winning are", winSum, totalGames,
         (100.0 * winSum / totalGames));


      System.out.printf("The average game length is %.2f rolls.\n",
         ((double) length / totalGames));
   }
   
   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6);  
      int die2 = 1 + randomNumbers.nextInt(6);  
      int sum = die1 + die2; // sum die values

      return sum; // return sum of dice
   } 
} // end class Craps


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
