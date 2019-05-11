/**
 * 
 */
package Integración.Factoria;

import Integración.Impresora.DAOImpresora;
import Integración.Local.DAOLocal;
import Integración.Local.DAOLocalImpl;
import Integración.Local.DAORepresentante;
import Integración.Local.DAORepresentanteImp;
import Integración.PedidoImpresion.DAOPedidoImpresion;
import Integración.PedidoImpresion.DAOPedidoImpresionImp;
import Integración.Plataforma.DAOPlataforma;
import Integración.Plataforma.DAOPlataformaImp;
import Integración.Usuario.DAOUsuario;
import Integración.Diseño.DAODiseño;

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
		// TODO Apéndice de método generado automáticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see FactoriaDAO#generateDAODiseño()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DAODiseño generateDAODiseño() {
		// begin-user-code
		return new DAODiseñoImp();
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
	public DAOPlataforma generateDAOPlataforma() {
		// begin-user-code
		return new DAOPlataformaImp();
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

	public DAORepresentante generateDAORepresentante(){
		
		return new DAORepresentanteImp();
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
}