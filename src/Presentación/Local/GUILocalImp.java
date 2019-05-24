package Presentación.Local;

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

@SuppressWarnings("serial")
public class GUILocalImp extends GUILocal {

	// MENU DE LOCAL!

	private GUIAltaLocal Gui_altaLocal;
	private GUIBajaLocal Gui_bajaLocal;
	private GUIBuscarLocal Gui_buscarLocal;
	private GUIModificarLocal Gui_modificarLocal;
	private JTextField IdLocalText;

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

		IdLocalText = new JTextField();
		IdLocalText.setBounds(62, 75, 311, 28);
		contentPane.add(IdLocalText);
		IdLocalText.setColumns(10);

		JButton btnBuscarLocal = new JButton("Buscar Local");
		btnBuscarLocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIMensaje mensaje = new GUIMensaje();
				if (!IdLocalText.getText().equals("")) {
					int idLoc = Integer.parseInt(IdLocalText.getText());

					Gui_buscarLocal = new GUIBuscarLocal(idLoc);
					Gui_buscarLocal.setVisible(true);
					Controlador.getInstance().accion(Events.BUSCAR_LOCAL,
							idLoc);
					

				} else {
					mensaje.showMessage("Debe introducir un Id",
							"BUSCAR LOCAL", false);
					IdLocalText.setText("");
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
				Gui_altaLocal = new GUIAltaLocal();
				Gui_altaLocal.setVisible(true);
				dispose();
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

		switch (event) {
		case Events.ALTA_LOCAL_OK:
			Gui_altaLocal.update(event, res);
			break;
		case Events.ALTA_LOCAL_KO:
			Gui_altaLocal.update(event, res);
			break;

		case Events.BAJA_LOCAL_OK:
			Gui_bajaLocal.update(event, res);
			break;
		case Events.BAJA_LOCAL_KO:
			Gui_bajaLocal.update(event, res);
			break;

		case Events.BAJA_DISEÑO_OK:
			break;
		case Events.BAJA_DISEÑO_KO:
			break;
		case Events.MODIFICAR_LOCAL_OK:
			Gui_buscarLocal.update(event, res);
			break;
		case Events.MODIFICAR_LOCAL_KO:
			Gui_buscarLocal.update(event, res);
			break;
			
		case Events.BUSCAR_LOCAL_OK:
			Gui_buscarLocal.update(event, res);
			
			break;
		case Events.BUSCAR_LOCAL_KO:
			Gui_buscarLocal.update(event, res);
			//Gui_buscarLocal.dispose();
			break;
		}

	}

}
