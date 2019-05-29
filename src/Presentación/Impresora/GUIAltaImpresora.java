/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.Toolkit;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
	private JTextField txtIntroduceTuId;
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

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		

		JLabel lblTamao = new JLabel(" Tamaño");
		lblTamao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamao.setBounds(28, 182, 71, 14);
		panel.add(lblTamao);

		JLabel lblX = new JLabel("x");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblX.setBounds(177, 172, 16, 30);
		panel.add(lblX);

		JLabel label_6 = new JLabel("x");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(263, 172, 16, 30);
		panel.add(label_6);

		JLabel lblIdUsuario = new JLabel("Id usuario");
		lblIdUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdUsuario.setBounds(32, 293, 71, 14);
		panel.add(lblIdUsuario);

		txtIntroduceTuId = new JTextField();
		txtIntroduceTuId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtIntroduceTuId.getText().equals("Introduce tu Id")) {
					txtIntroduceTuId.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtIntroduceTuId.getText().equals("")) {
					txtIntroduceTuId.setText("Introduce tu Id");
				}
			}
		});
		txtIntroduceTuId.setForeground(Color.GRAY);
		txtIntroduceTuId.setText("Introduce tu Id");
		txtIntroduceTuId.setBounds(113, 290, 95, 20);
		panel.add(txtIntroduceTuId);
		txtIntroduceTuId.setColumns(10);

		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("imagenes\\logo-REDM.png"));
		label_7.setBounds(28, 237, 58, 53);
		panel.add(label_7);

		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(20, 50, 17, 14);
		panel.add(label);

		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(20, 182, 17, 14);
		panel.add(label_1);

		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(20, 292, 17, 14);
		panel.add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("imagenes\\3d-printer-REDM-REDM.png"));
		label_3.setBounds(229, 23, 156, 138);
		panel.add(label_3);
		
		comboBox = new JComboBox<Material>();
		comboBox.setModel(new DefaultComboBoxModel<Material>(Material.values()));
		comboBox.setBounds(109, 43, 107, 30);
		panel.add(comboBox);
		
		textFieldAlto = new JTextField();
		textFieldAlto.setBounds(111, 179, 56, 20);
		panel.add(textFieldAlto);
		textFieldAlto.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMaterial.setBounds(30, 51, 69, 14);
		panel.add(lblMaterial);
		
		textFieldAncho = new JTextField();
		textFieldAncho.setBounds(197, 179, 56, 20);
		panel.add(textFieldAncho);
		textFieldAncho.setColumns(10);
		
		textFieldProfundidad = new JTextField();
		textFieldProfundidad.setBounds(281, 179, 58, 20);
		panel.add(textFieldProfundidad);
		textFieldProfundidad.setColumns(10);
		
		JLabel lblalto = new JLabel("(alto)");
		lblalto.setBounds(113, 201, 54, 14);
		panel.add(lblalto);
		
		JLabel lblancho = new JLabel("(ancho)");
		lblancho.setBounds(203, 201, 58, 14);
		panel.add(lblancho);
		
		JLabel lblprofundidad = new JLabel("(profundidad)");
		lblprofundidad.setBounds(279, 201, 89, 14);
		panel.add(lblprofundidad);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (datosObligatorios()) {
					JOptionPane.showMessageDialog(new JFrame(), "Debes rellenar los campos obligatorios (*)", "Error",JOptionPane.ERROR_MESSAGE);
				}
				else{
					try{
						float alto =Float.parseFloat(textFieldAlto.getText());
						float ancho =Float.parseFloat(textFieldAncho.getText());
						float profundidad = Float.parseFloat(textFieldProfundidad.getText());
						int idUsuario = Integer.parseInt(txtIntroduceTuId.getText());
						Material m = (Material) comboBox.getSelectedItem();
						TImpresora tImpresora = new TImpresora(m, alto, ancho, profundidad, idUsuario, true);
						Controlador.getInstance().accion(Events.ALTA_IMPRESORA, tImpresora);
						dispose();
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Datos erróneos", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnFinalizar.setBounds(312, 358, 89, 23);
		panel.add(btnFinalizar);
	}

	private boolean datosObligatorios() {
		return textFieldAlto.getText().equals("") || textFieldAncho.getText().equals("") || 
				textFieldProfundidad.getText().equals("") || 
				txtIntroduceTuId.getText().equals("Introduce tu Id");
	}
	
	public void clearData(){
		txtIntroduceTuId.setText("");
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