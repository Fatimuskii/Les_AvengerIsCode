package Presentación.PedidoImpresion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class GUIModificar extends JFrame{

	private JPanel contentPane;
	
	public GUIModificar(){
		this.contentPane= new JPanel();
		initGUI();
	}
	
	
	public void initGUI() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		setTitle("MENU MODIFICAR");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 643, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 625, 36);
		contentPane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmVolverAlMenu = new JMenuItem("Volver al Menu");
		mntmVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 /*GUIPedidoImpresionImp imp; 
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
		label.setIcon(new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		menuBar.add(label);
		
		JLabel lblLogopedido = new JLabel("\r\n");
		lblLogopedido.setBounds(33, 62, 224, 164);
		contentPane.add(lblLogopedido);
		ImageIcon fot = new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\code.png");
		Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblLogopedido.getWidth(), lblLogopedido.getHeight(),Image.SCALE_DEFAULT));
		lblLogopedido.setIcon(icono);
		
		JLabel lblLogoenvio = new JLabel("\r\n");
		lblLogoenvio.setBounds(361, 62, 221, 164);
		contentPane.add(lblLogoenvio);
		ImageIcon fot1 = new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\envio.png");
		Icon icono1 = new ImageIcon(fot1.getImage().getScaledInstance(lblLogoenvio.getWidth(), lblLogoenvio.getHeight(), Image.SCALE_DEFAULT));
		lblLogoenvio.setIcon(icono1);
		
		JButton btnNewButton = new JButton("Modificar Pedido");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 GUIModificarPedido pedido; 
				pedido= new  GUIModificarPedido(); 
				pedido.setVisible(true); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(33, 266, 227, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar Envio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIModificarEnvio envio; 
				envio= new  GUIModificarEnvio(); 
				envio.setVisible(true); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(361, 266, 221, 53);
		contentPane.add(btnNewButton_1);
	}
}

