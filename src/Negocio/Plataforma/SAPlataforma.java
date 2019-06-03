/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.List;

import Negocio.Diseño.TDiseño;
import Negocio.Usuario.SAUsuario;
import Negocio.Usuario.TUsuario;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface SAPlataforma {
	
	
	public TUsuario logueo(int user, String pass, SAUsuario usuario);
	
	
	public String getUsuarioLogueado();
	
	
	public List<TDiseño> getListaCompra();
	
	
	public void eliminarElementoCarrito(TDiseño aEliminar);
	
	
	public void vaciarElementosCarrito();
	
	
	public boolean comprarElementosCarrito();
	
	
	public boolean annadirElementoCarrito(TDiseño aAnnadir);
	
	
	public ArrayList<TCompra> listarPorIdUsuarioCompras(int idUsuario);
}