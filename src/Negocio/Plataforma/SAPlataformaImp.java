/**
 * 
 */
package Negocio.Plataforma;

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
public class SAPlataformaImp implements SAPlataforma {
public TPlataforma plataforma;
	
	public SAPlataformaImp() {
		this.plataforma= new TPlataforma();
	}
	
	public TUsuario logueo(int user, String pass, SAUsuario usuario) {
		return plataforma.logueo(user, pass, usuario);
	}
	
	public String getUsuarioLogueado() {
		return plataforma.getUsuarioLogueado();
	}
	
	public List<TDiseño> getListaCompra(){
		return plataforma.getListaCompra();
	}
	
	public void eliminarElementoCarrito(TDiseño aEliminar) {
		plataforma.eliminarElementoCarrito(aEliminar);
	}
	
	public void vaciarElementosCarrito() {
		plataforma.vaciarElementosCarrito();
	}
	
	public void comprarElementosCarrito() {
		plataforma.comprarElementosCarrito();
	}

	@Override
	public void annadirElementoCarrito(TDiseño aAnnadir) {
		// TODO Auto-generated method stub
		plataforma.annadirElementoCarrito(aAnnadir);
	}
}