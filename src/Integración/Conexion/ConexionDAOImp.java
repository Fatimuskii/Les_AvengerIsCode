/**
 * 
 */
package Integración.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ConexionDAOImp extends ConexionDAO {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Connection conexion;

	/** 
	 * (sin Javadoc)
	 * @return 
	 * @see ConexionDAO#getConexion()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Connection getConexion() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		String user = "root";
		String pass = "";
		// end-user-code
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/avengeris", user, pass);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (SQLException e) {
			conexion=null;
			//System.out.println("Problema de conexion con la Base de Datos");
		}
		
		return conexion;
	}
	
	protected void close() {
		try {
			if(conexion!=null&&!conexion.isClosed())
				conexion.close();
		} catch (SQLException e) {
			conexion = null;
		}
	}
}