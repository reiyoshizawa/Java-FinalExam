package Ch07Solutions;// GCS Exercise 7.1 Part B Solution: DrawSpiral2Test.java
// Test application to display class DrawSpiral2.
import javax.swing.JFrame;

public class DrawSpiral2Test
{
   public static void main(String[] args)
   {
      DrawSpiral2 panel = new DrawSpiral2();      
      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(300, 300);
      application.setVisible(true);
   } 
} // end class DrawSpiralTest2


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

