package Presentación.PedidoImpresion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Toolkit;


public class GUIModificarPedido extends GUIPedidoImpresionImp {
	
	private JPanel contentPane;
	private JTextField txtSePuedeModificar;
	
	public GUIModificarPedido() {
		this.contentPane= new JPanel();
		initGUI();
	}
	
	
	public void initGUI() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		setTitle("MODIFICAR PEDIDO");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 547, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 529, 41);
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
		
		txtSePuedeModificar = new JTextField();
		txtSePuedeModificar.setText("se puede modificar el material y la cantidad");
		txtSePuedeModificar.setBounds(103, 54, 286, 41);
		contentPane.add(txtSePuedeModificar);
		txtSePuedeModificar.setColumns(10);
	}
}


