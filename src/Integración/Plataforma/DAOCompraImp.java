/**
 * 
 */
package Integraci�n.Plataforma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Integraci�n.Conexion.ConexionDAO;
import Negocio.Dise�o.TDise�o;
import Negocio.Plataforma.TCompra;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOCompraImp implements DAOCompra {

	public int alta(TCompra compra) {
		
		int idCompra = -100;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();

		if(connection != null){
			try{
				Statement statement = connection.createStatement();
				String query = "INSERT INTO compras (IdUsuario,IdDise�o)"
						+ "VALUES ('"
						+ compra.getIdUsuario()
						+ "', '"
						+ compra.getIdDise�o()
						+ "');";
				statement.executeUpdate(query);
				query = "SELECT last_insert_id() as last_id from compras";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					idCompra = resultSet.getInt("last_id");
				}
				connection.close();
			}
			catch(SQLException e){
				idCompra = -100;
			}
		}
		
		return idCompra;
	}
	public ArrayList<TCompra> listarPorUsuario(int idUsuario) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		ArrayList<TCompra>  listaCompras = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();
		
		if(connection!=null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM compras WHERE IdUsuario="+idUsuario;
				ResultSet resultSet = statement.executeQuery(query);
				TCompra compra;
				while(resultSet.next()) {
					compra = new TCompra(
							resultSet.getInt("IdCompra"),
							resultSet.getInt("IdUsuario"),
							resultSet.getInt("IdDise�o")
							);
					listaCompras.add(compra);
				}
			} catch (SQLException e) {
				listaCompras = null;
			}
		}
		
		return listaCompras;
		// end-user-code
	}
}