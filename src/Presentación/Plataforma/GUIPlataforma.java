package Presentación.Plataforma;

import javax.swing.JFrame;

public abstract class GUIPlataforma extends JFrame {
	private static GUIPlataforma instance;
	
	public GUIPlataforma(){
		super();
	}

	public static GUIPlataforma getInstance() {
		if (instance == null)
			instance = new GUIPlataformaImp();
		instance.setVisible(true);
		return instance;
	}
	public abstract void update(int event, Object res);
	public abstract void initGUI();
}
