/**
 * 
 */
package Presentación.Controlador;

import Negocio.Factoria.SAFactoria;
import Negocio.Local.SALocal;
import Negocio.Local.TLocal;
import Presentación.Local.GUIAltaLocal;
import Presentación.Local.GUILocal;
import Presentación.Plataforma.GUIPlataforma;
import Presentación.Plataforma.GUIPlataformaImp;
import Presentación.Plataforma.GUILogin;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ControladorImp extends Controlador {
	/**
	 * (sin Javadoc)
	 * 
	 * @see Controlador#accion(int evento, Object datos)
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

	private SALocal SALocal;

	// AQUI VENDRIAN EL RESTO DE SA

	public ControladorImp() {
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal = factoriaSA.generateSALocal();

	}

	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		TLocal tlocal;

		int res;
		switch (evento) {

		/* Eventos de Local */
		case Events.OPEN_GUI_LOCAL_MENU:
			GUILocal.getInstance();
			// GUILocal.getInstance().update
			break;
		case Events.GUI:
			GUIPlataformaImp.getInstance();
			break;
		case Events.ALTA_LOCAL:
			tlocal = (TLocal)datos;
			res=this.SALocal.alta(tlocal);
			if(res > 0)
				GUILocal.getInstance().update(Events.ALTA_LOCAL_OK, res);
			else
				GUILocal.getInstance().update(Events.ALTA_LOCAL_KO, res);
			break;


		// end-user-code
		}

	}
}