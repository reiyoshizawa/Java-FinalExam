package JavaSwing;

import javax.swing.*;

public class DrawPanelTest {

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame myApp = new JFrame();

        // set the frame to exit when it is closed
        myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myApp.add(panel);
        myApp.setSize(300, 300);
        myApp.setVisible(true);
    }

}
