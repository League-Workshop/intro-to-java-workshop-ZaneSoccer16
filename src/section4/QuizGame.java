package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String Input = JOptionPane.showInputDialog("What is the capital of California?");
		// 3. Use an if statement to check if their answer is correct
		if (Input.equals("Sacramento")) {
			JOptionPane.showMessageDialog(null, "You are Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String Input2 = JOptionPane.showInputDialog("What is 169-126");
		if (Input2.equals("43")) {
			JOptionPane.showMessageDialog(null, "You are Correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong");
		}
			String Input3 = JOptionPane.showInputDialog("What is 109+100?");
			if (Input3.equals("209")) {
				JOptionPane.showMessageDialog(null, "You are Correct");
				score++;
			} else {
				JOptionPane.showMessageDialog(null, "You are wrong");
				// 6. After all the questions have been asked, print the user's score

			}JOptionPane.showMessageDialog(null, "score: " + score);
		}
	
	
	}

