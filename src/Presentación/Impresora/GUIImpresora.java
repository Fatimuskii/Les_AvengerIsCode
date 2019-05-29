/**
 * 
 */
package Presentación.Impresora;

import javax.swing.JFrame;
import javax.swing.JPanel;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public abstract class GUIImpresora extends JPanel{
	private static GUIImpresora instance;
	public abstract void initGUI();
	
	public static GUIImpresora getInstance() {
		if(instance == null)
			instance = new GUIImpresoraImp();
		instance.setVisible(true);
		return instance;
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param event
	 * @param res
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void update(int event, Object res);
}