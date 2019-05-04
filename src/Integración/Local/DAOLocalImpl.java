/**
 * 
 */
package Integración.Local;

import Integración.Conexion.ConexionDAO;
import Negocio.Local.TLocal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import com.mysql.jdbc.Statement;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOLocalImpl implements DAOLocal {
	/** 
	 * (sin Javadoc)
	 * @see DAOLocal#alta(TLocal datos)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TLocal datos) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		int IdLocal = -100;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();
		
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "INSERT INTO locales (nombre, telefono, CIF, direccion, CP, localidad, representante, activo)"
						+ " VALUES ('"
						+ datos.getNombreLocal()
						+ "', '"
						+ datos.getTelefono()
						+ "', '"
						+ datos.getCIF()
						+ "', '"
						+ datos.getDireccion()
						+ "', '"
						+ datos.getCP()
						+ "', '"
						+ datos.getLocalidad()
						+ "', '"
						+ datos.getRepresentante()
						+ "', '"
						+ (datos.getActivo() ? 1 : 0) + "');";
				statement.executeUpdate(query);
				query = "SELECT last_insert_IdLocal() as last_IdLocal from locales";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					IdLocal = resultSet.getInt("last_IdLocal");
				}
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				IdLocal = -100;
			}
		}
		return IdLocal;
		
		
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOLocal#baja(Integer IdLocal)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int baja(int IdLocal) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		int result = -100;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();		// end-user-code
	
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE locales SET activo=0 WHERE IdLocal=" + IdLocal;
				statement.executeUpdate(query);
				result = IdLocal;
				connection.close();
			} catch (SQLException e) {
				result = -100;
			}
		}
		return result;
	
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOLocal#modificar(TLocal datos)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int modificar(TLocal datos) {
		
		// begin-user-code
		
		int IdLocal = -100;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		// TODO Apéndice de método generado automáticamente
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE locales SET " 
						+ "nombre='" + datos.getNombreLocal()+ "', " 
						+ "telefono=" + datos.getTelefono()+ ", " 
						+ "CIF=" + datos.getCIF() + ", " 
						+ "direccion=" + datos.getDireccion() + ", " 
						+ "CP=" + datos.getCP() + ", " 
						+ "localidad=" + datos.getLocalidad() + ", " 
						+ "representante=" + datos.getRepresentante() + ", " 
						+ "activo=" + datos.getActivo() 
						+ "WHERE IdLocal=" + datos.getIdLocal();
				statement.executeUpdate(query);
				IdLocal = datos.getIdLocal();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				IdLocal = -100;
			}
		}
		return IdLocal;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOLocal#buscarPorId(Integer IdLocal)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TLocal buscarPorId(int IdLocal) {
		// begin-user-code
		TLocal local = null;
		ConexionDAO daocon = ConexionDAO.getInstance();
		Connection connection = daocon.getConexion();
		// TODO Apéndice de método generado automáticamente
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM locales WHERE IdLocal=" + IdLocal;
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					local = new TLocal(IdLocal, 
							resultSet.getString("nombre"),
							resultSet.getInt("telefono"),
							resultSet.getInt("CIF"),
							resultSet.getString("direccion"),
							resultSet.getInt("CP"),
							resultSet.getString("localidad"),
							resultSet.getInt("representante"),
							resultSet.getBoolean("activo"));
				}
				connection.close();
			} catch (SQLException e) {
				local = null;
			}
		}

		// end-user-code
		return local;


		
		
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOLocal#listarTodos()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TLocal> listarTodos() {
		// begin-user-code
		ArrayList<TLocal> listaLocal = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();

		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM locales WHERE activo=1";
				ResultSet resultSet = statement.executeQuery(query);
				
				while (resultSet.next()) {
					listaLocal.add(this.buscarPorId(resultSet.getInt("IdLocal")));
				}
				connection.close();
			} catch (SQLException e) {
				listaLocal = null;
			}
		}

		return listaLocal;
		// TODO Apéndice de método generado automáticamente
		
		// end-user-code
	}

	@Override
	public TLocal buscarPorNombre(String nombre) {
		// TODO Apéndice de método generado automáticamente
		// begin-user-code
				TLocal local = null;
				ConexionDAO daocon = ConexionDAO.getInstance();
				Connection connection = daocon.getConexion();
				// TODO Apéndice de método generado automáticamente
				if (connection != null) {
					try {
						Statement statement = connection.createStatement();
						String query = "SELECT * FROM locales WHERE nombre=" + nombre;
						ResultSet resultSet = statement.executeQuery(query);
						if (resultSet.next()) {
							local = new TLocal(resultSet.getInt("IdLocal"), 
									nombre,
									resultSet.getInt("telefono"),
									resultSet.getInt("CIF"),
									resultSet.getString("direccion"),
									resultSet.getInt("CP"),
									resultSet.getString("localidad"),
									resultSet.getInt("representante"),
									resultSet.getBoolean("activo"));
						}
						connection.close();
					} catch (SQLException e) {
						local = null;
					}
				}

				// end-user-code
				return local;

	}

	@Override
	public int activarLocal(int IdLocal) {
		// TODO Apéndice de método generado automáticamente
		int response = -100;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE locales SET active=1 WHERE IdLocal=" + IdLocal;
				statement.executeUpdate(query);
				response = IdLocal;
				connection.close();
			} catch (SQLException e) {
				response = -100;
			}
		}
		return response;
	}

	
}