/**
 * 
 */
package Presentación.Controlador;

import java.util.ArrayList;

import Negocio.Factoria.SAFactoria;
import Negocio.Local.SALocal;
import Negocio.Local.SARepresentante;
import Negocio.Local.TRepresentante;
import Negocio.Usuario.SAUsuario;
import Negocio.Local.TLocal;
import Negocio.Usuario.TUsuario;
import Negocio.Diseño.SADiseño;
import Negocio.Diseño.TDiseño;
import Presentación.Impresora.GUIImpresora;
import Presentación.Local.GUILocal;
import Presentación.Plataforma.GUIPlataformaImp;
import Presentación.Usuario.GUIUsuario;
import Presentación.Diseño.GUIDiseño;

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
	private SADiseño SADiseño;

	// AQUI VENDRIAN EL RESTO DE SA

	public ControladorImp() {
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal = factoriaSA.generateSALocal();
		SARepresentante = factoriaSA.generateSARepresentante();
		SADiseño = factoriaSA.generateSADiseño();
	}

	@SuppressWarnings("null")
	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		TLocal tlocal;
		TRepresentante trepre;
		TUsuario tUsuario;
		TDiseño tDiseño;
		
		int idDiseño;
		int idUsuario;
		ArrayList<TDiseño> resultD;
		int res;
		switch (evento) {

		case Events.GUI:
			GUIPlataformaImp.getInstance();
			break;
		/* Eventos de Local & Representante */
		case Events.OPEN_GUI_LOCAL_MENU:
			GUILocal.getInstance();
			// GUILocal.getInstance().update
			break;
		case Events.ALTA_LOCAL:
			tlocal = (TLocal) datos;
			res = this.SALocal.alta(tlocal);

			if (res > 0)
				GUILocal.getInstance().update(Events.ALTA_LOCAL_OK, res);
			else
				GUILocal.getInstance().update(Events.ALTA_LOCAL_KO, res);
			break;

		case Events.ALTA_REPRESENTANTE:
			trepre = (TRepresentante) datos;
			res = this.SARepresentante.alta(trepre);
			if (res > 0) {
				GUILocal.getInstance()
						.update(Events.ALTA_REPRESENTANTE_OK, res);
				//GUIAltaLocal Gui_altaLocal= new GUIAltaLocal();
				
			} else
				GUILocal.getInstance()
						.update(Events.ALTA_REPRESENTANTE_KO, res);

			break;

		case Events.OPEN_GUI_USUARIO_MENU:
			GUIUsuario.getInstance();
			break;
		case Events.OPEN_GUI_PERFIL_USUARIO:
			GUIUsuario.getInstance();
			break;
		case Events.OPEN_GUI_MODIFICAR_USUARIO:
			GUIUsuario.getInstance();
			break;
		case Events.OPEN_GUI_ALTA_IMPRESORA:
			GUIImpresora.getInstance();
			break;
		case Events.OPEN_GUI_BAJA_IMPRESORA:
			GUIImpresora.getInstance();
			break;	
		case Events.OPEN_GUI_BUSCAR_IMPRESORA:
			GUIImpresora.getInstance();
			break;	
		case Events.OPEN_GUI_BUSCAR_USUARIO_IMPRESORA:
			GUIImpresora.getInstance();
			break;
		case Events.OPEN_GUI_LISTAR_IMPRESORA:
			GUIImpresora.getInstance();
			break;
		case Events.OPEN_GUI_MODIFICAR_IMPRESORA:
			GUIImpresora.getInstance();
			break;
		case Events.OPEN_GUI_IMPRESORA_MENU:
			GUIImpresora.getInstance();
			break;	
			/*DISEÑO*/
		case Events.OPEN_GUI_DISEÑO_MENU:
			GUIDiseño.getInstance();
			// GUIDiseño.getInstance().update
			break;
		case Events.ALTA_DISEÑO:
			tDiseño = (TDiseño) datos;
			res = this.SADiseño.alta(tDiseño);

			if (res > 0)
				GUIDiseño.getInstance().update(Events.ALTA_DISEÑO_OK, res);
			else
				GUIDiseño.getInstance().update(Events.ALTA_DISEÑO_KO, res);
			break;
		case Events.BAJA_DISEÑO:
			idDiseño = (int) datos;
			res = this.SADiseño.baja(idDiseño);
			
			if (res > 0)
				GUIDiseño.getInstance().update(Events.BAJA_DISEÑO_OK, res);
			else
				GUIDiseño.getInstance().update(Events.BAJA_DISEÑO_KO, res);
			break;
		case Events.LISTAR_DISEÑOS:
			resultD = this.SADiseño.listarTodos();
			if (resultD != null)
				GUIDiseño.getInstance().update(Events.LISTAR_DISEÑOS_OK, resultD);
			else
				GUIDiseño.getInstance().update(Events.LISTAR_DISEÑOS_KO, resultD);
			break;
			case Events.LISTAR_DISEÑOS_USU:
				int idU = (int) datos;
				resultD = this.SADiseño.listarPorUsuario(idU);
			if (resultD != null)
				GUIDiseño.getInstance().update(Events.LISTAR_DISEÑOS_USU_OK, resultD);
			else
				GUIDiseño.getInstance().update(Events.LISTAR_DISEÑOS_USU_KO, resultD);
			break;
			case Events.BUSCAR_DISEÑO_ID:
			idDiseño = (int) datos;
			tDiseño = this.SADiseño.buscarPorId(idDiseño);
			if (tDiseño != null)
				GUIDiseño.getInstance().update(Events.BUSCAR_DISEÑO_ID_OK, tDiseño);
			else
				GUIDiseño.getInstance().update(Events.BUSCAR_DISEÑO_ID_KO, tDiseño);
			break;
		case Events.BUSCAR_DISEÑO_PALABRA_CLAVE:
			String palabra = (String) datos;
			resultD = this.SADiseño.buscarPorPalabraClave(palabra);
			if (resultD != null)
				GUIDiseño.getInstance().update(Events.BUSCAR_DISEÑO_PALABRA_CLAVE, resultD);
			else
				GUIDiseño.getInstance().update(Events.BUSCAR_DISEÑO_PALABRA_CLAVE, resultD);
			break;
		case Events.MODIFICAR_DISEÑO:
			tDiseño = (TDiseño) datos;
			res = this.SADiseño.modificar(tDiseño);
			if (res > 0)
				GUIDiseño.getInstance().update(Events.MODIFICAR_DISEÑO_OK, res);
			else
				GUIDiseño.getInstance().update(Events.MODIFICAR_DISEÑO_KO, res);
			break;
			
		// end-user-code
		}

	}
}