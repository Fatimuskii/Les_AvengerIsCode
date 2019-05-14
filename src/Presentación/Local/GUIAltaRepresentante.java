package Presentación.Local;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Negocio.Local.TRepresentante;
import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

@SuppressWarnings("serial")
public class GUIAltaRepresentante extends GUILocalImp {

	private JPanel contentPane;
	private TRepresentante representante;
	
	private JTextField rep_nombreCompleto;
	private JTextField telefonoPersonal;
	private JTextField email;

	public GUIAltaRepresentante() {
		super();
		contentPane = new JPanel();
		initGUI();
		
	}
	
	public void initGUI() {
		setTitle("ALTA LOCAL");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 499, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDatosDelPropietario = new JLabel("Datos del Propietario:");
		lblDatosDelPropietario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelPropietario.setBounds(55, 60, 154, 16);
		contentPane.add(lblDatosDelPropietario);

		JLabel lblNombreRepresentante = new JLabel("Nombre y Apellidos:");
		lblNombreRepresentante.setBounds(90, 89, 143, 36);
		contentPane.add(lblNombreRepresentante);

		rep_nombreCompleto = new JTextField();
		rep_nombreCompleto.setBounds(210, 96, 186, 22);
		contentPane.add(rep_nombreCompleto);
		rep_nombreCompleto.setColumns(10);

		JLabel lblTelefonoPersonal = new JLabel("Telefono personal:");
		lblTelefonoPersonal.setBounds(90, 117, 143, 36);
		contentPane.add(lblTelefonoPersonal);

		telefonoPersonal = new JTextField();
		telefonoPersonal.setColumns(10);
		telefonoPersonal.setBounds(210, 124, 186, 22);
		contentPane.add(telefonoPersonal);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(90, 147, 70, 36);
		contentPane.add(lblEmail);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(210, 154, 186, 22);
		contentPane.add(email);

		JButton botonAceptar = new JButton("Continuar->");
		botonAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String nombreRep = rep_nombreCompleto.getText();
				int telRep = Integer.parseInt(telefonoPersonal.getText());
				String emailRep = email.getText();

			
					representante = new TRepresentante(nombreRep, telRep, emailRep);
					Controlador.getInstance().accion(Events.ALTA_REPRESENTANTE, representante);
					dispose();
				
			}
		});
		botonAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonAceptar.setBounds(318, 205, 111, 42);
		contentPane.add(botonAceptar);

		JButton btnatras = new JButton("<- Atr\u00E1s");
		btnatras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnatras.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnatras.setBounds(183, 205, 111, 42);
		contentPane.add(btnatras);
		
		JLabel lblLogoaltaRep = new JLabel("logoAltaLocal");
		lblLogoaltaRep.setBounds(347, 31, 49, 44);
		Icon icono = new ImageIcon(new ImageIcon("F:\\Documentos\\IS 2018-2019\\Les_AvengerIsCode\\imagenes\\loginRepresentante.png").getImage().getScaledInstance(lblLogoaltaRep.getWidth(), lblLogoaltaRep.getHeight(), Image.SCALE_DEFAULT));
		lblLogoaltaRep.setIcon(icono);
		this.repaint();
		
		contentPane.add(lblLogoaltaRep);
	}
	
	public void limpiarDatos() {
		// TODO Apéndice de método generado automáticamente
		contentPane = new JPanel();
		//initGUI();
	}

}
