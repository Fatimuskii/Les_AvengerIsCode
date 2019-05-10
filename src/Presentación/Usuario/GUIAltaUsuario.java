/**
 * 
 */
package Presentaci�n.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIAltaUsuario extends JFrame {

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
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JButton btnFinalizar;
	

	private GUIDatosBancariosUsuario GUI_DatosBancariosUsuario;

	public GUIAltaUsuario() {
		super();
		this.contentPane = new JPanel();
		this.txtNombre = new JTextField();
		this.txtApellidos = new JTextField();
		this.txtEmail = new JTextField();
		this.txtContrasea = new JTextField();
		this.lblFechaDeNacimiento = new JLabel();
		this.txtConfirmarContrasea = new JTextField();
		this.spinner = new JSpinner();
		this.spinner_1 = new JSpinner();
		this.spinner_2 = new JSpinner();
		this.txtDireccin = new JTextField();
		this.lblDatosPersonales = new JLabel();
		this.separator = new JSeparator();
		this.btnNewButton = new JButton();
		this.lblNewLabel = new JLabel();
		this.label = new JLabel();
		this.label_1 = new JLabel();
		this.label_2 = new JLabel();
		this.label_3 = new JLabel();
		this.label_4 = new JLabel();
		this.label_5 = new JLabel();
		this.btnFinalizar = new JButton();
		this.GUI_DatosBancariosUsuario = new GUIDatosBancariosUsuario();
		this.setFocusable(true);
		initGUI();
	}

	public void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUIAltaUsuario.class.getResource("/logo.png")));
		setTitle("Alta Usuario");
		setBounds(100, 100, 453, 441);
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
		txtNombre.setBounds(28, 86, 103, 20);
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
		txtApellidos.setBounds(158, 86, 176, 20);
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
		txtEmail.setBounds(28, 117, 306, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);

		txtContrasea = new JTextField();
		txtContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtContrasea.getText().equals("Contrase�a")) {
					txtContrasea.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtContrasea.getText().equals("")) {
					txtContrasea.setText("Contrase�a");
				}
			}
		});
		txtContrasea.setForeground(Color.DARK_GRAY);
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setBounds(28, 285, 139, 20);
		panel.add(txtContrasea);
		txtContrasea.setColumns(10);

		lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaDeNacimiento.setBounds(28, 159, 124, 14);
		panel.add(lblFechaDeNacimiento);

		txtConfirmarContrasea = new JTextField();
		txtConfirmarContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtConfirmarContrasea.getText().equals("Confirmar contrase�a")) {
					txtConfirmarContrasea.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtConfirmarContrasea.getText().equals("")) {
					txtConfirmarContrasea.setText("Confirmar contrase�a");
				}
			}
		});
		txtConfirmarContrasea.setForeground(Color.DARK_GRAY);
		txtConfirmarContrasea.setText("Confirmar contrase\u00F1a");
		txtConfirmarContrasea.setBounds(28, 316, 139, 20);
		panel.add(txtConfirmarContrasea);
		txtConfirmarContrasea.setColumns(10);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner.setBounds(28, 184, 39, 20);
		panel.add(spinner);

		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 12, 2));
		spinner_1.setBounds(77, 184, 39, 20);
		panel.add(spinner_1);

		spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(1900, 1900, 2001, 4));
		spinner_2.setBounds(126, 184, 65, 20);
		panel.add(spinner_2);

		txtDireccin = new JTextField();
		txtDireccin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtDireccin.getText().equals("Direcci�n")) {
					txtDireccin.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtDireccin.getText().equals("")) {
					txtDireccin.setText("Direcci�n");
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
		lblDatosPersonales.setBounds(28, 50, 176, 25);
		panel.add(lblDatosPersonales);

		separator = new JSeparator();
		separator.setBounds(28, 272, 306, 2);
		panel.add(separator);

		btnNewButton = new JButton("Siguiente");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (!datosObligatorios()) {
					JOptionPane.showOptionDialog(new JFrame(), "Debes rellenar los campos obligatorios (*)", "Quit",
							JOptionPane.OK_OPTION, JOptionPane.OK_OPTION, null, null, null);
				} else {
					if (!contrase�aErr()) {
						GUI_DatosBancariosUsuario.setVisible(true);
					}
				}
			}
		});
		btnNewButton.setBounds(213, 358, 89, 23);
		panel.add(btnNewButton);

		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!datosObligatorios()) {
					JOptionPane.showOptionDialog(new JFrame(), "Debes rellenar los campos obligatorios (*)", "Quit",
							JOptionPane.OK_OPTION, JOptionPane.OK_OPTION, null, null, null);
				}
				contrase�aErr();
			}
		});
		btnFinalizar.setBounds(312, 358, 89, 23);
		panel.add(btnFinalizar);

		lblNewLabel = new JLabel("*");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(20, 88, 8, 14);
		panel.add(lblNewLabel);

		label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(150, 88, 17, 14);
		panel.add(label);

		label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(20, 120, 17, 14);
		panel.add(label_1);

		label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(20, 159, 17, 14);
		panel.add(label_2);

		label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(20, 230, 17, 14);
		panel.add(label_3);

		label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(20, 288, 17, 14);
		panel.add(label_4);

		label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(20, 316, 17, 14);
		panel.add(label_5);
	}

	private boolean datosObligatorios() {
		if (txtNombre.getText().equals("Nombre") || txtApellidos.getText().equals("Apellido(s)") || txtEmail.getText().equals("E-mail")
				|| txtContrasea.getText().equals("Contrase�a") || txtConfirmarContrasea.getText().equals("Confirmar contrase�a")
				|| txtDireccin.getText().equals("Direcci�n"))
			return false;
		return true;
	}

	private boolean contrase�aErr() {
		if (!this.txtConfirmarContrasea.getText().equals(this.txtContrasea.getText())) {
			txtContrasea.setBackground(Color.red);
			txtConfirmarContrasea.setBackground(Color.red);
			JOptionPane.showMessageDialog(new JFrame(), "La contrase�a no coincide");
			return true;
		}
		else {
			txtContrasea.setBackground(Color.white);
			txtConfirmarContrasea.setBackground(Color.white);

		return false;
		}
	}
	
	//GENERAR ID ALEATORIO TODO
}