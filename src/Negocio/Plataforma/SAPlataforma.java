/**
 * 
 */
package Negocio.Plataforma;

import java.util.List;

import Negocio.Dise�o.TDise�o;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SAPlataforma {
	
	
	boolean logueo(String user, String pass);
	
	
	public String getUsuarioLogueado();
	
	
	public List<TDise�o> getListaCompra();
	
	
	public void eliminarElementoCarrito(TDise�o aEliminar);
	
	
	public void vaciarElementosCarrito();
	
	
	public void comprarElementosCarrito();
}