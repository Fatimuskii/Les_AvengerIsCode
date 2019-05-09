package Presentación.Local;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import Negocio.Local.SARepresentante;
import Negocio.Local.TLocal;
import Negocio.Local.TRepresentante;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

@SuppressWarnings("serial")
public class GUIAltaLocal extends JFrame {

	

	private JPanel contentPane;

	private TLocal local;
	private int IdRepresentante;

	
	JTextField nombre;
	JTextField telefono;
	JTextField CIF;
	JTextField direccion;
	JTextField CP;
	JTextField localidad;
	//JTextField IdRepre;
	

	public GUIAltaLocal() {
		super();
		contentPane = new JPanel();
		initGUI();
	}
	public GUIAltaLocal(int idRep){
		super();
		contentPane = new JPanel();
		this.IdRepresentante= idRep;
		initGUI();
	}

	public int getIdRepresentante(){
		return this.IdRepresentante;
	}

	public void initGUI() {
		setResizable(false);

		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"imagenes\\local1.png"));
		setTitle("FORMULARIO DE CREACION DE LOCAL");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 492, 455);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/* DATOS DEL LOCAL EN SI: */

		JLabel lblDatosDelLocal = new JLabel("Datos del Local:");
		lblDatosDelLocal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelLocal.setBounds(28, 100, 130, 16);
		contentPane.add(lblDatosDelLocal);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(63, 149, 119, 29);
		contentPane.add(lblNombre);

		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(194, 152, 175, 22);
		contentPane.add(nombre);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(63, 179, 119, 29);
		contentPane.add(lblTelefono);

		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(194, 182, 116, 22);
		contentPane.add(telefono);

		JLabel lblCif = new JLabel("CIF:");
		lblCif.setBounds(63, 209, 119, 29);
		contentPane.add(lblCif);

		CIF = new JTextField();
		CIF.setColumns(10);
		CIF.setBounds(194, 212, 175, 22);
		contentPane.add(CIF);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(63, 240, 119, 29);
		contentPane.add(lblDireccin);

		direccion = new JTextField();
		direccion.setColumns(10);
		direccion.setBounds(194, 243, 175, 22);
		contentPane.add(direccion);

		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal:");
		lblCdigoPostal.setBounds(63, 271, 119, 29);
		contentPane.add(lblCdigoPostal);

		CP = new JTextField();
		CP.setColumns(10);
		CP.setBounds(194, 274, 116, 22);
		contentPane.add(CP);

		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(63, 299, 119, 29);
		contentPane.add(lblLocalidad);

		localidad = new JTextField();
		localidad.setColumns(10);
		localidad.setBounds(194, 303, 116, 22);
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
						cpLocal, locLocal, getIdRepresentante(), true);
				Controlador.getInstance().accion(Events.ALTA_LOCAL, local);
				dispose();

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAceptar.setBounds(341, 327, 116, 36);
		contentPane.add(btnAceptar);

		JLabel lblLogoaltalocal = new JLabel("logoAltaLocal");
		lblLogoaltalocal.setBounds(327, 42, 76, 74);
		Icon icono = new ImageIcon(new ImageIcon("F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\altaLocal.png").getImage().getScaledInstance(lblLogoaltalocal.getWidth(), lblLogoaltalocal.getHeight(), Image.SCALE_DEFAULT));
		lblLogoaltalocal.setIcon(icono);
		this.repaint();
		
		contentPane.add(lblLogoaltalocal);
		
	}

	public void limpiarDatos() {
		// TODO Apéndice de método generado automáticamente
		contentPane = new JPanel();
		initGUI();
	}


}
