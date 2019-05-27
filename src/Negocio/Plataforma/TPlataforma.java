/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Negocio.Diseño.TDiseño;
import Negocio.Usuario.TUsuario;
import Presentacion.Plataforma2.GUIPlataformaF;
import Presentación.Controlador.Events;
import Presentación.Plataforma.GUIPlataforma;

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
		listaCompra.add(new TDiseño(0, "Diseño1","Material1", 0, 0, 0, 0, 0, null, false));
		listaCompra.add(new TDiseño(0, "Diseño3","Material3", 0, 0, 0, 0, 0, null, false));
		listaCompra.add(new TDiseño(0, "Diseño4","Material4", 0, 0, 0, 0, 0, null, false));
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
	
	public List<TDiseño> getListaCompra() {
		return this.listaCompra;
	}
	
	public void eliminarElementoCarrito(TDiseño aEliminar) {
		listaCompra.remove(aEliminar);
		GUIPlataformaF.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public void vaciarElementosCarrito() {
		listaCompra=new ArrayList<TDiseño>();
		GUIPlataformaF.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
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