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

public class GUILocalImp extends GUILocal {

	
	private GUIAltaLocal Gui_altaLocal;
	private GUIBajaLocal Gui_bajaLocal;
	private GUIModificarLocal Gui_modLocal;
	private GUIBuscarLocal Gui_buscarLocal;
	private GUIListarLocales Gui_listarLocales;
	
	private JPanel contentPane;
	


	public GUILocalImp(){
		super();
		contentPane = new JPanel();
		Gui_altaLocal = new GUIAltaLocal();
		initGUI();
	}
	
	 public void initGUI(){
		 setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\local.png"));
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
		
		JButton btnBuscarLocal = new JButton("Buscar Local");
		btnBuscarLocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
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
		
		JTextField nombreLocal = new JTextField();
		nombreLocal.setBounds(62, 75, 311, 28);
		contentPane.add(nombreLocal);
		nombreLocal.setColumns(10);
		
		JButton button = new JButton("Registrar local");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gui_altaLocal.setVisible(true);
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
		TLocal tlocal;
		GUIMensaje res_mensaje = new GUIMensaje();
	
		switch(event){
		case Events.ALTA_LOCAL_OK:
			res_mensaje.showMessage("Se ha dado de alta correctamente al Local con id: "
					+ (int) res,  "ALTA LOCAL", false);
			break;
		case Events.ALTA_LOCAL_KO:
			res_mensaje.showMessage("Error en el alta del Local.",  "ALTA LOCAL", false);
		
		}
	}
}
