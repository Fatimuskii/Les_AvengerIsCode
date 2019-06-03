package Presentación.Plataforma;

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
import Negocio.Plataforma.TCompra;
import Negocio.Usuario.TUsuario;

public class GUIHistorialCompras extends JPanel implements GUIEventoPlataforma {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1376741197533209478L;
	private GUIListaModelo<TCompra> listaModelo;
	private JList<TCompra> listaCompras;
	private JTextArea texto;
	private TUsuario user;
	
	public GUIHistorialCompras(TUsuario user) {
		setLayout(new BorderLayout(0, 0));
		if(user!=null)
			this.user=user;
		JPanel panelListaInfo = new JPanel();
		add(panelListaInfo, BorderLayout.CENTER);
		panelListaInfo.setLayout(new GridLayout(1, 2));
		
		this.listaModelo = new GUIListaModelo<TCompra>();
		this.listaCompras = new JList<TCompra>(this.listaModelo);
		this.listaCompras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.listaCompras.setFixedCellHeight(20);
		this.listaCompras.setFixedCellWidth(150);
		this.listaCompras.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				TCompra compra = listaCompras.getSelectedValue();
				if (compra != null)
					texto.setText(compra.listaToString());
				else
					texto.setText("");
			}
		});
		this.texto = new JTextArea(20, 50);
		this.texto.setEditable(false);
		panelListaInfo.add(new JScrollPane(listaCompras, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		panelListaInfo.add(new JScrollPane(texto, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));

	}
	
	public void setList(List<TCompra> compras) {
		this.listaModelo.setList(compras);
		if(compras.isEmpty()) {
			texto.setText("");
		}
		else {
			
		}
	}
	
	public void update(int evento, Object objeto) {
		// TODO Auto-generated method stub
		this.setList((List<TCompra>)objeto);
	}
}
