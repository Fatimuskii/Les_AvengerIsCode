package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Presentación.Impresora.GUIImpresoraImp;

public class GUIPerfilUsuario extends JFrame {

	private JPanel contentPane;
	private GUIImpresoraImp GUI_ImpresoraImp;
	private JTextField textField;
	
	public GUIPerfilUsuario() throws HeadlessException {
		super();
		this.contentPane = new JPanel();
		this.GUI_ImpresoraImp = new GUIImpresoraImp();
		initGUI();
	}

	public void initGUI(){
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logo.png"));
		setTitle("Perfil Usuario");
		setBounds(100, 100, 521, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\logo.png"));
		lblNewLabel.setBounds(10, 11, 78, 74);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 93, 68, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnImpresora = new JButton("Mi Impresora");
		btnImpresora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_ImpresoraImp.setVisible(true);	
			}
		});
		
		btnImpresora.setBounds(363, 86, 110, 21);
		panel.add(btnImpresora);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(148, 86, 60, 21);
		panel.add(menuBar);
		
		JMenu mnDiseos = new JMenu("Dise\u00F1os");
		menuBar.add(mnDiseos);
		
		JMenuItem mntmComprados = new JMenuItem("Comprados");
		mnDiseos.add(mntmComprados);
		
		JMenuItem mntmCreados = new JMenuItem("Creados");
		mnDiseos.add(mntmCreados);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("imagenes\\graphic-tools-REDM.png"));
		lblNewLabel_2.setBounds(155, 36, 53, 49);
		panel.add(lblNewLabel_2);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(256, 86, 60, 21);
		panel.add(menuBar_1);
		
		JMenu mnCesta = new JMenu("  Cesta");
		menuBar_1.add(mnCesta);
		
		JMenuItem mntmDiseos = new JMenuItem("Dise\u00F1os");
		mnCesta.add(mntmDiseos);
		
		JMenuItem menuItem = new JMenuItem("Pedido impresión");
		mnCesta.add(menuItem);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes\\commerce-and-shopping-REDM.png"));
		label.setBounds(261, 36, 53, 49);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("imagenes\\3d-printer-REDM.png"));
		label_1.setBounds(393, 36, 53, 49);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setText("Buscar usuario");
		textField.setForeground(Color.GRAY);
		textField.setColumns(10);
		textField.setBounds(183, 164, 227, 20);
		panel.add(textField);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(183, 195, 89, 23);
		panel.add(btnBuscar);
		
		JButton button = new JButton("Mostrar todos");
		button.setBounds(292, 195, 118, 23);
		panel.add(button);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(10, 134, 85, 21);
		panel.add(menuBar_2);
		
		JMenu mnConfiguacin = new JMenu("Configuaci\u00F3n");
		menuBar_2.add(mnConfiguacin);
		
		JMenuItem mntmModificarUsuario = new JMenuItem("Modificar usuario");
		mnConfiguacin.add(mntmModificarUsuario);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar sesi\u00F3n");
		mnConfiguacin.add(mntmCerrarSesin);
	}
	
}
