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
	private JTextField textImpresora;
	private JLabel lblDimensiones;
	private JTextField textDimensiones;
	private JLabel lblUsuario;
	private JTextField textUsuario;
	private JButton btnAceptar;
	private JTextField textMaterial;
	
	public GUIBuscarIdImpresora() {
		super();
		this.contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI(){
		setTitle("Impresora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIdImpresora = new JLabel("ID Impresora:");
		lblIdImpresora.setBounds(15, 33, 84, 14);
		
		textImpresora = new JTextField();
		textImpresora.setBounds(109, 30, 170, 20);
		textImpresora.setEditable(false);
		textImpresora.setColumns(10);
		
		JLabel lblaltoXAncho = new JLabel("(alto x ancho x profundidad)");
		lblaltoXAncho.setBounds(109, 129, 280, 14);
		
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
		btnAceptar.setBounds(335, 262, 84, 35);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setBounds(16, 235, 89, 14);
		
		textMaterial = new JTextField();
		textMaterial.setBounds(109, 232, 170, 20);
		textMaterial.setEditable(false);
		textMaterial.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblIdImpresora);
		contentPane.add(textImpresora);
		contentPane.add(btnAceptar);
		contentPane.add(lblDimensiones);
		contentPane.add(lblaltoXAncho);
		contentPane.add(textDimensiones);
		contentPane.add(lblUsuario);
		contentPane.add(textUsuario);
		contentPane.add(lblMaterial);
		contentPane.add(textMaterial);
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		textImpresora.setText("");
		textDimensiones.setText("");
		textUsuario.setText("");
		textMaterial.setText("");
		// end-user-code
	}
	
	public void update(int event, TImpresora res){
		switch (event) {
		case Events.BUSCAR_IMPRESORA_OK:
			textImpresora.setText(""+res.getId_impresora());
			textDimensiones.setText("" + res.getAlto() + "x" + res.getAncho() + "x" + res.getProfundidad());
			textUsuario.setText("" + res.getUsuario());
			textMaterial.setText(res.getMaterial()+"");
			
			textImpresora.setEnabled(true);
			textDimensiones.setEnabled(true);
			textUsuario.setEnabled(true);
			textMaterial.setEnabled(true);
			break;
		case Events.BUSCAR_IMPRESORA_KO:
			this.dispose();
			JOptionPane.showMessageDialog(null, "Error al buscar la impresora");
			break;
		}
		
	}
}