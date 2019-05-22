package Integración.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import Negocio.Usuario.TUsuario;

import Integración.Conexion.ConexionDAO;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Stephani
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("unused")
public class DAOUsuarioImp implements DAOUsuario {
	/** 
	 * (sin Javadoc)
	 * @see DAOUsuario#create()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int altaUsuario(TUsuario datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		
		int idUsuario = 00000;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();
		
		if(connection != null){
			try{
				Statement statement = connection.createStatement();
				String query = "INSERT INTO usuario (nombre, apellidos, fechaNaciemiento, direccion, contraseña, datosBancarios)"
						+ "VALUES ('"
						+ datos.getNombre()
						+"','"
						+datos.getApellidos()
						+"','"
						+datos.getFechaNacimiento()
						+"','"
						+datos.getDireccion()
						+"','"
						+datos.getContraseña()
						+"','"
						+datos.getEmail()
						+"','"
						+datos.getTitularCuenta()
						+"','"
						+datos.getNumeroCuenta()
						+"','"
						+datos.getCvv()		
						+"','"
						+datos.getFechaCaducidad()	
						+ "');";
						
				statement.executeUpdate(query);				
				query = "SELECT last_insert_id() as last_id from usuario";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					idUsuario = resultSet.getInt("last_id");
				}

			}
			catch (SQLException e) {
				e.printStackTrace();
				idUsuario = 00000;
			}
		}
		return idUsuario;
		// end-user-code
	}

	public int bajaUsuario(int idUsuario) {
		// begin-user-code
		int result = 00000;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();		// conexion SQL
	
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE usuario SET activo=0 WHERE idUsuario=" + idUsuario;
				statement.executeUpdate(query);
				result = idUsuario;
				connection.close();
			} catch (SQLException e) {
				result = 00000;
			}
		}
		return result;
	
	}

	public TUsuario buscarIdUsuario(int idUsuario){
		
		TUsuario tUsuario = null;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM usuario WHERE idUsuario=" + idUsuario;
				ResultSet resultSet = statement.executeQuery(query);
				if(resultSet.next()) {
					tUsuario = new TUsuario(
							idUsuario,
							resultSet.getString("nombre"),
							resultSet.getString("apellidos"),
							resultSet.getDate("fechaNacimiento"),
							resultSet.getString("direccion"),
							resultSet.getString("contraseña"),
							resultSet.getString("titularCuenta"),
							resultSet.getInt("numeroCuenta"),
							resultSet.getInt("cvv"),
							resultSet.getDate("fechaCaducidad")
							);
				}
			} catch (SQLException e) {
				tUsuario = null;
			}
		}
			
		return tUsuario;
	}
	
	public TUsuario acceso(TUsuario tUsuario){
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
		
		return tUsuario;
	}
	
	public ArrayList<TUsuario> listarUsuarios() {
	
		ArrayList<TUsuario>  listaUsuarios = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM usuario";
				ResultSet resultSet = statement.executeQuery(query);
				TUsuario tUsuario = null;
				
				while(resultSet.next()) {
					tUsuario = new TUsuario(
							resultSet.getInt("idUsuario"),
							resultSet.getString("nombre"),
							resultSet.getString("apellidos"),
							resultSet.getDate("fechaNacimiento"),
							resultSet.getString("direccion"),
							resultSet.getString("contraseña"),
							resultSet.getString("titularCuenta"),
							resultSet.getInt("numeroCuenta"),
							resultSet.getInt("cvv"),
							resultSet.getDate("fechaCaducidad")
							);
				}
					listaUsuarios.add(tUsuario);
				
			}catch (SQLException e) {
				e.printStackTrace();
				listaUsuarios = null;
			}
		}
		
		return listaUsuarios;
		// end-user-code
	}

	public Integer modificarUsuario(TUsuario tUsuario){
		
		Integer idUsuario = 0;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection conect = connectionDAO.getConexion();
		
		if(conect != null){
			
			try{
				Statement statement = conect.createStatement();
				String query = "UPDATE usuario SET "
						+ "nombre='" + tUsuario.getNombre() + "', "
						+ "apellidos='" + tUsuario.getApellidos() + "', "
						+ "direccion='" + tUsuario.getDireccion() + "', "
						+ "fechaNacimiento='" + tUsuario.getFechaNacimiento() + "', "
						+ "e-mail='" + tUsuario.getEmail() + "', "
						+ "titularCuenta='" + tUsuario.getTitularCuenta() + ",' "
						+ "numerCuenta='" + tUsuario.getNumeroCuenta() + ",' "
						+ "cvv='" + tUsuario.getCvv() + ",' "
						+ "fechaCaducidad='" + tUsuario.getFechaCaducidad()
						+ "WHERE idDiseño=" + tUsuario.getIdUsuario();
				
				statement.executeUpdate(query);
				idUsuario = tUsuario.getIdUsuario();
				
				
			}
			catch(SQLException e){
			idUsuario = -1;
			}
			
		}
				
		return idUsuario;
	}
}
