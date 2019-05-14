package Presentación.Local;

import java.awt.Event;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Negocio.Local.TLocal;
import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

public class GUILocalImp extends GUILocal {

	// MENU DE LOCAL!

	private GUIAltaLocal Gui_altaLocal;
	private GUIAltaRepresentante Gui_altaRepre;
	private GUIBajaLocal Gui_bajaLocal;
	private GUIModificarLocal Gui_modLocal;
	private GUIBuscarLocal Gui_buscarLocal;
	private GUIListarLocales Gui_listarLocales;

	JTextField nombreLocal;

	private JPanel contentPane;

	public GUILocalImp() {
		super();
		contentPane = new JPanel();
		// Gui_altaRepre = new GUIAltaRepresentante();
		initGUI();
	}

	public void initGUI() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("imagenes\\local.png"));
		setTitle("Local");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 631, 376);

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalir.setBounds(447, 264, 124, 34);
		contentPane.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		nombreLocal = new JTextField();
		nombreLocal.setBounds(62, 75, 311, 28);
		contentPane.add(nombreLocal);
		nombreLocal.setColumns(10);

		JButton btnBuscarLocal = new JButton("Buscar Local");
		btnBuscarLocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIMensaje mensaje = new GUIMensaje();
				String n = nombreLocal.getText();

				if (!n.equals("")) {
					Gui_buscarLocal = new GUIBuscarLocal();
					Gui_buscarLocal.setVisible(true);	
				}
				else{
					mensaje.showMessage("No se admiten sól numeros", "",
							false);
					nombreLocal.setText("");
				}
			}
		});

		btnBuscarLocal.setBounds(386, 68, 124, 34);
		contentPane.add(btnBuscarLocal);

		JButton btnMostrarLocales = new JButton("Mostrar todos");
		btnMostrarLocales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrarLocales.setBounds(386, 125, 124, 34);
		contentPane.add(btnMostrarLocales);

		JButton button = new JButton("Registrar local");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gui_altaRepre = new GUIAltaRepresentante();
				Gui_altaRepre.setVisible(true);
				
				//Gui_altaLocal= new GUIAltaLocal();
			}
		});
		button.setBounds(283, 264, 138, 34);
		contentPane.add(button);

		JLabel lblNewLabel = new JLabel("pic_local");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\local1.png"));
		lblNewLabel.setBounds(62, 128, 150, 133);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void update(int event, Object res) {
		// TODO Apéndice de método generado automáticamente
		GUIMensaje res_mensaje = new GUIMensaje();

		switch (event) {
		case Events.ALTA_LOCAL_OK:
			Gui_altaLocal.update(event, res);
			break;
		case Events.ALTA_LOCAL_KO:
			Gui_altaLocal.update(event, res);
			break;
		case Events.ALTA_REPRESENTANTE_OK:
			Gui_altaRepre.update(event, res);
			Gui_altaLocal = new GUIAltaLocal();
			Gui_altaLocal.setIdRepresentante((int) res);
			Gui_altaLocal.setVisible(true);
			
			break;
		case Events.ALTA_REPRESENTANTE_KO:
			Gui_altaRepre.update(event, res);
			
		case Events.BAJA_DISEÑO_OK:
			break;
			
		case Events.BAJA_DISEÑO_KO:
			break;
		case Events.MODIFICAR_LOCAL_OK:
			break;
		case Events.MODIFICAR_LOCAL_KO:
			
		case Events.BUSCAR_LOCAL_OK:
			break;
		case Events.BUSCAR_LOCAL_KO:
			break;
		
		}
		
		

	}

}
