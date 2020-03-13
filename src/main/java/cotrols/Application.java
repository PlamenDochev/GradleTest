package cotrols;

import sun.rmi.runtime.Log;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        Login loginForm = new Login();

        JFrame frame = new JFrame("Test gradle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        frame.setContentPane(loginForm.loginPanel);
        System.out.println("Hello mada faka");
    }
}
