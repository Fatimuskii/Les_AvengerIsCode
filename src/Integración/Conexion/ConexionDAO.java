/**
 * 
 */
package Integración.Conexion;

import java.sql.Connection;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 
 */
public abstract class ConexionDAO {
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static ConexionDAO instance;

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static ConexionDAO getInstance() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		if (instance == null) {

			instance = new ConexionDAOImp();

		}
		return instance;

		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract Connection getConexion();
}
