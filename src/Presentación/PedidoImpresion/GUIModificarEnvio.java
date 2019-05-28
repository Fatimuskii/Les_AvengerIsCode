package Presentación.PedidoImpresion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class GUIModificarEnvio extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	
	public GUIModificarEnvio() {
		this.contentPane= new JPanel();
		initGUI();
	}
	
	public void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logoUsu.png"));
		setTitle("MODIFICAR ENVIO");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 549, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 531, 39);
		contentPane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmVolverAlMenu = new JMenuItem("Volver al Menu");
		mntmVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* GUIPedidoImpresionImp imp; 
					imp= new  GUIPedidoImpresionImp(); 
					imp.setVisible(true); 
					dispose();*/
			}
		});
		mnArchivo.add(mntmVolverAlMenu);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes\\logoUsu.png"));
		menuBar.add(label);
		
		textField = new JTextField();
		textField.setText("???");
		textField.setBounds(180, 130, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}


