/**
 * 
 */
package Presentación.PedidoImpresion;

import javax.swing.JFrame;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public abstract class GUIPedidoImpresion extends JFrame{
	
private static GUIPedidoImpresion instance;
	
	public abstract void update(int event, Object res);
	//public abstract void initGUI();
	
	public static GUIPedidoImpresion getInstance() {
		if(instance == null)
			instance = new GUIPedidoImpresionImp();
		instance.setVisible(true);
		return instance;
	}
}