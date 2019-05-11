/**
 * 
 */
package Integración.Diseño;

import Integración.Conexion.ConexionDAO;
import Negocio.Diseño.TDiseño;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAODiseñoImp implements DAODiseño {
	/** 
	 * (sin Javadoc)
	 * @see DAODiseño#alta(TDiseño tDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TDiseño tDiseño) {
		
		int idDiseño = -100;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();
		
		if(connection != null){
			try{
				Statement statement = connection.createStatement();
				String query = "INSERT INTO diseños (nombre, descripcion, propietario, alto, ancho, profundidad, precio, archivo, imagen)"
						+ "VALUES ('"
						+ tDiseño.getNombre()
						+ "', '"
						+ tDiseño.getDescripcion()
						+ "', '"
						+ tDiseño.getPropietario()
						+ "', '"
						+ tDiseño.getAlto()
						+ "', '"
						+ tDiseño.getAncho()
						+ "', '"
						+ tDiseño.getProfundidad()
						+ "', '"
						+ tDiseño.getPrecio()
						+ "', '"
						+ tDiseño.getArchivo()
						+ "', '"
						+ tDiseño.getImagen()
						+ "', '"
						+ (tDiseño.getActivo() ? 1 : 0)
						+ ");";
				statement.executeUpdate(query);
				query = "SELECT last_insert_idDiseño() as last_IdDiseño from diseños";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					idDiseño = resultSet.getInt("last_idDiseño");
				}
				connection.close();
			}
			catch(SQLException e){
				e.printStackTrace();
				idDiseño = -100;
			}
		}
		
		return idDiseño;
	}

	/** 
	 * (sin Javadoc)
	 * @see DAODiseño#baja(int idDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int baja(int idDiseño) {
		// begin-user-code
		int result = -100;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection !=null){
			try{
				Statement statement =connection.createStatement();
				String query = "UPDATE diseños SET activo=0 WHERE idDiseño=" + idDiseño;
				statement.executeUpdate(query);
			}
			catch(SQLException e){
				e.printStackTrace();
				result =-100;
			}
		}
		return result;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAODiseño#modificar(TDiseño tDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int modificar(TDiseño tDiseño) {
		// begin-user-code
		int idDiseño = -100;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE producto SET "
						+ "nombre='" + tDiseño.getNombre()+ "', "
						+ "descripcion='"+tDiseño.getDescripcion() + "', "
						+ "propietario='" + tDiseño.getPropietario() + "', "
						+ "alto='" +  tDiseño.getAlto() + "', "
						+ "ancho='" +  tDiseño.getAncho() + "', "
						+ "profundidad='" +  tDiseño.getProfundidad() + "', "
						+ "precio='" + tDiseño.getPrecio() + "', "
						+ "archivo='" + tDiseño.getArchivo() + "', "
						+ "imagen='" + tDiseño.getImagen() + "', "
						+ "activo=" + (tDiseño.getActivo() ? 1 : 0) + " "
						+ "WHERE idDiseño=" + tDiseño.getId_diseño();
				statement.executeUpdate(query);
				idDiseño = tDiseño.getId_diseño();
			} catch (SQLException e) {
				idDiseño = -100;
			}
		}
		
		return idDiseño;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAODiseño#buscarPorId(int idDiseño)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TDiseño buscarPorId(int idDiseño) {
		// begin-user-code
		TDiseño tDiseño = null;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM diseños WHERE idDiseño=" + idDiseño;
				ResultSet resultSet = statement.executeQuery(query);
				if(resultSet.next()) {
					tDiseño = new TDiseño(
							idDiseño,
							resultSet.getString("nombre"),
							resultSet.getString("descripcion"),
							resultSet.getInt("propietario"),
							resultSet.getFloat("alto"),
							resultSet.getFloat("ancho"),
							resultSet.getFloat("profundidad"),
							resultSet.getFloat("precio"),
							resultSet.getString("archivo"),
							resultSet.getObject("imagen"),
							resultSet.getBoolean("activo")
							);
				}
			} catch (SQLException e) {
				tDiseño = null;
			}
		}
		
		return tDiseño;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAODiseño#buscarPorPalabraClave(String palabraClave)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDiseño> buscarPorPalabraClave(String palabraClave) {
		// begin-user-code
		TDiseño tDiseño = null;
		ArrayList<TDiseño>  listaDiseños = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM diseños WHERE nombre CONTAINS=" +palabraClave;
				ResultSet resultSet = statement.executeQuery(query);
				while(resultSet.next()) {
					tDiseño = new TDiseño(
							resultSet.getInt("idDiseño"),
							resultSet.getString("nombre"),
							resultSet.getString("descripcion"),
							resultSet.getInt("propietario"),
							resultSet.getFloat("alto"),
							resultSet.getFloat("ancho"),
							resultSet.getFloat("profundidad"),
							resultSet.getFloat("precio"),
							resultSet.getString("archivo"),
							resultSet.getObject("imagen"),
							resultSet.getBoolean("activo")
							);
					listaDiseños.add(tDiseño);
				}
			} catch (SQLException e) {
				tDiseño = null;
			}
		}
		
		return tDiseño;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAODiseño#listarTodos()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDiseño> listarTodos() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		ArrayList<TDiseño>  listaDiseños = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM diseños WHERE activo=1";
				ResultSet resultSet = statement.executeQuery(query);
				TDiseño tDiseño;
				while(resultSet.next()) {
					tDiseño = new TDiseño(
							resultSet.getInt("idDiseño"),
							resultSet.getString("nombre"),
							resultSet.getString("descripcion"),
							resultSet.getInt("propietario"),
							resultSet.getFloat("alto"),
							resultSet.getFloat("ancho"),
							resultSet.getFloat("profundidad"),
							resultSet.getFloat("precio"),
							resultSet.getString("archivo"),
							resultSet.getObject("imagen"),
							resultSet.getBoolean("activo")
							);
					listaDiseños.add(tDiseño);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				listaDiseños = null;
			}
		}
		
		return listaDiseños;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAODiseño#listarPorUsuario(int idUsuario)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TDiseño> listarPorUsuario(int idUsuario) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		ArrayList<TDiseño>  listaDiseños = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM diseños WHERE propietario="+idUsuario;
				ResultSet resultSet = statement.executeQuery(query);
				TDiseño tDiseño;
				while(resultSet.next()) {
					tDiseño = new TDiseño(
							resultSet.getInt("idDiseño"),
							resultSet.getString("nombre"),
							resultSet.getString("descripcion"),
							resultSet.getInt("propietario"),
							resultSet.getFloat("alto"),
							resultSet.getFloat("ancho"),
							resultSet.getFloat("profundidad"),
							resultSet.getFloat("precio"),
							resultSet.getString("archivo"),
							resultSet.getObject("imagen"),
							resultSet.getBoolean("activo")
							);
					listaDiseños.add(tDiseño);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				listaDiseños = null;
			}
		}
		
		return listaDiseños;
		// end-user-code
	}
}