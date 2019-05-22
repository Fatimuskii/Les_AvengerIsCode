/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.List;

import Negocio.Diseño.TDiseño;
import Negocio.Usuario.TUsuario;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TPlataforma {
	private TUsuario usuarioLogueado;
	private ArrayList<TDiseño> diseños;
	private List<TDiseño> listaCompra;
	private ArrayList<TDiseño> diseñosComprados;
	
	public TPlataforma() {
		//this.usuarioLogueado=new TUsuario();
		diseñosComprados=new ArrayList<TDiseño>();
		listaCompra=new ArrayList<TDiseño>();
		//listaCompra.add(new TDiseño("Diseño1","Material1"));
		//listaCompra.add(new TDiseño("Diseño2","Material2"));
		//listaCompra.add(new TDiseño("Diseño3","Material3"));
		//listaCompra.add(new TDiseño("Diseño4","Material4"));
	}
	
	/*public boolean logueo(String user, String pass) {
		return this.usuarioLogueado.verificacion(user, pass);
	}*/
	
	public String getUsuarioLogueado(){
		return usuarioLogueado.getNombre();
	}
	
	public List<TDiseño> getListaCompra() {
		return this.listaCompra;
	}
	
	public void eliminarElementoCarrito(TDiseño aEliminar) {
		listaCompra.remove(aEliminar);
	}
	
	public void vaciarElementosCarrito() {
		//listaCompra.removeAll(listaCompra);
		listaCompra=new ArrayList<TDiseño>();
	}
	
	public void comprarElementosCarrito() {
		for(TDiseño m : listaCompra) {
			diseñosComprados.add(m);
		}
		listaCompra=new ArrayList<TDiseño>();
	}
	
	public void guardarDatosCompra() {
		
	}
}