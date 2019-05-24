/**
 * 
 */
package Negocio.Factoria;

import Negocio.Diseño.SADiseño;
import Negocio.Diseño.SADiseñoImp;
import Negocio.Impresora.SAImpresora;
import Negocio.Impresora.SAImpresoraImp;
import Negocio.Local.SALocal;
import Negocio.Local.SALocalImp;
import Negocio.Usuario.SAUsuario;
import Negocio.Usuario.SAUsuarioImp;
import Negocio.Plataforma.SAPlataforma;
import Negocio.Plataforma.SAPlataformaImp;
import Negocio.PedidoImpresion.SAPedidoImpresion;
import Negocio.PedidoImpresion.SAPedidoImpresionImp;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SAFactoriaImp extends SAFactoria {
	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSADiseño()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SADiseño generateSADiseño() {
		// begin-user-code
		return new SADiseñoImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAImpresora()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAImpresora generateSAImpresora() {
		// begin-user-code
		return new SAImpresoraImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSALocal()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	public SALocal generateSALocal() {
		// begin-user-code
		return new SALocalImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAUsuario()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAUsuario generateSAUsuario() {
		// begin-user-code
		return new SAUsuarioImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAPlataforma()
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAPlataforma generateSAPlataforma() {
		// begin-user-code
		return new SAPlataformaImp();
		// end-user-code
	}

	/** 
	 * (sin Javadoc)
	 * @see SAFactoria#generateSAPedidoImpresion(SAPedidoImpresion Parameter1)
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SAPedidoImpresion generateSAPedidoImpresion() {
		// begin-user-code
		return new SAPedidoImpresionImp();
		// end-user-code
	}

	
}