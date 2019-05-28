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
import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

import java.awt.Font;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class GUIPedidoImpresionImp extends GUIPedidoImpresion {

	private JPanel contentPane;
	private GUIAltaPedidoImpresionSeleccion GUIDatos;

	private TUsuario usuarioSol;

	private GUIMensaje res_mensaje;

	/**
	 * Create the frame.
	 */
	public GUIPedidoImpresionImp(TUsuario Log) {
		super();
		this.contentPane = new JPanel();
		this.res_mensaje = new GUIMensaje();
		this.usuarioSol = Log;
		// guiAltaPedidoImpresion = new GUIAltaPedidoImpresion();
		initGUI();
	}

	// Plataforma me pasara: TUsuario usuario, TImpresora impresora, TDiseño
	// diseño, TLocal local

	public void setUsurio(TUsuario user) {
		this.usuarioSol = user;
	}


	private void initGUI() {

		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		this.setLayout(new BorderLayout());
		this.add(contentPane, BorderLayout.CENTER);
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

				Controlador.getInstance().accion(Events.LISTAR_DISEÑOS_USU, usuarioSol.getIdUsuario());
				Controlador.getInstance().accion(Events.LISTAR_IMPRESORAS, null);
				Controlador.getInstance().accion(Events.LISTAR_LOCALES, null);
				GUIDatos = new GUIAltaPedidoImpresionSeleccion();
				GUIDatos.setVisible(true);
			}
		});
		mnAlta.add(mntmAlta);

		JMenuItem mntmBaja = new JMenuItem("Cancelar pedido\r\n");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				res_mensaje.showMessage("Opción no implementada. ",
						"CANCELAR PEDIDO", false);
			}
		});
		mnAlta.add(mntmBaja);

		JMenuItem mntmBuscar = new JMenuItem("Buscar pedido\r\n");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				res_mensaje.showMessage("Opción no implementada. ",
						"BUSCAR PEDIDO", false);
			}
		});
		mnAlta.add(mntmBuscar);

		JMenu mnModificar = new JMenu("Modificar");
		mnAlta.add(mnModificar);

		JMenuItem mntmPedidoImpresion = new JMenuItem("Pedido impresion");
		mntmPedidoImpresion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				res_mensaje.showMessage("Opción no implementada. ",
						"MODIFICAR PEDIDO", false);
			}
		});
		mnModificar.add(mntmPedidoImpresion);

		JMenuItem mntmEnvio = new JMenuItem("Envio");
		mntmEnvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				res_mensaje.showMessage("Opción no implementada. ",
						"ENVIO PEDIDO", false);
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
				GUIDatos = new GUIAltaPedidoImpresionSeleccion();
				GUIDatos.setVisible(true);
			}
		});
		btnHacerPedido.setBounds(312, 53, 263, 65);
		btnHacerPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(btnHacerPedido);

		JButton btnBajaPedido = new JButton("CANCELAR PEDIDO\r\n");
		btnBajaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				res_mensaje.showMessage("Opción no implementada. ",
						"CANCELAR PEDIDO", false);
			}
		});
		btnBajaPedido.setBounds(312, 131, 263, 65);
		btnBajaPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(btnBajaPedido);

		JButton btnModificarPedido = new JButton("MODIFICAR PEDIDO\r\n");
		btnModificarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res_mensaje.showMessage("Opción no implementada. ",
						"MODIFICAR PEDIDO", false);
			}
		});
		btnModificarPedido.setBounds(312, 292, 263, 65);
		btnModificarPedido.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(btnModificarPedido);

		JButton btnBuscarPedido = new JButton("BUSCAR PEDIDO\r\n");
		btnBuscarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				res_mensaje.showMessage("Opción no implementada. ",
						"BUSCAR PEDIDO", false);
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
		case Events.LISTAR_DISEÑOS_USU_OK:
			GUIDatos.update(event, (ArrayList<TDiseño>) res);
			break;
		case Events.LISTAR_DISEÑOS_USU_KO:
			GUIDatos.update(event, (ArrayList<TDiseño>) res);
			break;
		case Events.LISTAR_IMPRESORAS_OK:
			GUIDatos.update(event, (ArrayList<TImpresora>) res);
			break;
		case Events.LISTAR_IMPRESORAS_KO:
			GUIDatos.update(event, (ArrayList<TImpresora>) res);
			break;
		case Events.LISTAR_LOCALES_OK:
			GUIDatos.update(event, (ArrayList<TLocal>) res);
			break;
		case Events.LISTAR_LOCALES_KO:
			GUIDatos.update(event, (ArrayList<TLocal>) res);
			break;
		}
				
	}

}
