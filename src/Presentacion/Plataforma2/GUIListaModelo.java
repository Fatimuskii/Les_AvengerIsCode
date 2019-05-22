package Presentacion.Plataforma2;

import java.util.List;

import javax.swing.DefaultListModel;

public class GUIListaModelo<T> extends DefaultListModel<T>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<T> lista;
	
	public GUIListaModelo() { 
		this.lista = null;
	}
	
	public void setList(List<T> lista) {
		this.lista = lista;
		fireContentsChanged(this, 0, this.lista.size());
	}
	
	@Override
	public T getElementAt(int index) { 
		return this.lista.get(index);
	}
	
	@Override
	public int getSize() {
		return this.lista == null ? 0 : this.lista.size();
	}
}
