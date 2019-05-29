package Presentación.Plataforma;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import Negocio.Diseño.*;

public class GUIPanelCarrito extends JPanel implements GUIEventoPlataforma {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GUIListaModelo<TDiseño> listaModelo;
	private JList<TDiseño> listaDiseños;
	private JTextArea texto;
	JButton botonBorrar;
	JButton botonVaciar;
	JButton botonComprar;
	
	/**
	 * Create the panel.
	 */
	public GUIPanelCarrito() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.EAST);
		panelBotones.setLayout(new BorderLayout(0, 0));
		
		botonComprar = new JButton("Comprar");
		botonComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelBotones.add(botonComprar, BorderLayout.SOUTH);
		
		botonVaciar = new JButton("Vaciar");
		panelBotones.add(botonVaciar, BorderLayout.CENTER);
		
		botonBorrar = new JButton("Borrar selecci\u00F3n");
		panelBotones.add(botonBorrar, BorderLayout.NORTH);
		
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
	
	public JButton getBotonBorrar() {
		return this.botonBorrar;
	}
	public JButton getBotonVaciar() {
		return this.botonVaciar;
	}
	public JButton getBotonComprar() {
		return this.botonComprar;
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
		if(!listaModelo.isEmpty())
			return this.listaDiseños.getSelectedValue();
		else return null;
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
