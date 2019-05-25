package Presentacion.Plataforma2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPanelInicio extends JPanel{
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
	
	public GUIPanelInicio(JLayeredPane layered,JPanel panelDiseños, JPanel panelPedImpresion, JPanel panelLocal, JPanel panelUsuarios) {
		this.layered=layered;
		this.panelDiseños=panelDiseños;
		this.panelPedImpresion=panelPedImpresion;
		this.panelLocal=panelLocal;
		this.panelUsuarios=panelUsuarios;
	
		setLayout(new GridLayout(4, 1, 0, 0));
		init();
	}
	
	private void init() {
		JButton btnNewButton = new JButton("Diseños");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelDiseños);
				layered.repaint();
				layered.revalidate();
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pedido de impresion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelPedImpresion);
				layered.repaint();
				layered.revalidate();
			}
		});
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Local");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelLocal);
				layered.repaint();
				layered.revalidate();
			}
		});
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Usuarios");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layered.removeAll();
				layered.add(panelUsuarios);
				layered.repaint();
				layered.revalidate();
			}
			
		});
		add(btnNewButton_3);

	}

}
