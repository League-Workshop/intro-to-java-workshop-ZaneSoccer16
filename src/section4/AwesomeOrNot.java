package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random Number = new Random();
int Num=Number.nextInt(4);
	// 3. Print out this variable
System.out.println(Num);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("Enter something which you think is awesome");	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!
if(Num==0) {
	JOptionPane.showMessageDialog(null, "Whatever you chose is AWESOME");
}

	// 6. If the random number is 1
if(Num==1) {
	JOptionPane.showMessageDialog(null, "Whatever you chose is OK");
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(Num==2) {
	JOptionPane.showMessageDialog(null, "Whatever you chose is BORING");
}

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(Num==3) {
	JOptionPane.showMessageDialog(null, "Whatever you chose is VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY VERY BORING");
}
	// -- write your own answer

}


}