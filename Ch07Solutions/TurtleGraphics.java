package Ch07Solutions;// Exercise 7.21: TurtleGraphics.java
// Drawing turtle graphics based on turtle commands.
import java.util.Scanner;

public class TurtleGraphics
{
   private static final int MAXCOMMANDS = 100; // maximum size of command array
   private static final int SIZE = 20; // size of the drawing area

   private static int[][] floor; // array representing the floor
   private static int[][] commandArray; // list of commands

   private static int count; // the current number of commands
   private static int xPos; // the x Position of the turtle
   private static int yPos; // the y Position of the turtle

   // enters the commands for the turtle graphics
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      count = 0;
      commandArray = new int[MAXCOMMANDS][2];
      floor = new int[SIZE][SIZE];

      System.out.print("Enter command (9 to end input): ");
      int inputCommand = input.nextInt();

      while (inputCommand != 9 && count < MAXCOMMANDS)
      {
         commandArray[count][0] = inputCommand;

         // prompt for forward spaces
         if (inputCommand == 5)
         {
            System.out.print("Enter forward spaces: ");
            commandArray[count][1] = input.nextInt();
         } 

         count++;

         System.out.print("Enter command (9 to end input): ");
         inputCommand = input.nextInt();
      } 

      executeCommands();
   } 

   // executes the commands in the command array
   public static void executeCommands()
   {
      int commandNumber = 0; // the current position in the array
      int direction = 0; // the direction the turtle is facing
      int distance = 0; // the distance the turtle will travel
      int command; // the current command
      boolean penDown = false; // whether the pen is up or down
      xPos = 0;
      yPos = 0;

      command = commandArray[commandNumber][0];

      // continue executing commands until either reach the end
      // or reach the max commands
      while (commandNumber < count)
      {
         //System.out.println("Executing...");
         // determine what command was entered 
         // and perform desired action
         switch (command)
         {
            case 1: // pen down
               penDown = false;
               break;               
            case 2: // pen up
               penDown = true;
               break;               
            case 3: // turn right
               direction = turnRight(direction);
               break;               
            case 4: // turn left
               direction = turnLeft(direction);
               break;               
            case 5: // move
               distance = commandArray[commandNumber][1];
               movePen(penDown, floor, direction, distance);
               break;               
            case 6: // display the drawing
               System.out.println("\nThe drawing is:\n");
               printArray(floor);
               break;      
         }  
      
         command = commandArray[++commandNumber][0];
      }  
   } 

   // method to turn turtle to the right
   public static int turnRight(int d) 
   {
      return ++d > 3 ? 0 : d;
   } 

   // method to turn turtle to the left
   public static int turnLeft(int d) 
   {
      return --d < 0 ? 3 : d;
   } 

   // method to move the pen 
   public static void movePen(boolean down, int a[][], int dir, int dist)
   {
      int j; // looping variable

      // determine which way to move pen
      switch (dir)
      {
         case 0: // move to right
            for (j = 1; j <= dist && yPos + j < SIZE; ++j)
               if (down)
                  a[xPos][yPos + j] = 1;

            yPos += j - 1;
            break;

         case 1: // move down
            for (j = 1; j <= dist && xPos + j < SIZE; ++j)
               if (down)
                  a[xPos + j][yPos] = 1;
            
            xPos += j - 1;
            break;

         case 2: // move to left
            for (j = 1; j <= dist && yPos - j >= 0; ++j)
               if (down)
                  a[xPos][yPos - j] = 1;
            
            yPos -= j - 1;
            break;

         case 3: // move up
            for (j = 1; j <= dist && xPos - j >= 0; ++j)
               if (down)
                  a[xPos - j][yPos] = 1;
            
            xPos -= j - 1;
            break;   
      }
   } 

   // method to print array drawing
   public static void printArray(int[][] a)
   {
      // display array
      for (int i = 0; i < SIZE; ++i)
      {
         for (int j = 0; j < SIZE; ++j)
            System.out.print((a[i][j] == 1 ? "*" : " "));
      
         System.out.println();
      } 
   } 
} // end class TurtleGraphics


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
