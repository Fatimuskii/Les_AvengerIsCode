/**
 * 
 */
package Presentaci�n.Controlador;

import java.util.ArrayList;

import Negocio.Factoria.SAFactoria;
import Negocio.Local.SALocal;
import Negocio.Local.SARepresentante;
import Negocio.Local.TRepresentante;
import Negocio.Usuario.SAUsuario;
import Negocio.Local.TLocal;
import Negocio.Usuario.TUsuario;
import Negocio.Dise�o.SADise�o;
import Negocio.Dise�o.TDise�o;
import Presentaci�n.Impresora.GUIImpresora;
import Presentaci�n.Local.GUILocal;
import Presentaci�n.Plataforma.GUIPlataformaImp;
import Presentaci�n.Usuario.GUIUsuario;
import Presentaci�n.Dise�o.GUIDise�o;

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
	private SADise�o SADise�o;

	// AQUI VENDRIAN EL RESTO DE SA

	public ControladorImp() {
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal = factoriaSA.generateSALocal();
		SARepresentante = factoriaSA.generateSARepresentante();
		SADise�o = factoriaSA.generateSADise�o();
	}

	@SuppressWarnings("null")
	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		TLocal tlocal;
		TRepresentante trepre;
		TUsuario tUsuario;
		TDise�o tDise�o;
		
		int idDise�o;
		int idUsuario;
		ArrayList<TDise�o> resultD;
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
			/*DISE�O*/
		case Events.OPEN_GUI_DISE�O_MENU:
			GUIDise�o.getInstance();
			// GUIDise�o.getInstance().update
			break;
		case Events.ALTA_DISE�O:
			tDise�o = (TDise�o) datos;
			res = this.SADise�o.alta(tDise�o);

			if (res > 0)
				GUIDise�o.getInstance().update(Events.ALTA_DISE�O_OK, res);
			else
				GUIDise�o.getInstance().update(Events.ALTA_DISE�O_KO, res);
			break;
		case Events.BAJA_DISE�O:
			idDise�o = (int) datos;
			res = this.SADise�o.baja(idDise�o);
			
			if (res > 0)
				GUIDise�o.getInstance().update(Events.BAJA_DISE�O_OK, res);
			else
				GUIDise�o.getInstance().update(Events.BAJA_DISE�O_KO, res);
			break;
		case Events.LISTAR_DISE�OS:
			resultD = this.SADise�o.listarTodos();
			if (resultD != null)
				GUIDise�o.getInstance().update(Events.LISTAR_DISE�OS_OK, resultD);
			else
				GUIDise�o.getInstance().update(Events.LISTAR_DISE�OS_KO, resultD);
			break;
			case Events.LISTAR_DISE�OS_USU:
				int idU = (int) datos;
				resultD = this.SADise�o.listarPorUsuario(idU);
			if (resultD != null)
				GUIDise�o.getInstance().update(Events.LISTAR_DISE�OS_USU_OK, resultD);
			else
				GUIDise�o.getInstance().update(Events.LISTAR_DISE�OS_USU_KO, resultD);
			break;
			case Events.BUSCAR_DISE�O_ID:
			idDise�o = (int) datos;
			tDise�o = this.SADise�o.buscarPorId(idDise�o);
			if (tDise�o != null)
				GUIDise�o.getInstance().update(Events.BUSCAR_DISE�O_ID_OK, tDise�o);
			else
				GUIDise�o.getInstance().update(Events.BUSCAR_DISE�O_ID_KO, tDise�o);
			break;
		case Events.BUSCAR_DISE�O_PALABRA_CLAVE:
			String palabra = (String) datos;
			resultD = this.SADise�o.buscarPorPalabraClave(palabra);
			if (resultD != null)
				GUIDise�o.getInstance().update(Events.BUSCAR_DISE�O_PALABRA_CLAVE, resultD);
			else
				GUIDise�o.getInstance().update(Events.BUSCAR_DISE�O_PALABRA_CLAVE, resultD);
			break;
		case Events.MODIFICAR_DISE�O:
			tDise�o = (TDise�o) datos;
			res = this.SADise�o.modificar(tDise�o);
			if (res > 0)
				GUIDise�o.getInstance().update(Events.MODIFICAR_DISE�O_OK, res);
			else
				GUIDise�o.getInstance().update(Events.MODIFICAR_DISE�O_KO, res);
			break;
			
		// end-user-code
		}

	}
}