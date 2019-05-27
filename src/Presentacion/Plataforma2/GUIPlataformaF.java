package Presentacion.Plataforma2;

import javax.swing.JFrame;

import Negocio.Plataforma.SAPlataforma;
import Negocio.Plataforma.SAPlataformaImp;
import Presentación.Plataforma.GUIPlataforma;
import Presentación.Plataforma.GUIPlataformaImp;

public abstract class GUIPlataformaF extends JFrame {
	private static GUIPlataformaF instance;
	
	public GUIPlataformaF(){
		super();
	}

	public static GUIPlataformaF getInstance() {
		if (instance == null)
			instance = new GUIPlataformaFimp();
		instance.setVisible(true);
		return instance;
	}
	public abstract void update(int event, Object res);
	public abstract void initGUI();
}
