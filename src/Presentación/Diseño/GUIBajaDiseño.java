/**
 * 
 */
package Presentaci�n.Dise�o;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import Presentaci�n.Controlador.Controlador;
import Presentaci�n.Controlador.Events;

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
public class GUIBajaDise�o extends JFrame{
	
	private JPanel contentPane;
	private JTextField textId;
	private int id;
	
	public GUIBajaDise�o(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI() {
		setTitle("Baja Dise�o");
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
		
		JLabel lblIdDiseo = new JLabel("ID Dise�o:");
		lblIdDiseo.setBounds(74, 62, 79, 14);
		contentPane.add(lblIdDiseo);
		
		JButton btnDarDeBaja = new JButton("Dar de Baja");
		btnDarDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					id = Integer.parseInt(textId.getText());
				
					int confirma = JOptionPane.showConfirmDialog(null, "�Desea dar de baja el dise�o?", "Confirmar baja de Dise�o", 
							JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if(confirma == JOptionPane.YES_OPTION) {
						Controlador.getInstance().accion(Events.BAJA_DISE�O, id);
					}
					else {
						dispose();
					}
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Introduzca un id correcto (n�mero)", "Error", JOptionPane.ERROR_MESSAGE);
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
	
	public void update(int event, Object res){
		switch (event) {
		case Events.BAJA_DISE�O_OK:
			JOptionPane.showMessageDialog(null,"Eliminado correctamente el dise�o: "+ id, "", JOptionPane.INFORMATION_MESSAGE);
			dispose();
			break;
		case Events.BAJA_DISE�O_KO:
			JOptionPane.showMessageDialog(null,"Error al eliminar el dise�o: " +id, "", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}

}