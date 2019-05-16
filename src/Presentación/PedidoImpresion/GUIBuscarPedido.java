package Presentación.PedidoImpresion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextPane;

public class GUIBuscarPedido extends GUIPedidoImpresionImp{
	
	private JPanel contentPane;
	
	public GUIBuscarPedido(){
		this.contentPane= new JPanel();
		initGUI();
	}
	
	public void initGUI(){
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		setTitle("BUSCAR PEDIDO IMPRESION");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 432, 39);
		contentPane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmVolverAlMenu = new JMenuItem("Volver al Menu");
		mntmVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 GUIPedidoImpresionImp imp; 
					imp= new  GUIPedidoImpresionImp(); 
					imp.setVisible(true); 
					dispose();
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
		
		JTextPane txtpnTablaBuscarPedidos = new JTextPane();
		txtpnTablaBuscarPedidos.setText("TABLA\r\nmuestra los pedidos del usuario SOLO\r\npuede buscar por el id del pedido, para comprobar si ha existido\r\n\r\nlistar todos los pedidos, SOLO el admin");
		txtpnTablaBuscarPedidos.setBounds(157, 52, 251, 188);
		contentPane.add(txtpnTablaBuscarPedidos);
		
		JRadioButton rdbtnIdpedidoimpresion = new JRadioButton("IDPedidoImpresion");
		rdbtnIdpedidoimpresion.setBounds(14, 71, 135, 25);
		contentPane.add(rdbtnIdpedidoimpresion);
		
		JRadioButton rdbtnUsuario = new JRadioButton("Usuario");
		rdbtnUsuario.setBounds(14, 111, 127, 25);
		contentPane.add(rdbtnUsuario);
		
		JButton btnListarTodos = new JButton("Listar todos");
		btnListarTodos.setBounds(14, 176, 99, 25);
		contentPane.add(btnListarTodos);
	}

}
