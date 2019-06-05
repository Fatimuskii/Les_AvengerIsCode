/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

import Negocio.Impresora.TImpresora;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

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

	public GUIImpresoraImp() {
		super();
		this.contentPane = new JPanel();
		this.gUIBajaImpresora = new GUIBajaImpresora();
		this.gUIModificarImpresora = new GUIModificarImpresora();
		this.gUIAltaImpresora = new GUIAltaImpresora();
		this.gUIListarImpresora = new GUIListarImpresora();
		this.gUIBuscarIdImpresora = new GUIBuscarIdImpresora();
		this.gUIBuscarUsuarioImpresora = new GUIBuscarUsuarioImpresora();
		this.setFocusable(true);
		initGUI();
	}

	/**
	 * Create the frame.
	 */
	public void initGUI() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		this.add(contentPane);
		this.setLayout(new BorderLayout());
		this.add(contentPane);

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

		JButton btnDarAlta = new JButton("Dar de alta");
		btnDarAlta.setBounds(130, 57, 100, 21);
		btnDarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIAltaImpresora.clearData();
				gUIAltaImpresora.setVisible(true);
			}
		});
		panel.add(btnDarAlta);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(260, 57, 90, 21);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIModificarImpresora.clearData();
				gUIModificarImpresora.setVisible(true);
			}
		});
		panel.add(btnModificar);

		JButton btnDarBaja = new JButton("Dar de baja");
		btnDarBaja.setBounds(370, 57, 100, 21);
		btnDarBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIBajaImpresora.clearData();
				gUIBajaImpresora.setVisible(true);
			}
		});
		panel.add(btnDarBaja);

		txtBuscar = new JTextField();
		txtBuscar.setForeground(Color.DARK_GRAY);
		txtBuscar.setText("Buscar Id impresora");
		txtBuscar.setBounds(140, 146, 126, 21);
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
		txtBuscarIdusuarioImpresor.setBounds(140, 203, 173, 20);
		txtBuscarIdusuarioImpresor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtBuscarIdusuarioImpresor.getText().equals(
						"Buscar IdUsuario impresor")) {
					txtBuscarIdusuarioImpresor.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtBuscarIdusuarioImpresor.getText().equals("")) {
					txtBuscarIdusuarioImpresor
							.setText("Buscar IdUsuario impresor");
				}
			}
		});
		panel.add(txtBuscarIdusuarioImpresor);
		txtBuscarIdusuarioImpresor.setColumns(10);

		// BOTON BUSCAR ID IMPRESORA
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					if (txtBuscar.getText().equals("Buscar Id impresora")) {
						throw new Exception();
					}
					int idImpresora = Integer.parseInt(txtBuscar.getText());

					gUIBuscarIdImpresora.clearData();
					Controlador.getInstance().accion(Events.BUSCAR_IMPRESORA,
							idImpresora);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,
							"Introduzca un idImpresora válido", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		});

		btnBuscar.setBounds(275, 145, 85, 23);
		panel.add(btnBuscar);

		JButton btnMostrarTodos = new JButton("Mostrar todos");
		btnMostrarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gUIListarImpresora.clearData();
				gUIListarImpresora.setVisible(true);
				Controlador.getInstance()
						.accion(Events.LISTAR_IMPRESORAS, null);
				gUIListarImpresora.toFront();
			}
		});
		btnMostrarTodos.setBounds(380, 145, 115, 23);
		panel.add(btnMostrarTodos);

		// BOTON BUSCAR POR ID USUARIO IMPRESOR
		JButton button = new JButton("Buscar");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					if (txtBuscarIdusuarioImpresor.getText().equals(
							"Buscar IdUsuario impresor")) {
						throw new Exception("Introduzca un idUsuario");
					}
					int idUsuario = Integer.parseInt(txtBuscarIdusuarioImpresor
							.getText());
					gUIBuscarUsuarioImpresora.clearData();
					Controlador.getInstance().accion(
							Events.BUSCAR_USUARIO_IMPRESORA, idUsuario);
				} 
				catch(NumberFormatException nf){
					JOptionPane.showMessageDialog(null, "Introduzca un id correcto (número)", "Error", JOptionPane.ERROR_MESSAGE);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(),
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		button.setBounds(323, 202, 85, 23);
		panel.add(button);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("imagenes\\3d-printer-conLOGO-REDM.png"));
		label_1.setBounds(80, 127, 53, 49);
		panel.add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("imagenes\\Usuario-impresor-REDM.png"));
		label_2.setBounds(83, 188, 53, 52);
		panel.add(label_2);
	}

	/**
	 * (sin Javadoc)
	 * 
	 * @see GUIImpresora#update(int event, Object res)
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("unchecked")
	public void update(int event, Object res) {
		switch (event) {
		case Events.ALTA_IMPRESORA_OK:
			gUIAltaImpresora.update(event, res);
			break;
		case Events.ALTA_IMPRESORA_KO:
			gUIAltaImpresora.update(event, res);
			break;
		case Events.BAJA_IMPRESORA_OK:
			gUIBajaImpresora.update(event, res);
			break;
		case Events.BAJA_DISEÑO_KO:
			gUIBajaImpresora.update(event, res);
			break;
		case Events.MODIFICAR_IMPRESORA_OK:
			gUIModificarImpresora.update(event, res);
			break;
		case Events.MODIFICAR_IMPRESORA_KO:
			gUIModificarImpresora.update(event, res);
			break;
		case Events.MODIFICAR_IMPRESORA_COMPROBAR_KO:
			gUIModificarImpresora.update(event, res);
			break;
		case Events.MODIFICAR_IMPRESORA_COMPROBAR_OK:
			gUIModificarImpresora.update(event, (TImpresora) res);
			break;
		case Events.LISTAR_IMPRESORAS_OK:
			gUIListarImpresora.update(event, (ArrayList<TImpresora>) res);
			break;
		case Events.LISTAR_IMPRESORAS_KO:
			gUIListarImpresora.update(event, (ArrayList<TImpresora>) res);
			break;
		case Events.BUSCAR_USUARIO_IMPRESORA_OK:
			gUIBuscarUsuarioImpresora
					.update(event, (ArrayList<TImpresora>) res);
			break;
		case Events.BUSCAR_USUARIO_IMPRESORA_KO:
			gUIBuscarUsuarioImpresora
					.update(event, (ArrayList<TImpresora>) res);
			break;
		case Events.BUSCAR_IMPRESORA_OK:
			gUIBuscarIdImpresora.update(event, (TImpresora) res);
			break;
		case Events.BUSCAR_IMPRESORA_KO:
			gUIBuscarIdImpresora.update(event, (TImpresora) res);
			break;
		}
	}
}