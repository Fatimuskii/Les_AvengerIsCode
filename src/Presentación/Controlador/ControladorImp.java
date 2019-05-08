/**
 * 
 */
package Presentación.Controlador;

import Negocio.Factoria.SAFactoria;
import Negocio.Local.SALocal;
import Negocio.Local.SARepresentante;
import Negocio.Local.TRepresentante;
import Negocio.Usuario.SAUsuario;
import Negocio.Local.TLocal;
import Negocio.Usuario.TUsuario;
import Presentación.Local.GUIAltaLocal;
import Presentación.Local.GUILocal;
import Presentación.Plataforma.GUIPlataforma;
import Presentación.Plataforma.GUIPlataformaImp;
import Presentación.Plataforma.GUILogin;
import Presentación.Usuario.GUIUsuario;

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
	private SARepresentante SARepresentante;
	private SAUsuario SAUsuario;

	// AQUI VENDRIAN EL RESTO DE SA

	public ControladorImp() {
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal = factoriaSA.generateSALocal();
		SARepresentante = factoriaSA.generateSARepresentante();

	}

	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		TLocal tlocal;
		TRepresentante trepre;
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
			
		case Events.ALTA_REPRESENTANTE:
			trepre = (TRepresentante)datos;
			res=this.SARepresentante.alta(trepre);
			
			if(res > 0)
				GUILocal.getInstance().update(Events.ALTA_REPRESENTANTE_OK, res);
			else
				GUILocal.getInstance().update(Events.ALTA_REPRESENTANTE_KO, res);
			break;
		case Events.OPEN_GUI_USUARIO_MENU:
			GUIUsuario.getInstance();
			break;
		case Events.OPEN_GUI_PERFIL_USUARIO:
			GUIUsuario.getInstance();
			break;

		// end-user-code
		}

	}
}