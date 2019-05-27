package Presentacion.Plataforma2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Negocio.Dise�o.TDise�o;

public class GUIPedidoImpresionSeleccion extends JPanel {
	
	private GUIListaModelo<TDise�o> listaModeloD;
	private JList<TDise�o> listaDise�os;
	private JTextArea texto;
	private JButton annadirCarrito;
	
	/**
	 * Create the panel.
	 */
	public GUIPedidoImpresionSeleccion() {
		init();

	}
	
	public void init() {
		setLayout(new BorderLayout(0, 0));
		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.EAST);
		panelBotones.setLayout(new BorderLayout(0, 0));
		
		annadirCarrito = new JButton("A�adir al carrito");
		panelBotones.add(annadirCarrito, BorderLayout.SOUTH);
		
		JPanel panelListaInfo = new JPanel();
		add(panelListaInfo, BorderLayout.CENTER);
		panelListaInfo.setLayout(new GridLayout(1, 2));
		
		this.listaModeloD = new GUIListaModelo<TDise�o>();
		this.listaDise�os = new JList<TDise�o>(this.listaModeloD);
		this.listaDise�os.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.listaDise�os.setFixedCellHeight(20);
		this.listaDise�os.setFixedCellWidth(150);
		this.listaDise�os.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				TDise�o dise�o = listaDise�os.getSelectedValue();
				if (dise�o != null)
					texto.setText(dise�o.listaToString());
				else
					texto.setText("");
			}
		});
		this.texto = new JTextArea(20, 50);
		this.texto.setEditable(false);
		panelListaInfo.add(new JScrollPane(listaDise�os, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		panelListaInfo.add(new JScrollPane(texto, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
	}
	
	public JButton getBotonComprar() {
		return this.annadirCarrito;
	}
	
	public void setListD(List<TDise�o> dise�os) {
		this.listaModeloD.setList(dise�os);
		if(dise�os.isEmpty()) {
			texto.setText("");
		}
		else {
			
		}
	}
	
	public TDise�o getSelectedItem() {
		return this.listaDise�os.getSelectedValue();
	}
	
	public void limpiar() {
		this.listaDise�os.clearSelection();
		this.texto.setText("");
	}
}
