/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Integraci�n.Factoria.FactoriaDAO;
import Integraci�n.Plataforma.DAOCompra;
import Negocio.Dise�o.TDise�o;
import Negocio.Usuario.SAUsuario;
import Negocio.Usuario.TUsuario;
import Presentaci�n.Plataforma.GUIPlataforma;
import Presentaci�n.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TPlataforma {
	private TUsuario usuarioLogueado;
	@SuppressWarnings("unused")
	private ArrayList<TDise�o> dise�os;
	private List<TDise�o> listaCompra;
	private ArrayList<TDise�o> dise�osComprados;
	
	public TPlataforma() {
		//this.usuarioLogueado=new TUsuario();
		dise�osComprados=new ArrayList<TDise�o>();
		listaCompra=new ArrayList<TDise�o>();
		GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public TUsuario logueo(int user, String pass, SAUsuario usuario) {
		TUsuario prueba = usuario.buscarIdUsuario(user);
		if(prueba!=null && prueba.getContrase�a().equals(pass)){
			this.usuarioLogueado=prueba;
			return this.usuarioLogueado;
		}
		else
			return null;
	}
	
	public String getUsuarioLogueado(){
		return usuarioLogueado.getNombre();
	}
	
	public List<TDise�o> getListaCompra() {
		return this.listaCompra;
	}
	
	public void eliminarElementoCarrito(TDise�o aEliminar) {
		listaCompra.remove(aEliminar);
		GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public void vaciarElementosCarrito() {
		listaCompra=new ArrayList<TDise�o>();
		GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
	}
	
	public boolean comprarElementosCarrito() {
		TCompra compra;
		int ret;
		DAOCompra compraDAO = FactoriaDAO.getInstance().generateDAOCompra();
		for(TDise�o m : listaCompra) {
			compra=new TCompra(1,this.usuarioLogueado.getIdUsuario(),m.getId_dise�o());
			ret = compraDAO.alta(compra);
		}
		if(listaCompra.size()>=1){
			listaCompra=new ArrayList<TDise�o>();
			GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
			return true;
		}
		listaCompra=new ArrayList<TDise�o>();
		GUIPlataforma.getInstance().update(Events.MODIFICAR_CARRITO_ANNADIR, listaCompra);
		return false;
	}

	public boolean annadirElementoCarrito(TDise�o aAnnadir) {
		// TODO Auto-generated method stub
		if(!listaCompra.contains(aAnnadir)){
			listaCompra.add(aAnnadir);
			return true;
		}
		return false;
	}
}