/**
 * 
 */
package Negocio.Plataforma;

import java.util.ArrayList;
import java.util.List;

import Integración.Diseño.DAODiseño;
import Integración.Factoria.FactoriaDAO;
import Integración.Plataforma.DAOCompra;
import Integración.Usuario.DAOUsuario;
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
	
	public boolean comprarElementosCarrito() {
		return plataforma.comprarElementosCarrito();
	}

	@Override
	public boolean annadirElementoCarrito(TDiseño aAnnadir) {
		// TODO Auto-generated method stub
		return plataforma.annadirElementoCarrito(aAnnadir);
	}
	
	public ArrayList<TCompra> listarPorIdUsuarioCompras(int idUsuario){
		ArrayList<TCompra> compras=null;
		DAOCompra compraDAO = FactoriaDAO.getInstance().generateDAOCompra();
		compras = compraDAO.listarPorUsuario(idUsuario);
		return compras;
	}
	
	public ArrayList<TDiseño> listarIdDiseñosComprados(int idUsuario){
		ArrayList<TDiseño> lista=new ArrayList<TDiseño>();
		ArrayList<TCompra> compras;
		TDiseño diseñoAct;
		DAODiseño diseñoDAO=FactoriaDAO.getInstance().generateDAODiseño();
		compras=listarPorIdUsuarioCompras(idUsuario);
		for(TCompra m : compras){
			diseñoAct=diseñoDAO.buscarPorId(m.getIdDiseño());
			if(diseñoAct!=null){
				lista.add(diseñoAct);
			}
		}
		return lista;
	}
	
}