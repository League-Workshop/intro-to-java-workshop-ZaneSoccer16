package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		System.out.println("Hello");
		JOptionPane.showMessageDialog(null, "Hello");
		String name="Zane";
		JOptionPane.showMessageDialog(null, "Hi "+name);
	}

}
