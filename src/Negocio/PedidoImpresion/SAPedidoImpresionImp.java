/**
 * 
 */
package Negocio.PedidoImpresion;

import Integración.Factoria.FactoriaDAO;
import Integración.Impresora.DAOImpresora;
import Integración.PedidoImpresion.DAOPedidoImpresion;
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
		// TODO Apéndice de método generado automáticamente

		int idPedidoImpr = -100;
		
		if (tPedidoImpr != null) {	
			//DAOUsuario usuarioDAO = FactoriaDAO.getInstance().generateDAOUsuario();

		/*	TUsuario usuario = usuarioDAO.buscarIdUsuario(tDiseño.getPropietario());
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