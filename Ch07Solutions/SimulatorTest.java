package Ch07Solutions;

// Exercise 7.37 Solution: SimulatorTest.java
// Test application for class Simulator
public class SimulatorTest
{
   public static void main(String[] args)
   {
      Simulator simpletron = new Simulator();

      // initialize the registers
      simpletron.initializeRegisters();
      
      // prompt the user to enter instructions
      simpletron.printInstructions();
      simpletron.loadInstructions();
      
      // execute the program and print the memory dump when finished
      simpletron.execute();
      simpletron.dump();
   }    
} // end class SimulatorTest


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
