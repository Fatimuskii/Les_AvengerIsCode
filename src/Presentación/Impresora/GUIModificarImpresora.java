/**
 * 
 */
package Presentación.Impresora;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Negocio.Impresora.Material;
import Negocio.Impresora.TImpresora;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Marina
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIModificarImpresora extends JFrame {

	private JPanel contentPane;
	private int id;
	private JTextField textIdImpresora;
	private JTextField textAlto;
	private JTextField textAncho;
	private JTextField textProfundidad;
	private JComboBox<Material> comboBoxMaterial;
	private int usuario;
	
	public GUIModificarImpresora() {
		super();
		this.contentPane = new JPanel();
		this.setFocusable(true);
		initGUI();
	}

	private void initGUI() {
		setResizable(false);

		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\3d-printer.png"));
		setTitle("Modificar Impresora");
		setBounds(100, 100, 453, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
		contentPane.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(47, 14, 156, 138);
		contentPane.add(label_3);
		label_3.setIcon(new ImageIcon("imagenes\\3d-printer-REDM-REDM.png"));

		JLabel lblIdImpresora = new JLabel("ID Impresora:");
		lblIdImpresora.setBounds(236, 26, 110, 14);
		contentPane.add(lblIdImpresora);

		textIdImpresora = new JTextField();
		textIdImpresora.setBounds(236, 51, 147, 20);
		contentPane.add(textIdImpresora);
		textIdImpresora.setColumns(10);

		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(textIdImpresora.getText().equals("")){
						throw new Exception();
					}
					id = Integer.parseInt(textIdImpresora.getText());
					Controlador.getInstance().accion(Events.MODIFICAR_IMPRESORA_COMPROBAR, id);
					toFront();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Introduce un id válido (número)",
							"Error Impresora", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnComprobar.setBounds(236, 100, 147, 23);
		contentPane.add(btnComprobar);

		JSeparator separator = new JSeparator();
		separator.setBounds(37, 163, 384, 2);
		contentPane.add(separator);

		JLabel lblDimensiones = new JLabel("Dimensiones:");
		lblDimensiones.setBounds(37, 191, 86, 14);
		contentPane.add(lblDimensiones);

		textAlto = new JTextField();
		textAlto.setEditable(false);
		textAlto.setEnabled(false);
		textAlto.setBounds(133, 188, 70, 20);
		contentPane.add(textAlto);
		textAlto.setColumns(10);

		textAncho = new JTextField();
		textAncho.setEditable(false);
		textAncho.setEnabled(false);
		textAncho.setBounds(236, 188, 70, 20);
		contentPane.add(textAncho);
		textAncho.setColumns(10);

		textProfundidad = new JTextField();
		textProfundidad.setEditable(false);
		textProfundidad.setEnabled(false);
		textProfundidad.setBounds(335, 188, 70, 20);
		contentPane.add(textProfundidad);
		textProfundidad.setColumns(10);

		comboBoxMaterial = new JComboBox<Material>();
		comboBoxMaterial.setEnabled(false);
		comboBoxMaterial.setModel(new DefaultComboBoxModel<Material>(Material.values()));
		comboBoxMaterial.setBounds(133, 270, 147, 20);
		contentPane.add(comboBoxMaterial);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(textAlto.getText().equals("") || textAncho.getText().equals("") || 
							textProfundidad.getText().equals("")){
						throw new Exception();
					}
					
					float al = Float.parseFloat(textAlto.getText());
					float an = Float.parseFloat(textAncho.getText());
					float pr = Float.parseFloat(textProfundidad.getText());
					Material m=(Material) comboBoxMaterial.getSelectedItem();
					
					
					TImpresora tImpresora = new TImpresora(id, m, al, an, pr, usuario, true);
					Controlador.getInstance().accion(Events.MODIFICAR_IMPRESORA, tImpresora);
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente",
							"Error Impresora", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnModificar.setBounds(307, 357, 110, 33);
		contentPane.add(btnModificar);

		JLabel lblX = new JLabel("x");
		lblX.setBounds(216, 191, 20, 14);
		contentPane.add(lblX);

		JLabel label = new JLabel("x");
		label.setBounds(316, 191, 20, 14);
		contentPane.add(label);

		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setBounds(37, 273, 86, 14);
		contentPane.add(lblMaterial);

		JLabel lblalto = new JLabel("(alto)");
		lblalto.setBounds(133, 211, 70, 14);
		contentPane.add(lblalto);

		JLabel lblancho = new JLabel("(ancho)");
		lblancho.setBounds(236, 211, 70, 14);
		contentPane.add(lblancho);

		JLabel lblprofundidad = new JLabel("(profundidad)");
		lblprofundidad.setBounds(335, 211, 86, 14);
		contentPane.add(lblprofundidad);
	}

	public void clearData(){
		textIdImpresora.setText("");
		textAlto.setText("");
		textAncho.setText("");
		textProfundidad.setText("");
		
		textAlto.setEditable(false);
		textAncho.setEditable(false);
		textProfundidad.setEditable(false);

		textAlto.setEnabled(false);
		textAncho.setEnabled(false);
		textProfundidad.setEnabled(false);
		comboBoxMaterial.setEnabled(false);
	}
	
	public void update(int events, Object res) {
		switch (events) {
		case Events.MODIFICAR_IMPRESORA_COMPROBAR_OK:
			textAlto.setEditable(true);
			textAncho.setEditable(true);
			textProfundidad.setEditable(true);

			textAlto.setEnabled(true);
			textAncho.setEnabled(true);
			textProfundidad.setEnabled(true);
			comboBoxMaterial.setEnabled(true);
			
			usuario = ((TImpresora) res).getUsuario();
			id = ((TImpresora)res).getId_impresora();
			textAlto.setText(String.valueOf(((TImpresora) res).getAlto()));
			textAncho.setText(String.valueOf(((TImpresora) res).getAncho()));
			textProfundidad.setText(String.valueOf(((TImpresora) res).getProfundidad()));
			

			break;
		case Events.MODIFICAR_IMPRESORA_COMPROBAR_KO:
			JOptionPane.showMessageDialog(null,
					"La impresora indicada no existe",
					"Error Impresora", JOptionPane.ERROR_MESSAGE);
			break;
		case Events.MODIFICAR_IMPRESORA_OK:
			JOptionPane.showMessageDialog(null,
					"Éxito al modificar la impresora id: " + id);
			dispose();
			break;
		case Events.MODIFICAR_IMPRESORA_KO:
			JOptionPane.showMessageDialog(null,
					"Error al modificar la impresora id: " + id,
					"Error Impresora", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}