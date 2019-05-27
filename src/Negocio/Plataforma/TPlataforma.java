/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Negocio.Dise�o.TDise�o;
import Negocio.Usuario.TUsuario;
import Presentacion.Plataforma2.GUIPlataformaF;
import Presentaci�n.Controlador.Events;
import Presentaci�n.Plataforma.GUIPlataforma;

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
		listaCompra.add(new TDise�o(0, "Dise�o1","Material1", 0, 0, 0, 0, 0, null, false));
		listaCompra.add(new TDise�o(0, "Dise�o3","Material3", 0, 0, 0, 0, 0, null, false));
		listaCompra.add(new TDise�o(0, "Dise�o4","Material4", 0, 0, 0, 0, 0, null, false));
		GUIPlataformaF.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public TUsuario logueo(String user, String pass) {
		this.usuarioLogueado= new TUsuario(484444, "pepe", "sfdfs",
				"asdfadsf", new Date(), "sdfsadf",
				"asdfadfa", "sfadfa", "asfdfadf",
				new Date(),true);
		return this.usuarioLogueado;
	}
	
	public String getUsuarioLogueado(){
		return usuarioLogueado.getNombre();
	}
	
	public List<TDise�o> getListaCompra() {
		return this.listaCompra;
	}
	
	public void eliminarElementoCarrito(TDise�o aEliminar) {
		listaCompra.remove(aEliminar);
		GUIPlataformaF.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public void vaciarElementosCarrito() {
		listaCompra=new ArrayList<TDise�o>();
		GUIPlataformaF.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public void comprarElementosCarrito() {
		for(TDise�o m : listaCompra) {
			dise�osComprados.add(m);
		}
		listaCompra=new ArrayList<TDise�o>();
	}
	
	public void guardarDatosCompra() {
		
	}

	public void annadirElementoCarrito(TDise�o aAnnadir) {
		// TODO Auto-generated method stub
		listaCompra.add(aAnnadir);
	}
}