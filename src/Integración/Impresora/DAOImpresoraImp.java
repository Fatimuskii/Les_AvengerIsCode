/**
 * 
 */
package Integración.Impresora;

import Integración.Factoria.FactoriaDAO;
import Negocio.Impresora.TImpresora;
import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOImpresoraImp implements DAOImpresora {
	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#alta(TImpresora tImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TImpresora tImpresora) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		
		DAOImpresora impresoraDAO = FactoriaDAO.getInstance().generateDAOImpresora();

		return 0;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#buscarId(int idImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TImpresora buscarId(int idImpresora) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		TImpresora tImpresora = null;
		DAOImpresora impresoraDAO = FactoriaDAO.getInstance().generateDAOImpresora();
		tImpresora = impresoraDAO.buscarId(idImpresora);
		return tImpresora;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#buscarPorUsuario(int idUsuario)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TImpresora buscarPorUsuario(int idUsuario) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		
		DAOImpresora impresoraDAO = FactoriaDAO.getInstance().generateDAOImpresora();

		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#listarTodo()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TImpresora> listarTodo() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		DAOImpresora impresoraDAO = FactoriaDAO.getInstance().generateDAOImpresora();
		ArrayList<TImpresora> listaImpresoras = impresoraDAO.listarTodo();
		return listaImpresoras;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#modificar(TImpresora tImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int modificar(TImpresora tImpresora) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		
		DAOImpresora impresoraDAO = FactoriaDAO.getInstance().generateDAOImpresora();

		return 0;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#baja(int idImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int baja(int idImpresora) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		int id = -1;

		DAOImpresora impresoraDAO = FactoriaDAO.getInstance().generateDAOImpresora();

		TImpresora tImpresora;
		tImpresora = impresoraDAO.buscarId(idImpresora);
		if (tImpresora != null) {
			if (tImpresora.getActivo()) {
				id = impresoraDAO.baja(idImpresora);
			}
		}

		return id;
		// end-user-code
	}
}