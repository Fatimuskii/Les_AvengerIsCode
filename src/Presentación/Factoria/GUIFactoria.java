/**
 * 
 */
package Presentación.Factoria;

import javax.swing.JFrame;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class GUIFactoria extends JFrame {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static GUIFactoria instance;
	
	public static GUIFactoria getInstance() {
		if(instance == null) instance = new GUIFactoriaImp();
		return instance;
	}
}