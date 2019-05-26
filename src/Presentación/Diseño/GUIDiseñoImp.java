/**
 * 
 */
package Presentación.Diseño;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import Negocio.Diseño.TDiseño;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIDiseñoImp extends GUIDiseño {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIAltaDiseño gUIAltaDiseño;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIBajaDiseño gUIBajaDiseño;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIModificarDiseño gUIModificarDiseño;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIListarDiseños gUIListarDiseños;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIBuscarPalabraDiseño gUIBuscarPalabraDiseño;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIListarporUsuarioDiseño gUIListarporUsuarioDiseño;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIBuscarporIdDiseño gUIBuscarporIdDiseño;
	
	private JPanel contentPane;
	private JTextField txtBuscarId;
	private JTextField txtListarIdusuario;
	private JTextField txtBuscarPalabraClave;
	
	public GUIDiseñoImp() {
		super();
		contentPane = new JPanel();
		gUIAltaDiseño = new GUIAltaDiseño();
		gUIBajaDiseño = new GUIBajaDiseño();
		gUIBuscarPalabraDiseño = new GUIBuscarPalabraDiseño();
		gUIBuscarporIdDiseño = new GUIBuscarporIdDiseño();
		gUIListarDiseños = new GUIListarDiseños();
		gUIListarporUsuarioDiseño = new GUIListarporUsuarioDiseño();
		gUIModificarDiseño = new GUIModificarDiseño();
		initGUI();
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private void initGUI() {
		// begin-user-code
		setTitle("Menú Diseños");
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"imagenes\\graphic-tools.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 536, 338);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblIconoDiseño = new JLabel("");
		lblIconoDiseño
				.setIcon(new ImageIcon(
						"imagenes\\IconoDiseñoMenu.png"));

		JButton btnAltaDiseño = new JButton("Alta Diseño");
		btnAltaDiseño.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIAltaDiseño.clearData();
				gUIAltaDiseño.setVisible(true);
			}
		});

		JButton btnBajaDiseño = new JButton("Baja Diseño");
		btnBajaDiseño.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIBajaDiseño.clearData();
				gUIBajaDiseño.setVisible(true);
			}
		});

		JButton btnListarDiseos = new JButton("Listar Diseños");
		btnListarDiseos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIListarDiseños.clearData();
				gUIListarDiseños.setVisible(true);
				Controlador.getInstance().accion(Events.LISTAR_DISEÑOS, null);
				gUIListarDiseños.toFront();
			}
		});

		JButton btnModificarDiseos = new JButton("Modificar Diseño");
		btnModificarDiseos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIModificarDiseño.clearData();
				gUIModificarDiseño.setVisible(true);
			}
		});

		JButton btnListarDiseosPor = new JButton("Listar Diseños por usuario");
		btnListarDiseosPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(txtListarIdusuario.getText().equals("(idUsuario)")){
						throw new Exception("Introduzca un Usuario");
					}
					int usuario = Integer.parseInt(txtListarIdusuario.getText());
					
					gUIListarporUsuarioDiseño.clearData();
					gUIListarporUsuarioDiseño.setVisible(true);
					
					Controlador.getInstance().accion(Events.LISTAR_DISEÑOS_USU, usuario);
					gUIBuscarPalabraDiseño.toFront();
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnBuscarDiseo = new JButton("Buscar Diseño");
		btnBuscarDiseo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIBuscarporIdDiseño.clearData();
				try {
					if(txtBuscarId.getText().equals("(id)")){
						throw new Exception("Introduzca un id");
					}
					int id = Integer.parseInt(txtBuscarId.getText());
					gUIBuscarporIdDiseño.setVisible(true);
				
					Controlador.getInstance().accion(Events.BUSCAR_DISEÑO_ID, id);
					gUIBuscarporIdDiseño.toFront();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnBuscarDiseoPor = new JButton(
				"Buscar Diseños por Palabra Clave");
		btnBuscarDiseoPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(txtBuscarPalabraClave.getText().equals("(palabra clave)")){
						throw new Exception("Introduzca una palabra clave");
					}
					String palabra = txtBuscarPalabraClave.getText();
					gUIBuscarPalabraDiseño.clearData();
					gUIBuscarPalabraDiseño.setVisible(true);
					Controlador.getInstance().accion(Events.BUSCAR_DISEÑO_PALABRA_CLAVE, palabra);
					gUIBuscarPalabraDiseño.toFront();
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		txtBuscarId = new JTextField();
		txtBuscarId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtBuscarId.getText().trim().equals("(id)")) {
					txtBuscarId.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtBuscarId.getText().trim().equals("")) {
					txtBuscarId.setText("(id)");
				}
			}
		});
		txtBuscarId.setText("(id)");
		txtBuscarId.setColumns(10);

		txtListarIdusuario = new JTextField();
		txtListarIdusuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtListarIdusuario.getText().trim().equals("(idUsuario)")) {
					txtListarIdusuario.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtListarIdusuario.getText().trim().equals("")) {
					txtListarIdusuario.setText("(idUsuario)");
				}
			}
		});
		txtListarIdusuario.setText("(idUsuario)");
		txtListarIdusuario.setColumns(10);

		txtBuscarPalabraClave = new JTextField();
		txtBuscarPalabraClave.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtBuscarPalabraClave.getText().trim()
						.equals("(palabra clave)")) {
					txtBuscarPalabraClave.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtBuscarPalabraClave.getText().trim().equals("")) {
					txtBuscarPalabraClave.setText("(palabra clave)");
				}
			}
		});
		txtBuscarPalabraClave.setText("(palabra clave)");
		txtBuscarPalabraClave.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(10)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblIconoDiseño,
																				GroupLayout.PREFERRED_SIZE,
																				147,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								btnAltaDiseño,
																								GroupLayout.PREFERRED_SIZE,
																								133,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								btnListarDiseos,
																								GroupLayout.PREFERRED_SIZE,
																								133,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(36)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								btnBajaDiseño,
																								GroupLayout.PREFERRED_SIZE,
																								133,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								btnModificarDiseos,
																								GroupLayout.PREFERRED_SIZE,
																								133,
																								GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				txtBuscarId,
																				GroupLayout.PREFERRED_SIZE,
																				246,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				btnBuscarDiseo,
																				GroupLayout.PREFERRED_SIZE,
																				237,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				txtListarIdusuario,
																				GroupLayout.PREFERRED_SIZE,
																				246,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				btnListarDiseosPor,
																				GroupLayout.PREFERRED_SIZE,
																				237,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				txtBuscarPalabraClave,
																				GroupLayout.PREFERRED_SIZE,
																				246,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				btnBuscarDiseoPor,
																				GroupLayout.PREFERRED_SIZE,
																				237,
																				GroupLayout.PREFERRED_SIZE)))));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(31)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(2)
																		.addComponent(
																				btnAltaDiseño)
																		.addGap(47)
																		.addComponent(
																				btnListarDiseos))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(2)
																		.addComponent(
																				btnBajaDiseño)
																		.addGap(47)
																		.addComponent(
																				btnModificarDiseos))
														.addComponent(
																lblIconoDiseño,
																GroupLayout.PREFERRED_SIZE,
																137,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				txtBuscarId,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																btnBuscarDiseo))
										.addGap(11)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				txtListarIdusuario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																btnListarDiseosPor))
										.addGap(11)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				txtBuscarPalabraClave,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																btnBuscarDiseoPor))));
		contentPane.setLayout(gl_contentPane);
				// end-user-code
	}
	
	/** 
	 * (sin Javadoc)
	 * @see GUIDiseño#update(int event, Object res)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("unchecked")
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_DISEÑO_OK:
			gUIAltaDiseño.update(event, res);
			break;
		case Events.ALTA_DISEÑO_KO:
			gUIAltaDiseño.update(event, res);
			break;
		case Events.BAJA_DISEÑO_OK:
			gUIBajaDiseño.update(event, res);
			break;
		case Events.BAJA_DISEÑO_KO:
			gUIBajaDiseño.update(event, res);
			break;
		case Events.LISTAR_DISEÑOS_OK:
			gUIListarDiseños.update(event,(ArrayList<TDiseño>) res);
			break;
		case Events.LISTAR_DISEÑOS_KO:
			gUIListarDiseños.update(event, (ArrayList<TDiseño>) res);
			break;
		case Events.BUSCAR_DISEÑO_ID_OK:
			gUIBuscarporIdDiseño.update(event, (TDiseño) res);
			break;
		case Events.BUSCAR_DISEÑO_ID_KO:
			gUIBuscarporIdDiseño.update(event, (TDiseño) res);
			break;
		case Events.BUSCAR_DISEÑO_PALABRA_CLAVE_OK:
			gUIBuscarPalabraDiseño.update(event, (ArrayList<TDiseño>) res);
			break;
		case Events.BUSCAR_DISEÑO_PALABRA_CLAVE_KO:
			gUIBuscarPalabraDiseño.update(event, (ArrayList<TDiseño>) res);
			break;
		case Events.MODIFICAR_DISEÑO_OK:
			gUIModificarDiseño.update(event, res);
			break;
		case Events.MODIFICAR_DISEÑO_KO:
			gUIModificarDiseño.update(event, res);
			break;
		case Events.MODIFICAR_DISEÑO_COMPROBAR_OK:
			gUIModificarDiseño.update(event, res);
			break;
		case Events.MODIFICAR_DISEÑO_COMPROBAR_KO:
			gUIModificarDiseño.update(event, res);
			break;
		case Events.LISTAR_DISEÑOS_USU_OK:
			gUIListarporUsuarioDiseño.update(event, (ArrayList<TDiseño>) res);
			break;
		case Events.LISTAR_DISEÑOS_USU_KO:
			gUIListarporUsuarioDiseño.update(event, (ArrayList<TDiseño>) res);
			break;
			
		}
		
		
	}
}