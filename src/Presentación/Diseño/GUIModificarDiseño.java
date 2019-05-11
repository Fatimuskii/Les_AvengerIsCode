/**
 * 
 */
package Presentación.Diseño;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.SystemColor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIModificarDiseño extends JFrame{
	
	private JPanel contentPane;
	private JTextField textID;
	private JTextField textNombre;
	private JTextField textAlto;
	private JTextField textAncho;
	private JTextField textProfundidad;
	private JTextField textArchivo;
	
	public GUIModificarDiseño(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	private void initGUI(){
		setTitle("Modificar Diseño");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIdDiseño = new JLabel("ID Diseño:");
		
		textID = new JTextField();
		textID.setColumns(10);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Comprobar si el ID es correcto
				
				
				//Comprobar si el ID existe
				
			}
		});
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.menu);
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);
		
		JLabel lblAltura = new JLabel("Alto:");
		
		JLabel lblAncho = new JLabel("Ancho:");
		
		textAlto = new JTextField();
		textAlto.setEditable(false);
		textAlto.setColumns(10);
		
		JLabel lblProfundidad = new JLabel("Profundidad:");
		
		JLabel lblArchivo = new JLabel("Archivo:");
		
		textAncho = new JTextField();
		textAncho.setEditable(false);
		textAncho.setColumns(10);
		
		textProfundidad = new JTextField();
		textProfundidad.setEditable(false);
		textProfundidad.setColumns(10);
		
		textArchivo = new JTextField();
		textArchivo.setEditable(false);
		textArchivo.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblIdDiseño, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textID, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(66)
					.addComponent(btnComprobar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(205))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
					.addGap(29))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblAltura, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textAlto, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(205))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblAncho, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textAncho, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(205))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblProfundidad, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textProfundidad, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(205))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblArchivo, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textArchivo, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(205))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(283)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblIdDiseño))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnComprobar))
					.addGap(11)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescripcion)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAltura))
						.addComponent(textAlto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAncho))
						.addComponent(textAncho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblProfundidad))
						.addComponent(textProfundidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblArchivo))
						.addComponent(textArchivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}
}