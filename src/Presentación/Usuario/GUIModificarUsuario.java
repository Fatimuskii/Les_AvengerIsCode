/**
 * 
 */
package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import Negocio.Diseño.TDiseño;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIModificarUsuario extends JFrame{
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtEmail;
	private JTextField txtContrasea;
	private JLabel lblFechaDeNacimiento;
	private JTextField txtConfirmarContrasea;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JSpinner spinner_2;
	private JTextField txtDireccin;
	private JLabel lblDatosPersonales;
	private JSeparator separator;

	private JButton btnFinalizar;
	private JTextField numTarjeta;
	private JTextField nombreTarjeta;
	private JTextField txtIdusuario;

	private int id;
	
	public GUIModificarUsuario() {
		super();
		this.contentPane = new JPanel();
		this.txtNombre = new JTextField();
		this.numTarjeta = new JTextField();
		this.nombreTarjeta = new JTextField();
		this.txtApellidos = new JTextField();
		this.txtEmail = new JTextField();
		this.txtIdusuario = new JTextField();
		this.txtContrasea = new JTextField();
		this.lblFechaDeNacimiento = new JLabel();
		this.txtConfirmarContrasea = new JTextField();
		this.spinner = new JSpinner();
		this.spinner_1 = new JSpinner();
		this.spinner_2 = new JSpinner();
		this.txtDireccin = new JTextField();
		this.lblDatosPersonales = new JLabel();
		this.separator = new JSeparator();
		this.btnFinalizar = new JButton();
		this.setFocusable(true);
		initGUI();
	}


	public void initGUI(){
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logo.png"));
		setTitle("Alta Usuario");
		setBounds(100, 100, 453, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtNombre.getText().equals("Nombre")) {
					txtNombre.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtNombre.getText().equals("")) {
					txtNombre.setText("Nombre");
				}
			}
		});
		
		txtNombre.setForeground(Color.DARK_GRAY);
		txtNombre.setText("Nombre");
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNombre.setToolTipText("");
		txtNombre.setBounds(28, 109, 103, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellidos = new JTextField();
		txtApellidos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtApellidos.getText().equals("Apellido(s)")) {
					txtApellidos.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtApellidos.getText().equals("")) {
					txtApellidos.setText("Apellido(s)");
				}
			}
		});
		txtApellidos.setForeground(Color.DARK_GRAY);
		txtApellidos.setText("Apellido(s)");
		txtApellidos.setBounds(141, 109, 176, 20);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtEmail.getText().equals("E-mail")) {
					txtEmail.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEmail.getText().equals("")) {
					txtEmail.setText("E-mail");
				}
			}
		});
		txtEmail.setForeground(Color.DARK_GRAY);
		txtEmail.setText("E-mail");
		txtEmail.setBounds(28, 140, 306, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);

		txtContrasea = new JTextField();
		txtContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtContrasea.getText().equals("Contraseña")) {
					txtContrasea.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtContrasea.getText().equals("")) {
					txtContrasea.setText("Contraseña");
				}
			}
		});
		txtContrasea.setForeground(Color.DARK_GRAY);
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setBounds(28, 423, 139, 20);
		panel.add(txtContrasea);
		txtContrasea.setColumns(10);

		lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaDeNacimiento.setBounds(28, 171, 124, 14);
		panel.add(lblFechaDeNacimiento);

		txtConfirmarContrasea = new JTextField();
		txtConfirmarContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtConfirmarContrasea.getText().equals("Confirmar contraseña")) {
					txtConfirmarContrasea.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtConfirmarContrasea.getText().equals("")) {
					txtConfirmarContrasea.setText("Confirmar contraseña");
				}
			}
		});
		txtConfirmarContrasea.setForeground(Color.DARK_GRAY);
		txtConfirmarContrasea.setText("Confirmar contrase\u00F1a");
		txtConfirmarContrasea.setBounds(28, 454, 139, 20);
		panel.add(txtConfirmarContrasea);
		txtConfirmarContrasea.setColumns(10);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner.setBounds(28, 196, 39, 20);
		panel.add(spinner);

		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 2));
		spinner_1.setBounds(77, 196, 39, 20);
		panel.add(spinner_1);

		spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(1900, 1900, 2001, 4));
		spinner_2.setBounds(126, 196, 65, 20);
		panel.add(spinner_2);

		txtDireccin = new JTextField();
		txtDireccin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtDireccin.getText().equals("Dirección")) {
					txtDireccin.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtDireccin.getText().equals("")) {
					txtDireccin.setText("Dirección");
				}
			}
		});
		txtDireccin.setForeground(Color.DARK_GRAY);
		txtDireccin.setText("Direcci\u00F3n");
		txtDireccin.setBounds(28, 227, 306, 20);
		panel.add(txtDireccin);
		txtDireccin.setColumns(10);

		lblDatosPersonales = new JLabel("Datos personales");
		lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDatosPersonales.setBounds(28, 73, 176, 25);
		panel.add(lblDatosPersonales);

		separator = new JSeparator();
		separator.setBounds(28, 410, 306, 2);
		panel.add(separator);

		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!datosObligatorios()) {
					JOptionPane.showOptionDialog(new JFrame(), "Debes rellenar los campos obligatorios (*)", "Quit",
							JOptionPane.OK_OPTION, JOptionPane.OK_OPTION, null, null, null);
				}
				contraseñaErr();
			}
		});
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = Integer.parseInt(txtIdusuario.getText());
				String nombre = txtNombre.getText();
				String apellidos = txtApellidos.getText();
				String email = txtEmail.getText();
				//fecha de nacimiento
				String direccion = txtDireccin.getText();
				String nombTarjeta = nombreTarjeta.getText();
				int numeroTarjeta = Integer.parseInt(numTarjeta.getText());
				//fecha de vencimiento
				String contraseña = txtContrasea.getText();
				
				TUsuario tUsuario = new TUsuario (); //TODO
				Controlador.getInstance().accion(Events.OPEN_GUI_MODIFICAR_USUARIO, tUsuario);
			}
		});
		btnFinalizar.setBounds(328, 477, 89, 23);
		panel.add(btnFinalizar);
		
		JLabel label_6 = new JLabel("Datos bancarios");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_6.setBounds(28, 258, 152, 23);
		panel.add(label_6);
		
		numTarjeta.setText("N\u00FAmero de tarjeta");
		numTarjeta.setForeground(Color.DARK_GRAY);
		numTarjeta.setColumns(10);
		numTarjeta.setBounds(28, 292, 152, 20);
		panel.add(numTarjeta);
		
		nombreTarjeta.setText("Nombre en la tarjeta");
		nombreTarjeta.setForeground(Color.DARK_GRAY);
		nombreTarjeta.setColumns(10);
		nombreTarjeta.setBounds(28, 323, 152, 20);
		panel.add(nombreTarjeta);
		
		JLabel label_7 = new JLabel("Fecha de vencimiento");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(28, 354, 138, 14);
		panel.add(label_7);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner_3.setBounds(28, 379, 46, 20);
		panel.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(2019), new Integer(2019), null, new Integer(1)));
		spinner_4.setBounds(86, 379, 66, 20);
		panel.add(spinner_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 60, 306, 2);
		panel.add(separator_1);
		
		txtIdusuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtIdusuario.getText().equals("idUsuario")) {
					txtIdusuario.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtIdusuario.getText().equals("")) {
					txtIdusuario.setText("idUsuario");
				}
			}
		});
		txtIdusuario.setToolTipText("");
		txtIdusuario.setText("idUsuario");
		txtIdusuario.setForeground(Color.DARK_GRAY);
		txtIdusuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtIdusuario.setColumns(10);
		txtIdusuario.setBounds(28, 29, 124, 20);
		panel.add(txtIdusuario);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(193, 28, 89, 23);
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id = Integer.parseInt(txtIdusuario.getText());
				Controlador.getInstance().accion(Events.MODIFICAR_DISEÑO_COMPROBAR, id);
				toFront();
			}
		});
		panel.add(btnComprobar);
	}

	private boolean datosObligatorios() {
		if (txtNombre.getText().equals("Nombre") || txtApellidos.getText().equals("Apellido(s)") || txtEmail.getText().equals("E-mail")
				|| txtContrasea.getText().equals("Contraseña") || txtConfirmarContrasea.getText().equals("Confirmar contraseña")
				|| txtDireccin.getText().equals("Dirección"))
			return false;
		return true;
	}

	private boolean contraseñaErr() {
		if (!this.txtConfirmarContrasea.getText().equals(this.txtContrasea.getText())) {
			txtContrasea.setBackground(Color.red);
			txtConfirmarContrasea.setBackground(Color.red);
			JOptionPane.showMessageDialog(new JFrame(), "La contraseña no coincide");
			return true;
		}
		else {
			txtContrasea.setBackground(Color.white);
			txtConfirmarContrasea.setBackground(Color.white);

		return false;
		}
	}
}