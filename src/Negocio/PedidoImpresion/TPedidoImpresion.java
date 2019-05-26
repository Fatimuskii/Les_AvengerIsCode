/**
 * 
 */
package Negocio.PedidoImpresion;

import java.util.Date;

import Negocio.Diseño.TDiseño;
import Negocio.Impresora.Material;
import Negocio.Impresora.TImpresora;
import Negocio.Local.TLocal;
import Negocio.Usuario.TUsuario;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TPedidoImpresion {

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int IdPedidoImpresion;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TUsuario usuarioSol;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TDiseño disenio;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TImpresora impresora;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String fecha;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private EstadoPedido estadoPedido;
	private int cantidad;
	private Material material;

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean envio;
	// true 1 a local
	// false 0 direccion de usuario
	private TLocal local;

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

	public TPedidoImpresion(int IdPedidoImpr, TUsuario user, TDiseño dis,
			TImpresora impresora, String fecha, EstadoPedido estadoPed,
			int cantidad, Material material, boolean tipoEnvio, TLocal local) {
		this.IdPedidoImpresion = IdPedidoImpr;
		this.usuarioSol = user;
		this.disenio = dis;
		this.impresora = impresora;
		this.fecha = fecha;
		this.estadoPedido = estadoPed;
		this.cantidad = cantidad;
		this.material = material;
		this.envio = tipoEnvio;
		this.local = local;

	}

	public TPedidoImpresion(TUsuario user, TDiseño dis, TImpresora impresora,
			String fecha, EstadoPedido estadoPed, int cantidad,
			Material material, boolean tipoEnvio, TLocal local) {
		this.usuarioSol = user;
		this.disenio = dis;
		this.impresora = impresora;
		this.fecha = fecha;
		this.estadoPedido = estadoPed;
		this.cantidad = cantidad;
		this.material = material;
		this.envio = tipoEnvio;
		this.local = local;

	}

	public int getIdUsuarioSol() {
		return this.usuarioSol.getIdUsuario();
	}

	public int getIdDiseño() {
		return this.disenio.getId_diseño();
	}

	public int getIdImpresora() {
		return this.impresora.getId_impresora();
	}

	public String getFecha() {
		return this.fecha;
	}

	public EstadoPedido getEstadoPed() {
		return this.estadoPedido;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public Material getMaterial() {
		return this.material;
	}

	public boolean getTipoEnvio() {
		return this.envio;
	}

	public int getIdLocal() {
		return this.local.getIdLocal();
	}
	
	public void setEstadoPedido(EstadoPedido nuevoEstado){
		this.estadoPedido = nuevoEstado;
	}
	

}