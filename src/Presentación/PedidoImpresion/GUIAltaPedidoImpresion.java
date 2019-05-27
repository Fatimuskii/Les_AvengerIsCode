package Presentación.PedidoImpresion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.SpinnerNumberModel;

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

import Negocio.Diseño.TDiseño;
import Negocio.Impresora.Material;
import Negocio.Impresora.TImpresora;
import Negocio.Local.TLocal;
import Negocio.PedidoImpresion.EstadoPedido;
import Negocio.PedidoImpresion.TPedidoImpresion;
import Negocio.Usuario.TUsuario;
import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

@SuppressWarnings("serial")
public class GUIAltaPedidoImpresion extends JFrame {
	private JPanel contentPane;
	private JSpinner spinnerCantidad;
	private JLabel lblUsuario;
	private JLabel lblImpresora;
	private JLabel lblDiseño;
	private JLabel lblFecha;
	private JLabel lblCantidad;
	private JLabel lblMaterial;
	private JLabel lblLocal;

	private TPedidoImpresion pedidoImpr;
	private TUsuario usuarioSol;
	private TImpresora impresora;
	private TDiseño diseño;
	private TLocal local;

	private GUIMensaje mensaje;

	/**
	 * Launch the application.
	 * 
	 * @param local
	 * @param diseño
	 * @param impresora
	 * @param usuarioSol
	 */
	public GUIAltaPedidoImpresion(TUsuario usuarioSol, TImpresora impresora,
			TDiseño diseño, TLocal local) {

		contentPane = new JPanel();
		this.usuarioSol = usuarioSol;
		this.impresora = impresora;
		this.diseño = diseño;
		this.local = local;
		this.mensaje = new GUIMensaje();
		initGUI();
	}

	/**
	 * Create the frame.
	 */
	public void initGUI() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"imagenes\\logoUsu.png"));
		setTitle("ALTA PEDIDO IMPRESION");
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
				dispose();
			}
		});

		JMenuItem mntmVolverAlMenu = new JMenuItem("Volver al menu");
		mntmVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnArchivo.add(mntmVolverAlMenu);
		mnArchivo.add(mntmSalir);

		JMenu mnPedidoimpresion = new JMenu("PedidoImpresion");
		menuBar.add(mnPedidoimpresion);

		JMenuItem mntmBaja = new JMenuItem("Baja");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje.showMessage("Opción no implementada...", "BAJA PEDIDO",
						false);
			}
		});
		mnPedidoimpresion.add(mntmBaja);

		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje.showMessage("Opción no implementada...",
						"BUSCAR PEDIDO", false);
			}
		});
		mnPedidoimpresion.add(mntmBuscar);

		JMenu mnModificar = new JMenu("Modificar");
		mnPedidoimpresion.add(mnModificar);

		JMenuItem mntmPedidoImpresion = new JMenuItem("Pedido impresion");
		mntmPedidoImpresion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje.showMessage("Opción no implementada...",
						"MODIFICAR PEDIDO - Pedido impresion", false);

			}
		});
		mnModificar.add(mntmPedidoImpresion);

		JMenuItem mntmEnvio = new JMenuItem("Envio");
		mntmEnvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje.showMessage("Opción no implementada...",
						"MODIFICAR PEDIDO - Envio", false);
			}
		});
		mnModificar.add(mntmEnvio);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("imagenes\\logoUsu.png"));
		menuBar.add(lblLogo);

		JLabel lblCompra = new JLabel("");
		lblCompra.setBounds(35, 69, 160, 155);
		panel.add(lblCompra);
		ImageIcon fot1 = new ImageIcon("imagenes\\commerce-and-shopping.png");
		Icon icono1 = new ImageIcon(fot1.getImage().getScaledInstance(
				lblCompra.getWidth(), lblCompra.getHeight(),
				Image.SCALE_DEFAULT));
		lblCompra.setIcon(icono1);

		JButton btnContinuar = new JButton("Aceptar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fecha = "2019-06-24";
				int cantidad = (int) spinnerCantidad.getValue();
				Material material = impresora.getMaterial();
				boolean tipoenvio = false;
				if (local != null)
					tipoenvio = true;
				EstadoPedido estadoPed = EstadoPedido.PEN;

				// prueba:
				// usuarioSol = new TUsuario(1,"pepe");

				pedidoImpr = new TPedidoImpresion(usuarioSol,
						diseño, impresora, fecha, estadoPed, cantidad,
						material, tipoenvio, local);
				Controlador.getInstance().accion(Events.ALTA_PEDIDO_IMPRESION,
						pedidoImpr);
			}
		});
		btnContinuar.setBounds(497, 345, 126, 40);
		panel.add(btnContinuar);

		lblUsuario = new JLabel("Usuario: " + usuarioSol.getNombre() + " "
				+ usuarioSol.getApellidos() + " (" + usuarioSol.getIdUsuario()
				+ ")");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario.setBounds(246, 92, 84, 25);
		panel.add(lblUsuario);

		lblImpresora = new JLabel("Impresora: " + impresora.getId_impresora());
		lblImpresora.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblImpresora.setBounds(246, 150, 113, 25);
		panel.add(lblImpresora);

		lblDiseño = new JLabel("Dise\u00F1o: " + diseño.getNombre() +" (" + diseño.getId_diseño()+")" );
		lblDiseño.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDiseño.setBounds(246, 121, 75, 25);
		panel.add(lblDiseño);

		lblFecha = new JLabel("Fecha: " + pedidoImpr.getFecha() );
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFecha.setBounds(246, 179, 67, 25);
		panel.add(lblFecha);

		lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCantidad.setBounds(246, 208, 97, 25);
		panel.add(lblCantidad);

		lblMaterial = new JLabel("Material de impresi\u00F3n: " + pedidoImpr.getMaterial().toString());
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMaterial.setBounds(246, 237, 227, 25);
		panel.add(lblMaterial);

		spinnerCantidad = new JSpinner();
		spinnerCantidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		spinnerCantidad.setModel(new SpinnerNumberModel(1, null, 5, 1));
		spinnerCantidad.setBounds(375, 212, 75, 22);
		panel.add(spinnerCantidad);

		lblLocal = new JLabel("Local: " + local.getNombreLocal() + " ("+ local.getIdLocal()+")");
		lblLocal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLocal.setBounds(246, 266, 65, 25);
		panel.add(lblLocal);
		this.repaint();
	}

	@SuppressWarnings("unused")
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

	public void update(int event, Object res) {
		// TODO Apéndice de método generado automáticamente
		switch (event) {
		case Events.ALTA_PEDIDO_IMPRESION_OK:

			break;
		case Events.ALTA_DISEÑO_KO:

			break;
		}
	}
}
