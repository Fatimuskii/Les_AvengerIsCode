package Presentación.Plataforma;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPanelInicio extends JPanel implements GUIEventoPlataforma{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	private JLayeredPane layered;
	private JPanel panelDiseños;
	private JPanel panelPedImpresion;
	private JPanel panelLocal;
	private JPanel panelUsuarios;
	private JPanel panelCompras;
	private JPanel panelImpresoras; 
	private JPanel panelHistorial;
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	
	public GUIPanelInicio(GUIVentanaPlataforma guiVentanaPlataforma, JLayeredPane layered,JPanel panelDiseños, JPanel panelPedImpresion, JPanel panelLocal, JPanel panelUsuarios,JPanel panelImpresoras, JPanel panelCompras, JPanel panelHistorial) {
		this.layered=layered;
		this.panelDiseños=panelDiseños;
		this.panelPedImpresion=panelPedImpresion;
		this.panelLocal=panelLocal;
		this.panelUsuarios=panelUsuarios;
		this.panelCompras=panelCompras;
		this.panelImpresoras=panelImpresoras;
		this.panelHistorial=panelHistorial;
		
		setLayout(new GridLayout(7, 1, 0, 0));
		init();
	}
	
	private void init() {
		btnNewButton = new JButton("Diseños");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelDiseños);
				layered.repaint();
				layered.revalidate();
			}
		});
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Pedido de impresion");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelPedImpresion);
				layered.repaint();
				layered.revalidate();
			}
		});
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Local");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelLocal);
				layered.repaint();
				layered.revalidate();
			}
		});
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Usuarios");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelUsuarios);
				layered.repaint();
				layered.revalidate();
			}
			
		});
		add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Comprar");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelCompras);
				Controlador.getInstance().accion(Events.ALTA_COMPRAS, null);
				layered.repaint();
				layered.revalidate();
			}
			
		});
		add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Impresoras");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelImpresoras);
				layered.repaint();
				layered.revalidate();
			}
			
		});
		add(btnNewButton_5);
		btnNewButton_6 = new JButton("Historial de compras");
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelHistorial);
				Controlador.getInstance().accion(Events.HISTORIAL_COMPRAS, null);
				layered.repaint();
				layered.revalidate();
			}
			
		});
		add(btnNewButton_6);


	}

	@Override
	public void update(int evento, Object objeto) {
		// TODO Apéndice de método generado automáticamente
		btnNewButton.setEnabled(true);
		btnNewButton_1.setEnabled(true);
		btnNewButton_2.setEnabled(true);
		btnNewButton_3.setEnabled(true);
		btnNewButton_4.setEnabled(true);
		btnNewButton_5.setEnabled(true);
		btnNewButton_6.setEnabled(true);
	}
	
	public void setPedidoImpresionGUI(JPanel panel){
		this.panelPedImpresion=panel;
	}
	
	public void setHistorialGUI(JPanel panel){
		this.panelHistorial=panel;
	}
}
