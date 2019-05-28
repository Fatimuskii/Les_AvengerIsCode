/**
 * 
 */
package Presentación.Controlador;

import java.util.ArrayList;

import Negocio.Factoria.SAFactoria;
import Negocio.Local.SALocal;
import Negocio.Usuario.SAUsuario;
import Negocio.Local.TLocal;
import Negocio.PedidoImpresion.TPedidoImpresion;
import Negocio.Usuario.TUsuario;
import Negocio.Diseño.SADiseño;
import Negocio.Diseño.TDiseño;
import Negocio.Impresora.SAImpresora;
import Negocio.Impresora.TImpresora;
import Negocio.PedidoImpresion.SAPedidoImpresion;
import Negocio.Plataforma.SAPlataforma;
import Presentación.Plataforma.GUIPlataforma;
import Presentación.Plataforma.GUIPlataformaImp;
import Presentación.Impresora.GUIImpresora;
import Presentación.Local.GUILocal;
import Presentación.PedidoImpresion.GUIPedidoImpresion;
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
	private SAUsuario SAUsuario;
	private SADiseño SADiseño;
	private SAImpresora SAImpresora;
	private SAPedidoImpresion SAPedidoImpresion;
	private SAPlataforma SAPlataforma;

	// private TUsuario uLogueado;
	private TUsuario uLogueado = new TUsuario(2, "Fatima", "Garcia Delgado",
			"fatima@gmail.com", "24/06/1990", "calle pepinno, 52", "fatima",
			"Fatima", "123456789E", "25/05/2023", true);

	// AQUI VENDRIAN EL RESTO DE SA

	public ControladorImp() {
		SAFactoria factoriaSA = SAFactoria.getInstance();
		SALocal = factoriaSA.generateSALocal();
		SADiseño = factoriaSA.generateSADiseño();
		SAImpresora = factoriaSA.generateSAImpresora();
		SAUsuario = factoriaSA.generateSAUsuario();
		SAPedidoImpresion = factoriaSA.generateSAPedidoImpresion();
		SAPlataforma = factoriaSA.generateSAPlataforma();
	}

	public void accion(int evento, Object datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		TLocal tlocal;
		TUsuario tUsuario;
		TDiseño tDiseño;
		TImpresora tImpresora;
		TPedidoImpresion tPedidoImpresion;

		int idLocal;
		int idDiseño;
		int idUsuario;
		int idImpresora;
		int idUsuarioLogueado;
		String nombre;
		ArrayList<TLocal> resultL;
		ArrayList<TDiseño> resultD;
		ArrayList<TImpresora> resultI;
		ArrayList<TUsuario> resultU;
		boolean acceso;
		int res;
		switch (evento) {

		case Events.GUI:
			GUIPlataformaImp.getInstance();
			// GUIPlataformaImp.getInstance();
			break;
		/* Eventos de Local */

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

		case Events.BAJA_LOCAL:
			idLocal = (int) datos;
			res = this.SALocal.baja(idLocal);
			if (res > 0)
				GUILocal.getInstance().update(Events.BAJA_LOCAL_OK, res);
			else
				GUILocal.getInstance().update(Events.BAJA_LOCAL_KO, res);
			break;

		case Events.BUSCAR_LOCAL:
			idLocal = (int) datos;
			tlocal = this.SALocal.buscarPorId(idLocal);

			if (tlocal != null) {
				GUILocal.getInstance().update(Events.BUSCAR_LOCAL_OK, tlocal);
			} else
				GUILocal.getInstance().update(Events.BUSCAR_LOCAL_KO, tlocal);
			break;

		case Events.MODIFICAR_LOCAL:
			tlocal = (TLocal) datos;
			res = this.SALocal.modificar(tlocal);
			if (res > 0) {
				GUILocal.getInstance().update(Events.MODIFICAR_LOCAL_OK, res);
			} else
				GUILocal.getInstance().update(Events.MODIFICAR_LOCAL_KO, res);
			break;
		case Events.LISTAR_LOCALES:
			resultL = this.SALocal.listarTodos();
			if (resultL != null)
				GUILocal.getInstance()
						.update(Events.LISTAR_LOCALES_OK, resultL);
			else
				GUILocal.getInstance()
						.update(Events.LISTAR_LOCALES_KO, resultL);
			break;

		case Events.OPEN_GUI_USUARIO_MENU:
			GUIUsuario.getInstance();
			break;
		case Events.ALTA_USUARIO:
			tUsuario = (TUsuario) datos;
			res = this.SAUsuario.altaUsuario(tUsuario);
			if (res > 0)
				GUIUsuario.getInstance().update(Events.ALTA_USUARIO_OK, res);
			else
				GUIUsuario.getInstance().update(Events.ALTA_USUARIO_KO, res);
			break;

		case Events.BAJA_USUARIO:
			idUsuario = (int) datos;
			res = this.SAUsuario.bajaUsuario(idUsuario);
			if (res > 0)
				GUIUsuario.getInstance().update(Events.BAJA_USUARIO_OK, res);
			else
				GUIUsuario.getInstance().update(Events.BAJA_USUARIO_KO, res);
			break;
		case Events.MODIFICAR_USUARIO:
			tUsuario = (TUsuario) datos;

			tUsuario = this.SAUsuario.modificarUsuario(tUsuario);
			if (tUsuario != null)
				GUIUsuario.getInstance().update(Events.MODIFICAR_USUARIO_OK,
						tUsuario);
			else
				GUIUsuario.getInstance().update(Events.MODIFICAR_USUARIO_KO,
						tUsuario);

			break;
		case Events.BUSCAR_USUARIO:
			idUsuario = (int) datos;
			tUsuario = this.SAUsuario.buscarIdUsuario(idUsuario);
			if (tUsuario != null)
				GUIUsuario.getInstance().update(Events.BUSCAR_USUARIO_OK,
						tUsuario);// tDiseño, tImpresora
			else
				GUIUsuario.getInstance().update(Events.BUSCAR_USUARIO_KO,
						tUsuario);
			break;
		case Events.LISTAR_USUARIO:
			resultU = this.SAUsuario.listarUsuarios();
			if (resultU != null)
				GUIUsuario.getInstance().update(Events.LISTAR_USUARIO_OK,
						resultU);
			else
				GUIUsuario.getInstance().update(Events.LISTAR_USUARIO_KO,
						resultU);
			break;
		/*
		 * case Events.ACCESO_USUARIO: tUsuario =(TUsuario) datos; acceso =
		 * this.SAUsuario.acceso(tUsuario); if (acceso)
		 * GUIUsuario.getInstance().update(Events.ACCESO_USUARIO_OK, acceso);
		 * else GUIUsuario.getInstance().update(Events.ACCESO_USUARIO_KO,
		 * acceso); break;
		 */
		case Events.MODIFICAR_USUARIO_COMPROBAR:
			idUsuario = (int) datos;
			tUsuario = this.SAUsuario.buscarIdUsuario(idUsuario);
			if (tUsuario != null)// ****

				GUIUsuario.getInstance().update(
						Events.MODIFICAR_USUARIO_COMPROBAR_OK, tUsuario);
			else
				GUIUsuario.getInstance().update(
						Events.MODIFICAR_USUARIO_COMPROBAR_KO, null);
			break;
		/* IMPRESORA */
		case Events.OPEN_GUI_IMPRESORA_MENU:
			GUIImpresora.getInstance();
			break;
		case Events.ALTA_IMPRESORA:
			tImpresora = (TImpresora) datos;
			res = this.SAImpresora.alta(tImpresora);

			if (res > 0)
				GUIImpresora.getInstance()
						.update(Events.ALTA_IMPRESORA_OK, res);
			else
				GUIImpresora.getInstance()
						.update(Events.ALTA_IMPRESORA_KO, res);
			break;
		case Events.BAJA_IMPRESORA:
			idImpresora = (int) datos;
			res = this.SAImpresora.baja(idImpresora);
			if (res > 0)
				GUIImpresora.getInstance()
						.update(Events.BAJA_IMPRESORA_OK, res);
			else
				GUIImpresora.getInstance()
						.update(Events.BAJA_IMPRESORA_KO, res);
			break;
		case Events.BUSCAR_IMPRESORA:
			idImpresora = (int) datos;
			tImpresora = this.SAImpresora.buscarId(idImpresora);
			if (tImpresora != null)
				GUIImpresora.getInstance().update(Events.BUSCAR_IMPRESORA_OK,
						tImpresora);
			else
				GUIImpresora.getInstance().update(Events.BUSCAR_IMPRESORA_KO,
						tImpresora);
			break;
		case Events.BUSCAR_USUARIO_IMPRESORA:
			idUsuario = (int) datos;

			tUsuario = this.SAUsuario.buscarIdUsuario(idUsuario);
			if (tUsuario != null) {
				resultI = this.SAImpresora.buscarPorUsuario(idUsuario);
				if (resultI != null)
					GUIImpresora.getInstance().update(
							Events.BUSCAR_USUARIO_IMPRESORA_OK, resultI);
				else
					GUIImpresora.getInstance().update(
							Events.BUSCAR_USUARIO_IMPRESORA_KO, resultI);
			} else {
				GUIImpresora.getInstance().update(
						Events.BUSCAR_USUARIO_IMPRESORA_KO, null);
			}
			break;
		case Events.LISTAR_IMPRESORAS:
			resultI = this.SAImpresora.listarTodo();
			if (resultI != null)
				GUIImpresora.getInstance().update(Events.LISTAR_IMPRESORAS_OK,
						resultI);
			else
				GUIImpresora.getInstance().update(Events.LISTAR_IMPRESORAS_KO,
						resultI);
			break;
		case Events.MODIFICAR_IMPRESORA:
			tImpresora = (TImpresora) datos;
			res = this.SAImpresora.modificar(tImpresora);
			if (res > 0)
				GUIImpresora.getInstance().update(
						Events.MODIFICAR_IMPRESORA_OK, res);
			else
				GUIImpresora.getInstance().update(
						Events.MODIFICAR_IMPRESORA_KO, res);
			break;
		case Events.MODIFICAR_IMPRESORA_COMPROBAR:
			idImpresora = (int) datos;
			tImpresora = this.SAImpresora.buscarId(idImpresora);
			if (tImpresora != null)
				GUIImpresora.getInstance().update(
						Events.MODIFICAR_IMPRESORA_COMPROBAR_OK, null);
			else
				GUIImpresora.getInstance().update(
						Events.MODIFICAR_IMPRESORA_COMPROBAR_KO, null);
			break;
		/* DISEÑO */
		case Events.OPEN_GUI_DISEÑO_MENU:
			GUIDiseño.getInstance();
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
				GUIDiseño.getInstance().update(Events.LISTAR_DISEÑOS_OK,
						resultD);
			else
				GUIDiseño.getInstance().update(Events.LISTAR_DISEÑOS_KO,
						resultD);
			break;
		case Events.LISTAR_DISEÑOS_USU:
			idUsuario = (int) datos;

			tUsuario = this.SAUsuario.buscarIdUsuario(idUsuario);

			if (tUsuario != null) {
				resultD = this.SADiseño.listarPorUsuario(idUsuario);
				if (resultD != null)
					GUIDiseño.getInstance().update(
							Events.LISTAR_DISEÑOS_USU_OK, resultD);
				else
					GUIDiseño.getInstance().update(
							Events.LISTAR_DISEÑOS_USU_KO, resultD);
			} else {
				GUIDiseño.getInstance().update(Events.LISTAR_DISEÑOS_USU_KO,
						null);
			}
			break;
		case Events.BUSCAR_DISEÑO_ID:
			idDiseño = (int) datos;
			tDiseño = this.SADiseño.buscarPorId(idDiseño);
			if (tDiseño != null)
				GUIDiseño.getInstance().update(Events.BUSCAR_DISEÑO_ID_OK,
						tDiseño);
			else
				GUIDiseño.getInstance().update(Events.BUSCAR_DISEÑO_ID_KO,
						tDiseño);
			break;
		case Events.BUSCAR_DISEÑO_PALABRA_CLAVE:
			String palabra = (String) datos;
			resultD = this.SADiseño.buscarPorPalabraClave(palabra);
			if (resultD != null)
				GUIDiseño.getInstance().update(
						Events.BUSCAR_DISEÑO_PALABRA_CLAVE_OK, resultD);
			else
				GUIDiseño.getInstance().update(
						Events.BUSCAR_DISEÑO_PALABRA_CLAVE_KO, resultD);
			break;
		case Events.MODIFICAR_DISEÑO:
			tDiseño = (TDiseño) datos;
			res = this.SADiseño.modificar(tDiseño);
			if (res > 0)
				GUIDiseño.getInstance().update(Events.MODIFICAR_DISEÑO_OK, res);
			else
				GUIDiseño.getInstance().update(Events.MODIFICAR_DISEÑO_KO, res);
			break;
		case Events.MODIFICAR_DISEÑO_COMPROBAR:
			idDiseño = (int) datos;
			tDiseño = this.SADiseño.buscarPorId(idDiseño);
			if (tDiseño != null)
				GUIDiseño.getInstance().update(
						Events.MODIFICAR_DISEÑO_COMPROBAR_OK, null);
			else
				GUIDiseño.getInstance().update(
						Events.MODIFICAR_DISEÑO_COMPROBAR_KO, null);
			break;
		case Events.ACCESO_USUARIO:
			// logguear en usuario
			TUsuario user;
			user = SAPlataforma.logueo(((TUsuario) datos).getNombre(),
					((TUsuario) datos).getContraseña());
			if (user != null) {
				// GUIPlataformaF.getInstance().update(Events.ACCESO_USUARIO_OK,
				// user);
				this.uLogueado = (TUsuario) datos;
				GUIPlataforma.getInstance().update(Events.ACCESO_USUARIO_OK,
						(TUsuario) datos);
			} else
				GUIPlataforma.getInstance().update(Events.ACCESO_USUARIO_KO,
						null);
			nombre = String.valueOf(datos.toString());
			idUsuarioLogueado = this.SAUsuario.acceso(nombre);
			if (idUsuarioLogueado > 0)
				GUIUsuario.getInstance().update(Events.ACCESO_USUARIO_OK,
						idUsuarioLogueado);
			else
				GUIUsuario.getInstance().update(Events.ACCESO_USUARIO_KO, null);
			break;
		case Events.ALTA_CARRITO:
			break;
		case Events.MODIFICAR_CARRITO:
			SAPlataforma.eliminarElementoCarrito((TDiseño) datos);
			break;
		case Events.MODIFICAR_CARRITO_ANNADIR:
			SAPlataforma.annadirElementoCarrito((TDiseño) datos);
			break;
		case Events.BAJA_CARRITO:
			SAPlataforma.vaciarElementosCarrito();
			break;
		/* EVENTOS DE PEDIDO IMPRESION */
		case Events.OPEN_GUI_PEDIDO_IMPRESION_MENU:
			GUIPedidoImpresion.getInstance(uLogueado);
			break;
		case Events.ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS:
			resultI = this.SAImpresora.listarTodo();
			if (resultI != null)
				GUIPedidoImpresion.getInstance(uLogueado).update(
						Events.ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS_OK,
						resultI);
			else
				GUIPedidoImpresion.getInstance(uLogueado).update(
						Events.ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS_KO,
						resultI);

			break;
		case Events.ALTA_PEDIDO_IMPRESION_LISTADISENIOS:
			idUsuario = (int) datos;

			tUsuario = this.SAUsuario.buscarIdUsuario(idUsuario);

			if (tUsuario != null) {
				resultD = this.SADiseño.listarPorUsuario(idUsuario);
				if (resultD != null)
					GUIPedidoImpresion.getInstance(uLogueado).update(
							Events.ALTA_PEDIDO_IMPRESION_LISTADISENIOS_OK,
							resultD);
				else
					GUIPedidoImpresion.getInstance(uLogueado).update(
							Events.ALTA_PEDIDO_IMPRESION_LISTADISENIOS_KO,
							resultD);
			} else {
				GUIPedidoImpresion.getInstance(uLogueado).update(
						Events.ALTA_PEDIDO_IMPRESION_LISTADISENIOS_KO, null);
			}
			break;

		case Events.ALTA_PEDIDO_IMPRESION_LISTALOCALES:
			resultL = this.SALocal.listarTodos();
			if (resultL != null)
				GUIPedidoImpresion.getInstance(uLogueado).update(
						Events.ALTA_PEDIDO_IMPRESION_LISTALOCALES_OK, resultL);
			else
				GUIPedidoImpresion.getInstance(uLogueado).update(
						Events.ALTA_PEDIDO_IMPRESION_LISTALOCALES_KO, resultL);
			break;
		case Events.ALTA_PEDIDO_IMPRESION:
			tPedidoImpresion = (TPedidoImpresion) datos;
			res = this.SAPedidoImpresion.alta(tPedidoImpresion);

			if (res > 0)
				GUIPedidoImpresion.getInstance(uLogueado).update(
						Events.ALTA_PEDIDO_IMPRESION_OK, res);
			else
				GUIPedidoImpresion.getInstance(uLogueado).update(
						Events.ALTA_PEDIDO_IMPRESION_KO, res);
			break;

		// end-user-code

		}

	}
}