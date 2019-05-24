/**
 * 
 */
package Presentación.Usuario;

import javax.swing.JFrame;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class GUIUsuario extends JFrame{
	private static GUIUsuario instance;
	public abstract void initGUI();
	
	public static GUIUsuario getInstance() {
		if(instance == null)
			instance = new GUIUsuarioImp();
		instance.setVisible(true);
		return instance;
	}
	
	public abstract void update(int event, Object res);//Object res_1
}