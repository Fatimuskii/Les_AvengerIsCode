package Presentación.PedidoImpresion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class GUIBajaPedidoImpresion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtIdpedido;
	
	
	
	public GUIBajaPedidoImpresion(){
		this.contentPane= new JPanel();
		initGUI();
	}
	
	public void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		setTitle("BAJA PEDIDO IMPRESION");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 558, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 540, 39);
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
		
		txtNombre = new JTextField();
		txtNombre.setText("nombre");
		txtNombre.setBounds(165, 52, 116, 22);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtIdpedido = new JTextField();
		txtIdpedido.setText("IDpedido");
		txtIdpedido.setBounds(165, 87, 116, 22);
		contentPane.add(txtIdpedido);
		txtIdpedido.setColumns(10);
	}
}



