/**
 * 
 */
package Presentación.Diseño;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import Negocio.Diseño.TDiseño;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

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
	private JTextField textPrecio;
	private JTextPane textPane;
	
	private int id;
	
	public GUIModificarDiseño(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	private void initGUI(){
		setTitle("Modificar Diseño");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIdDiseño = new JLabel("ID Diseño:");
		lblIdDiseño.setBounds(15, 20, 81, 14);
		
		textID = new JTextField();
		textID.setBounds(114, 17, 110, 20);
		textID.setColumns(10);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(290, 16, 110, 23);
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(textID.getText().equals("")){
						throw new Exception();
					}
					id = Integer.parseInt(textID.getText());
					Controlador.getInstance().accion(Events.MODIFICAR_DISEÑO_COMPROBAR, id);
					toFront();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Introduzca un ID válido", "Error", JOptionPane.ERROR_MESSAGE);	
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 50, 409, 10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 71, 81, 14);
		
		textNombre = new JTextField();
		textNombre.setBounds(114, 71, 110, 20);
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setBounds(15, 109, 81, 14);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 109, 286, 48);
		
		textPane = new JTextPane();
		textPane.setBackground(SystemColor.menu);
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);
		
		JLabel lblAltura = new JLabel("Alto:");
		lblAltura.setBounds(15, 216, 81, 14);
		
		JLabel lblAncho = new JLabel("Ancho:");
		lblAncho.setBounds(15, 251, 81, 14);
		
		textAlto = new JTextField();
		textAlto.setBounds(114, 213, 110, 20);
		textAlto.setEditable(false);
		textAlto.setColumns(10);
		
		JLabel lblProfundidad = new JLabel("Profundidad:");
		lblProfundidad.setBounds(15, 283, 81, 14);
		
		JLabel lblArchivo = new JLabel("Archivo:");
		lblArchivo.setBounds(15, 315, 81, 14);
		
		textAncho = new JTextField();
		textAncho.setBounds(114, 248, 110, 20);
		textAncho.setEditable(false);
		textAncho.setColumns(10);
		
		textProfundidad = new JTextField();
		textProfundidad.setBounds(114, 280, 110, 20);
		textProfundidad.setEditable(false);
		textProfundidad.setColumns(10);
		
		textArchivo = new JTextField();
		textArchivo.setBounds(114, 312, 110, 20);
		textArchivo.setEditable(false);
		textArchivo.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(288, 346, 112, 34);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					id = Integer.parseInt(textID.getText());
					String nombre = textNombre.getText();
					String descripcion = textPane.getText();
					float precio = Float.parseFloat(textPrecio.getText());
					float alto = Float.parseFloat(textAlto.getText());
					float ancho = Float.parseFloat(textAncho.getText());
					float profundidad = Float.parseFloat(textProfundidad.getText());
					String archivo = textArchivo.getText();
				
					if(nombre.equals("") || textAlto.getText().equals("") || textAncho.getText().equals("")||
							textProfundidad.getText().equals("") || textPrecio.getText().equals("") || 
							textArchivo.getText().equals("")){
						throw new Exception();
					}
						
					TDiseño tDiseño = new TDiseño (id, nombre, descripcion,1, alto, ancho, profundidad,precio, archivo,true); 
				
					Controlador.getInstance().accion(Events.MODIFICAR_DISEÑO, tDiseño);
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Introduzca todos los datos correctamente", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(15, 178, 81, 14);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(114, 175, 110, 20);
		textPrecio.setEditable(false);
		textPrecio.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblPrecio);
		contentPane.add(textPrecio);
		contentPane.add(lblIdDiseño);
		contentPane.add(textID);
		contentPane.add(btnComprobar);
		contentPane.add(separator);
		contentPane.add(lblNombre);
		contentPane.add(textNombre);
		contentPane.add(lblDescripcion);
		contentPane.add(scrollPane);
		contentPane.add(lblAltura);
		contentPane.add(textAlto);
		contentPane.add(lblAncho);
		contentPane.add(textAncho);
		contentPane.add(lblProfundidad);
		contentPane.add(textProfundidad);
		contentPane.add(lblArchivo);
		contentPane.add(textArchivo);
		contentPane.add(btnModificar);
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		textID.setText("");
		textNombre.setText("");
		textAlto.setText("");
		textAncho.setText("");
		textProfundidad.setText("");
		textArchivo.setText("");
		textPrecio.setText("");
		textPane.setText("");
		textPane.setBackground(SystemColor.menu);
		
		textNombre.setEditable(false);
		textAlto.setEditable(false);
		textAncho.setEditable(false);
		textProfundidad.setEditable(false);
		textArchivo.setEditable(false);
		textPrecio.setEditable(false);
		textPane.setEditable(false);
		// end-user-code
	}
	
	public void update(int event, TDiseño res){
		switch (event) {
		case Events.MODIFICAR_DISEÑO_OK:
			JOptionPane.showMessageDialog(null,"Éxito al modificar el diseño id: "+ id);
			dispose();
			break;
		case Events.MODIFICAR_DISEÑO_KO:
			JOptionPane.showMessageDialog(null,"Error al modificar el diseño id: "+ id, "Error Diseño", JOptionPane.ERROR_MESSAGE);
			break;
		case Events.MODIFICAR_DISEÑO_COMPROBAR_OK:
			textNombre.setEditable(true);
			textAlto.setEditable(true);
			textAncho.setEditable(true);
			textProfundidad.setEditable(true);
			textArchivo.setEditable(true);
			textPrecio.setEditable(true);
			textPane.setEditable(true);
			
			textPane.setBackground(SystemColor.text);
			textNombre.setEnabled(true);
			textAlto.setEnabled(true);
			textAncho.setEnabled(true);
			textProfundidad.setEnabled(true);
			textArchivo.setEnabled(true);
			textPrecio.setEnabled(true);
			textPane.setEnabled(true);
			
			
			textNombre.setText(res.getNombre());
			textAlto.setText(res.getAlto()+"");
			textAncho.setText(res.getAncho()+"");
			textProfundidad.setText(res.getProfundidad()+"");
			textArchivo.setText(res.getArchivo());
			textPrecio.setText(res.getPrecio()+"");
			textPane.setText(res.getDescripcion());
			
			break;
		case Events.MODIFICAR_DISEÑO_COMPROBAR_KO:
			JOptionPane.showMessageDialog(null,"El diseño con el id: " + id + " no existe.","Error Diseño",JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}

}