package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Geeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Hello world");
       String input=JOptionPane.showInputDialog("What is your name");
       JOptionPane.showMessageDialog(null, "hello"+input);
	}

}
