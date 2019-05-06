package Presentación.Plataforma;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private String user;
	private char[] pass;
	private GUIMenuUser menuUser;
	private GUIMenuAdmin menuAdmin; 

	public GUILogin() {
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	
	private KeyListener kl = new KeyListener(){

		@Override
		public void keyPressed(KeyEvent e) {
		    int key = e.getKeyCode();
		    
			if (key == KeyEvent.VK_ENTER) 
				log();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			
			if (key == KeyEvent.VK_SPACE){
		    	errorSpace();
		    	passwordField.setText(null);
		    }
			
			else if (key == KeyEvent.VK_ESCAPE)
				System.exit(0);	
		}

		@Override
		public void keyTyped(KeyEvent e) {
			int key = e.getKeyCode();
			
		    if (key == KeyEvent.VK_SPACE) {
		    	passwordField.setText("");
		    	errorSpace();	
		    }
		}
	};
		
	public void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 310);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(111, 109, 43, 16);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(200, 106, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(kl);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 141, 116, 22);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		passwordField.addKeyListener(kl);

		JLabel lblContrasenia = new JLabel("Contrase\u00F1a");
		lblContrasenia.setBounds(89, 144, 65, 16);
		contentPane.add(lblContrasenia);

		JLabel lblNewLabel = new JLabel("ACCESO A TU CUENTA AVENGERIS");
		lblNewLabel
				.setIcon(new ImageIcon(
						"F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\login.png"));
		lblNewLabel.setBounds(30, 13, 390, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(248, 212, 77, 25);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				log();
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(337, 212, 83, 25);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				close();
			}
		});
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void clearData() {
		// TODO Apéndice de método generado automáticamente
		
	}
	
	public void close(){
		
		
	}
	private void log()
	{
		char[] passCheck = {'1', '2', '3', '4'};
		user = textField.getText();
		pass = passwordField.getPassword();
		
		if(user.equals("Admin") && Arrays.equals(passCheck, pass))
		{
			//conectar(userTxt, passTxt);
			this.menuAdmin = new GUIMenuAdmin();
			menuAdmin.setVisible(true);
			this.dispose();
		}
		else
		{
			this.error();
			textField.setText("");
			passwordField.setText("");
		}
	}
	private void errorSpace(){
		JOptionPane.showMessageDialog(this, "Error. No se admiten espacios en blanco.");
	}
	private void error(){
		JOptionPane.showMessageDialog(this, "Error. Usuario y/o password incorrectos.");
	}

}
