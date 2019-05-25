/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */


/**
 * Launch the application.
 */
@SuppressWarnings("serial")
public class GUIBajaImpresora extends JFrame {
	
	private JPanel contentPane;
	private JTextField textIdImpresora;
	private int id;
	
	public GUIBajaImpresora() {
		super();
		this.contentPane = new JPanel();
		initGUI();
	}

	/**
	 * Create the frame.
	 */
	public void initGUI() {
		setTitle("Baja Impresora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\3d-printer.png"));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnConfirmarBaja = new JButton("Confirmar baja");
		btnConfirmarBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					id = Integer.parseInt(textIdImpresora.getText());
				
					int confirma = JOptionPane.showConfirmDialog(null, "¿Desea dar de baja el diseño?", "Confirmar baja de Diseño", 
							JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if(confirma == JOptionPane.YES_OPTION) {
						Controlador.getInstance().accion(Events.BAJA_IMPRESORA, id);
					}
					else {
						dispose();
					}
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Introduzca un id correcto (número)", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnConfirmarBaja.setBounds(152, 196, 123, 23);
		panel.add(btnConfirmarBaja);
		
		JLabel lblIdimpresora = new JLabel("IdImpresora");
		lblIdimpresora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdimpresora.setBounds(52, 86, 73, 14);
		panel.add(lblIdimpresora);
		
		textIdImpresora = new JTextField();
		textIdImpresora.setColumns(10);
		textIdImpresora.setBounds(135, 83, 162, 20);
		panel.add(textIdImpresora);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setIcon(new ImageIcon("imagenes\\3d-printer-REDM.png"));
		lblNewLabel.setBounds(187, 11, 73, 69);
		panel.add(lblNewLabel);
	}


	public void clearData() {
		textIdImpresora.setText("");
	}
	
	public void update(int event, Object res) {
		switch(event){
		case Events.BAJA_IMPRESORA_OK:
			JOptionPane.showMessageDialog(null,"Eliminado correctamente la impresora : "+ id, "", JOptionPane.INFORMATION_MESSAGE);
			dispose();
			break;
		case Events.BAJA_IMPRESORA_KO:
			JOptionPane.showMessageDialog(null,"Error al eliminar el diseño: " +id, "Eliminar Impresora", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}

}