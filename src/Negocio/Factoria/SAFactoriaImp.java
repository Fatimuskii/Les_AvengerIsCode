/**
 * 
 */
package Negocio.Factoria;

import Negocio.Dise�o.SADise�o;
import Negocio.Impresora.SAImpresora;
import Negocio.Local.SALocal;
import Negocio.Local.SALocalImp;
import Negocio.Local.SARepresentante;
import Negocio.Local.SARepresentanteImp;
import Negocio.Usuario.SAUsuario;
import Negocio.Plataforma.SAPlataforma;
import Negocio.PedidoImpresion.SAPedidoImpresion;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAFactoriaImp extends SAFactoria {
	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSADise�o()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SADise�o generateSADise�o() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAImpresora()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAImpresora generateSAImpresora() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSALocal()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	public SALocal generateSALocal() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return new SALocalImp();
		// end-user-code
	}
	@Override
	public SARepresentante generateSARepresentante() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return new SARepresentanteImp();
	}
	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAUsuario()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAUsuario generateSAUsuario() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAPlataforma()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAPlataforma generateSAPlataforma() {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAPedidoImpresion(SAPedidoImpresion Parameter1)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void generateSAPedidoImpresion(SAPedidoImpresion Parameter1) {
		// begin-user-code
		// TODO Ap�ndice de m�todo generado autom�ticamente

		// end-user-code
	}

	
}