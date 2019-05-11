/**
 * 
 */
package Presentación.Diseño;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Presentación.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIBuscarPalabraDiseño extends JFrame{
	
	public GUIBuscarPalabraDiseño(){
		super();
		initGUI();
	}
	
	private void initGUI(){
		
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}
	
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_DISEÑO_OK:
			JOptionPane.showMessageDialog(null,"Éxito al crear el diseño");
			//this.setVisible(false);
			break;
		case Events.ALTA_DISEÑO_KO:
			JOptionPane.showMessageDialog(null,"Error al crear el producto");
			break;
		}
		
	}

}