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
import Negocio.PedidoImpresion.TPedidoImpresion;
import Negocio.Usuario.TUsuario;
import Negocio.Dise�o.SADise�o;
import Negocio.Dise�o.TDise�o;
import Negocio.Impresora.SAImpresora;
import Negocio.Impresora.TImpresora;
import Negocio.PedidoImpresion.SAPedidoImpresion;
import Negocio.PedidoImpresion.TPedidoImpresion;
import Presentaci�n.Impresora.GUIImpresora;
import Presentaci�n.Local.GUILocal;
import Presentaci�n.PedidoImpresion.GUIPedidoImpresion;
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
	private SAImpresora SAImpresora;
	private SAPedidoImpresion SAPedidoImpresion;
	

	// AQUI VENDRIAN EL RESTO DE SA

	public ControladorImp() {
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal = factoriaSA.generateSALocal();
		SARepresentante = factoriaSA.generateSARepresentante();
		SADise�o = factoriaSA.generateSADise�o();
		SAImpresora = factoriaSA.generateSAImpresora();
		SAPedidoImpresion = factoriaSA.generateSAPedidoImpresion();
	}

	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		TLocal tlocal;
		TRepresentante trepre;
		TUsuario tUsuario;
		TDise�o tDise�o;
		TImpresora tImpresora;
		TPedidoImpresion tPedidoImpresion;
		
		int idLocal;
		int idRepre;
		int idDise�o;
		int idUsuario;
		int idImpresora;
		ArrayList<TDise�o> resultD;
		ArrayList<TImpresora> resultI;
		ArrayList<TUsuario> resultU;
		boolean acceso;
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
		case Events.BUSCAR_LOCAL:
			idLocal = (int)datos;
			tlocal=this.SALocal.buscarPorId(idLocal);
			
			if(tlocal!=null){
				GUILocal.getInstance().update(Events.BUSCAR_LOCAL_OK, tlocal);
			}
			else
				GUILocal.getInstance().update(Events.BUSCAR_LOCAL_KO, tlocal);
			break;
		case Events.BUSCAR_REPRESENTANTE:
			idRepre = (int)datos;
			trepre = this.SARepresentante.buscarPorId(idRepre);
			if(trepre!=null)
				GUILocal.getInstance().update(Events.BUSCAR_REPRESENTANTE_OK, trepre);
			else 
				GUILocal.getInstance().update(Events.BUSCAR_REPRESENTANTE_KO, trepre);
			break;
			
		case Events.MODIFICAR_LOCAL:
			tlocal = (TLocal) datos;
			res = this.SALocal.modificar(tlocal);
			if (res > 0) {
				GUILocal.getInstance()
						.update(Events.MODIFICAR_LOCAL_OK, res);
			} else
				GUILocal.getInstance()
						.update(Events.MODIFICAR_LOCAL_KO, res);
			break;
		case Events.MODIFICAR_REPRESENTANTE:
			trepre= (TRepresentante) datos; 
			res= this.SARepresentante.modificar(trepre);
			if (res > 0) {
				GUILocal.getInstance()
						.update(Events.MODIFICAR_REPRESENTANTE_OK, res);			
			} else
				GUILocal.getInstance()
						.update(Events.MODIFICAR_REPRESENTANTE_KO, res);
			break;
			
			
			/*USUARIO*/
		case Events.OPEN_GUI_USUARIO_MENU:
			GUIUsuario.getInstance();
			break;
		case Events.ALTA_USUARIO:
			tUsuario =(TUsuario) datos;
			res = this.SAUsuario.altaUsuario(tUsuario);
			if (res > 0)
				GUIUsuario.getInstance().update(Events.ALTA_USUARIO_OK, res);
			else
				GUIUsuario.getInstance().update(Events.ALTA_USUARIO_KO, res);
			break;
		case Events.BAJA_USUARIO:
			idUsuario =(int) datos;
			res = this.SAUsuario.bajaUsuario(idUsuario);
			if (res > 0)
				GUIUsuario.getInstance().update(Events.BAJA_USUARIO_OK, res);
			else
				GUIUsuario.getInstance().update(Events.BAJA_USUARIO_KO, res);
			break;
		case Events.MODIFICAR_USUARIO:
			tUsuario =(TUsuario) datos;
			res = this.SAUsuario.modificarUsuario(tUsuario);
			if (res > 0)
				GUIUsuario.getInstance().update(Events.MODIFICAR_USUARIO_OK, res);
			else
				GUIUsuario.getInstance().update(Events.MODIFICAR_USUARIO_KO, res);
			break;
		case Events.BUSCAR_USUARIO:
			idUsuario =(int) datos;
			tUsuario = this.SAUsuario.buscarIdUsuario(idUsuario);
			if (tUsuario != null)
				GUIUsuario.getInstance().update(Events.BUSCAR_USUARIO_OK, tUsuario);//tDise�o, tImpresora
			else
				GUIUsuario.getInstance().update(Events.BUSCAR_USUARIO_KO, tUsuario);
			break;	
		case Events.LISTAR_USUARIO:
			resultU = this.SAUsuario.listarUsuarios();
			if (resultU != null)
				GUIUsuario.getInstance().update(Events.LISTAR_USUARIO_OK, resultU);
			else
				GUIUsuario.getInstance().update(Events.LISTAR_USUARIO_KO, resultU);
			break;
		case Events.ACCESO_USUARIO:
			tUsuario =(TUsuario) datos;
			acceso = this.SAUsuario.acceso(tUsuario);
			if (acceso)
				GUIUsuario.getInstance().update(Events.ACCESO_USUARIO_OK, acceso);
			else
				GUIUsuario.getInstance().update(Events.ACCESO_USUARIO_KO, acceso);
			break;
		case Events.MODIFICAR_USUARIO_COMPROBAR:
			idUsuario = (int) datos;
			tUsuario = this.SAUsuario.buscarIdUsuario(idUsuario);
			if (tUsuario != null)
				GUIUsuario.getInstance().update(Events.MODIFICAR_USUARIO_COMPROBAR, null);
			else
				GUIUsuario.getInstance().update(Events.MODIFICAR_USUARIO_COMPROBAR_KO, null);
			break;
		/*IMPRESORA*/
		case Events.OPEN_GUI_IMPRESORA_MENU:
			GUIImpresora.getInstance();
			break;	
		case Events.ALTA_IMPRESORA:
			tImpresora = (TImpresora) datos;
			res = this.SAImpresora.alta(tImpresora);

			if (res > 0)
				GUIImpresora.getInstance().update(Events.ALTA_IMPRESORA_OK, res);
			else
				GUIImpresora.getInstance().update(Events.ALTA_IMPRESORA_KO, res);
			break;
		case Events.BAJA_IMPRESORA:
			idImpresora = (int) datos;
			res = this.SAImpresora.baja(idImpresora);
			if (res > 0)
				GUIImpresora.getInstance().update(Events.BAJA_IMPRESORA_OK, res);
			else
				GUIImpresora.getInstance().update(Events.BAJA_IMPRESORA_KO, res);
			break;	
		case Events.BUSCAR_IMPRESORA:
			idImpresora = (int) datos;
			tImpresora = this.SAImpresora.buscarId(idImpresora);
			if (tImpresora != null)
				GUIImpresora.getInstance().update(Events.BUSCAR_IMPRESORA_OK, tImpresora);
			else
				GUIImpresora.getInstance().update(Events.BUSCAR_IMPRESORA_KO, tImpresora);
			break;	
		case Events.BUSCAR_USUARIO_IMPRESORA:
			GUIImpresora.getInstance();
			break;
		case Events.LISTAR_IMPRESORAS:
			resultI = this.SAImpresora.listarTodo();
			if (resultI != null)
				GUIImpresora.getInstance().update(Events.LISTAR_IMPRESORAS_OK, resultI);
			else
				GUIImpresora.getInstance().update(Events.LISTAR_IMPRESORAS_KO, resultI);
			break;
		case Events.MODIFICAR_IMPRESORA:
			tImpresora = (TImpresora) datos;
			res = this.SAImpresora.modificar(tImpresora);
			if (res > 0)
				GUIImpresora.getInstance().update(Events.MODIFICAR_IMPRESORA_OK, res);
			else
				GUIImpresora.getInstance().update(Events.MODIFICAR_IMPRESORA_KO, res);
			break;
		case Events.MODIFICAR_IMPRESORA_COMPROBAR:
			idImpresora = (int) datos;
			tImpresora = this.SAImpresora.buscarId(idImpresora);
			if (tImpresora != null)
				GUIImpresora.getInstance().update(Events.MODIFICAR_IMPRESORA_COMPROBAR_OK, null);
			else
				GUIImpresora.getInstance().update(Events.MODIFICAR_IMPRESORA_COMPROBAR_KO, null);
			break;
			/*DISE�O*/
		case Events.OPEN_GUI_DISE�O_MENU:
			GUIDise�o.getInstance();
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
			idUsuario = (int) datos;
			resultD = this.SADise�o.listarPorUsuario(idUsuario);
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
				GUIDise�o.getInstance().update(Events.BUSCAR_DISE�O_PALABRA_CLAVE_OK, resultD);
			else
				GUIDise�o.getInstance().update(Events.BUSCAR_DISE�O_PALABRA_CLAVE_KO, resultD);
			break;
		case Events.MODIFICAR_DISE�O:
			tDise�o = (TDise�o) datos;
			res = this.SADise�o.modificar(tDise�o);
			if (res > 0)
				GUIDise�o.getInstance().update(Events.MODIFICAR_DISE�O_OK, res);
			else
				GUIDise�o.getInstance().update(Events.MODIFICAR_DISE�O_KO, res);
			break;
		case Events.MODIFICAR_DISE�O_COMPROBAR:
			idDise�o = (int) datos;
			tDise�o = this.SADise�o.buscarPorId(idDise�o);
			if (tDise�o != null)
				GUIDise�o.getInstance().update(Events.MODIFICAR_DISE�O_COMPROBAR_OK, null);
			else
				GUIDise�o.getInstance().update(Events.MODIFICAR_DISE�O_COMPROBAR_KO, null);
			break;
		case Events.ALTA_CARRITO:
			break;
		case Events.MODIFICAR_CARRITO:
			break;
		case Events.BAJA_CARRITO:
			break;
		/*case Events.ALTA_PEDIDO_IMPRESION:
			tPedidoImpresion = (TPedidoImpresion) datos;
			res = this.SAPedidoImpresion.alta(tPedidoImpresion);

			if (res > 0)
				GUIPedidoImpresion.getInstance().update(Events.ALTA_PEDIDO_IMPRESION_OK, res);
			else
				GUIPedidoImpresion.getInstance().update(Events.ALTA_PEDIDO_IMPRESION_KO, res);
			break;*/
			
		// end-user-code
			
		}

	}
}