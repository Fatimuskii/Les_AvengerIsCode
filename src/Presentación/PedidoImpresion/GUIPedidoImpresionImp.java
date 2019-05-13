/**
 * 
 */
package Presentación.PedidoImpresion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */


	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.Image;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JMenuBar;
	import javax.swing.JMenu;
	import javax.swing.JMenuItem;
	import javax.swing.JProgressBar;
	import javax.swing.JCheckBoxMenuItem;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.Toolkit;
	import javax.swing.JLabel;
	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JToggleButton;
	import java.awt.Font;

	public class GUIPedidoImpresionImp extends GUIPedidoImpresion {

		private JPanel contentPane;

		/**
		 * Launch the application.
		 */

		/**
		 * Create the frame.
		 */
		public GUIPedidoImpresionImp() {
			this.contentPane= new JPanel();
			initGui();
		}
		
		public void initGui(){
			
			
			setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\3d-printer.png"));
			setTitle("MENU PEDIDO IMPRESION");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 605, 429);
			contentPane = new JPanel();
			contentPane.setToolTipText("");
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JMenuBar menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 587, 40);
			contentPane.add(menuBar);
			
			JMenu mnArchivo = new JMenu("Archivo");
			menuBar.add(mnArchivo);
			
			JMenuItem mntmSalir = new JMenuItem("Salir");
			mntmSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			mnArchivo.add(mntmSalir);
			
			JMenu mnAlta = new JMenu("Menu Pedido");
			menuBar.add(mnAlta);
			
			JMenuItem mntmAlta = new JMenuItem("Hacer pedido\r\n");
			mntmAlta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIAltaPedidoImpresion alta; //declaro el nombre
					alta= new GUIAltaPedidoImpresion(); //creo caja de dialogo
					alta.setVisible(true); //hace visible la caja
				
				}
			});
			mnAlta.add(mntmAlta);
			
			JMenuItem mntmBaja = new JMenuItem("Cancelar pedido\r\n");
			/*mntmBaja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JDialogError error; //declaro el nombre
					error= new JDialogError(); //creo caja de dialogo
				//	alta.setLocationRelativeTo(this); //centra la caja 
					error.setVisible(true); //hace visible la caja
				}
			});*/
			mnAlta.add(mntmBaja);
			
			JMenuItem mntmBuscar = new JMenuItem("Buscar pedido\r\n");
			mnAlta.add(mntmBuscar);
			
			JMenu mnModificar = new JMenu("Modificar");
			mnAlta.add(mnModificar);
			
			JMenuItem mntmPedidoImpresion = new JMenuItem("Pedido impresion");
			mnModificar.add(mntmPedidoImpresion);
			
			JMenuItem mntmEnvio = new JMenuItem("Envio");
			mnModificar.add(mntmEnvio);
			
			JLabel lblLogo = new JLabel("");
			lblLogo.setIcon(new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\logoUsu.png"));
			menuBar.add(lblLogo);
			
			JLabel lbld = new JLabel("");
			lbld.setBounds(12, 53, 288, 304);
			contentPane.add(lbld);
			ImageIcon fot1 = new ImageIcon("C:\\Users\\Paula\\IBM\\rationalsdp\\workspace\\Les_AvengerIsCode\\imagenes\\3d-printer.png");
			Icon icono1 = new ImageIcon(fot1.getImage().getScaledInstance(lbld.getWidth(), lbld.getHeight(), Image.SCALE_DEFAULT));
			lbld.setIcon(icono1);
			
			JButton btnHacerPedido = new JButton("HACER PEDIDO");
			btnHacerPedido.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GUIAltaPedidoImpresion alta; //declaro el nombre
					alta= new GUIAltaPedidoImpresion(); //creo caja de dialogo
					alta.setVisible(true); //hace visible la caja
				}
			});
			btnHacerPedido.setBounds(312, 53, 263, 65);
			btnHacerPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
			contentPane.add(btnHacerPedido);
			
			JButton btnBajaPedido = new JButton("CANCELAR PEDIDO\r\n");
			/*btnBajaPedido.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JDialogError error; //declaro el nombre
					error= new JDialogError(); //creo caja de dialogo
				//	alta.setLocationRelativeTo(this); //centra la caja 
					error.setVisible(true); //hace visible la caja
				}
			});*/
			btnBajaPedido.setBounds(312, 131, 263, 65);
			btnBajaPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
			contentPane.add(btnBajaPedido);
			
			JButton btnModificarPedido = new JButton("MODIFICAR PEDIDO\r\n");
			btnModificarPedido.setBounds(312, 292, 263, 65);
			btnModificarPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
			contentPane.add(btnModificarPedido);
			
			JButton btnBuscarPedido = new JButton("BUSCAR PEDIDO\r\n");
			btnBuscarPedido.setBounds(312, 214, 263, 65);
			btnBuscarPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
			contentPane.add(btnBuscarPedido);
			this.repaint();
			
			
		}
		
	}

