package Presentación.Plataforma;

import java.awt.Toolkit;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GUIPlataformaImp extends GUIPlataforma {

	//private GUILogin loginGui;
	private GUIVentanaPlataforma contentPane;
	
	public GUIPlataformaImp(){
		super();
		//loginGui= new GUILogin();
		contentPane=new GUIVentanaPlataforma();
		this.setContentPane(contentPane);
		this.setVisible(true);
		initGUI();
	}
	
	
	public void initGUI() {
		setBounds(100, 100, 1071, 684);
		this.setLocationRelativeTo(null);//Pone el JFrame en el centro
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/imagenes/plataforma/avengerisLOGO (Recortado).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void close()
	{
		System.exit(0);
	}


	@Override
	public void update(int event, Object res) {
		contentPane.update(event, res);
		
	}
}
