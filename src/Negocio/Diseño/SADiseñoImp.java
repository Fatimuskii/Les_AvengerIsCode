/**
 * 
 */
package Negocio.Diseño;




import java.util.ArrayList;

import Integración.Diseño.DAODiseño;
import Integración.Factoria.FactoriaDAO;
import Integración.Usuario.DAOUsuario;
import Negocio.Usuario.TUsuario;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SADiseñoImp implements SADiseño {
	/** 
	 * (sin Javadoc)
	 * @see SADiseño#alta(TDiseño tDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TDiseño tDiseño) {
		// begin-user-code
		int id_diseño = -1;
		
		if (tDiseño != null) {	
			//DAOUsuario usuarioDAO = FactoriaDAO.getInstance().generateDAOUsuario();

		/*	TUsuario usuario = usuarioDAO.buscarIdUsuario(tDiseño.getPropietario());
			if(usuario != null){
				if(usuario.getActivo()){*/
					DAODiseño diseñoDAO = FactoriaDAO.getInstance().generateDAODiseño();
					tDiseño.setActivo(true);
					id_diseño = diseñoDAO.alta(tDiseño);
				}
	//		}
		//}
		
		return id_diseño;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADiseño#baja(int idDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int baja(int idDiseño) {
		// begin-user-code
		int id = -1;

		DAODiseño diseñoDAO = FactoriaDAO.getInstance().generateDAODiseño();

		TDiseño tDiseño;
		tDiseño = diseñoDAO.buscarPorId(idDiseño);
		System.out.println("entrando en BAJAA");

		if (tDiseño != null) {
			if (tDiseño.getActivo()) {
				id = diseñoDAO.baja(idDiseño);
			}
		}

		return id;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADiseño#modificar(TDiseño tDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int modificar(TDiseño tDiseño) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return 0;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADiseño#buscarPorId(int idDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TDiseño buscarPorId(int idDiseño) {
		// begin-user-code
		TDiseño tDiseño = null;
		DAODiseño diseñoDAO = FactoriaDAO.getInstance().generateDAODiseño();
		tDiseño = diseñoDAO.buscarPorId(idDiseño);
		return tDiseño;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADiseño#buscarPorPalabraClave(String palabraClave)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDiseño> buscarPorPalabraClave(String palabraClave) {
		// begin-user-code
		DAODiseño diseñoDAO = FactoriaDAO.getInstance().generateDAODiseño();
		ArrayList<TDiseño> listaDiseños = diseñoDAO.buscarPorPalabraClave(palabraClave);
		return listaDiseños;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADiseño#listarTodos()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDiseño> listarTodos() {
		// begin-user-code
		DAODiseño diseñoDAO = FactoriaDAO.getInstance().generateDAODiseño();
		ArrayList<TDiseño> listaDiseños = diseñoDAO.listarTodos();
		return listaDiseños;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SADiseño#listarPorUsuario(int idUsuario)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDiseño> listarPorUsuario(int idUsuario) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		ArrayList<TDiseño> listaDiseños = null;
		
		//Comprobar que el usuario existe y está activo
		DAOUsuario usuarioDAO = FactoriaDAO.getInstance().generateDAOUsuario();
		TUsuario usu = usuarioDAO.buscarId(idUsuario);
		if(usu != null){
			if(usu.getActivo()){
				DAODiseño diseñoDAO = FactoriaDAO.getInstance().generateDAODiseño();
				listaDiseños = diseñoDAO.listarPorUsuario(idUsuario);
			}
		}
		
		return listaDiseños;
		// end-user-code
	}
}