package Presentacion.Plataforma2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Negocio.Plataforma.SAPlataforma;
import Presentación.Plataforma.GUILogin;

public class GUIPlataformaFimp extends GUIPlataformaF {

	private GUILogin loginGui;
	private GUIVentanaPlataforma contentPane;
	
	public GUIPlataformaFimp(){
		super();
		//loginGui= new GUILogin();
		contentPane=new GUIVentanaPlataforma();
		this.setContentPane(contentPane);
		this.setVisible(true);
		initGUI();
	}
	
	
	public void initGUI() {
		setBounds(100, 100, 1071, 684);
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
