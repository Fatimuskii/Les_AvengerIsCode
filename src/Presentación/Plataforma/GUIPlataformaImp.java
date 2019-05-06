/**
 * 
 */
package Presentación.Plataforma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIPlataformaImp extends GUIPlataforma {
	
	private GUILogin loginGui;
	private JPanel contentPane;
	
	public GUIPlataformaImp(){
		super();
		//loginGui= new GUILogin();
		contentPane = new JPanel();	
		initGUI();
	}
	
	
	public void initGUI() {
		// TODO Apéndice de método generado automáticamente
		setTitle("LES_AVENGERIS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 517);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton login = new JButton("login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginGui = new GUILogin();
				loginGui.setVisible(true);
			}
		});
		login.setIcon(new ImageIcon("imagenes\\login.png"));
		login.setBounds(615, 24, 90, 60);
		contentPane.add(login);
		
		JButton carrito = new JButton("carrito");
		carrito.setIcon(new ImageIcon("imagenes\\carritoCompra.png"));
		carrito.setBounds(720, 24, 90, 60);
		contentPane.add(carrito);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("imagenes\\avengerisLOGO.png"));
		logo.setBounds(26, 0, 570, 166);
		contentPane.add(logo);

	}
	
	public void close()
	{
		System.exit(0);
	}


	@Override
	public void update(int event, Object res) {
		// TODO Apéndice de método generado automáticamente
		
	}
}