package Presentacion.Plataforma2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

import Negocio.Plataforma.CTRLPlataforma;

public class GUIPanelLogin extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Create the panel.
	 * @return 
	 */
	public GUIPanelLogin(CTRLPlataforma ctrl, GUIVentanaPlataforma principal) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		user = new JTextField("Usuario");
		user.setForeground(Color.GRAY);
		user.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pass);
		
		user.addFocusListener(new FocusAdapter() {
		    public void focusGained(FocusEvent e) {
		        JTextField source = (JTextField)e.getComponent();
		        source.setText("");
		        source.setForeground(Color.BLACK);
		        source.removeFocusListener(this);
		    }
		});
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton btnNewButton = new JButton("Login");
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ctrl.logueo(user.getText(), String.valueOf(pass.getPassword()))==true) {
					principal.logueado();
				}
			}
		});
		panel_1.add(btnNewButton);
		
		panel_1.add(btnNewButton_1);

	}

}
