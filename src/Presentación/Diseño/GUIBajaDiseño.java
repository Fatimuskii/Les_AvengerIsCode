/**
 * 
 */
package Presentación.Diseño;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIBajaDiseño extends JFrame{
	
	private JPanel contentPane;
	private JTextField textId;
	
	public GUIBajaDiseño(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI() {
		setTitle("Baja Diseño");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marina\\IBM\\rationalsdp\\IS\\Les_AvengerIsCode\\imagenes\\graphic-tools.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textId = new JTextField();
		textId.setBounds(171, 59, 86, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lblIdDiseo = new JLabel("ID Diseño:");
		lblIdDiseo.setBounds(74, 62, 79, 14);
		contentPane.add(lblIdDiseo);
		
		JButton btnDarDeBaja = new JButton("Dar de Baja");
		btnDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Comprobar si el ID es correcto
				int id = Integer.parseInt(textId.getText());
				//Comprobar si existe el ID del diseño
				
				int confirma = JOptionPane.showConfirmDialog(null, "¿Desea dar de baja el diseño?", "Confirmar baja de Diseño", 
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(confirma == JOptionPane.YES_OPTION) {
					Controlador.getInstance().accion(Events.BAJA_DISEÑO, id);
					//Dar de baja
					//Poner activo a 0
				}
				else {
					//No dar de baja el diseño
					//¿Volver a Menú o a la GUI de baja?
				}
			}
		});
		btnDarDeBaja.setBounds(153, 158, 124, 46);
		contentPane.add(btnDarDeBaja);
		
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		textId.setText("");
		// end-user-code
	}
}