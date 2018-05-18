package Ch07Solutions;// GCS Exercise 7.1 Part B Solution: DrawSpiral2.java
// Draws a circular spiral.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiral2 extends JPanel
{
   // draws a shape that continually spirals outward
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      g.setColor(Color.BLUE); // set drawing color to blue
      
      int x = getWidth() / 2; // starting x coordinate 
      int y = getHeight() / 2; // starting y coordinate 
      
      int radiusStep = 20; // distance the radius changes
      int diameter = 0; // diameter of the arc

      int arc = 180; // amount and direction of arc to sweep
      
      // draws individual arcs to form a spiral
      for (int i = 0; i < 20; i++)
      {
         if (i % 2 == 1) // move the x position every other repetition
            x -= 2 * radiusStep;
         
         y -= radiusStep; // move the y position
         
         diameter += 2 * radiusStep; // increase the diameter
         
         g.drawArc(x, y, diameter, diameter, 0, arc); // draw the arc
         
         arc = -arc; // reverse the direction of the arc
      } 
   } 
} // end class DrawSpiral2


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

