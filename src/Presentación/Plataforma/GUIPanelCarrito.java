package Presentaci�n.Plataforma;

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

import Negocio.Dise�o.*;

public class GUIPanelCarrito extends JPanel implements GUIEventoPlataforma {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GUIListaModelo<TDise�o> listaModelo;
	private JList<TDise�o> listaDise�os;
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
		
		this.listaModelo = new GUIListaModelo<TDise�o>();
		this.listaDise�os = new JList<TDise�o>(this.listaModelo);
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
	
	public JButton getBotonBorrar() {
		return this.botonBorrar;
	}
	public JButton getBotonVaciar() {
		return this.botonVaciar;
	}
	public JButton getBotonComprar() {
		return this.botonComprar;
	}
	
	public void setList(List<TDise�o> dise�os) {
		this.listaModelo.setList(dise�os);
		if(dise�os.isEmpty()) {
			texto.setText("");
		}
		else {
			
		}
	}
	
	public TDise�o getSelectedItem() {
		if(!listaModelo.isEmpty())
			return this.listaDise�os.getSelectedValue();
		else return null;
	}

	public void limpiar() {
		this.listaDise�os.clearSelection();
		this.texto.setText("");
	}

	@Override
	public void update(int evento, Object objeto) {
		// TODO Auto-generated method stub
		this.setList((List<TDise�o>)objeto);
	}

}
