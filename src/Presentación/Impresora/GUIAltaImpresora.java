/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.ImageIcon;

import Negocio.Impresora.Material;
import Negocio.Impresora.TImpresora;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */

/**
 * Launch the application.
 */
@SuppressWarnings("serial")
public class GUIAltaImpresora extends JFrame{
	
	private JPanel contentPane;

	private JButton btnFinalizar;
	private JTextField textFieldAlto;
	private JTextField textFieldAncho;
	private JTextField textFieldProfundidad;
	private JComboBox<Material> comboBox;

	public GUIAltaImpresora() {
		super();
		this.contentPane = new JPanel();
		this.setFocusable(true);
		initGUI();
	}

	/**
	 * Create the frame.
	 */
	public void initGUI() {
		setResizable(false);

		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\3d-printer.png"));
		setTitle("Alta Impresora");
		setBounds(100, 100, 453, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblTamao = new JLabel(" Tamaño");
		lblTamao.setBounds(30, 234, 71, 14);
		lblTamao.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblX = new JLabel("x");
		lblX.setBounds(177, 224, 16, 30);
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel label_6 = new JLabel("x");
		label_6.setBounds(263, 224, 16, 30);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel label = new JLabel("*");
		label.setBounds(20, 50, 17, 14);
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel label_1 = new JLabel("*");
		label_1.setBounds(20, 233, 17, 14);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel label_3 = new JLabel("");
		label_3.setBounds(236, 23, 156, 138);
		label_3.setIcon(new ImageIcon("imagenes\\3d-printer-REDM-REDM.png"));
		
		comboBox = new JComboBox<Material>();
		comboBox.setBounds(109, 43, 107, 30);
		comboBox.setModel(new DefaultComboBoxModel<Material>(Material.values()));
		
		textFieldAlto = new JTextField();
		textFieldAlto.setBounds(111, 231, 56, 20);
		textFieldAlto.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(30, 51, 69, 14);
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textFieldAncho = new JTextField();
		textFieldAncho.setBounds(197, 231, 56, 20);
		textFieldAncho.setColumns(10);
		
		textFieldProfundidad = new JTextField();
		textFieldProfundidad.setBounds(281, 231, 58, 20);
		textFieldProfundidad.setColumns(10);
		
		JLabel lblalto = new JLabel("(alto)");
		lblalto.setBounds(113, 252, 54, 14);
		
		JLabel lblancho = new JLabel("(ancho)");
		lblancho.setBounds(195, 252, 58, 14);
		
		JLabel lblprofundidad = new JLabel("(profundidad)");
		lblprofundidad.setBounds(273, 252, 89, 14);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (datosObligatorios()) {
					JOptionPane.showMessageDialog(new JFrame(), "Debes rellenar los campos obligatorios (*)", "Error",JOptionPane.ERROR_MESSAGE);
				}
				else{
					try{
						float alto =Float.parseFloat(textFieldAlto.getText());
						float ancho =Float.parseFloat(textFieldAncho.getText());
						float profundidad = Float.parseFloat(textFieldProfundidad.getText());
						Material m = (Material) comboBox.getSelectedItem();
						TImpresora tImpresora = new TImpresora(m, alto, ancho, profundidad, -1, true);
						Controlador.getInstance().accion(Events.ALTA_IMPRESORA, tImpresora);
						dispose();
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Datos erróneos", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnFinalizar.setBounds(281, 339, 104, 30);
		
		JLabel lblcm = new JLabel("cm");
		lblcm.setBounds(346, 234, 46, 14);
		
		contentPane.setLayout(null);
		contentPane.add(lblcm);
		contentPane.add(lblTamao);
		contentPane.add(lblX);
		contentPane.add(label_6);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(label_3);
		contentPane.add(comboBox);
		contentPane.add(textFieldAlto);
		contentPane.add(lblMaterial);
		contentPane.add(textFieldAncho);
		contentPane.add(textFieldProfundidad);
		contentPane.add(lblalto);
		contentPane.add(lblancho);
		contentPane.add(lblprofundidad);
		contentPane.add(btnFinalizar);
	}

	private boolean datosObligatorios() {
		return textFieldAlto.getText().equals("") || textFieldAncho.getText().equals("") || 
				textFieldProfundidad.getText().equals("");
	}
	
	public void clearData(){
		textFieldAlto.setText("");
		textFieldAncho.setText("");
		textFieldProfundidad.setText("");
	}
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_IMPRESORA_OK:
			dispose();
			JOptionPane.showMessageDialog(null,"Creada correctamente la impresora: " + res, "Crear Impresora", JOptionPane.INFORMATION_MESSAGE);
			break;
		case Events.ALTA_IMPRESORA_KO:
			JOptionPane.showMessageDialog(null, "Error al crear la impresora", "Error Alta Impresora", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}
}