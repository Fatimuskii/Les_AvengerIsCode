/**
 * 
 */
package Negocio.Dise�o;




import java.util.ArrayList;

import Integraci�n.Dise�o.DAODise�o;
import Integraci�n.Factoria.FactoriaDAO;
import Integraci�n.Usuario.DAOUsuario;
import Negocio.Usuario.TUsuario;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SADise�oImp implements SADise�o {
	/** 
	 * (sin Javadoc)
	 * @see SADise�o#alta(TDise�o tDise�o)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TDise�o tDise�o) {
		// begin-user-code
		int id_dise�o = -1;
		
		if (tDise�o != null) {	
			//DAOUsuario usuarioDAO = FactoriaDAO.getInstance().generateDAOUsuario();

		/*	TUsuario usuario = usuarioDAO.buscarIdUsuario(tDise�o.getPropietario());
			if(usuario != null){
				if(usuario.getActivo()){*/
					DAODise�o dise�oDAO = FactoriaDAO.getInstance().generateDAODise�o();
					tDise�o.setActivo(true);
					id_dise�o = dise�oDAO.alta(tDise�o);
				}
	//		}
		//}
		
		return id_dise�o;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADise�o#baja(int idDise�o)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int baja(int idDise�o) {
		// begin-user-code
		int id = -1;

		DAODise�o dise�oDAO = FactoriaDAO.getInstance().generateDAODise�o();

		TDise�o tDise�o;
		tDise�o = dise�oDAO.buscarPorId(idDise�o);
		System.out.println("entrando en BAJAA");

		if (tDise�o != null) {
			if (tDise�o.getActivo()) {
				id = dise�oDAO.baja(idDise�o);
			}
		}

		return id;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADise�o#modificar(TDise�o tDise�o)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int modificar(TDise�o tDise�o) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return 0;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADise�o#buscarPorId(int idDise�o)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TDise�o buscarPorId(int idDise�o) {
		// begin-user-code
		TDise�o tDise�o = null;
		DAODise�o dise�oDAO = FactoriaDAO.getInstance().generateDAODise�o();
		tDise�o = dise�oDAO.buscarPorId(idDise�o);
		return tDise�o;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADise�o#buscarPorPalabraClave(String palabraClave)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDise�o> buscarPorPalabraClave(String palabraClave) {
		// begin-user-code
		DAODise�o dise�oDAO = FactoriaDAO.getInstance().generateDAODise�o();
		ArrayList<TDise�o> listaDise�os = dise�oDAO.buscarPorPalabraClave(palabraClave);
		return listaDise�os;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADise�o#listarTodos()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDise�o> listarTodos() {
		// begin-user-code
		DAODise�o dise�oDAO = FactoriaDAO.getInstance().generateDAODise�o();
		ArrayList<TDise�o> listaDise�os = dise�oDAO.listarTodos();
		return listaDise�os;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADise�o#listarPorUsuario(int idUsuario)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDise�o> listarPorUsuario(int idUsuario) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		ArrayList<TDise�o> listaDise�os = null;
		
		//Comprobar que el usuario existe y est� activo
		DAOUsuario usuarioDAO = FactoriaDAO.getInstance().generateDAOUsuario();
		TUsuario usu = usuarioDAO.buscarId(idUsuario);
		if(usu != null){
			if(usu.getActivo()){
				DAODise�o dise�oDAO = FactoriaDAO.getInstance().generateDAODise�o();
				listaDise�os = dise�oDAO.listarPorUsuario(idUsuario);
			}
		}
		
		return listaDise�os;
		// end-user-code
	}
}