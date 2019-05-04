/**
 * 
 */
package Presentación.Local;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */


import javax.swing.JFrame;

//import Presentación.Factoria.GUI;

public abstract class GUILocal extends JFrame{
	private static GUILocal instance;
	
	public abstract void update(int event, Object res);
	
	public static GUILocal getInstance() {
		if(instance == null)
			instance = new GUILocalImp();
		instance.setVisible(true);
		return instance;
	}
}


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
