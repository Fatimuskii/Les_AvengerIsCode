/**
 * 
 */
package Integraci�n.Factoria;

import Integraci�n.Impresora.DAOImpresora;
import Integraci�n.Impresora.DAOImpresoraImp;
import Integraci�n.Local.DAOLocal;
import Integraci�n.Local.DAOLocalImpl;
import Integraci�n.PedidoImpresion.DAOPedidoImpresion;
import Integraci�n.PedidoImpresion.DAOPedidoImpresionImp;
import Integraci�n.Plataforma.DAOCompra;
import Integraci�n.Plataforma.DAOCompraImp;
import Integraci�n.Usuario.DAOUsuario;
import Integraci�n.Usuario.DAOUsuarioImp;
import Integraci�n.Dise�o.DAODise�o;
import Integraci�n.Dise�o.DAODise�oImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FactoriaDAOImp extends FactoriaDAO {
	/** 
	 * (sin Javadoc)
	 * @see FactoriaDAO#generateDAOImpresora()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOImpresora generateDAOImpresora() {
		// begin-user-code
		return new DAOImpresoraImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see FactoriaDAO#generateDAODise�o()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAODise�o generateDAODise�o() {
		// begin-user-code
		return new DAODise�oImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see FactoriaDAO#generateDAOUsuario()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOUsuario generateDAOUsuario() {
		// begin-user-code
		return new DAOUsuarioImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see FactoriaDAO#generateDAOPlataforma()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOCompra generateDAOPlataforma() {
		// begin-user-code
		return new DAOCompraImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see FactoriaDAO#generateDAOLocal()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOLocal generateDAOLocal() {
		// begin-user-code
		return new DAOLocalImpl();
		// end-user-code
	}
	/** 
	 * (sin Javadoc)
	 * @see FactoriaDAO#generatePedidoImpresion()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAOPedidoImpresion generatePedidoImpresion() {
		// begin-user-code
		return new DAOPedidoImpresionImp();
		// end-user-code
	}

	@Override
	public DAOCompra generateDAOCompra() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return new DAOCompraImp();
	}
}