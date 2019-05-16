package Negocio.Local;

import java.util.ArrayList;

import Integraci�n.Dise�o.DAODise�o;
import Integraci�n.Factoria.FactoriaDAO;
import Integraci�n.Local.DAOLocal;
import Integraci�n.Local.DAORepresentante;
import Negocio.Dise�o.TDise�o;

public class SARepresentanteImp implements SARepresentante{

	@Override
	public int alta(TRepresentante datos) {
		// TODO Ap�ndice de m�todo generado autom�ticamente 
		DAORepresentante repDAO = FactoriaDAO.getInstance().generateDAORepresentante();
		if ( repDAO.buscarPorNombre(datos.getNombreCompleto())== null ) {
			return repDAO.alta(datos);
		}
		else 
			return -1;
	
	}

	@Override
	public int baja(int IdRepresentante) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return 0;
	}

	@Override
	public int modificar(TRepresentante datos) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		DAORepresentante repDAO = FactoriaDAO.getInstance().generateDAORepresentante();
		int res= repDAO.modificar(datos);
		if (res>0)
			return res;
		else
			return -1;
	}

	@Override
	public TRepresentante buscarPorId(int IdRepresentante) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		// begin-user-code
				TRepresentante tRepre = null;
				DAORepresentante repreDAO = FactoriaDAO.getInstance().generateDAORepresentante();
				tRepre = repreDAO.buscarPorId(IdRepresentante);
				return tRepre;
				// end-user-code
	}

	@Override
	public ArrayList<TRepresentante> listarTodos() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	
	
}
