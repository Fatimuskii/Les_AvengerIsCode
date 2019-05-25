/**
 * 
 */
package Presentación.Impresora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Negocio.Diseño.TDiseño;
import Negocio.Impresora.TImpresora;
import Presentación.Controlador.Events;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIBuscarIdImpresora extends JFrame{
	
	private JPanel contentPane;
	private JTextField textDiseño;
	private JLabel lblDimensiones;
	private JTextField textDimensiones;
	private JLabel lblUsuario;
	private JTextField textUsuario;
	private JButton btnAceptar;
	
	public GUIBuscarIdImpresora() {
		super();
		this.contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI(){
		setTitle("Impresora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIdImpresora = new JLabel("ID Impresora:");
		lblIdImpresora.setBounds(15, 33, 84, 14);
		
		textDiseño = new JTextField();
		textDiseño.setBounds(109, 30, 170, 20);
		textDiseño.setEditable(false);
		textDiseño.setColumns(10);
		
		JLabel lblaltoXAncho = new JLabel("(alto x ancho x profundidad)");
		lblaltoXAncho.setBounds(109, 125, 280, 14);
		
		lblDimensiones = new JLabel("Dimensiones:");
		lblDimensiones.setBounds(15, 106, 84, 14);
		
		textDimensiones = new JTextField();
		textDimensiones.setBounds(109, 103, 170, 20);
		textDimensiones.setEditable(false);
		textDimensiones.setColumns(10);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(15, 169, 74, 14);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(109, 166, 170, 20);
		textUsuario.setEditable(false);
		textUsuario.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(340, 235, 84, 35);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblIdImpresora);
		contentPane.add(textDiseño);
		contentPane.add(btnAceptar);
		contentPane.add(lblDimensiones);
		contentPane.add(lblaltoXAncho);
		contentPane.add(textDimensiones);
		contentPane.add(lblUsuario);
		contentPane.add(textUsuario);
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		textDiseño.setText("");
		textDimensiones.setText("");
		textUsuario.setText("");
		// end-user-code
	}
	
	public void update(int event, TImpresora res){
		switch (event) {
		case Events.BUSCAR_IMPRESORA_OK:
			textDiseño.setText(""+res.getId_impresora());
			textDimensiones.setText("" + res.getAlto() + "x" + res.getAncho() + "x" + res.getProfundidad());
			textUsuario.setText("" + res.getUsuario());
			
			textDiseño.setEnabled(true);
			textDimensiones.setEnabled(true);
			textUsuario.setEnabled(true);
			break;
		case Events.BUSCAR_IMPRESORA_KO:
			this.dispose();
			JOptionPane.showMessageDialog(null, "Error al buscar la impresora");
			break;
		}
		
	}
}