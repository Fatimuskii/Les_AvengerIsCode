/**
 * 
 */
package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import Negocio.Diseño.TDiseño;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIModificarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtEmail;
	private JTextField txtContrasea;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblDatosBancarios;
	private JLabel lblFechaVencimiento;
	private JTextField txtConfirmarContrasea;
	private JSpinner dia;
	private JSpinner mes;
	private JSpinner anio;
	private JSpinner mes_2;
	private JSpinner anio_2;
	private JTextField txtDireccin;
	private JLabel lblDatosPersonales;
	private JSeparator separator;

	private JButton btnFinalizar;
	private JTextField numTarjeta;
	private JTextField nombreTarjeta;
	private JTextField txtIdusuario;
//	private SimpleDateFormat fechaNac;
//	private SimpleDateFormat fechaVenc;

	private int id;
	//private boolean admin;

	public GUIModificarUsuario(int id) {
		super();
		this.contentPane = new JPanel();
	//	this.admin = admin;
		this.id = id;
		this.setFocusable(true);
		initGUI();
	}

	public void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\logo.png"));
		setTitle("Modificar Usuario");
		setBounds(100, 100, 453, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		txtIdusuario = new JTextField();
	//	if (admin) {
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
			txtIdusuario.setText("idUsuario");
//		} else {
//			txtIdusuario.setText(String.valueOf(id));
//			txtIdusuario.setEditable(false);
//		}
		txtIdusuario.setToolTipText("");
		txtIdusuario.setForeground(Color.DARK_GRAY);
		txtIdusuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtIdusuario.setColumns(10);
		txtIdusuario.setBounds(28, 29, 124, 20);
		panel.add(txtIdusuario);

		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(193, 28, 89, 23);
	//	if (admin) {
			btnComprobar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					id = Integer.parseInt(txtIdusuario.getText());
					Controlador.getInstance().accion(
							Events.MODIFICAR_USUARIO_COMPROBAR, id);
					toFront();
				}
			});
	//	}
	//	else btnComprobar.setEnabled(false);
		panel.add(btnComprobar);

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

		txtConfirmarContrasea = new JTextField();
		txtConfirmarContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtConfirmarContrasea.getText().equals(
						"Confirmar contraseña")) {
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

		lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaDeNacimiento.setBounds(28, 171, 124, 14);
		panel.add(lblFechaDeNacimiento);

		dia = new JSpinner();
		dia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		dia.setBounds(28, 196, 39, 20);
		panel.add(dia);

		mes = new JSpinner();
		mes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		mes.setBounds(77, 196, 39, 20);
		panel.add(mes);

		anio = new JSpinner();
		anio.setModel(new SpinnerNumberModel(1900, 1900, 2001, 1));
		anio.setBounds(126, 196, 65, 20);
		panel.add(anio);

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

		lblDatosBancarios = new JLabel("Datos bancarios");
		lblDatosBancarios.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDatosBancarios.setBounds(28, 258, 152, 23);
		panel.add(lblDatosBancarios);

		numTarjeta = new JTextField("N\u00FAmero de tarjeta");
		numTarjeta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (numTarjeta.getText().equals("N\u00FAmero de tarjeta")) {
					numTarjeta.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (numTarjeta.getText().equals("")) {
					numTarjeta.setText("N\u00FAmero de tarjeta");
				}
			}
		});
		numTarjeta.setForeground(Color.DARK_GRAY);
		numTarjeta.setColumns(10);
		numTarjeta.setBounds(28, 292, 152, 20);
		panel.add(numTarjeta);

		nombreTarjeta = new JTextField("Nombre en la tarjeta");
		nombreTarjeta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (nombreTarjeta.getText().equals("Nombre en la tarjeta")) {
					nombreTarjeta.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (nombreTarjeta.getText().equals("")) {
					nombreTarjeta.setText("Nombre en la tarjeta");
				}
			}
		});
		nombreTarjeta.setForeground(Color.DARK_GRAY);
		nombreTarjeta.setColumns(10);
		nombreTarjeta.setBounds(28, 323, 152, 20);
		panel.add(nombreTarjeta);

		lblFechaVencimiento = new JLabel("Fecha de vencimiento");
		lblFechaVencimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaVencimiento.setBounds(28, 354, 138, 14);
		panel.add(lblFechaVencimiento);

		mes_2 = new JSpinner();
		mes_2.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		mes_2.setBounds(28, 379, 46, 20);
		panel.add(mes_2);

		anio_2 = new JSpinner();
		anio_2.setModel(new SpinnerNumberModel(new Integer(2019), new Integer(
				2019), null, new Integer(1)));
		anio_2.setBounds(86, 379, 66, 20);
		panel.add(anio_2);

		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	if(admin)
				id = Integer.parseInt(txtIdusuario.getText());
				String nombre = txtNombre.getText();
				String apellidos = txtApellidos.getText();
				String email = txtEmail.getText();
				String fechaNacimiento = dia.getValue().toString() + "/"
						+ mes.getValue().toString() + "/" + anio.getValue().toString();
				

				String direccion = txtDireccin.getText();
				String nombTarjeta = nombreTarjeta.getText();
				String numeroTarjeta = numTarjeta.getText();
				String fechaVencimiento = mes_2.getValue() + "/"
						+ anio_2.getValue();
				
				String contraseña = txtContrasea.getText();

				TUsuario tUsuario = new TUsuario(id, nombre, apellidos, email,
						fechaNacimiento, direccion, contraseña, nombTarjeta,
						numeroTarjeta, fechaVencimiento, true);
				Controlador.getInstance().accion(Events.MODIFICAR_USUARIO,
						tUsuario);
			}
		});
		btnFinalizar.setBounds(328, 477, 89, 23);
		panel.add(btnFinalizar);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 60, 306, 2);
		panel.add(separator_1);
	}

	public void clearData() {
		txtNombre.setText("");
		txtApellidos.setText("");
		txtApellidos.setText("");
		txtContrasea.setText("");
		txtConfirmarContrasea.setText("");
		txtDireccin.setText("");
		numTarjeta.setText("");
		nombreTarjeta.setText("");
		txtEmail.setText("");
		dia.setValue(1);
		mes.setValue(1);
		anio.setValue(1900);
		mes_2.setValue(1);
		anio_2.setValue(2019);

		txtNombre.setEditable(false);
		txtApellidos.setEditable(false);
		txtApellidos.setEditable(false);
		txtContrasea.setEditable(false);
		txtConfirmarContrasea.setEditable(false);
		txtDireccin.setEditable(false);
		numTarjeta.setEditable(false);
		nombreTarjeta.setEditable(false);
		((DefaultEditor) dia.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) mes.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) anio.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) mes_2.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) anio_2.getEditor()).getTextField().setEditable(false);
		txtEmail.setEditable(false);
	}

	@SuppressWarnings("deprecation")
	public void update(int events, TUsuario res) {
		switch (events) {
		case Events.MODIFICAR_USUARIO_OK:
			JOptionPane.showMessageDialog(null,
					"Éxito al modificar el usuario id: " + id);
			dispose();
			break;
		case Events.MODIFICAR_USUARIO_KO:
			JOptionPane.showMessageDialog(null,
					"Error al modificar el usuario id: " + id, "Error Usuario",
					JOptionPane.ERROR_MESSAGE);
			break;
		case Events.MODIFICAR_USUARIO_COMPROBAR_OK:
			txtNombre.setEditable(true);
			txtApellidos.setEditable(true);
			txtApellidos.setEditable(true);
			txtContrasea.setEditable(true);
			txtConfirmarContrasea.setEditable(true);
			txtDireccin.setEditable(true);
			numTarjeta.setEditable(true);
			nombreTarjeta.setEditable(true);
			((DefaultEditor) dia.getEditor()).getTextField().setEditable(true);
			((DefaultEditor) mes.getEditor()).getTextField().setEditable(true);
			((DefaultEditor) anio.getEditor()).getTextField().setEditable(true);
			((DefaultEditor) mes_2.getEditor()).getTextField()
					.setEditable(true);
			((DefaultEditor) anio_2.getEditor()).getTextField().setEditable(
					true);
			txtEmail.setEditable(true);
			
			txtNombre.setText(res.getNombre());
			txtApellidos.setText(res.getApellidos());
			txtContrasea.setText(res.getContraseña());
			txtConfirmarContrasea.setText(res.getContraseña());
			txtDireccin.setText(res.getDireccion());
			numTarjeta.setText(res.getNumeroCuenta());
			nombreTarjeta.setText(res.getTitularCuenta());
			txtEmail.setText(res.getEmail());
//			dia.setValue(res.getFechaNacimiento().substring(0, 2));
//			mes.setValue(res.getFechaNacimiento().substring(3, 5));
//			anio.setValue(res.getFechaNacimiento().substring(6, 9));
//			mes_2.setValue(res.getFechaCaducidad().substring(0, 2));
//			anio_2.setValue(res.getFechaCaducidad().substring(4, 7));
			

			
			dia.setValue(Integer.valueOf(Integer.parseInt(res.getFechaNacimiento().substring(0, 1))));
			mes.setValue(Integer.valueOf(Integer.parseInt(res.getFechaNacimiento().substring(2, 4))));//**************
			anio.setValue(Integer.valueOf(Integer.parseInt(res.getFechaNacimiento().substring(5, 9))));
			mes_2.setValue(Integer.valueOf(Integer.parseInt(res.getFechaCaducidad().substring(0, 1))));
			anio_2.setValue(Integer.valueOf(Integer.parseInt(res.getFechaCaducidad().substring(2, 6))));

			txtNombre.setEnabled(true);
			txtApellidos.setEnabled(true);
			txtApellidos.setEnabled(true);
			txtContrasea.setEnabled(true);
			txtConfirmarContrasea.setEnabled(true);
			txtDireccin.setEnabled(true);
			numTarjeta.setEnabled(true);
			nombreTarjeta.setEnabled(true);
			txtEmail.setEnabled(true);
			dia.setEnabled(true);
			mes.setEnabled(true);
			anio.setEnabled(true);
			mes_2.setEnabled(true);
			anio_2.setEnabled(true);
			break;
		case Events.MODIFICAR_USUARIO_COMPROBAR_KO:
			JOptionPane.showMessageDialog(null,
					"Error al modificar el usuario id: " + id, "Error Usuario",
					JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}