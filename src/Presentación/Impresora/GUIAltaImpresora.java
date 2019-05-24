/**
 * 
 */
package Presentación.Impresora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.Toolkit;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JRadioButton;

import Negocio.Diseño.TDiseño;
import Presentación.Controlador.Events;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */

/**
 * Launch the application.
 */
@SuppressWarnings("serial")
public class GUIAltaImpresora extends JFrame{
	
	private JPanel contentPane;

	private JButton btnFinalizar;
	private JTextField txtIntroduceTuId;
	private JRadioButton mntmPal;
	private JRadioButton mntmAbs;
	private JRadioButton mntmPetg;
	private JRadioButton mntmNylon;
	private JSpinner spinner_3;
	private JSpinner spinner_4;
	private JSpinner spinner_5;

	public GUIAltaImpresora() {
		super();
		this.contentPane = new JPanel();
		this.btnFinalizar = new JButton();
		this.mntmPal = new JRadioButton();
		this.mntmAbs = new JRadioButton();
		this.mntmPetg = new JRadioButton();
		this.mntmNylon = new JRadioButton();
		this.spinner_3 = new JSpinner();
		this.spinner_4 = new JSpinner();
		this.spinner_5 = new JSpinner();
		this.setFocusable(true);
		initGUI();
	}

	/**
	 * Create the frame.
	 */
	public void initGUI() {

		setResizable(false);

		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\3d-printer.png"));
		setTitle("Alta Impresora");
		setBounds(100, 100, 453, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(30, 50, 56, 21);
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
		lblTamao.setBounds(28, 182, 56, 14);
		panel.add(lblTamao);

		spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(8, 8, 1600, 1));
		spinner_3.setBounds(109, 179, 58, 20);
		panel.add(spinner_3);

		spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(8, 8, 900, 1));
		spinner_4.setBounds(195, 179, 58, 20);
		panel.add(spinner_4);

		spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(8, 8, 250, 1));
		spinner_5.setBounds(280, 179, 58, 20);
		panel.add(spinner_5);

		JLabel lblX = new JLabel("x");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblX.setBounds(177, 172, 16, 30);
		panel.add(lblX);

		JLabel label_6 = new JLabel("x");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(263, 172, 16, 30);
		panel.add(label_6);

		JLabel lblIdUsuario = new JLabel("Id usuario");
		lblIdUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdUsuario.setBounds(28, 293, 67, 14);
		panel.add(lblIdUsuario);

		txtIntroduceTuId = new JTextField();
		txtIntroduceTuId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtIntroduceTuId.getText().equals("Introduce tu Id")) {
					txtIntroduceTuId.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtIntroduceTuId.getText().equals("")) {
					txtIntroduceTuId.setText("Introduce tu Id");
				}
			}
		});
		txtIntroduceTuId.setForeground(Color.GRAY);
		txtIntroduceTuId.setText("Introduce tu Id");
		txtIntroduceTuId.setBounds(109, 290, 95, 20);
		panel.add(txtIntroduceTuId);
		txtIntroduceTuId.setColumns(10);

		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("imagenes\\logo-REDM.png"));
		label_7.setBounds(28, 237, 58, 53);
		panel.add(label_7);

		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(20, 50, 17, 14);
		panel.add(label);

		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(20, 182, 17, 14);
		panel.add(label_1);

		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(97, 293, 17, 14);
		panel.add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("imagenes\\3d-printer-REDM-REDM.png"));
		label_3.setBounds(229, 23, 156, 138);
		panel.add(label_3);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!datosObligatorios()) {
					JOptionPane.showOptionDialog(new JFrame(), "Debes rellenar los campos obligatorios (*)", "Quit",
							JOptionPane.OK_OPTION, JOptionPane.OK_OPTION, null, null, null);
				}
			}
		});
		btnFinalizar.setBounds(312, 358, 89, 23);
		panel.add(btnFinalizar);

	}

	private boolean datosObligatorios() {
		if ((!mntmAbs.isSelected() && !mntmPetg.isSelected() && !mntmNylon.isSelected() && !mntmPal.isSelected())
				|| txtIntroduceTuId.getText().equals("Introduce tu Id"))
			return false;
		return true;
	}
	
	public void update(int event, Object res){
		switch (event) {
		case Events.ALTA_IMPRESORA_OK:
			JOptionPane.showMessageDialog(null,"Éxito al crear la impresora");
			dispose();
			break;
		case Events.ALTA_IMPRESORA_KO:
			JOptionPane.showMessageDialog(null, "Error al crear la impresora", "Error Alta Impresora", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}
}