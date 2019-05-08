/**
 * 
 */
package Presentaci�n.Controlador;

import Negocio.Factoria.SAFactoria;
import Negocio.Local.SALocal;
import Negocio.Usuario.SAUsuario;
import Negocio.Local.TLocal;
import Negocio.Usuario.TUsuario;
import Presentaci�n.Local.GUIAltaLocal;
import Presentaci�n.Local.GUILocal;
import Presentaci�n.Plataforma.GUIPlataforma;
import Presentaci�n.Plataforma.GUIPlataformaImp;
import Presentaci�n.Plataforma.GUILogin;
import Presentaci�n.Usuario.GUIUsuario;

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
	private SAUsuario SAUsuario;

	// AQUI VENDRIAN EL RESTO DE SA

	public ControladorImp() {
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal = factoriaSA.generateSALocal();

	}

	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		TLocal tlocal;
		TUsuario tUsuario;

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
		case Events.OPEN_GUI_USUARIO_MENU:
			GUIUsuario.getInstance();

		// end-user-code
		}

	}
}