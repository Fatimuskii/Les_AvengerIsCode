package Negocio.Plataforma;

import java.util.List;

import Negocio.Dise�o.TDise�o;

public class CTRLPlataforma {
public TPlataforma plataforma;
	
	public ControladorPlataforma() {
		this.plataforma= new TPlataforma();
	}
	
	public boolean logueo(String user, String pass) {
		return plataforma.logueo(user, pass);
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
	
	public void comprarElementosCarrito() {
		plataforma.comprarElementosCarrito();
	}
}
