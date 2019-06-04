/**
 * 
 */
package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Negocio.Diseño.TDiseño;
import Negocio.Usuario.TUsuario;
import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;
import Presentación.Diseño.GUIListarporUsuarioDiseño;
import Presentación.Impresora.GUIImpresoraImp;
import Presentación.Local.GUIBuscarLocal;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */

public class GUIUsuarioImp extends GUIUsuario {

	private JPanel contentPane;
	private JTextField textField;
	private GUIModificarUsuario GUI_ModificarUsuario;
	private GUIBajaUsuario GUI_BajaUsuario;
	private GUIAltaUsuario GUI_AltaUsuario;
	private GUIListarUsuarios GUI_ListarUsuarios;
	private GUIBuscarporIdUsuario<Object> GUI_BuscarporIdUsuario;
	private JLabel id_Usuario;
//	private boolean admin;

	private int id;

	// private GUIAccesoUsuario GUI_AccesoUsuario;

	public GUIUsuarioImp() {
		super();
	//	this.admin = true;// ************************* pasar como parametro
		// this.id = userLog.getIdUsuario();
		this.contentPane = new JPanel();
		this.GUI_BajaUsuario = new GUIBajaUsuario();
		this.GUI_AltaUsuario = new GUIAltaUsuario();
		this.GUI_ListarUsuarios = new GUIListarUsuarios();
		this.GUI_ModificarUsuario = new GUIModificarUsuario(id);
		// this.GUI_AccesoUsuario = new GUIAccesoUsuario();
		initGUI();
	}

	public void initGUI() {
		/*
		 * setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logo.png"
		 * )); setTitle("Perfil Usuario"); setBounds(100, 100, 521, 300);
		 */

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		this.setLayout(new BorderLayout());
		this.add(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\logo.png"));
		lblNewLabel.setBounds(10, 11, 78, 74);
		panel.add(lblNewLabel);

		id_Usuario = new JLabel("ID Usuario");
		id_Usuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		id_Usuario.setBounds(20, 93, 68, 14);
		panel.add(id_Usuario);

		// MODIFICAR
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	if (admin)
					GUI_ModificarUsuario.clearData();
				GUI_ModificarUsuario.setVisible(true);
			}
		});

		btnModificar.setBounds(350, 86, 100, 21);
		panel.add(btnModificar);

		// DAR DE BAJA
		JButton btnBaja = new JButton("Dar de baja");
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	if (admin)
					GUI_ModificarUsuario.clearData();
				GUI_BajaUsuario.setVisible(true);
			}
		});

		btnBaja.setBounds(230, 86, 100, 21);
		panel.add(btnBaja);

//		// DAR DE ALTA
//		JButton btnAlta = new JButton("Dar de alta");
//		btnAlta.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			//	if (admin)
//					GUI_ModificarUsuario.clearData();
//				GUI_AltaUsuario.setVisible(true);
//			}
//		});
//
//		btnAlta.setBounds(350, 86, 100, 21);
//		panel.add(btnAlta);
//		if (!admin)
//			btnAlta.setEnabled(false);

		// CERRAR SESION
		JButton btnCerrarSesion = new JButton("Cerrar sesión");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	if (admin)
					GUI_ModificarUsuario.clearData();

				int confirma = JOptionPane.showConfirmDialog(null,
						"Se va a cerrar la aplicación", "Cerrar sesión",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (confirma == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});

		btnCerrarSesion.setBounds(470, 86, 130, 21);
		panel.add(btnCerrarSesion);

		textField = new JTextField();
		textField.setText("Buscar usuario");
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (textField.getText().equals("Buscar usuario")) {
					textField.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().equals("")) {
					textField.setText("Buscar usuario");
				}
			}
		});
		textField.setForeground(Color.GRAY);
		textField.setColumns(10);
		textField.setBounds(230, 164, 227, 20);
		panel.add(textField);

		// BUSCAR
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(230, 195, 89, 23);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIMensaje mensaje = new GUIMensaje();
				if (!textField.getText().equals("Buscar usuario")) {
					id = Integer.parseInt(textField.getText());
					GUI_BuscarporIdUsuario = new GUIBuscarporIdUsuario<Object>(
							id);// ***

					Controlador.getInstance().accion(Events.BUSCAR_USUARIO, id);

					//
					//
					// Controlador.getInstance().accion(Events.LISTAR_DISEÑOS_USU_LOG,
					// id);
					// Controlador.getInstance().accion(Events.LISTAR_IMPRESORAS_USU_LOG,
					// id);

					// GUI_BuscarporIdUsuario.setVisible(true);
					// GUI_BuscarporIdUsuario.toFront();
				} else {
					mensaje.showMessage("Debe introducir un Id",
							"Buscar Usuario", false);
				}
			}
		});
		panel.add(btnBuscar);

		JButton button = new JButton("Mostrar todos");
		button.setBounds(335, 195, 118, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI_ListarUsuarios.setVisible(true);
				Controlador.getInstance().accion(Events.LISTAR_USUARIO, null);
			}
		});
		panel.add(button);
//		if (!admin)
//			button.setEnabled(false);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(int event, Object res) {
		switch (event) {
		case Events.ALTA_USUARIO_OK:
			GUI_AltaUsuario.update(event, res);
			break;
		case Events.ALTA_USUARIO_KO:
			GUI_AltaUsuario.update(event, res);
			break;
		case Events.BAJA_USUARIO_OK:
			GUI_BajaUsuario.update(event, res);
			break;
		case Events.BAJA_USUARIO_KO:
			GUI_BajaUsuario.update(event, res);
			break;
		case Events.MODIFICAR_USUARIO_OK:
			GUI_ModificarUsuario.update(Events.MODIFICAR_USUARIO_OK,
					(TUsuario) res);
			break;
		case Events.MODIFICAR_USUARIO_KO:
			GUI_ModificarUsuario.update(Events.MODIFICAR_USUARIO_KO,
					(TUsuario) res);
			break;
		case Events.LISTAR_USUARIO_OK:
			GUI_ListarUsuarios.update(event, (ArrayList<TUsuario>) res);
			break;
		case Events.LISTAR_USUARIO_KO:
			GUI_ListarUsuarios.update(event, (ArrayList<TUsuario>) res);
			break;
		case Events.MODIFICAR_USUARIO_COMPROBAR_OK:
			GUI_ModificarUsuario.update(Events.MODIFICAR_USUARIO_COMPROBAR_OK,
					(TUsuario) res);
			break;
		case Events.MODIFICAR_USUARIO_COMPROBAR_KO:
			GUI_ModificarUsuario.update(Events.MODIFICAR_USUARIO_COMPROBAR_KO,
					(TUsuario) res);
			break;
		case Events.BUSCAR_USUARIO_OK:
			GUI_BuscarporIdUsuario.update(event, res);
			break;
		case Events.BUSCAR_USUARIO_KO:
			GUI_BuscarporIdUsuario.update(event, res);
			break;
		case Events.LISTAR_DISEÑOS_USU_LOG_OK:
			GUI_BuscarporIdUsuario.update(event, res);
			break;
		case Events.LISTAR_DISEÑOS_USU_LOG_KO:
			GUI_BuscarporIdUsuario.update(event, res);
			break;
		case Events.LISTAR_IMPRESORAS_USU_LOG_OK:
			GUI_BuscarporIdUsuario.update(event, res);
			break;
		case Events.LISTAR_IMPRESORAS_USU_LOG_KO:
			GUI_BuscarporIdUsuario.update(event, res);
			break;
		}

	}

}
