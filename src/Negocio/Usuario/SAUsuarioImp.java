/**
 * 
 */
package Negocio.Usuario;

import java.util.ArrayList;

import Integración.Factoria.FactoriaDAO;
import Integración.Usuario.DAOUsuario;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Stephani
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAUsuarioImp implements SAUsuario {

	@Override
	public int altaUsuario(TUsuario tUsuario) {

		int id_usuario = -1;

		if (tUsuario != null) {
			DAOUsuario daoUsuario = FactoriaDAO.getInstance()
					.generateDAOUsuario();
			tUsuario.setActivo(true);
			id_usuario = daoUsuario.altaUsuario(tUsuario);
			// if((daoUsuario.buscarIdUsuario(tUsuario.getIdUsuario())) == null
			// )
			// return daoUsuario.altaUsuario(tUsuario);
		}
		return id_usuario;
	}

	public int bajaUsuario(int idUsuario) {

		DAOUsuario daoUsuario = FactoriaDAO.getInstance().generateDAOUsuario();

		if (daoUsuario.buscarIdUsuario(idUsuario) != null)
			return daoUsuario.bajaUsuario(idUsuario);

		return -1;
	}

	public TUsuario buscarIdUsuario(int idUsuario) {

		DAOUsuario daoUsuario = FactoriaDAO.getInstance().generateDAOUsuario();

		return daoUsuario.buscarIdUsuario(idUsuario);
	}

	public boolean acceso(TUsuario tUsuario) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	public int modificarUsuario(TUsuario tUsuario) {
		DAOUsuario daoUsuario = FactoriaDAO.getInstance().generateDAOUsuario();

		if (daoUsuario.buscarIdUsuario(tUsuario.getIdUsuario()) != null)
			return daoUsuario.modificarUsuario(tUsuario);

		return -1;
	}

	public ArrayList<TUsuario> listarUsuarios() {

		DAOUsuario daoUsuario = FactoriaDAO.getInstance().generateDAOUsuario();
		ArrayList<TUsuario> tListaUsuarios = daoUsuario.listarUsuarios();

		return tListaUsuarios;
	}

}