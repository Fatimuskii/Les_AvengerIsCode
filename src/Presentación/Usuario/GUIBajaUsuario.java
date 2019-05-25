/**
 * 
 */
package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIBajaUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JPasswordField passwordField;
	private int id;

	public GUIBajaUsuario() {
		super();
		this.contentPane = new JPanel();
		initGUI();
	}

	public void initGUI() {
		setTitle("Baja Usuario");
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logo.png"));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\log2.png"));
		lblNewLabel.setBounds(169, 11, 94, 86);
		panel.add(lblNewLabel);

		JLabel lblEmail = new JLabel("ID");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(62, 120, 46, 14);
		panel.add(lblEmail);

		textId = new JTextField();
		textId.setBounds(135, 117, 162, 20);
		panel.add(textId);
		textId.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 150, 162, 20);
		panel.add(passwordField);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContrasea.setBounds(62, 153, 73, 14);
		panel.add(lblContrasea);

		JButton btnConfirmarBaja = new JButton("Confirmar baja");
		btnConfirmarBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = Integer.parseInt(textId.getText());
				JOptionPane.showOptionDialog(new JFrame(), "¿Estás seguro?",
						"Quit", JOptionPane.YES_NO_OPTION,
						JOptionPane.YES_NO_OPTION, null, null, null );
				if(true) Controlador.getInstance().accion(Events.BAJA_USUARIO, id);
				else dispose();
			}
		});
		btnConfirmarBaja.setBounds(152, 196, 123, 23);
		panel.add(btnConfirmarBaja);
	}

	public void update(int event, Object res) {
		switch (event) {
		case Events.BAJA_USUARIO_OK:
			JOptionPane.showMessageDialog(null,
					"Eliminado correctamente el usuario : " + id, "",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case Events.BAJA_USUARIO_KO:
			JOptionPane.showMessageDialog(null,
					"Error al eliminar el usuario: " + id, "",
					JOptionPane.ERROR_MESSAGE);
			break;
		}

	}

}