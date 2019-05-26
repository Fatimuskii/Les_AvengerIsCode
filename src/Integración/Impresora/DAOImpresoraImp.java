/**
 * 
 */
package Integración.Impresora;

import Integración.Conexion.ConexionDAO;
import Negocio.Impresora.TImpresora;
import Negocio.Impresora.Material;

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
public class DAOImpresoraImp implements DAOImpresora {
	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#alta(TImpresora tImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int alta(TImpresora tImpresora) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		int idImpresora = -100;

		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();

		if(connection != null){
			try{
				Statement statement = connection.createStatement();
				String query = "INSERT INTO impresora (material, alto, ancho, profundidad, usuario, activo)"
						+ "VALUES ('"
						+ tImpresora.getMaterial()
						+ "', '"
						+ tImpresora.getAlto()
						+ "', '"
						+ tImpresora.getAncho()
						+ "', '"
						+ tImpresora.getProfundidad()
						+ "', '"
						+ tImpresora.getUsuario()
						+ "', '"
						+ (tImpresora.getActivo() ? 1 : 0)
						+ "');";
				statement.executeUpdate(query);
				query = "SELECT last_insert_id() as last_id from impresora";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					idImpresora = resultSet.getInt("last_id");
				}
				connection.close();
			}
			catch(SQLException e){
				idImpresora = -100;
			}
		}
		
		return idImpresora;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#buscarId(int idImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TImpresora buscarId(int idImpresora) {
		// begin-user-code
		TImpresora tImpresora = null;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM impresora WHERE idImpresora=" + idImpresora;
				ResultSet resultSet = statement.executeQuery(query);
				if(resultSet.next()) {
					tImpresora = new TImpresora(
							idImpresora,
							Material.parse(resultSet.getString("material")),
							resultSet.getFloat("alto"),
							resultSet.getFloat("ancho"),
							resultSet.getFloat("profundidad"),
							resultSet.getInt("usuario"),
							resultSet.getBoolean("activo")
							);
				}
			} catch (SQLException e) {
				tImpresora = null;
			}
		}
		
		return tImpresora;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#buscarPorUsuario(int idUsuario)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TImpresora> buscarPorUsuario(int idUsuario) {
		// begin-user-code
		ArrayList<TImpresora>  listaImpresoras = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM impresora WHERE usuario="+idUsuario + " AND activo = 1";
				ResultSet resultSet = statement.executeQuery(query);
				TImpresora tImpresora;
				while(resultSet.next()) {
					tImpresora = new TImpresora(
							resultSet.getInt("idImpresora"),
							Material.parse(resultSet.getString("material")),
							resultSet.getFloat("alto"),
							resultSet.getFloat("ancho"),
							resultSet.getFloat("profundidad"),
							resultSet.getInt("usuario"),
							resultSet.getBoolean("activo")
							);
					listaImpresoras.add(tImpresora);
				}
			} catch (SQLException e) {
				listaImpresoras = null;
			}
		}
		
		return listaImpresoras;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#listarTodo()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<TImpresora> listarTodo() {
		// begin-user-code
		ArrayList<TImpresora>  listaImpresoras = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM impresora WHERE activo=1";
				ResultSet resultSet = statement.executeQuery(query);
				TImpresora tImpresora;
				while(resultSet.next()) {
					tImpresora = new TImpresora(
							resultSet.getInt("idImpresora"),
							Material.parse(resultSet.getString("material")),
							resultSet.getFloat("alto"),
							resultSet.getFloat("ancho"),
							resultSet.getFloat("profundidad"),
							resultSet.getInt("usuario"),
							resultSet.getBoolean("activo")
							);
					listaImpresoras.add(tImpresora);
				}
			} catch (SQLException e) {
				listaImpresoras = null;
			}
		}
		
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
		int idImpresora = -100;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE impresora SET "
						+ "material='"+tImpresora.getMaterial() + "', "
						+ "alto='" +  tImpresora.getAlto() + "', "
						+ "ancho='" +  tImpresora.getAncho() + "', "
						+ "profundidad='" +  tImpresora.getProfundidad() + "', "
						+ "usuario='" + tImpresora.getUsuario() + "', "
						+ "activo=" + (tImpresora.getActivo() ? 1 : 0) + " "
						+ "WHERE idDiseño=" + tImpresora.getId_impresora();
				statement.executeUpdate(query);
				idImpresora = tImpresora.getId_impresora();
			} catch (SQLException e) {
				idImpresora = -100;
			}
		}
		
		return idImpresora;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see DAOImpresora#baja(int idImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int baja(int idImpresora) {
		// begin-user-code
		int id = -1;
		
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE impresora SET activo=0 WHERE idImpresora=" + idImpresora;
				statement.executeUpdate(query);
				id = idImpresora;
				connection.close();
			} catch (SQLException e) {
				id = -100;
			}
		}

		return id;
		// end-user-code
	}
}