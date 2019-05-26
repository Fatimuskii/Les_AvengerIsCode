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

import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import Negocio.Diseño.TDiseño;
import Negocio.Impresora.TImpresora;
import Negocio.Local.TLocal;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Events;

import java.awt.Font;

@SuppressWarnings("serial")
public class GUIPedidoImpresionImp extends GUIPedidoImpresion {

	private JPanel contentPane;
	private GUIAltaPedidoImpresion guiAlta;
	
	private TUsuario usuarioSol; 
	private TImpresora impresora;
	private TDiseño diseño;
	private TLocal local;
	
	

	/**
	 * Create the frame.
	 */
	public GUIPedidoImpresionImp() {
		super();
		this.contentPane = new JPanel();
		//guiAltaPedidoImpresion = new GUIAltaPedidoImpresion();
		initGUI();
	}
	
	// Plataforma me pasara: TUsuario usuario, TImpresora impresora, TDiseño diseño, TLocal local
	
	public void setUsurio(TUsuario user){
		this.usuarioSol= user;
	}

	public void setImpresora(TImpresora impresora){
		this.impresora= impresora;
	}
	public void setDiseño(TDiseño diseño){
		this.diseño=diseño;
	}
	
	public void setLocal(TLocal local){
		this.local = local;
	}
	private void initGUI() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"imagenes\\logoUsu.png"));
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
				guiAlta = new GUIAltaPedidoImpresion(usuarioSol,impresora,diseño,local);
				
				guiAlta.setVisible(true);
			}
		});
		mnAlta.add(mntmAlta);

		JMenuItem mntmBaja = new JMenuItem("Cancelar pedido\r\n");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIBajaPedidoImpresion baja; // declaro el nombre
				baja = new GUIBajaPedidoImpresion(); // creo caja de dialogo
				baja.setVisible(true);
				// dispose();
			}
		});
		mnAlta.add(mntmBaja);

		JMenuItem mntmBuscar = new JMenuItem("Buscar pedido\r\n");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIBuscarPedido buscar;
				buscar = new GUIBuscarPedido();
				buscar.setVisible(true);
				// dispose();
			}
		});
		mnAlta.add(mntmBuscar);

		JMenu mnModificar = new JMenu("Modificar");
		mnAlta.add(mnModificar);

		JMenuItem mntmPedidoImpresion = new JMenuItem("Pedido impresion");
		mntmPedidoImpresion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIModificarPedido modificar;
				modificar = new GUIModificarPedido();
				modificar.setVisible(true);
				// dispose();
			}
		});
		mnModificar.add(mntmPedidoImpresion);

		JMenuItem mntmEnvio = new JMenuItem("Envio");
		mntmEnvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIModificarEnvio envio;
				envio = new GUIModificarEnvio();
				envio.setVisible(true);
				// dispose();
			}
		});
		mnModificar.add(mntmEnvio);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("imagenes\\logoUsu.png"));
		menuBar.add(lblLogo);

		JLabel lbld = new JLabel("");
		lbld.setBounds(12, 53, 288, 304);
		contentPane.add(lbld);
		ImageIcon fot1 = new ImageIcon("imagenes\\3d-printer.png");
		Icon icono1 = new ImageIcon(fot1.getImage().getScaledInstance(
				lbld.getWidth(), lbld.getHeight(), Image.SCALE_DEFAULT));
		lbld.setIcon(icono1);

		JButton btnHacerPedido = new JButton("HACER PEDIDO");
		btnHacerPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guiAlta = new GUIAltaPedidoImpresion(usuarioSol,impresora,diseño,local); 
				guiAlta.setVisible(true); 
			}
		});
		btnHacerPedido.setBounds(312, 53, 263, 65);
		btnHacerPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(btnHacerPedido);

		JButton btnBajaPedido = new JButton("CANCELAR PEDIDO\r\n");
		btnBajaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIBajaPedidoImpresion baja;
				baja = new GUIBajaPedidoImpresion();
				baja.setVisible(true);
				// dispose();
			}
		});
		btnBajaPedido.setBounds(312, 131, 263, 65);
		btnBajaPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(btnBajaPedido);

		JButton btnModificarPedido = new JButton("MODIFICAR PEDIDO\r\n");
		btnModificarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIModificar mod;
				mod = new GUIModificar();
				mod.setVisible(true);
				// dispose();
			}
		});
		btnModificarPedido.setBounds(312, 292, 263, 65);
		btnModificarPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(btnModificarPedido);

		JButton btnBuscarPedido = new JButton("BUSCAR PEDIDO\r\n");
		btnBuscarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIBuscarPedido buscar;
				buscar = new GUIBuscarPedido();
				buscar.setVisible(true);
				// dispose();
			}
		});
		btnBuscarPedido.setBounds(312, 214, 263, 65);
		btnBuscarPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(btnBuscarPedido);
		this.repaint();

	}

	@Override
	public void update(int event, Object res) {
		// TODO Apéndice de método generado automáticamente
		switch (event) {
		case Events.ALTA_PEDIDO_IMPRESION_OK:
			guiAlta.update(event, res);
			break;
		case Events.ALTA_DISEÑO_KO:
			guiAlta.update(event, res);
			break;
		}
	}

}
