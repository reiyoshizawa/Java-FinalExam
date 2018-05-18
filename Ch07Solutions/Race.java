package Ch07Solutions;// Exercise 7.28 Solution: Race.java
// Program simulates the race between the tortoise and the hare
import java.util.Random;

public class Race
{
   private static final int RACE_END = 70;  // final position
   
   private static final Random randomNumbers = new Random();
   
   private static int tortoise; // toroise's position
   private static int hare; // hare's position
   private static int timer; // clock ticks elapsed

   // run the race
   public static void main(String[] args)
   {
      tortoise = 1;
      hare = 1;
      timer = 0;

      System.out.println("ON YOUR MARK, GET SET");
      System.out.println("BANG !!!!!");
      System.out.println("AND THEY'RE OFF !!!!!");

      while (tortoise < RACE_END && hare < RACE_END)
      {
         moveHare();
         moveTortoise();
         printCurrentPositions();

         // slow down race
         for (int temp = 0; temp < 100000000; temp++);

         ++timer;
      } 

      // tortoise beats hare or a tie
      if (tortoise >= hare)
         System.out.println("\nTORTOISE WINS!!! YAY!!!");
      // hare beat tortoise
      else
         System.out.println("\nHare wins. Yuch!");

      System.out.printf("TIME ELAPSED = %d seconds\n", timer);
   } 

   // move tortoise's position
   public static void moveTortoise()
   {
      // randomize move to choose
      int percent = 1 + randomNumbers.nextInt(10);

      // determine moves by percent in range in Fig 7.32
      // fast plod
      if (percent >= 1 && percent <= 5)
         tortoise += 3;
      // slip
      else if (percent == 6 || percent == 7)
         tortoise -= 6;
      // slow plod
      else
         ++tortoise;

      // ensure tortoise doesn't slip beyond start position
      if (tortoise < 1)
         tortoise = 1;

      // ensure tortoise doesn't pass the finish
      else if (tortoise > RACE_END)
         tortoise = RACE_END;
   } 

   // move hare's position
   public static void moveHare()
   {
      // randomize move to choose
      int percent = 1 + randomNumbers.nextInt(10);

      // determine moves by percent in range in Fig 7.32
      // big hop
      if (percent == 3 || percent == 4)
         hare += 9;
      // big slip
      else if (percent == 5)
         hare -= 12;
      // small hop
      else if (percent >= 6 && percent <= 8)
         ++hare;
      // small slip
      else if (percent > 8)
         hare -= 2;

      // ensure that hare doesn't slip beyond start position
      if (hare < 1)
         hare = 1;
      // ensure hare doesn't pass the finish
      else if (hare > RACE_END)
         hare = RACE_END;
   } 

   // display positions of tortoise and hare
   public static void printCurrentPositions()
   {
      // goes through all 70 squares, printing H
      // if hare on position and T for tortoise
      for (int count = 1; count <= RACE_END; count++)
         // tortoise and hare positions collide
         if (count == tortoise && count == hare)
            System.out.print("OUCH!!!");
         else if (count == hare)
            System.out.print("H");
         else if (count == tortoise)
            System.out.print("T");
         else
            System.out.print(" ");
      
      System.out.println();
   } 
} // end class Race


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
