/**
 * 
 */
package Negocio.Plataforma;

import java.util.List;

import Negocio.Diseño.TDiseño;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SAPlataforma {
	
	
	boolean logueo(String user, String pass);
	
	
	public String getUsuarioLogueado();
	
	
	public List<TDiseño> getListaCompra();
	
	
	public void eliminarElementoCarrito(TDiseño aEliminar);
	
	
	public void vaciarElementosCarrito();
	
	
	public void comprarElementosCarrito();
}