import javax.swing.JOptionPane;

public class ErrorsEdit {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null,
				"Do you like coffee? \nYes or No:");
		if (answer.contains("no")) {
			JOptionPane.showMessageDialog(null,
					"Good, you're too young to drink coffee anyways!");
		} else if (answer.contains("yes"))
			;
		{
			JOptionPane.showMessageDialog(null, "Try Starbucks ><");
		}
		;
	}
}
