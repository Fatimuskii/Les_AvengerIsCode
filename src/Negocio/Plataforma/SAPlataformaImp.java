/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.List;

import Integraci�n.Dise�o.DAODise�o;
import Integraci�n.Factoria.FactoriaDAO;
import Integraci�n.Plataforma.DAOCompra;
import Integraci�n.Usuario.DAOUsuario;
import Negocio.Dise�o.TDise�o;
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
	
	public List<TDise�o> getListaCompra(){
		return plataforma.getListaCompra();
	}
	
	public void eliminarElementoCarrito(TDise�o aEliminar) {
		plataforma.eliminarElementoCarrito(aEliminar);
	}
	
	public void vaciarElementosCarrito() {
		plataforma.vaciarElementosCarrito();
	}
	
	public boolean comprarElementosCarrito() {
		return plataforma.comprarElementosCarrito();
	}

	@Override
	public boolean annadirElementoCarrito(TDise�o aAnnadir) {
		// TODO Auto-generated method stub
		return plataforma.annadirElementoCarrito(aAnnadir);
	}
	
	public ArrayList<TCompra> listarPorIdUsuarioCompras(int idUsuario){
		ArrayList<TCompra> compras=null;
		DAOCompra compraDAO = FactoriaDAO.getInstance().generateDAOCompra();
		compras = compraDAO.listarPorUsuario(idUsuario);
		return compras;
	}
	
	public ArrayList<TDise�o> listarIdDise�osComprados(int idUsuario){
		ArrayList<TDise�o> lista=new ArrayList<TDise�o>();
		ArrayList<TCompra> compras;
		TDise�o dise�oAct;
		DAODise�o dise�oDAO=FactoriaDAO.getInstance().generateDAODise�o();
		compras=listarPorIdUsuarioCompras(idUsuario);
		for(TCompra m : compras){
			dise�oAct=dise�oDAO.buscarPorId(m.getIdDise�o());
			if(dise�oAct!=null){
				lista.add(dise�oAct);
			}
		}
		return lista;
	}
	
}