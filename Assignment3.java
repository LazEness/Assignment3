/**
 * Author: Eli Brennan
 * Class: CSC 200
 * Date: 10/6/2015
 */
import javax.swing.JOptionPane;
public class Assignment3 {
	public enum AccountTypes {
		Admin, Student, Staff 
	}	
	
	public static void main(String[] args) {
		//Declaring the limit at 3 to compare with the attempts the user takes and initializing the attempts at 0.
		final int limit = 3;
		int attempts = 0;
		String username = "", realUsername = "LazEness", password = "", realPassword = "Qwerty";
		AccountTypes realAccount = AccountTypes.Admin;
		while ((attempts < limit) && (!username.equals(realUsername)) )	{
			username = JOptionPane.showInputDialog(null, "Please Enter a Username");
			if (!username.equals(realUsername)) {
					attempts = attempts + 1;
					JOptionPane.showMessageDialog(null, "Invalid Username.");
			}
		}
		while ((attempts < limit) && (!password.equals(realPassword)) ){
			password = JOptionPane.showInputDialog(null, "Please Enter a Password");
			if (!password.equals(realPassword)) {
				attempts = attempts + 1;
			}
		}
		if ((attempts < limit) && (password.equals(realPassword)) && (username.equals(realUsername)) ){
			JOptionPane.showMessageDialog(null, "Welcome " + realUsername);
			AccountTypes[] choices = { AccountTypes.Admin, AccountTypes.Staff, AccountTypes.Student};
			AccountTypes input = null;
			while (!(input == realAccount)){
					input = (AccountTypes) JOptionPane.showInputDialog(
				 					null, "Select an Account Type from the list...", "Account Type",
				 					JOptionPane.QUESTION_MESSAGE, null, choices, 
				 					choices[0]);
					if (!(input == (realAccount))) {
						JOptionPane.showMessageDialog(null, "Wrong Account type.");
					
					}
				}
					switch (input) {
					case Staff: JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
							break;
					case Admin: JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
							break;
					case Student: JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
							break;
							
			
				}
		}
		if ((!password.equals(realPassword)) || (!username.equals(realUsername))) { 
			JOptionPane.showMessageDialog(null, "Contact Administrator");
		}
		
	}
}

	

	
