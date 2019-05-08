package Presentación.Local;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import Negocio.Local.TLocal;
import Negocio.Local.TRepresentante;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

@SuppressWarnings("serial")
public class GUIAltaLocal extends JFrame {

	private JPanel contentPane;

	private TLocal local;
	private TRepresentante representante;

	JTextField rep_nombreCompleto;
	JTextField telefonoPersonal;
	JTextField email;
	JTextField nombre;
	JTextField telefono;
	JTextField CIF;
	JTextField direccion;
	JTextField CP;
	JTextField localidad;

	public GUIAltaLocal() {
		super();
		contentPane = new JPanel();
		initGUI();
	}

	public void initGUI() {
		setResizable(false);

		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\local1.png"));
		setTitle("FORMULARIO DE CREACION DE LOCAL");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/* DATOS DEL REPRESENTANTE */
		JLabel lblDatosDelPropietario = new JLabel("Datos del Propietario:");
		lblDatosDelPropietario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelPropietario.setBounds(40, 77, 154, 16);
		contentPane.add(lblDatosDelPropietario);

		JLabel lblNombreRepresentante = new JLabel("Nombre y Apellidos:");
		lblNombreRepresentante.setBounds(75, 106, 143, 36);
		contentPane.add(lblNombreRepresentante);

		rep_nombreCompleto = new JTextField();
		rep_nombreCompleto.setBounds(195, 113, 186, 22);
		contentPane.add(rep_nombreCompleto);
		rep_nombreCompleto.setColumns(10);

		JLabel lblTelefonoPersonal = new JLabel("Telefono personal:");
		lblTelefonoPersonal.setBounds(75, 134, 143, 36);
		contentPane.add(lblTelefonoPersonal);

		telefonoPersonal = new JTextField();
		telefonoPersonal.setColumns(10);
		telefonoPersonal.setBounds(195, 141, 186, 22);
		contentPane.add(telefonoPersonal);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(75, 164, 70, 36);
		contentPane.add(lblEmail);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(195, 171, 186, 22);
		contentPane.add(email);

		JButton btnValidarDatosProp = new JButton("Validar Datos");
		btnValidarDatosProp.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		btnValidarDatosProp.setBounds(353, 213, 116, 29);
		contentPane.add(btnValidarDatosProp);

		btnValidarDatosProp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Primero recoger los datos del Representante:
				/*
				 * rep_nombreCompleto; telefonoPersonal; email;
				 */
				String nombreRep = rep_nombreCompleto.getText();
				int telRep = Integer.parseInt(telefonoPersonal.getText());
				String emailRep = email.getText();

				representante = new TRepresentante(nombreRep, telRep, emailRep);
				Controlador.getInstance().accion(Events.ALTA_REPRESENTANTE_OK, representante);
			}
		});
		/* DATOS DEL LOCAL EN SI: */

		JLabel lblDatosDelLocal = new JLabel("Datos del Local:");
		lblDatosDelLocal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelLocal.setBounds(40, 213, 130, 16);
		contentPane.add(lblDatosDelLocal);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(75, 262, 119, 29);
		contentPane.add(lblNombre);

		nombre = new JTextField();
		nombre.setEditable(false);
		nombre.setColumns(10);
		nombre.setBounds(206, 265, 175, 22);
		contentPane.add(nombre);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(75, 292, 119, 29);
		contentPane.add(lblTelefono);

		telefono = new JTextField();
		telefono.setEditable(false);
		telefono.setColumns(10);
		telefono.setBounds(206, 295, 116, 22);
		contentPane.add(telefono);

		JLabel lblCif = new JLabel("CIF:");
		lblCif.setBounds(75, 322, 119, 29);
		contentPane.add(lblCif);

		CIF = new JTextField();
		CIF.setEditable(false);
		CIF.setColumns(10);
		CIF.setBounds(206, 325, 175, 22);
		contentPane.add(CIF);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(75, 353, 119, 29);
		contentPane.add(lblDireccin);

		direccion = new JTextField();
		direccion.setEditable(false);
		direccion.setColumns(10);
		direccion.setBounds(206, 356, 175, 22);
		contentPane.add(direccion);

		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setBounds(75, 384, 119, 29);
		contentPane.add(lblCdigoPostal);

		CP = new JTextField();
		CP.setEditable(false);
		CP.setColumns(10);
		CP.setBounds(206, 387, 116, 22);
		contentPane.add(CP);

		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(75, 412, 119, 29);
		contentPane.add(lblLocalidad);

		localidad = new JTextField();
		localidad.setEditable(false);
		localidad.setColumns(10);
		localidad.setBounds(206, 416, 116, 22);
		contentPane.add(localidad);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Nota: meter un comprobar de los datos de representante.
				// Si va bien, validamos los datos de Local.

				// Segundo los datos del local en sí
				/* nombre; telefono; CIF; direccion; CP; localidad; */
				String nombreLocal = nombre.getText();
				int telLocal = Integer.parseInt(telefono.getText());
				int cifLocal = Integer.parseInt(CIF.getText());
				String dirLocal = direccion.getText();
				int cpLocal = Integer.parseInt(CP.getText());
				String locLocal = localidad.getText();

				// Nota.... no se como conseguir el ID que genere el
				// TRepresentante...)

				local = new TLocal(nombreLocal, telLocal, cifLocal, dirLocal,
						cpLocal, locLocal, 1, true);
				Controlador.getInstance().accion(Events.ALTA_LOCAL, local);
				dispose();

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(353, 440, 116, 36);
		btnAceptar.setEnabled(false);
		contentPane.add(btnAceptar);

		JLabel lblLogonuevolocal = new JLabel("LogoNuevoLocal");
		lblLogonuevolocal.setBounds(302, 13, 96, 79);
		contentPane.add(lblLogonuevolocal);
	}

	public void limpiarDatos() {
		// TODO Apéndice de método generado automáticamente
		contentPane = new JPanel();
		initGUI();
	}
}
