package Presentación.Local;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Negocio.Local.TLocal;
import Presentación.GUIMensaje;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

@SuppressWarnings("serial")
public class GUIModificarLocal extends JFrame {

	private JPanel contentPane;

	// local
	private TLocal tLocal;
	private JTextPane nombreText;
	private JTextPane telefonoText;
	private JTextPane dirText;
	private JTextPane locText;
	private JTextPane cpText;
	// Propietario
	private JTextPane namePropText;
	private JTextPane telPropText;
	private JTextPane emailPropText;

	public GUIModificarLocal(TLocal local) {

		super();
		this.tLocal = local;

		contentPane = new JPanel();
		initGUI();
	}

	@SuppressWarnings("rawtypes")
	public void initGUI() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"imagenes\\local1.png"));
		setTitle("Modificar datos de Local");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/* Datos del Local: */
		JLabel label = new JLabel("IdLocal:");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(37, 36, 67, 16);
		contentPane.add(label);

		JLabel IdLocal = new JLabel("" + tLocal.getIdLocal());
		IdLocal.setBounds(114, 38, 46, 14);
		contentPane.add(IdLocal);

		JLabel nombre_loc = new JLabel("Nombre:");
		nombre_loc.setFont(new Font("Tahoma", Font.BOLD, 13));
		nombre_loc.setBounds(37, 64, 67, 16);
		contentPane.add(nombre_loc);

		nombreText = new JTextPane();
		nombreText.setBounds(104, 65, 101, 22);
		contentPane.add(nombreText);

		JLabel tel_loc = new JLabel("Tel\u00E9fono:");
		tel_loc.setFont(new Font("Tahoma", Font.BOLD, 13));
		tel_loc.setBounds(37, 93, 67, 16);
		contentPane.add(tel_loc);

		telefonoText = new JTextPane();
		telefonoText.setBounds(104, 93, 101, 22);
		contentPane.add(telefonoText);

		JLabel lblCif = new JLabel("CIF:");
		lblCif.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCif.setBounds(37, 128, 67, 16);
		contentPane.add(lblCif);

		JLabel cifText = new JLabel("" + tLocal.getCIF());
		cifText.setBounds(77, 130, 46, 14);
		contentPane.add(cifText);

		JLabel dire_loc = new JLabel("Direcci\u00F3n:");
		dire_loc.setFont(new Font("Tahoma", Font.BOLD, 13));
		dire_loc.setBounds(37, 151, 67, 16);
		contentPane.add(dire_loc);

		dirText = new JTextPane();
		dirText.setToolTipText("direccion\r\n");
		dirText.setBounds(104, 151, 174, 22);
		contentPane.add(dirText);

		JLabel label_5 = new JLabel("Localidad:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_5.setBounds(37, 180, 67, 16);
		contentPane.add(label_5);

		locText = new JTextPane();
		locText.setBounds(104, 180, 101, 22);
		contentPane.add(locText);

		JLabel label_6 = new JLabel("CP:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_6.setBounds(37, 214, 43, 16);
		contentPane.add(label_6);

		cpText = new JTextPane();
		cpText.setBounds(77, 208, 67, 22);
		contentPane.add(cpText);


		JLabel lblnombreProp = new JLabel("Nombre:");
		lblnombreProp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblnombreProp.setBounds(275, 62, 67, 16);
		contentPane.add(lblnombreProp);

		namePropText = new JTextPane();
		namePropText.setBounds(343, 64, 146, 22);
		contentPane.add(namePropText);


		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int idLoc= tLocal.getIdLocal();
				String nombreLoc = nombreText.getText();
				int telLoc = Integer.parseInt(telefonoText.getText());
				int CIFLoc= tLocal.getCIF();
				String dirLoc = dirText.getText();
				int cpLoc = Integer.parseInt(cpText.getText());
				String locLoc = locText.getText();
				String nombreProp = namePropText.getText();

				tLocal = new TLocal(idLoc, nombreLoc, telLoc, CIFLoc, dirLoc,
						cpLoc, locLoc, nombreProp, true);
				Controlador.getInstance().accion(Events.MODIFICAR_LOCAL, tLocal);
				
				
			}
		});

		btnAceptar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAceptar.setBounds(356, 200, 120, 42);
		contentPane.add(btnAceptar);

	}

	public void update(int event, Object res) {

		GUIMensaje res_mensaje = new GUIMensaje();
		switch (event) {
		case Events.MODIFICAR_LOCAL_OK:
			res_mensaje.showMessage(
					"Se ha dado modificado correctamente al Local con id: "
							+ (int) res, "MODIFICAR LOCAL", false);
			break;
		case Events.MODIFICAR_LOCAL_KO:
			res_mensaje.showMessage("Error en la modificación del Local:",
					"MODIFICAR LOCAL", false);
			break;
		}
		this.dispose();
	}
}
