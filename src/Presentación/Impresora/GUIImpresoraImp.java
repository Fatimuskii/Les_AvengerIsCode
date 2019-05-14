/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

import Negocio.Diseño.TDiseño;
import Presentación.Controlador.Events;
import Presentación.Diseño.GUIAltaDiseño;
import Presentación.Diseño.GUIBajaDiseño;
import Presentación.Diseño.GUIBuscarPalabraDiseño;
import Presentación.Diseño.GUIBuscarporIdDiseño;
import Presentación.Diseño.GUIDiseño;
import Presentación.Diseño.GUIListarDiseños;
import Presentación.Diseño.GUIListarporUsuarioDiseño;
import Presentación.Diseño.GUIModificarDiseño;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
import java.util.ArrayList;


/**
 * Launch the application.
 */

@SuppressWarnings("serial")
public class GUIImpresoraImp extends GUIImpresora {
	
	private GUIAltaImpresora gUIAltaImpresora;
	private GUIBajaImpresora gUIBajaImpresora;
	private GUIModificarImpresora gUIModificarImpresora;
	private GUIListarImpresora gUIListarImpresora;
	private GUIBuscarIdImpresora gUIBuscarIdImpresora;
	private GUIBuscarUsuarioImpresora gUIBuscarUsuarioImpresora;
	
	private JPanel contentPane;
	private JTextField txtBuscar;
	private JTextField txtBuscarIdusuarioImpresor;
	private GUIBajaImpresora GUI_BajaImpresora;	
	
	
	public GUIImpresoraImp() {
		super();
		setTitle("Menu Impresora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\3d-printer.png"));
		this.contentPane = new JPanel();
		this.txtBuscar = new JTextField();
		this.txtBuscarIdusuarioImpresor = new JTextField();
		this.GUI_BajaImpresora = new GUIBajaImpresora();
		this.setFocusable(true);
		initGUI();
	}



	/**
	 * Create the frame.
	 */
	public void initGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes\\3d-printer-REDM.png"));
		label.setBounds(22, 0, 73, 69);
		panel.add(label);
		
		JLabel lblIdimpresora = new JLabel(" IdImpresora");
		lblIdimpresora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdimpresora.setBounds(10, 64, 85, 14);
		panel.add(lblIdimpresora);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(132, 57, 90, 21);
		panel.add(menuBar);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenuItem mntmDarDeBaja = new JMenuItem("Dar de baja");
		mntmDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_BajaImpresora.setVisible(true);
			}
		});
		mnConfiguracin.add(mntmDarDeBaja);
		
		JMenuItem mntmModificarImpresora = new JMenuItem("Modificar impresora");
		mntmModificarImpresora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HACER MODIFICAR IMPRESORA (DISTINTO DE ALTA(?))
			}
		});
		mnConfiguracin.add(mntmModificarImpresora);
		
		txtBuscar = new JTextField();
		txtBuscar.setForeground(Color.DARK_GRAY);
		txtBuscar.setText("Buscar Id impresora");
		txtBuscar.setBounds(81, 146, 126, 21);
		txtBuscar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtBuscar.getText().equals("Buscar Id impresora")) {
					txtBuscar.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtBuscar.getText().equals("")) {
					txtBuscar.setText("Buscar Id impresora");
				}
			}
		});
		panel.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		txtBuscarIdusuarioImpresor = new JTextField();
		txtBuscarIdusuarioImpresor.setForeground(Color.DARK_GRAY);
		txtBuscarIdusuarioImpresor.setText("Buscar IdUsuario impresor");
		txtBuscarIdusuarioImpresor.setBounds(81, 203, 173, 20);
		txtBuscarIdusuarioImpresor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtBuscarIdusuarioImpresor.getText().equals("Buscar IdUsuario impresor")) {
					txtBuscarIdusuarioImpresor.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtBuscarIdusuarioImpresor.getText().equals("")) {
					txtBuscarIdusuarioImpresor.setText("Buscar IdUsuario impresor");
				}
			}
		});
		panel.add(txtBuscarIdusuarioImpresor);
		txtBuscarIdusuarioImpresor.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(216, 145, 85, 23);
		panel.add(btnBuscar);
		
		JButton btnMostrarTodos = new JButton("Mostrar todos");
		btnMostrarTodos.setBounds(309, 145, 115, 23);
		panel.add(btnMostrarTodos);
		
		JButton button = new JButton("Buscar");
		button.setBounds(264, 202, 85, 23);
		panel.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("imagenes\\logo-REDM-REDM.png"));
		label_1.setBounds(25, 127, 46, 41);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("imagenes\\Usuario-impresor-REDM.png"));
		label_2.setBounds(22, 188, 53, 52);
		panel.add(label_2);
	}



	/** 
	 * (sin Javadoc)
	 * @see GUIDiseño#update(int event, Object res)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("unchecked")
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_IMPRESORA_OK:
			gUIAltaImpresora.update(event, null);
			break;
		case Events.ALTA_IMPRESORA_KO:
			gUIAltaImpresora.update(event, null);
			break;
		case Events.BAJA_IMPRESORA_OK:
			gUIBajaImpresora.update(event, res);
			break;
		case Events.BAJA_DISEÑO_KO:
			gUIBajaImpresora.update(event, res);
			break;
		case Events.MODIFICAR_IMPRESORA_OK:
			gUIModificarImpresora.update(Events.MODIFICAR_DISEÑO_OK, res);
			break;
		case Events.MODIFICAR_IMPRESORA_KO:
			gUIModificarImpresora.update(Events.MODIFICAR_DISEÑO_KO, res);
			break;
		}
	}
}