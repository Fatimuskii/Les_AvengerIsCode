package Presentacion.Plataforma2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Negocio.Plataforma.SAPlataforma;
import Presentación.Local.GUILocal;
import Presentación.Local.GUILocalImp;

public class GUIVentanaPlataforma extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SAPlataforma ctrl;
	
	private JPanel contentPane;
	private JPanel superiorPane;
	private JPanel izquierdoPane;
	private GUIPanelLogin loginPane;
	private GUIPanelLogueado logueadoPane;
	private GUIPanelInicio inicioPane;
	private GUIImagePanel imagenSuperior;
	private JLayeredPane layeredPane;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private GUIPanelCarrito panelCarrito;
	
	private JButton borrar;
	private JButton vaciar;
	private JButton comprar;
	

	/**
	 * Create the frame.
	 */
	public GUIVentanaPlataforma(SAPlataforma ctrl) {
		this.ctrl=ctrl;
		setBounds(100, 100, 1071, 684);
		this.setLayout(new BorderLayout(0, 0));
		
		contentPane = new JPanel();
		this.add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		superiorPane=new JPanel();
		contentPane.add(superiorPane,BorderLayout.NORTH);
		superiorPane.setLayout(new BorderLayout(0, 0));
		
		loginPane=new GUIPanelLogin(ctrl,this);
		superiorPane.add(loginPane,BorderLayout.EAST);
		
		//logueadoPane=new GUIPanelLogueado(ctrl);
		
		panelCarrito=new GUIPanelCarrito();
		panelCarrito.setList(ctrl.getListaCompra());

		imagenSuperior = new GUIImagePanel(new ImageIcon("resources/imagenes/plataforma/avengerisLOGO.png").getImage());
		superiorPane.add(imagenSuperior, BorderLayout.WEST);
		
		izquierdoPane = new JPanel();
		contentPane.add(izquierdoPane, BorderLayout.WEST);
		izquierdoPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new GUILocalImp();
		//panel_1.setBackground(Color.BLACK);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.GREEN);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.PINK);
		
		inicioPane =new GUIPanelInicio(layeredPane, panel_1, panel_2, panel_3, panel_4);
		izquierdoPane.add(inicioPane);
		
		borrar=panelCarrito.getBotonBorrar();
		vaciar=panelCarrito.getBotonVaciar();
		comprar=panelCarrito.getBotonComprar();
		this.initBotonesPCarrito();
	}
	
	public void logueado() {
		logueadoPane=new GUIPanelLogueado(ctrl);
		logueadoPane.getBotonCarrito().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelCarrito);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		superiorPane.remove(loginPane);
		loginPane.setVisible(false);
		superiorPane.add(logueadoPane,BorderLayout.EAST);
		superiorPane.revalidate();
		superiorPane.repaint();
	}
	
	public void initBotonesPCarrito() {
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.eliminarElementoCarrito(panelCarrito.getSelectedItem());
				panelCarrito.setList(ctrl.getListaCompra());
			}
		});
		
		vaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ctrl.vaciarElementosCarrito();
				panelCarrito.setList(ctrl.getListaCompra());
			}
		});
		
		comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ctrl.comprarElementosCarrito();
				panelCarrito.setList(ctrl.getListaCompra());
			}
		});
	}
}
