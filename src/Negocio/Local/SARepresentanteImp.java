package Negocio.Local;

import java.util.ArrayList;

import Integración.Factoria.FactoriaDAO;
import Integración.Local.DAOLocal;
import Integración.Local.DAORepresentante;

public class SARepresentanteImp implements SARepresentante{

	@Override
	public int alta(TRepresentante datos) {
		// TODO Apéndice de método generado automáticamente 
		DAORepresentante repDAO = FactoriaDAO.getInstance().generateDAORepresentante();
		if ( repDAO.buscarPorNombre(datos.getNombreCompleto())== null ) {
			return repDAO.alta(datos);
		}
		else 
			return -1;
	
	}

	@Override
	public int baja(int IdRepresentante) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public int modificar(TRepresentante datos) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public TLocal buscarPorId(int IdRepresentante) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public ArrayList<TRepresentante> listarTodos() {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	
	
}
