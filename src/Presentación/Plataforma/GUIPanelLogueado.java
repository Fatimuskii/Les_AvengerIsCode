package Presentación.Plataforma;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import Negocio.Plataforma.SAPlataforma;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

public class GUIPanelLogueado extends JPanel implements GUIEventoPlataforma{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextPane txtpnBienvenido;
	/**
	 * Create the panel.
	 */
	private JButton btnCarrito;
	
	public GUIPanelLogueado() {
		setLayout(new BorderLayout(0, 0));
		txtpnBienvenido = new JTextPane();
		this.btnCarrito = new JButton("Carrito");
		//btnCarrito.setIcon(new ImageIcon("C:\\Users\\iconm\\eclipse-workspace\\plataformaInterfaz\\resources\\imagenes\\plataforma\\carritoCompra.png"));
		add(this.btnCarrito, BorderLayout.SOUTH);
		
		JButton btnCerrarSesion = new JButton("Cerrar sesión");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirma = JOptionPane.showConfirmDialog(null,
						"Se va a cerrar la aplicación", "Cerrar sesión",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (confirma == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		add(btnCerrarSesion,BorderLayout.CENTER);
	}
	
	public JButton getBotonCarrito() {
		return this.btnCarrito;
	}
	
	@Override
	public void update(int evento, Object objeto) {
		// TODO Auto-generated method stub
		txtpnBienvenido.setText("Bienvenid@ "+((TUsuario) objeto).getNombre());
		txtpnBienvenido.setEditable(false);
		StyledDocument doc = txtpnBienvenido.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		add(txtpnBienvenido, BorderLayout.NORTH);
	}
	 
	 
}
