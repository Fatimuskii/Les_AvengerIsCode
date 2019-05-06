/**
 * 
 */
package Presentación.Plataforma;

import javax.swing.JFrame;

import Presentación.Local.GUILocal;
import Presentación.Local.GUILocalImp;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class GUIPlataforma extends JFrame {

	private static GUIPlataforma instance;

	public static GUIPlataforma getInstance() {
		if (instance == null)
			instance = new GUIPlataformaImp();
		instance.setVisible(true);
		return instance;
	}
}
