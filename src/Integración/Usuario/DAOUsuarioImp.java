/**
 * 
 */
package Integraci�n.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Negocio.Usuario.TUsuario;

import Integraci�n.Conexion.ConexionDAO;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOUsuarioImp implements DAOUsuario {
	/** 
	 * (sin Javadoc)
	 * @see DAOUsuario#create()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int altaUsuario(TUsuario datos) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		int IdUsuario = 0000;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();
		
		if(connection != null){
			try{
				Statement statement = connection.createStatement();
				/*String query = "INSERT INTO usuarios (nombre, apellidos, e-mail, fechaNaciemiento, direccion, contrase�a, confirmarContrase�a)"
						+ "VALUES ('"
						+ datos.getNombre()
						+"','"
						+datos.getApellidos()
						+"','"
						+datos.getFechaNacimiento()
						+"','"
						+datos.getDireccion()
						+"','"
						+datos.getContrase�a() + "');";*/
			}
			catch (SQLException e) {
				e.printStackTrace();
				IdUsuario = 0000;
			}
		}
		return IdUsuario;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOUsuario#read()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void bajaUsuario(int idUsuario) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente

		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOUsuario#update()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buscarIdUsuario(int idUsuario){
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente

		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOUsuario#delete()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void acceso(TUsuario tUsuario){
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente

		// end-user-code
	}
	
	public void buscarId(TUsuario tUsuario){
		
	}
	
	public void modificarUsuario(TUsuario tUsuario){
		
	}
}