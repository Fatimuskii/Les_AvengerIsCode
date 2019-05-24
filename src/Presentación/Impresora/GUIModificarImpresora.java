/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import Negocio.Impresora.TImpresora;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Marina
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIModificarImpresora extends JFrame {

	private JPanel contentPane;
	private int id;
	private JButton btnFinalizar;
	private JTextField txtIntroduceTuId;
	private JRadioButton mntmPal;
	private JRadioButton mntmAbs;
	private JRadioButton mntmPetg;
	private JRadioButton mntmNylon;
	private JSpinner alto;
	private JSpinner ancho;
	private JSpinner profundidad;
	private JButton btnComprobar;
	
	public GUIModificarImpresora() {
		super();
		this.contentPane = new JPanel();
		this.btnFinalizar = new JButton();
		this.mntmPal = new JRadioButton();
		this.mntmAbs = new JRadioButton();
		this.mntmPetg = new JRadioButton();
		this.mntmNylon = new JRadioButton();
		this.alto = new JSpinner();
		this.ancho = new JSpinner();
		this.profundidad = new JSpinner();
		this.txtIntroduceTuId = new JTextField();
		this.setFocusable(true);
		initGUI();
	}

	private void initGUI() {
			setResizable(false);

			setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\3d-printer.png"));
			setTitle("Modificar Impresora");
			setBounds(100, 100, 453, 441);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);

			JPanel panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);

			
			txtIntroduceTuId.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					if (txtIntroduceTuId.getText().equals("idImpresora")) {
						txtIntroduceTuId.setText("");
					}
				}

				@Override
				public void focusLost(FocusEvent e) {
					if (txtIntroduceTuId.getText().equals("")) {
						txtIntroduceTuId.setText("idImpresora");
					}
				}
			});
			txtIntroduceTuId.setToolTipText("");
			txtIntroduceTuId.setText("IdImpresora");
			txtIntroduceTuId.setForeground(Color.DARK_GRAY);
			txtIntroduceTuId.setFont(new Font("Tahoma", Font.PLAIN, 11));
			txtIntroduceTuId.setColumns(10);
			txtIntroduceTuId.setBounds(162, 11, 122, 20);
			panel.add(txtIntroduceTuId);

			
			btnComprobar = new JButton("Comprobar");
			btnComprobar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					id = Integer.parseInt(txtIntroduceTuId.getText());
					Controlador.getInstance().accion(
							Events.MODIFICAR_IMPRESORA_COMPROBAR, id);
					toFront();
				}
			});
			btnComprobar.setBounds(304, 10, 105, 23);
			panel.add(btnComprobar);

			JMenuBar menuBar = new JMenuBar();
			menuBar.setBounds(30, 200, 56, 21);
			panel.add(menuBar);

			JMenu mnMaterial = new JMenu("Material");
			menuBar.add(mnMaterial);

			mntmPal = new JRadioButton("PAL");
			mntmPal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mntmAbs.setSelected(false);
					mntmPetg.setSelected(false);
					mntmNylon.setSelected(false);
				}
			});
			mnMaterial.add(mntmPal);

			mntmAbs = new JRadioButton("ABS");
			mntmAbs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mntmPal.setSelected(false);
					mntmPetg.setSelected(false);
					mntmNylon.setSelected(false);
				}
			});
			mnMaterial.add(mntmAbs);

			mntmPetg = new JRadioButton("PETG");
			mntmPetg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mntmPal.setSelected(false);
					mntmAbs.setSelected(false);
					mntmNylon.setSelected(false);
				}
			});
			mnMaterial.add(mntmPetg);

			mntmNylon = new JRadioButton("Nylon");
			mntmNylon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mntmPal.setSelected(false);
					mntmAbs.setSelected(false);
					mntmPetg.setSelected(false);
				}
			});
			mnMaterial.add(mntmNylon);

			JLabel lblTamao = new JLabel(" Tama\u00F1o");
			lblTamao.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblTamao.setBounds(30, 316, 56, 14);
			panel.add(lblTamao);

			alto.setModel(new SpinnerNumberModel(8, 8, 1600, 1));
			alto.setBounds(107, 313, 58, 20);
			panel.add(alto);

			ancho.setModel(new SpinnerNumberModel(8, 8, 900, 1));
			ancho.setBounds(189, 313, 58, 20);
			panel.add(ancho);

			profundidad.setModel(new SpinnerNumberModel(8, 8, 250, 1));
			profundidad.setBounds(273, 313, 58, 20);
			panel.add(profundidad);

			JLabel lblX = new JLabel("x");
			lblX.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblX.setBounds(175, 306, 16, 30);
			panel.add(lblX);

			JLabel label_6 = new JLabel("x");
			label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
			label_6.setBounds(257, 306, 16, 30);
			panel.add(label_6);

			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon("imagenes\\3d-printer-REDM-REDM.png"));
			label_3.setBounds(145, 42, 156, 138);
			panel.add(label_3);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(44, 187, 365, 2);
			panel.add(separator);
			
			btnFinalizar = new JButton("Finalizar");
			btnFinalizar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					id = Integer.parseInt(txtIntroduceTuId.getText());
				//	String material = String.valueOf(mnMaterial.getPressedIcon());//TODO
					String nombre = null;
					float al = Float.valueOf(alto.getValue().toString());
					float an = Float.valueOf(ancho.getValue().toString());
					float pr = Float.valueOf(profundidad.getValue().toString());
					//TImpresora tImpresora = new TImpresora(id,nombre,material,al,an,pr,); // TODO
					//Controlador.getInstance().accion(Events.MODIFICAR_IMPRESORA, tImpresora);
				}
			});
			btnFinalizar.setBounds(338, 368, 89, 23);
			panel.add(btnFinalizar);
	}

	public void update(int events, Object res) {
		switch (events) {
		case Events.MODIFICAR_IMPRESORA_OK:
			JOptionPane.showMessageDialog(null,
					"Éxito al modificar la impresora id: " + id);
			dispose();
			break;
		case Events.MODIFICAR_IMPRESORA_KO:
			JOptionPane.showMessageDialog(null,
					"Error al modificar la impresora id: " + id,
					"Error Impresora", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}