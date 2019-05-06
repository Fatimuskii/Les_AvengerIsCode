package Presentación.Plataforma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class GUIPlataformaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField pass;

	public GUIPlataformaLogin() {
		super();
		initGUI();
	}

	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setBounds(332, 215, 59, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);

		user = new JTextField();
		user.setBounds(138, 85, 116, 22);
		contentPane.add(user);
		user.setColumns(10);

		pass = new JTextField();
		pass.setBounds(138, 128, 116, 22);
		contentPane.add(pass);
		pass.setColumns(10);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(49, 88, 77, 16);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(49, 131, 77, 16);
		contentPane.add(lblContrasea);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel
				.setIcon(new ImageIcon(
						"F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\login.png"));
		lblNewLabel.setBounds(301, 87, 90, 60);
		contentPane.add(lblNewLabel);

		JRadioButton soyAdmin = new JRadioButton("Soy Admin");
		soyAdmin.setBounds(175, 176, 127, 25);
		contentPane.add(soyAdmin);
	}

}
