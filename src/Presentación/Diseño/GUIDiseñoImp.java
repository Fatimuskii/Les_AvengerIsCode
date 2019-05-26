/**
 * 
 */
package Presentaci�n.Dise�o;

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

import Negocio.Dise�o.TDise�o;
import Presentaci�n.Controlador.Controlador;
import Presentaci�n.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIDise�oImp extends GUIDise�o {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIAltaDise�o gUIAltaDise�o;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIBajaDise�o gUIBajaDise�o;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIModificarDise�o gUIModificarDise�o;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIListarDise�os gUIListarDise�os;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIBuscarPalabraDise�o gUIBuscarPalabraDise�o;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIListarporUsuarioDise�o gUIListarporUsuarioDise�o;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GUIBuscarporIdDise�o gUIBuscarporIdDise�o;
	
	private JPanel contentPane;
	private JTextField txtBuscarId;
	private JTextField txtListarIdusuario;
	private JTextField txtBuscarPalabraClave;
	
	public GUIDise�oImp() {
		super();
		contentPane = new JPanel();
		gUIAltaDise�o = new GUIAltaDise�o();
		gUIBajaDise�o = new GUIBajaDise�o();
		gUIBuscarPalabraDise�o = new GUIBuscarPalabraDise�o();
		gUIBuscarporIdDise�o = new GUIBuscarporIdDise�o();
		gUIListarDise�os = new GUIListarDise�os();
		gUIListarporUsuarioDise�o = new GUIListarporUsuarioDise�o();
		gUIModificarDise�o = new GUIModificarDise�o();
		initGUI();
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private void initGUI() {
		// begin-user-code
		setTitle("Men� Dise�os");
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						"imagenes\\graphic-tools.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 536, 338);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblIconoDise�o = new JLabel("");
		lblIconoDise�o
				.setIcon(new ImageIcon(
						"imagenes\\IconoDise�oMenu.png"));

		JButton btnAltaDise�o = new JButton("Alta Dise�o");
		btnAltaDise�o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIAltaDise�o.clearData();
				gUIAltaDise�o.setVisible(true);
			}
		});

		JButton btnBajaDise�o = new JButton("Baja Dise�o");
		btnBajaDise�o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIBajaDise�o.clearData();
				gUIBajaDise�o.setVisible(true);
			}
		});

		JButton btnListarDiseos = new JButton("Listar Dise�os");
		btnListarDiseos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIListarDise�os.clearData();
				gUIListarDise�os.setVisible(true);
				Controlador.getInstance().accion(Events.LISTAR_DISE�OS, null);
				gUIListarDise�os.toFront();
			}
		});

		JButton btnModificarDiseos = new JButton("Modificar Dise�o");
		btnModificarDiseos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIModificarDise�o.clearData();
				gUIModificarDise�o.setVisible(true);
			}
		});

		JButton btnListarDiseosPor = new JButton("Listar Dise�os por usuario");
		btnListarDiseosPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(txtListarIdusuario.getText().equals("(idUsuario)")){
						throw new Exception("Introduzca un Usuario");
					}
					int usuario = Integer.parseInt(txtListarIdusuario.getText());
					
					gUIListarporUsuarioDise�o.clearData();
					gUIListarporUsuarioDise�o.setVisible(true);
					
					Controlador.getInstance().accion(Events.LISTAR_DISE�OS_USU, usuario);
					gUIBuscarPalabraDise�o.toFront();
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnBuscarDiseo = new JButton("Buscar Dise�o");
		btnBuscarDiseo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gUIBuscarporIdDise�o.clearData();
				try {
					if(txtBuscarId.getText().equals("(id)")){
						throw new Exception("Introduzca un id");
					}
					int id = Integer.parseInt(txtBuscarId.getText());
					gUIBuscarporIdDise�o.setVisible(true);
				
					Controlador.getInstance().accion(Events.BUSCAR_DISE�O_ID, id);
					gUIBuscarporIdDise�o.toFront();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnBuscarDiseoPor = new JButton(
				"Buscar Dise�os por Palabra Clave");
		btnBuscarDiseoPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(txtBuscarPalabraClave.getText().equals("(palabra clave)")){
						throw new Exception("Introduzca una palabra clave");
					}
					String palabra = txtBuscarPalabraClave.getText();
					gUIBuscarPalabraDise�o.clearData();
					gUIBuscarPalabraDise�o.setVisible(true);
					Controlador.getInstance().accion(Events.BUSCAR_DISE�O_PALABRA_CLAVE, palabra);
					gUIBuscarPalabraDise�o.toFront();
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
																				lblIconoDise�o,
																				GroupLayout.PREFERRED_SIZE,
																				147,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								btnAltaDise�o,
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
																								btnBajaDise�o,
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
																				btnAltaDise�o)
																		.addGap(47)
																		.addComponent(
																				btnListarDiseos))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(2)
																		.addComponent(
																				btnBajaDise�o)
																		.addGap(47)
																		.addComponent(
																				btnModificarDiseos))
														.addComponent(
																lblIconoDise�o,
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
	 * @see GUIDise�o#update(int event, Object res)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("unchecked")
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_DISE�O_OK:
			gUIAltaDise�o.update(event, res);
			break;
		case Events.ALTA_DISE�O_KO:
			gUIAltaDise�o.update(event, res);
			break;
		case Events.BAJA_DISE�O_OK:
			gUIBajaDise�o.update(event, res);
			break;
		case Events.BAJA_DISE�O_KO:
			gUIBajaDise�o.update(event, res);
			break;
		case Events.LISTAR_DISE�OS_OK:
			gUIListarDise�os.update(event,(ArrayList<TDise�o>) res);
			break;
		case Events.LISTAR_DISE�OS_KO:
			gUIListarDise�os.update(event, (ArrayList<TDise�o>) res);
			break;
		case Events.BUSCAR_DISE�O_ID_OK:
			gUIBuscarporIdDise�o.update(event, (TDise�o) res);
			break;
		case Events.BUSCAR_DISE�O_ID_KO:
			gUIBuscarporIdDise�o.update(event, (TDise�o) res);
			break;
		case Events.BUSCAR_DISE�O_PALABRA_CLAVE_OK:
			gUIBuscarPalabraDise�o.update(event, (ArrayList<TDise�o>) res);
			break;
		case Events.BUSCAR_DISE�O_PALABRA_CLAVE_KO:
			gUIBuscarPalabraDise�o.update(event, (ArrayList<TDise�o>) res);
			break;
		case Events.MODIFICAR_DISE�O_OK:
			gUIModificarDise�o.update(event, res);
			break;
		case Events.MODIFICAR_DISE�O_KO:
			gUIModificarDise�o.update(event, res);
			break;
		case Events.MODIFICAR_DISE�O_COMPROBAR_OK:
			gUIModificarDise�o.update(event, res);
			break;
		case Events.MODIFICAR_DISE�O_COMPROBAR_KO:
			gUIModificarDise�o.update(event, res);
			break;
		case Events.LISTAR_DISE�OS_USU_OK:
			gUIListarporUsuarioDise�o.update(event, (ArrayList<TDise�o>) res);
			break;
		case Events.LISTAR_DISE�OS_USU_KO:
			gUIListarporUsuarioDise�o.update(event, (ArrayList<TDise�o>) res);
			break;
			
		}
		
		
	}
}