package Ch07Solutions;// GCS Exercise 7.1 Part A Solution: DrawSpiral1.java
// Draws a square shaped spiral.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiral1 extends JPanel
{
   // draws a square shape that continually spirals outward
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      g.setColor(Color.RED); // draw a red spiral
      
      int oldX = getWidth() / 2; // starting X
      int oldY = getHeight() / 2; // starting Y
      
      int distance = 0; // distance to move

      // draws individual lines in to form a spiral
      for (int i = 0; i < 20; i++)
      {
         int newX = oldX; // new X position
         int newY = oldY; // new Y position
         
         if (i % 2 == 0) // increment the distance every other leg
            distance += 40; // sets the distance between lines
         
         // set the endpoint depending on the desired direction
         switch (i % 4)
         {
            case 0:
               newY += distance;
               break;               
            case 1:
               newX -= distance;
               break;               
            case 2:
               newY -= distance;
               break;               
            case 3:
               newX += distance;
               break;
         } 
         
         g.drawLine(oldX, oldY, newX, newY);
         oldX = newX; // replace the old position
         oldY = newY; // with the new position
      } 
   } 
} // end class DrawSpiral1


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

