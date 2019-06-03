/**
 * 
 */
package Presentaci�n.Dise�o;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

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
public class GUIAltaDise�o extends JFrame{
	
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textAltura;
	private JTextField textAncho;
	private JTextField textPrecio;
	private JTextField textArchivo;
	private JTextField textProfundidad;
	private JTextArea textAreaDescripcion;
	
	public GUIAltaDise�o(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\graphic-tools.png"));
		setTitle("Alta Dise�o");
		setBounds(100, 100, 450, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(27, 19, 58, 14);
		
		textNombre = new JTextField();
		textNombre.setBounds(118, 16, 301, 20);
		textNombre.setColumns(10);
		
		JLabel lblDescripci�n = new JLabel("Descripci�n:");
		lblDescripci�n.setBounds(27, 57, 81, 14);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(27, 279, 81, 14);
		
		JLabel lblArchivo = new JLabel("Archivo:");
		lblArchivo.setBounds(27, 317, 81, 14);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(118, 54, 301, 92);
		
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		scrollPane.setViewportView(textAreaDescripcion);
		
		textAltura = new JTextField();
		textAltura.setBounds(118, 162, 160, 20);
		textAltura.setColumns(10);
		
		textAncho = new JTextField();
		textAncho.setBounds(118, 200, 160, 20);
		textAncho.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(27, 165, 81, 14);
		
		JLabel lblAncho = new JLabel("Ancho:");
		lblAncho.setBounds(27, 203, 81, 14);
		
		JLabel lblProfundidad = new JLabel("Profundidad:");
		lblProfundidad.setBounds(27, 241, 81, 14);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(118, 276, 160, 20);
		textPrecio.setColumns(10);
		
		textArchivo = new JTextField();
		textArchivo.setBounds(118, 314, 160, 20);
		textArchivo.setColumns(10);
		
		textProfundidad = new JTextField();
		textProfundidad.setBounds(118, 238, 160, 20);
		textProfundidad.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(319, 354, 100, 32);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String nombre = textNombre.getText();
					float altura = Float.parseFloat(textAltura.getText());
					float ancho = Float.parseFloat(textAncho.getText());
					float profundidad = Float.parseFloat(textProfundidad.getText());
					double precio = Float.parseFloat(textPrecio.getText());
					String descripcion = textAreaDescripcion.getText();
					String archivo = textArchivo.getText();
					
					if(nombre.equals("") || textAltura.getText().equals("") || textAncho.getText().equals("")||
							textProfundidad.getText().equals("") || textPrecio.getText().equals("") ||
							textArchivo.getText().equals("")){
						throw new Exception();
					}
					String[] a = archivo.split("\\.");
					if(!a[1].equals("stf")){
						throw new Exception("La extensi�n del archivo no es v�lida");
					}
					TDise�o dise�o = new TDise�o(nombre, descripcion, -1, altura, ancho, profundidad, precio, archivo, true);
					Controlador.getInstance().accion(Events.ALTA_DISE�O, dise�o);
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Introduzca todos los datos correctamente", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JLabel label = new JLabel("*");
		label.setBounds(15, 165, 6, 14);
		label.setForeground(Color.RED);
		
		JLabel label_1 = new JLabel("*");
		label_1.setBounds(15, 19, 6, 14);
		label_1.setForeground(Color.RED);
		
		JLabel label_2 = new JLabel("*");
		label_2.setBounds(15, 203, 6, 14);
		label_2.setForeground(Color.RED);
		
		JLabel label_3 = new JLabel("*");
		label_3.setBounds(15, 241, 6, 14);
		label_3.setForeground(Color.RED);
		
		JLabel label_4 = new JLabel("*");
		label_4.setBounds(15, 279, 6, 14);
		label_4.setForeground(Color.RED);
		
		JLabel label_5 = new JLabel("*");
		label_5.setBounds(15, 317, 6, 14);
		label_5.setForeground(Color.RED);
		contentPane.setLayout(null);
		contentPane.add(label_1);
		contentPane.add(lblNombre);
		contentPane.add(textNombre);
		contentPane.add(lblDescripci�n);
		contentPane.add(scrollPane);
		contentPane.add(label);
		contentPane.add(lblAltura);
		contentPane.add(textAltura);
		contentPane.add(label_2);
		contentPane.add(lblAncho);
		contentPane.add(textAncho);
		contentPane.add(label_3);
		contentPane.add(lblProfundidad);
		contentPane.add(textProfundidad);
		contentPane.add(label_4);
		contentPane.add(lblPrecio);
		contentPane.add(textPrecio);
		contentPane.add(label_5);
		contentPane.add(lblArchivo);
		contentPane.add(textArchivo);
		contentPane.add(btnAceptar);
		
		JLabel lbstf = new JLabel("(deber� ser .stf)");
		lbstf.setBounds(118, 337, 160, 14);
		contentPane.add(lbstf);
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
		// end-user-code
	}
	
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_DISE�O_OK:
			JOptionPane.showMessageDialog(null,"�xito al crear el dise�o");
			dispose();
			break;
		case Events.ALTA_DISE�O_KO:
			JOptionPane.showMessageDialog(null, "Error al crear el dise�o");
			this.toFront();
			break;
		}
	}

	
}