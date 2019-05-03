/**
 * 
 */
package Negocio.Local;

import java.util.ArrayList;

import Integración.Factoria.FactoriaDAO;
import Integración.Local.DAOLocal;
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
		// TODO Apéndice de método generado automáticamente
		TLocal tLeido; 
		DAOLocal localDAO = FactoriaDAO.getInstance().generateDAOLocal();
		if ( (tLeido = localDAO.(animal.getChip()))== null ) {
			return animalDAO.create(animal);
		}else{
			if (!tLeido.isActive()){
				return animalDAO.activate(tLeido.getId());
			}
			else return -1;
		}
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SALocal#baja(Integer IdLocal)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void baja(Integer IdLocal) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SALocal#modificar(TLocal datos)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer modificar(TLocal datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SALocal#buscarPorId(Integer IdLocal)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TLocal buscarPorId(Integer IdLocal) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SALocal#listarTodos()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList listarTodos() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return null;
		// end-user-code
	}
}