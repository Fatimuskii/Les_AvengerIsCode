/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
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

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */


/**
 * Launch the application.
 */
@SuppressWarnings("serial")
public class GUIBajaImpresora extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	
	public GUIBajaImpresora() {
		super();
		this.contentPane = new JPanel();
		this.textField = new JTextField();
		this.passwordField = new JPasswordField();
		initGUI();
	}

	/**
	 * Create the frame.
	 */
	public void initGUI() {
		setTitle("Baja Impresora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\3d-printer.png"));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEmail = new JLabel("IdUsuario");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(52, 120, 63, 14);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(135, 117, 162, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContrasea.setBounds(52, 153, 73, 14);
		panel.add(lblContrasea);
		
		JButton btnConfirmarBaja = new JButton("Confirmar baja");
		btnConfirmarBaja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showOptionDialog(new JFrame(), "¿Estás seguro?" , "Quit",
						JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, null, null, null);
			}
		});
		btnConfirmarBaja.setBounds(152, 196, 123, 23);
		panel.add(btnConfirmarBaja);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 150, 162, 20);
		panel.add(passwordField);
		
		JLabel lblIdimpresora = new JLabel("IdImpresora");
		lblIdimpresora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdimpresora.setBounds(52, 86, 73, 14);
		panel.add(lblIdimpresora);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 83, 162, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setIcon(new ImageIcon("imagenes\\3d-printer-REDM.png"));
		lblNewLabel.setBounds(187, 11, 73, 69);
		panel.add(lblNewLabel);
	}
}