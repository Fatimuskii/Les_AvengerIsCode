/**
 * 
 */
package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Integración.Usuario.DAOUsuarioImp;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIAccesoUsuario extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField nombre;

	
	public GUIAccesoUsuario() {
		super();
		this.contentPane = new JPanel();
		this.passwordField = new JPasswordField();
		this.nombre = new JTextField();

		initGUI();
	}

	public void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logo.png"));
		setTitle("Acceso Usuario");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(153, 148, 135, 20);
		panel.add(passwordField);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContrasea.setBounds(70, 151, 67, 14);
		panel.add(lblContrasea);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuario.setBounds(70, 113, 46, 14);
		panel.add(lblUsuario);

		nombre = new JTextField();
		nombre.setBounds(153, 110, 135, 20);
		panel.add(nombre);
		nombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\logo.png"));
		lblNewLabel.setBounds(173, 11, 94, 83);
		panel.add(lblNewLabel);

		JButton btnLogin = new JButton("Iniciar sesi\u00F3n");
		btnLogin.setBounds(153, 197, 135, 23);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Controlador.getInstance().accion(Events.ACCESO_USUARIO, nombre.getText());
			}
		});
		panel.add(btnLogin);
	}

	public void update(int events, Object res) {
		switch (events) {
		case Events.ACCESO_USUARIO_OK:
			JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
			dispose();
			break;
		case Events.ACCESO_USUARIO_KO:
			JOptionPane.showMessageDialog(null, "Error en el acceso",
					"Error Acceso", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
	
}