package Presentación.Local;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Negocio.Local.TLocal;
import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

@SuppressWarnings("serial")
public class GUIBuscarLocal extends JFrame {

	private JTextField IdLocalField;
	private JTextField nombreField;
	private JTextField telField;
	private JTextField CIFField;
	private JTextField dirField;
	private JTextField cpField;
	private JTextField locField;
	private JTextField repreField;
	private JLabel lblActivo;
	
	private JButton btnEliminar;
	private JButton btnModificar;
	
	GUIModificarLocal Gui_modificarLocal;

	TLocal local;
	private JPanel contentPane;

	public GUIBuscarLocal(int idLoc) {

		super();
		contentPane = new JPanel();
		initGUI();
	}

	public void initGUI() {
		// tabla con todos los datos del Local
		// SALDRÁ BOTON EDITAR Y BORRAR.
		setResizable(false);
		setTitle("LOCAL");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"\\imagenes\\altaLocal.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIdlocal = new JLabel("IdLocal:");
		lblIdlocal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdlocal.setBounds(29, 28, 67, 16);
		contentPane.add(lblIdlocal);

		IdLocalField = new JTextField();
		IdLocalField.setBounds(96, 28, 74, 22);
		contentPane.add(IdLocalField);
		IdLocalField.setEditable(false);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(29, 56, 67, 16);
		contentPane.add(lblNombre);

		nombreField = new JTextField();
		nombreField.setBounds(96, 57, 101, 22);
		contentPane.add(nombreField);
		nombreField.setEditable(false);

		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTelfono.setBounds(29, 85, 67, 16);
		contentPane.add(lblTelfono);

		telField = new JTextField();
		telField.setBounds(96, 85, 84, 22);
		contentPane.add(telField);
		telField.setEditable(false);

		JLabel lblCif = new JLabel("CIF:");
		lblCif.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCif.setBounds(29, 120, 67, 16);
		contentPane.add(lblCif);

		CIFField = new JTextField();
		CIFField.setBounds(69, 114, 101, 22);
		contentPane.add(CIFField);
		CIFField.setEditable(false);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccin.setBounds(29, 143, 67, 16);
		contentPane.add(lblDireccin);

		dirField = new JTextField();
		dirField.setBounds(96, 143, 141, 22);
		contentPane.add(dirField);
		dirField.setEditable(false);

		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLocalidad.setBounds(29, 172, 67, 16);
		contentPane.add(lblLocalidad);

		locField = new JTextField();
		locField.setBounds(96, 172, 84, 22);
		contentPane.add(locField);
		locField.setEditable(false);

		JLabel lblCp = new JLabel("CP:");
		lblCp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCp.setBounds(29, 206, 43, 16);
		contentPane.add(lblCp);

		cpField = new JTextField();
		cpField.setBounds(69, 200, 67, 22);
		contentPane.add(cpField);
		cpField.setEditable(false);

		JLabel lblDueo = new JLabel("Propietario:");
		lblDueo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDueo.setBounds(29, 227, 141, 16);
		contentPane.add(lblDueo);

		repreField = new JTextField();
		repreField.setBounds(116, 227, 141, 22);
		contentPane.add(repreField);
		repreField.setEditable(false);
		
		lblActivo = new JLabel("");
		lblActivo.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		
		lblActivo.setBounds(211, 30, 97, 14);
		contentPane.add(lblActivo);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Gui_modificarLocal = new GUIModificarLocal(local);
				Gui_modificarLocal.setVisible(true);
				dispose();
			}
		});
		btnModificar.setBounds(323, 163, 97, 25);
		contentPane.add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirma = JOptionPane.showConfirmDialog(null,
						"¿Desea dar de este local?", "Confirmar baja",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (confirma == JOptionPane.YES_OPTION){
					Controlador.getInstance().accion(Events.BAJA_LOCAL,
							local.getIdLocal());
					dispose();
				}
				else
					dispose();
			}
		});
		btnEliminar.setForeground(Color.RED);
		btnEliminar.setBounds(323, 197, 97, 25);
		contentPane.add(btnEliminar);
	}

	public void update(int event, Object res) {
		// TODO Apéndice de método generado automáticamente
		GUIMensaje res_mensaje = new GUIMensaje();
		switch (event) {

		case Events.BUSCAR_LOCAL_OK:
			local = (TLocal) res;
			IdLocalField.setText("" + local.getIdLocal());
			nombreField.setText(local.getNombreLocal());
			telField.setText("" + local.getTelefono());
			CIFField.setText("" + local.getCIF());
			dirField.setText(local.getDireccion());
			cpField.setText("" + local.getCP());
			locField.setText(local.getLocalidad());
			repreField.setText(local.getRepresentante());
			if (local.getActivo()){
				lblActivo.setText("ACTIVO");
				lblActivo.setForeground(Color.GREEN);
					
			}
			else {
				lblActivo.setText("NO ACTIVO");
				lblActivo.setForeground(Color.RED);
				btnEliminar.setEnabled(false);
				btnModificar.setEnabled(false);
			}

			break;
		case Events.BUSCAR_LOCAL_KO:
			res_mensaje.showMessage("Error en la búsqueda del Local.",
					"BUSCAR LOCAL", false);
			break;

		case Events.MODIFICAR_LOCAL_OK:
			Gui_modificarLocal.update(event, res);
			break;
		case Events.MODIFICAR_LOCAL_KO:
			Gui_modificarLocal.update(event, res);
			break;
			
		case Events.BAJA_LOCAL_OK:
			res_mensaje.showMessage("Se ha dado de baja correctamente el local.",
					"DAR DE BAJA A LOCAL", false);
			break;
		case Events.BAJA_LOCAL_KO: 
			res_mensaje.showMessage("Error en la baja del Local.",
					"DAR DE BAJA A LOCAL", false);
			break;
		}
		

	}

	public void limpiar() {
		// TODO Apéndice de método generado automáticamente
		this.contentPane = new JPanel();
	}

}
