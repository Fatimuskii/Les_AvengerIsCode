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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;
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
	private GUIImpresoraImp GUI_ImpresoraImp;
	private JTextField textField;
	private GUIModificarUsuario GUI_ModificarUsuario;
	private GUIBajaUsuario GUI_BajaUsuario;
	private GUIAltaUsuario GUI_AltaUsuario;
	private GUIListarUsuarios GUI_ListarUsuarios;
	private GUIBuscarporIdUsuario GUI_BuscarporIdUsuario;
	private JLabel id_Usuario;
	private boolean admin;
	
	private int id;
	

	public GUIUsuarioImp(){
		super();
		this.contentPane = new JPanel();
		this.GUI_ImpresoraImp = new GUIImpresoraImp();
		this.GUI_ModificarUsuario = new GUIModificarUsuario();
		this.GUI_BajaUsuario = new GUIBajaUsuario();
		this.GUI_AltaUsuario = new GUIAltaUsuario();
		this.GUI_ListarUsuarios = new GUIListarUsuarios();
		initGUI();
	}

	public void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logo.png"));
		setTitle("Perfil Usuario");
		setBounds(100, 100, 521, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

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

		JButton btnImpresora = new JButton("Mi Impresora");
		btnImpresora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_ImpresoraImp.setVisible(true);
			}
		});

		btnImpresora.setBounds(363, 86, 110, 21);
		panel.add(btnImpresora);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(148, 86, 60, 21);
		panel.add(menuBar);

		JMenu mnDiseos = new JMenu("Dise\u00F1os");
		menuBar.add(mnDiseos);

		JMenuItem mntmComprados = new JMenuItem("Comprados");
		mnDiseos.add(mntmComprados);

		JMenuItem mntmCreados = new JMenuItem("Creados");
		mnDiseos.add(mntmCreados);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2
				.setIcon(new ImageIcon("imagenes\\graphic-tools-REDM.png"));
		lblNewLabel_2.setBounds(155, 36, 53, 49);
		panel.add(lblNewLabel_2);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(256, 86, 60, 21);
		panel.add(menuBar_1);

		JMenu mnCesta = new JMenu("  Cesta");
		menuBar_1.add(mnCesta);

		JMenuItem mntmDiseos = new JMenuItem("Dise\u00F1os");
		mnCesta.add(mntmDiseos);

		JMenuItem menuItem = new JMenuItem("Pedido impresión");
		mnCesta.add(menuItem);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes\\commerce-and-shopping-REDM.png"));
		label.setBounds(261, 36, 53, 49);
		panel.add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("imagenes\\3d-printer-REDM.png"));
		label_1.setBounds(393, 36, 53, 49);
		panel.add(label_1);

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
		textField.setBounds(183, 164, 227, 20);
		panel.add(textField);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(183, 195, 89, 23);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIMensaje mensaje = new GUIMensaje();
				if(!textField.getText().equals("Buscar usuario")){
					id = Integer.parseInt(textField.getText());

					GUI_BuscarporIdUsuario = new GUIBuscarporIdUsuario(id);
					GUI_BuscarporIdUsuario.setVisible(true);
					Controlador.getInstance().accion(Events.BUSCAR_USUARIO,
							id);
				}
				else{
					mensaje.showMessage("Debe introducir un Id",
							"Buscar Usuario", false);
				}
			}
		});
		panel.add(btnBuscar);

		JButton button = new JButton("Mostrar todos");
		button.setBounds(292, 195, 118, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI_ListarUsuarios.setVisible(true);
			}
		});
		panel.add(button);
		if(!admin)button.setEnabled(false);

		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(10, 134, 90, 21);
		panel.add(menuBar_2);

		JMenu mnConfiguacin = new JMenu("Configuraci\u00F3n");
		menuBar_2.add(mnConfiguacin);

		JMenuItem mntmModificarUsuario = new JMenuItem("Modificar usuario");
		mntmModificarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI_ModificarUsuario.setVisible(true);
			}
		});
		mnConfiguacin.add(mntmModificarUsuario);

		JMenuItem mntmDarDeBaja = new JMenuItem("Darse de baja");
		mntmDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI_BajaUsuario.setVisible(true);
			}
		});
		mnConfiguacin.add(mntmDarDeBaja);
		
		JMenuItem mntmDarDeAlta = new JMenuItem("Dar de alta");
		mntmDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI_AltaUsuario.setVisible(true);
			}
		});
		mnConfiguacin.add(mntmDarDeAlta);
		if(!admin) mntmDarDeAlta.setEnabled(false);

		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar sesi\u00F3n");
		mnConfiguacin.add(mntmCerrarSesin);

	}

	@Override
	public void update(int event, Object res) {
		switch (event) {
		case Events.ALTA_USUARIO_OK:
			GUI_AltaUsuario.update(event, null);
			break;
		case Events.ALTA_USUARIO_KO:
			GUI_AltaUsuario.update(event, null);
			break;
		case Events.BAJA_USUARIO_OK:
			GUI_BajaUsuario.update(event, res);
			break;
		case Events.BAJA_USUARIO_KO:
			GUI_BajaUsuario.update(event, res);
			break;
		case Events.MODIFICAR_USUARIO_OK:
			GUI_ModificarUsuario.update(Events.MODIFICAR_USUARIO_OK, res);
			break;
		case Events.MODIFICAR_USUARIO_KO:
			GUI_ModificarUsuario.update(Events.MODIFICAR_USUARIO_KO, res);
			break;
		}
		
	}

}
