package Presentación.Plataforma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Negocio.Diseño.TDiseño;
import Negocio.Plataforma.SAPlataforma;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;
import Presentación.Diseño.GUIDiseño;
import Presentación.Impresora.GUIImpresora;
import Presentación.Local.GUILocal;
import Presentación.Local.GUILocalImp;
import Presentación.PedidoImpresion.GUIPedidoImpresion;
import Presentación.Usuario.GUIUsuario;

public class GUIVentanaPlataforma extends JPanel implements GUIEventoPlataforma {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JPanel superiorPane;
	private JPanel izquierdoPane;
	private GUIPanelLogin loginPane;
	private GUIPanelLogueado logueadoPane;
	private GUIPanelInicio inicioPane;
	private GUIImagePanel imagenSuperior;
	private JLayeredPane layeredPane;
	private GUIDiseño panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private GUIPanelCarrito panelCarrito;
	private GUIPanelCompras panelCompras;
	private GUIHistorialCompras panelHistorial;
	private TUsuario uLogueado;	
	private JButton borrar;
	private JButton vaciar;
	private JButton comprar;
	private JButton annadirCarrito;
	
	

	/**
	 * Create the frame.
	 */
	public GUIVentanaPlataforma() {
		init();
	}
	
	public void init() {
		setBounds(100, 100, 1071, 684);
		this.setLayout(new BorderLayout(0, 0));
		
		contentPane = new JPanel();
		this.add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		superiorPane=new JPanel();
		contentPane.add(superiorPane,BorderLayout.NORTH);
		superiorPane.setLayout(new BorderLayout(0, 0));
		
		loginPane=new GUIPanelLogin(this);
		superiorPane.add(loginPane,BorderLayout.EAST);
		
		panelCarrito=new GUIPanelCarrito();

		imagenSuperior = new GUIImagePanel(new ImageIcon("imagenes/avengerisLOGO.png").getImage());
		superiorPane.add(imagenSuperior, BorderLayout.WEST);
		
		izquierdoPane = new JPanel();
		contentPane.add(izquierdoPane, BorderLayout.WEST);
		izquierdoPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(new BorderLayout(0, 0));
		
		panel_1 = GUIDiseño.getInstance();
		
		panel_2 = new JPanel();
		
		panel_3 = GUILocal.getInstance();
		
		panel_4 = GUIUsuario.getInstance();
		
		panel_5 = GUIImpresora.getInstance();
		
		panelHistorial=new GUIHistorialCompras(null);
		
		panelCompras=new GUIPanelCompras();
		
		inicioPane =new GUIPanelInicio(this,layeredPane, panel_1, panel_2, panel_3, panel_4, panel_5, panelCompras, panelHistorial);
		izquierdoPane.add(inicioPane);
		
		borrar=panelCarrito.getBotonBorrar();
		vaciar=panelCarrito.getBotonVaciar();
		comprar=panelCarrito.getBotonComprar();
		annadirCarrito=panelCompras.getBotonComprar();
		
		this.initBotonesPCarrito();
		this.initBotonesPCompras();
	}
	public void logueado(TUsuario usuario) {
		uLogueado = usuario;
		inicioPane.setPedidoImpresionGUI(GUIPedidoImpresion.getInstance(uLogueado));
		panelHistorial=new GUIHistorialCompras(uLogueado);
		inicioPane.setHistorialGUI(panelHistorial);
		inicioPane.update(0, null);
		logueadoPane=new GUIPanelLogueado();
		logueadoPane.getBotonCarrito().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panelCarrito);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		logueadoPane.update(0, usuario );
		superiorPane.remove(loginPane);
		loginPane.setVisible(false);
		superiorPane.add(logueadoPane,BorderLayout.EAST);
		superiorPane.revalidate();
		superiorPane.repaint();
	}
	
	public void initBotonesPCarrito() {
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object objeto=panelCarrito.getSelectedItem();
				if(objeto!=null)
					Controlador.getInstance().accion(Events.MODIFICAR_CARRITO, objeto);
			}
		});
		
		vaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstance().accion(Events.BAJA_CARRITO, null);
			}
		});
		
		comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirma=JOptionPane.showConfirmDialog(null,"Desea comprar, el precio total es: "+panelCarrito.calcularPrecio()+" €","Confirmacion de compra",
						JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
				if(confirma==JOptionPane.YES_OPTION){
					Controlador.getInstance().accion(Events.HISTORIAL_ANNADIR_COMPRAS, null);
				}
			}
		});
	}
	
	public void initBotonesPCompras() {
		annadirCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstance().accion(Events.MODIFICAR_CARRITO_ANNADIR, panelCompras.getSelectedItem());
				
			}
		});
	}

	@Override
	public void update(int evento, Object objeto) {
		// TODO Auto-generated method stub
		switch(evento) {
		case Events.ACCESO_USUARIO_OK:
			logueado((TUsuario)objeto);
			break;
		case Events.ACCESO_USUARIO_KO:
			JOptionPane.showMessageDialog(null, "Usuario no reconocido o contraseña incorrecta", "Error Logueo", JOptionPane.ERROR_MESSAGE);
			break;
		case Events.MODIFICAR_CARRITO_ANNADIR:
			panelCarrito.update(0, objeto);
			break;
		case Events.MODIFICAR_CARRITO_ANNADIR_OK:
			JOptionPane.showMessageDialog(null, "Añadido correctamente", "Añadido", JOptionPane.INFORMATION_MESSAGE);
			break;
		case Events.MODIFICAR_CARRITO_ANNADIR_KO:
			JOptionPane.showMessageDialog(null, "Ya se encuentra en el carrito", "No añadido", JOptionPane.ERROR_MESSAGE);
			break;
		case Events.HISTORIAL_ANNADIR_COMPRAS_OK:
			JOptionPane.showMessageDialog(null, "Comprado con exito", "Comprado", JOptionPane.INFORMATION_MESSAGE);
			this.panelCarrito.limpiar();
			break;
		case Events.HISTORIAL_ANNADIR_COMPRAS_KO:
			JOptionPane.showMessageDialog(null, "Lista de la compra vacia", "No comprado", JOptionPane.ERROR_MESSAGE);
			break;
		case Events.ALTA_COMPRAS_OK:
			panelCompras.update(evento, objeto);
			break;
		case Events.HISTORIAL_COMPRAS_OK:
			panelHistorial.update(evento, objeto);
		}
	}
	
	
}
