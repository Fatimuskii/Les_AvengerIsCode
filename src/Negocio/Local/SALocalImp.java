/**
 * 
 */
package Negocio.Local;

import java.util.ArrayList;

import Integraci�n.Factoria.FactoriaDAO;
import Integraci�n.Local.DAOLocal;
import Negocio.Factoria.SAFactoria;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SALocalImp implements SALocal {
	/** 
	 * (sin Javadoc)
	 * @see SALocal#alta(TLocal datos)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TLocal datos) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		TLocal tLeido; 
		DAOLocal localDAO = FactoriaDAO.getInstance().generateDAOLocal();
		if ( (tLeido = localDAO.buscarPorNombre(datos.getNombreLocal()))== null ) {
			return localDAO.alta(datos);
		}else{
			if (!tLeido.getActivo()){
				return localDAO.activarLocal(tLeido.getIdLocal());
			}
			else return -1;
		}
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @return 
	 * @see SALocal#baja(Integer IdLocal)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int baja(int IdLocal) {
		TLocal tLeido;
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		DAOLocal localDAO= FactoriaDAO.getInstance().generateDAOLocal();
		if ((tLeido = localDAO.buscarPorId(IdLocal)) != null) {
			if(tLeido.getActivo())
				return localDAO.baja(IdLocal);
		}
		return -1;
		
		
		
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SALocal#modificar(TLocal datos)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int modificar(TLocal datos) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		DAOLocal localDAO = FactoriaDAO.getInstance().generateDAOLocal();
		if ((localDAO.buscarPorNombre(datos.getNombreLocal().toLowerCase())) == null)
			return localDAO.modificar(datos);
		else
			return -1;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SALocal#buscarPorId(Integer IdLocal)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TLocal buscarPorId(int IdLocal) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		TLocal local = null;
		DAOLocal localDAO = FactoriaDAO.getInstance().generateDAOLocal();
		local = localDAO.buscarPorId(IdLocal);
		return local;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SALocal#listarTodos()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TLocal> listarTodos() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		DAOLocal localDAO = FactoriaDAO.getInstance().generateDAOLocal();
		ArrayList<TLocal> localList = localDAO.listarTodos();
		return localList;
		// end-user-code
	}
}