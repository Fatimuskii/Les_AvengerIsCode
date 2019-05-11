/**
 * 
 */
package Presentación.Diseño;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIAltaDiseño extends JFrame{
	
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textAltura;
	private JTextField textAncho;
	private JTextField textPrecio;
	private JTextField textArchivo;
	private JTextField textProfundidad;
	private JTextArea textAreaDescripcion;

	
	public GUIAltaDiseño(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\graphic-tools.png"));
		setTitle("Alta Diseño");
		setBounds(100, 100, 390, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		JLabel lblDescripción = new JLabel("Descripción:");
		
		JLabel lblPrecio = new JLabel("Precio:");
		
		JLabel lblArchivo = new JLabel("Archivo:");
		
		JScrollPane scrollPane = new JScrollPane();
		
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		scrollPane.setViewportView(textAreaDescripcion);
		
		textAltura = new JTextField();
		textAltura.setColumns(10);
		
		textAncho = new JTextField();
		textAncho.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		
		JLabel lblAncho = new JLabel("Ancho:");
		
		JLabel lblProfundidad = new JLabel("Profundidad:");
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		
		textArchivo = new JTextField();
		textArchivo.setColumns(10);
		
		textProfundidad = new JTextField();
		textProfundidad.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(label_1)
					.addGap(6)
					.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblDescripción, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(label)
					.addGap(6)
					.addComponent(lblAltura, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textAltura, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(151))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(label_2)
					.addGap(6)
					.addComponent(lblAncho, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textAncho, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(151))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(label_3)
					.addGap(6)
					.addComponent(lblProfundidad, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textProfundidad, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(151))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(label_4)
					.addGap(6)
					.addComponent(lblPrecio, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textPrecio, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(151))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(label_5)
					.addGap(6)
					.addComponent(lblArchivo, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textArchivo, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
					.addGap(151))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(254)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNombre))
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDescripción))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAltura))
						.addComponent(textAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAncho))
						.addComponent(textAncho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblProfundidad))
						.addComponent(textProfundidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPrecio))
						.addComponent(textPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblArchivo))
						.addComponent(textArchivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
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
		textNombre.setText("");
		textAltura.setText("");
		textAncho.setText("");
		textPrecio.setText("");
		textArchivo.setText("");
		textProfundidad.setText("");
		textAreaDescripcion.setText("");
		textAreaDescripcion.setText("");
		// end-user-code
	}
	
}