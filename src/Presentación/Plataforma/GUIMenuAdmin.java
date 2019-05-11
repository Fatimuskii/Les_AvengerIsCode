package Presentación.Plataforma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

@SuppressWarnings("serial")
public class GUIMenuAdmin extends JFrame {

	private JPanel contentPane;

	public GUIMenuAdmin() {
		contentPane = new JPanel();
		initGUI();
	}

	public void initGUI() {
		setResizable(false);
		setTitle("BIENVENIDO ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnDiseños = new JButton("DISEÑOS");
		btnDiseños.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstance().accion(Events.OPEN_GUI_DISEÑO_MENU, null);
			}
		});
		btnDiseños.setBounds(33, 70, 116, 37);
		contentPane.add(btnDiseños);

		JButton btnImpresoras = new JButton("IMPRESORAS");
		btnImpresoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstance().accion(Events.OPEN_GUI_IMPRESORA_MENU, null);
			}
		});
		btnImpresoras.setBounds(161, 70, 116, 37);
		contentPane.add(btnImpresoras);

		JButton btnLocales = new JButton("LOCALES");
		btnLocales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstance().accion(Events.OPEN_GUI_LOCAL_MENU,
						null);
			}
		});
		btnLocales.setBounds(289, 70, 116, 37);
		contentPane.add(btnLocales);

		JButton btnPedidos = new JButton("PEDIDOS");
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPedidos.setBounds(161, 186, 116, 37);
		contentPane.add(btnPedidos);

		JButton btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setBounds(33, 186, 116, 37);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador.getInstance().accion(Events.OPEN_GUI_USUARIO_MENU,
						null);
			}
		});
		contentPane.add(btnUsuarios);

		JLabel lblLogodiseo = new JLabel("logoDise\u00F1o");
		lblLogodiseo.setBounds(33, 13, 116, 47);
		contentPane.add(lblLogodiseo);

		JLabel lblLogoimpresoras = new JLabel("logoImpresoras");
		lblLogoimpresoras.setBounds(161, 10, 116, 47);
		contentPane.add(lblLogoimpresoras);

		JLabel lblLogolocales = new JLabel("logoLocales");
		lblLogolocales.setBounds(289, 13, 116, 47);
		contentPane.add(lblLogolocales);

		JLabel lblLogousuarios = new JLabel("logoUsuarios");
		lblLogousuarios.setBounds(33, 126, 116, 47);
		contentPane.add(lblLogousuarios);

		JLabel lblLogopedidoimpresion = new JLabel("logoPedidoImpresion");
		lblLogopedidoimpresion.setBounds(161, 126, 116, 47);
		contentPane.add(lblLogopedidoimpresion);
	}

}
