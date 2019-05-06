package Presentación;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class GUIMensaje extends JDialog {
	
	public void showMessage(String message,String message2, boolean error) {
		if(!error){
			JOptionPane.showMessageDialog(new JFrame(),message	, message2, JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(new JFrame(),message	, message2, JOptionPane.ERROR_MESSAGE);
	}
}