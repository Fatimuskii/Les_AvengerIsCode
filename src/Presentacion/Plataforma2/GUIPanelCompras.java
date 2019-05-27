package Presentacion.Plataforma2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Negocio.Diseño.TDiseño;

public class GUIPanelCompras extends JPanel implements GUIEventoPlataforma{
private static final long serialVersionUID = 1L;
	
	private GUIListaModelo<TDiseño> listaModelo;
	private JList<TDiseño> listaDiseños;
	private JTextArea texto;
	private JButton annadirCarrito;
	
	/**
	 * Create the panel.
	 */
	public GUIPanelCompras() {
		init();

	}
	
	public void init() {
		setLayout(new BorderLayout(0, 0));
		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.EAST);
		panelBotones.setLayout(new BorderLayout(0, 0));
		
		annadirCarrito = new JButton("Añadir al carrito");
		panelBotones.add(annadirCarrito, BorderLayout.SOUTH);
		
		JPanel panelListaInfo = new JPanel();
		add(panelListaInfo, BorderLayout.CENTER);
		panelListaInfo.setLayout(new GridLayout(1, 2));
		
		this.listaModelo = new GUIListaModelo<TDiseño>();
		this.listaDiseños = new JList<TDiseño>(this.listaModelo);
		this.listaDiseños.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.listaDiseños.setFixedCellHeight(20);
		this.listaDiseños.setFixedCellWidth(150);
		this.listaDiseños.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				TDiseño diseño = listaDiseños.getSelectedValue();
				if (diseño != null)
					texto.setText(diseño.listaToString());
				else
					texto.setText("");
			}
		});
		this.texto = new JTextArea(20, 50);
		this.texto.setEditable(false);
		panelListaInfo.add(new JScrollPane(listaDiseños, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		panelListaInfo.add(new JScrollPane(texto, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));

	}
	
	public JButton getBotonComprar() {
		return this.annadirCarrito;
	}
	
	public void setList(List<TDiseño> diseños) {
		this.listaModelo.setList(diseños);
		if(diseños.isEmpty()) {
			texto.setText("");
		}
		else {
			
		}
	}
	
	public TDiseño getSelectedItem() {
		return this.listaDiseños.getSelectedValue();
	}
	
	public void limpiar() {
		this.listaDiseños.clearSelection();
		this.texto.setText("");
	}

	@Override
	public void update(int evento, Object objeto) {
		// TODO Auto-generated method stub
		this.setList((List<TDiseño>)objeto);
	}
}
