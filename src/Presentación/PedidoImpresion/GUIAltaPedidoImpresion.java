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

public class GUIAltaPedidoImpresion extends GUIPedidoImpresionImp{
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAltaPedidoImpresion frame = new GUIAltaPedidoImpresion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIAltaPedidoImpresion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\3d-printer.png"));
		setTitle("ALTA PEDIDO IMPRESION\r\n");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 681, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 653, 40);
		panel.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmVolverAlMenu = new JMenuItem("Volver al menu");
		mntmVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 GUIPedidoImpresionImp imp; 
				imp= new  GUIPedidoImpresionImp(); 
				imp.setVisible(true); 
			}
		});
		mnArchivo.add(mntmVolverAlMenu);
		mnArchivo.add(mntmSalir);
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenu mnDiseo = new JMenu("Dise\u00F1o");
		menuBar.add(mnDiseo);
		
		JMenu mnPedidoimpresion = new JMenu("PedidoImpresion");
		menuBar.add(mnPedidoimpresion);
		
		JMenuItem mntmAlta = new JMenuItem("Alta");
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIAltaPedidoImpresion alta; //declaro el nombre
				alta= new GUIAltaPedidoImpresion(); //creo caja de dialogo
				alta.setVisible(true); //hace visible la caja
			}
		});
		mnPedidoimpresion.add(mntmAlta);
		
		JMenuItem mntmBaja = new JMenuItem("Baja");
		mnPedidoimpresion.add(mntmBaja);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnPedidoimpresion.add(mntmBuscar);
		
		JMenu mnModificar = new JMenu("Modificar");
		mnPedidoimpresion.add(mnModificar);
		
		JMenuItem mntmPedidoImpresion = new JMenuItem("Pedido impresion");
		mnModificar.add(mntmPedidoImpresion);
		
		JMenuItem mntmEnvio = new JMenuItem("Envio");
		mnModificar.add(mntmEnvio);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
		menuBar.add(lblLogo);
		
		JLabel lblCompra = new JLabel("");
		lblCompra.setBounds(35, 69, 160, 155);
		panel.add(lblCompra);
		ImageIcon fot1 = new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\commerce-and-shopping.png");
		Icon icono1 = new ImageIcon(fot1.getImage().getScaledInstance(lblCompra.getWidth(), lblCompra.getHeight(), Image.SCALE_DEFAULT));
		lblCompra.setIcon(icono1);
		
		txtNombre = new JTextField();
		txtNombre.setText("NOMBRE\r\n");
		txtNombre.setForeground(Color.GRAY);
		/*txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtNombre.getText().equals("")){
					txtNombre.setText("Nombre");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtNombre.getText().equals("")){
					txtNombre.setText("Nombre");
				}
			}	
		});*/
		txtNombre.setBounds(237, 68, 193, 22);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		
		txtApellidos = new JTextField();
		txtApellidos.setText("APELLIDOS");
		txtApellidos.setBounds(237, 103, 311, 22);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JTextPane txtpnListaDeDiseos = new JTextPane();
		txtpnListaDeDiseos.setText("LISTA DE DISE\u00D1OS");
		txtpnListaDeDiseos.setBounds(237, 140, 206, 202);
		panel.add(txtpnListaDeDiseos);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnContinuar.setBounds(482, 350, 97, 25);
		panel.add(btnContinuar);
		
		this.repaint();
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

