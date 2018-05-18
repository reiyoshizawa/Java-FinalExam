package JavaSwing;

import javax.swing.*;

public class DialogBoxExample {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name");
        String message = String.format("Welcome back, %s! We know you love Java!", name);
        JOptionPane.showMessageDialog(null, message);

    }

}
