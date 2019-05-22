/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.List;

import Negocio.Dise�o.TDise�o;
import Negocio.Usuario.TUsuario;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TPlataforma {
	private TUsuario usuarioLogueado;
	private ArrayList<TDise�o> dise�os;
	private List<TDise�o> listaCompra;
	private ArrayList<TDise�o> dise�osComprados;
	
	public TPlataforma() {
		//this.usuarioLogueado=new TUsuario();
		dise�osComprados=new ArrayList<TDise�o>();
		listaCompra=new ArrayList<TDise�o>();
		//listaCompra.add(new TDise�o("Dise�o1","Material1"));
		//listaCompra.add(new TDise�o("Dise�o2","Material2"));
		//listaCompra.add(new TDise�o("Dise�o3","Material3"));
		//listaCompra.add(new TDise�o("Dise�o4","Material4"));
	}
	
	/*public boolean logueo(String user, String pass) {
		return this.usuarioLogueado.verificacion(user, pass);
	}*/
	
	public String getUsuarioLogueado(){
		return usuarioLogueado.getNombre();
	}
	
	public List<TDise�o> getListaCompra() {
		return this.listaCompra;
	}
	
	public void eliminarElementoCarrito(TDise�o aEliminar) {
		listaCompra.remove(aEliminar);
	}
	
	public void vaciarElementosCarrito() {
		//listaCompra.removeAll(listaCompra);
		listaCompra=new ArrayList<TDise�o>();
	}
	
	public void comprarElementosCarrito() {
		for(TDise�o m : listaCompra) {
			dise�osComprados.add(m);
		}
		listaCompra=new ArrayList<TDise�o>();
	}
	
	public void guardarDatosCompra() {
		
	}
}