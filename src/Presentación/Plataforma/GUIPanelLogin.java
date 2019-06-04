package Presentación.Plataforma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

import Negocio.Plataforma.SAPlataforma;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;
import Presentación.Usuario.GUIUsuario;

public class GUIPanelLogin extends JPanel implements GUIEventoPlataforma {
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
	public GUIPanelLogin( final GUIVentanaPlataforma principal) {
		init();
	}
	
	public void init() {
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
				if(user.getText()!="" && String.copyValueOf(pass.getPassword())!="")
					try{
						Controlador.getInstance().accion(Events.ACCESO_USUARIO, new TUsuario(Integer.parseInt(user.getText()), "","","", "", null, String.copyValueOf(pass.getPassword()), "", "", null, true));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "El usuario debe ser un número", "Error login", JOptionPane.INFORMATION_MESSAGE);
					}
			}
		});
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_1.add(btnNewButton);
		
		panel_1.add(btnNewButton_1);
	}

	@Override
	public void update(int evento, Object objeto) {
		// TODO Auto-generated method stub
		
	}

}
