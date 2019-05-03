/**
 * 
 */
package Presentación.Controlador;

import Negocio.Factoria.SAFactoria;
import Negocio.Local.SALocal;
import Negocio.Local.TLocal;
import Presentación.Main.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ControladorImp extends Controlador {
	/** 
	 * (sin Javadoc)
	 * @see Controlador#accion(int evento, Object datos)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	private SALocal SALocal;
	
	//AQUI VENDRIAN EL RESTO DE SA
	
	public ControladorImp(){
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal=factoriaSA.generateSALocal();
		
	}
	
	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		TLocal tlocal;
		
		
		int res;
		switch(evento){
		
		/*Eventos de Local*/
		case Events.ALTA_LOCAL:
			SALocal createSALocal = SAFactoria.getInstance().generateSALocal();
			TLocal tLocal = (TLocal)datos;
			int resultcreateLocal = createSALocal.alta(tLocal);
			break;
		
		
		
		
		
		}
		// end-user-code
	}
}