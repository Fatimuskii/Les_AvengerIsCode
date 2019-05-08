/**
 * 
 */
package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIModificarUsuario extends JFrame{
	
	private JPanel contentPane;
	private GUIAltaUsuario GUI_AltaUsuario;
	private GUIDatosBancariosUsuario GUI_DatosBancariosUsuario;
	
	
	public void initGUI(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUIModificarUsuario.class.getResource("/logo.png")));
		setTitle("Modificar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Datos personales");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_AltaUsuario.setVisible(true);
			}
		});
		btnNewButton.setBounds(33, 154, 115, 23);
		panel.add(btnNewButton);
		
		JButton btnDatosBancarios = new JButton("Datos bancarios");
		btnDatosBancarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_DatosBancariosUsuario.setVisible(true);
			}
		});
		btnDatosBancarios.setBounds(272, 154, 115, 23);
		panel.add(btnDatosBancarios);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GUIModificarUsuario.class.getResource("/tools.png")));
		label.setBounds(145, 22, 123, 121);
		panel.add(label);
	}
}