/**
 * 
 */
package Presentaci�n.Dise�o;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Presentaci�n.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIBuscarPalabraDise�o extends JFrame{
	
	public GUIBuscarPalabraDise�o(){
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
		// TODO Ap�ndice de m�todo generado autom�ticamente

		// end-user-code
	}
	
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_DISE�O_OK:
			JOptionPane.showMessageDialog(null,"�xito al crear el dise�o");
			//this.setVisible(false);
			break;
		case Events.ALTA_DISE�O_KO:
			JOptionPane.showMessageDialog(null,"Error al crear el producto");
			break;
		}
		
	}

}