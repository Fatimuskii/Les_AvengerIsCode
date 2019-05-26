/**
 * 
 */
package Negocio.PedidoImpresion;

import Integraci�n.Factoria.FactoriaDAO;
import Integraci�n.Impresora.DAOImpresora;
import Integraci�n.PedidoImpresion.DAOPedidoImpresion;
import Negocio.Impresora.SAImpresora;
import Negocio.Impresora.TImpresora;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAPedidoImpresionImp implements SAPedidoImpresion {
 
	/** 
	 * (sin Javadoc)
	 * @see SAImpresora#alta(TImpresora tImpresora)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@Override
	public int alta(TPedidoImpresion tPedidoImpr) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		int idPedidoImpr = -100;
		
		if (tPedidoImpr != null) {	
			//DAOUsuario usuarioDAO = FactoriaDAO.getInstance().generateDAOUsuario();

		/*	TUsuario usuario = usuarioDAO.buscarIdUsuario(tDise�o.getPropietario());
			if(usuario != null){
				if(usuario.getActivo()){*/
					EstadoPedido estadoIni =  EstadoPedido.PEN;
					DAOPedidoImpresion pedidoImprDAO = FactoriaDAO.getInstance().generatePedidoImpresion();
					tPedidoImpr.setEstadoPedido(estadoIni);
					idPedidoImpr = pedidoImprDAO.alta(tPedidoImpr);
				}
	//		}
		//}
		
		return idPedidoImpr;
		
	}
	
}