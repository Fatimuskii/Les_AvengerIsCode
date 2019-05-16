package Integraci�n.Local;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Integraci�n.Conexion.ConexionDAO;
import Negocio.Local.TRepresentante;

public class DAORepresentanteImp implements DAORepresentante {

	@Override
	public int alta(TRepresentante datos) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		int IdRepresentante = -100;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();

		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "INSERT INTO representantes (nombre, telefono, email)"
						+ " VALUES ('"
						+ datos.getNombreCompleto()
						+ "', '"
						+ datos.getTel() + "', '" + datos.getEmail() + "');";
				statement.executeUpdate(query);
				query = "SELECT last_insert_id() as last_id from representantes";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					IdRepresentante = resultSet.getInt("last_id");
				}

			} catch (SQLException e) {
				e.printStackTrace();
				IdRepresentante = -100;
			}
		}
		return IdRepresentante;
		// end-user-code
	}

	@Override
	public int baja(int IdRepresentante) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		int result = -100;
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion(); // end-user-code

		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "DELETE from representantes WHERE IdRepresentante "
						+ IdRepresentante;
				statement.executeUpdate(query);
				result = IdRepresentante;
				connection.close();
			} catch (SQLException e) {
				result = -100;
			}
		}
		return result;
	}

	@Override
	public int modificar(TRepresentante datos) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		int IdRepresentante = -100;
		ConexionDAO con = ConexionDAO.getInstance();
		Connection connection = con.getConexion();
		// TODO Ap�ndice de m�todo generado autom�ticamente
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "UPDATE representantes SET " 
						+ "nombre='" + datos.getNombreCompleto() + "', " 
						+ "telefono='" + datos.getTel() + "', "
						+ "email='" + datos.getEmail() +"' "
						+ "WHERE IdRepresentante=" + datos.getIdRepresentante();
				statement.executeUpdate(query);
				IdRepresentante = datos.getIdRepresentante();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				IdRepresentante = -100;
			}
		}
		return IdRepresentante;
	}

	@Override
	public TRepresentante buscarPorId(int IdRepresentante) {
		// begin-user-code
		TRepresentante representante = null;
		ConexionDAO daocon = ConexionDAO.getInstance();
		Connection connection = daocon.getConexion();
		// TODO Ap�ndice de m�todo generado autom�ticamente
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM representantes WHERE IdRepresentante="
						+ IdRepresentante;
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					representante = new TRepresentante(IdRepresentante,
							resultSet.getString("nombre"),
							resultSet.getInt("telefono"),
							resultSet.getString("email"));
				}
				connection.close();
			} catch (SQLException e) {
				representante = null;
			}
		}

		// end-user-code
		return representante;

	}

	@Override
	public ArrayList<TRepresentante> listarTodos() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		ArrayList<TRepresentante> listaRepre = new ArrayList<>();
		ConexionDAO connectionDAO = ConexionDAO.getInstance();
		Connection connection = connectionDAO.getConexion();

		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM representantes";
				ResultSet resultSet = statement.executeQuery(query);

				while (resultSet.next()) {
					listaRepre.add(this.buscarPorId(resultSet
							.getInt("IdRepresentante")));
				}
				connection.close();
			} catch (SQLException e) {
				listaRepre = null;
			}
		}

		return listaRepre;
		// TODO Ap�ndice de m�todo generado autom�ticamente

		// end-user-code
	}

	@Override
	public TRepresentante buscarPorNombre(String nombre) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		// begin-user-code
		TRepresentante repre = null;
		ConexionDAO daocon = ConexionDAO.getInstance();
		Connection connection = daocon.getConexion();
		// TODO Ap�ndice de m�todo generado autom�ticamente
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				String query = "SELECT * FROM representantes WHERE nombre='" + nombre+"'";
				ResultSet resultSet = statement.executeQuery(query);
				if (resultSet.next()) {
					repre = new TRepresentante(resultSet.getInt("IdRepresentante"), nombre,
							resultSet.getInt("telefono"),
							resultSet.getString("email"));
				}
				connection.close();
			} catch (SQLException e) {
				repre = null;
			}
		}

		// end-user-code
		return repre;
	}

}
