/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Negocio.Diseño.TDiseño;
import Negocio.Usuario.SAUsuario;
import Negocio.Usuario.TUsuario;
import Presentación.Plataforma.GUIPlataforma;
import Presentación.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TPlataforma {
	private TUsuario usuarioLogueado;
	@SuppressWarnings("unused")
	private ArrayList<TDiseño> diseños;
	private List<TDiseño> listaCompra;
	private ArrayList<TDiseño> diseñosComprados;
	
	public TPlataforma() {
		//this.usuarioLogueado=new TUsuario();
		diseñosComprados=new ArrayList<TDiseño>();
		listaCompra=new ArrayList<TDiseño>();
		GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public TUsuario logueo(int user, String pass, SAUsuario usuario) {
		TUsuario prueba = usuario.buscarIdUsuario(user);
		if(prueba!=null && prueba.getContraseña().equals(pass)){
			this.usuarioLogueado=prueba;
			return this.usuarioLogueado;
		}
		else
			return null;
	}
	
	public String getUsuarioLogueado(){
		return usuarioLogueado.getNombre();
	}
	
	public List<TDiseño> getListaCompra() {
		return this.listaCompra;
	}
	
	public void eliminarElementoCarrito(TDiseño aEliminar) {
		listaCompra.remove(aEliminar);
		GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public void vaciarElementosCarrito() {
		listaCompra=new ArrayList<TDiseño>();
		GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public void comprarElementosCarrito() {
		for(TDiseño m : listaCompra) {
			diseñosComprados.add(m);
		}
		listaCompra=new ArrayList<TDiseño>();
	}
	
	public void guardarDatosCompra() {
		
	}

	public void annadirElementoCarrito(TDiseño aAnnadir) {
		// TODO Auto-generated method stub
		listaCompra.add(aAnnadir);
	}
}