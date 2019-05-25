package Presentacion.Plataforma2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import Negocio.Plataforma.SAPlataforma;

public class GUIPanelLogueado extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	private JButton btnCarrito;
	
	public GUIPanelLogueado(SAPlataforma ctrl) {
		setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnBienvenido = new JTextPane();
		txtpnBienvenido.setText("Bienvenido "+ctrl.getUsuarioLogueado()+" :)");
		StyledDocument doc = txtpnBienvenido.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		add(txtpnBienvenido, BorderLayout.NORTH);
		
		this.btnCarrito = new JButton("Carrito");
		//btnCarrito.setIcon(new ImageIcon("C:\\Users\\iconm\\eclipse-workspace\\plataformaInterfaz\\resources\\imagenes\\plataforma\\carritoCompra.png"));
		add(this.btnCarrito, BorderLayout.SOUTH);

	}
	 public JButton getBotonCarrito() {
		 return this.btnCarrito;
	 }
}
