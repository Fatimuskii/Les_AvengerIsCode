/**
 * 
 */
package Integración.PedidoImpresion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Integración.Conexion.ConexionDAO;
import Negocio.PedidoImpresion.TPedidoImpresion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DAOPedidoImpresionImp implements DAOPedidoImpresion {

	@Override
	public int alta(TPedidoImpresion datos) {
		int IdPed = -100;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();
		
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "INSERT INTO pedidoImpresion (usuarioSol, disenio, impresora, fecha, estadoPedido, cantidad, material, tipoenvio, idlocal)"
						+ " VALUES ('"
						+ datos.getIdUsuarioSol()
						+ "', '"
						+ datos.getIdDiseño()
						+ "', '"
						+ datos.getIdImpresora()
						+ "', '"
						+ datos.getFecha()
						+ "', '"
						+ datos.getEstadoPed()
						+ "', '"
						+ datos.getCantidad()
						+ "', '"
						+ datos.getMaterial()
						+ "', '"
						+ (datos.getTipoEnvio() ? 1 : 0) 
						+ "', '"
						+ datos.getIdLocal()+ "');";
				statement.executeUpdate(query);
				query = "SELECT last_insert_id() as last_id from pedidoImpresion";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					IdPed = resultSet.getInt("last_id");
				}

			} catch (SQLException e) {
				e.printStackTrace();
				IdPed = -100;
			}
		}
		return IdPed;
		// end-user-code
	}
}