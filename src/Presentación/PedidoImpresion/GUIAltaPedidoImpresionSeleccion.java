package Presentación.PedidoImpresion;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Negocio.Diseño.TDiseño;
import Negocio.Impresora.TImpresora;
import Negocio.Local.TLocal;
import Negocio.Usuario.TUsuario;
import Presentación.GUIMensaje;
import Presentación.Controlador.Events;
import Presentación.Plataforma.GUIListaModelo;

@SuppressWarnings("serial")
public class GUIAltaPedidoImpresionSeleccion extends JFrame {
	private JPanel contentPane;

	private JTextField textIdDiseñoSelect;
	private JTextField textIdImpresoraSelect;
	private JTextField textIdLocalSelect; // puede ser nulo
	private GUIListaModelo<TDiseño> listaModeloD;
	private GUIListaModelo<TImpresora> listaModeloI;
	private GUIListaModelo<TLocal> listaModeloL;
	private JList<TDiseño> listaDiseños;
	private JList<TImpresora> listaImpresoras;
	private JList<TLocal> listaLocales;
	private JTextArea texto;
	private GUIAltaPedidoImpresion guiAlta;
	
	private TDiseño dis;
	private TImpresora imp;
	private TLocal loc;
	private TUsuario user;

	private JCheckBox chckbxRecogerDomicilio;
	private JButton botonContinuar;

	public GUIAltaPedidoImpresionSeleccion(TUsuario user) {
		super();
		this.user=user;
		initGUI();

	}

	public void setDiseño(TDiseño dis){
		this.dis = dis;
	}
	public void setImpresora(TImpresora imp){
		this.imp = imp;
	}
	public void setLocal(TLocal loc){
		this.loc= loc;
	}
	public void initGUI() {
		setBounds(100, 100, 949, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblListaDiseos = new JLabel("LISTA DISE\u00D1OS");
		lblListaDiseos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaDiseos.setBounds(203, 24, 127, 20);
		contentPane.add(lblListaDiseos);

		this.listaModeloD = new GUIListaModelo<TDiseño>();
		listaDiseños = new JList<TDiseño>(this.listaModeloD);
		listaDiseños.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaDiseños.setBounds(202, 53, 159, 236);
		listaDiseños.add(new JScrollPane(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		listaDiseños.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Apéndice de método generado automáticamente
				TDiseño dis =listaDiseños.getSelectedValue();
				setDiseño(dis);
				if (dis != null) {
					textIdDiseñoSelect.setText(dis.toStringNameID());
				}
				else
					textIdDiseñoSelect.setText("");
			}

		});
		contentPane.add(listaDiseños);


		JLabel lblListaImpresoras = new JLabel("LISTA IMPRESORAS");
		lblListaImpresoras.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaImpresoras.setBounds(374, 24, 164, 20);
		contentPane.add(lblListaImpresoras);

		this.listaModeloI = new GUIListaModelo<TImpresora>();
		listaImpresoras = new JList<TImpresora>(this.listaModeloI);
		listaImpresoras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaImpresoras.setBounds(384, 53, 159, 236);
		contentPane.add(listaImpresoras);

		listaImpresoras.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Apéndice de método generado automáticamente
				TImpresora imp =listaImpresoras.getSelectedValue();
				setImpresora(imp);
				if (imp != null) {
					textIdImpresoraSelect.setText(imp.toString());
				}
			}

		});
		JLabel lblListaLocales = new JLabel("LISTA LOCALES:");
		lblListaLocales.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaLocales.setBounds(568, 24, 164, 20);
		contentPane.add(lblListaLocales);

		this.listaModeloL = new GUIListaModelo<TLocal>();
		listaLocales = new JList<TLocal>(this.listaModeloL);
		listaLocales.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaLocales.setBounds(568, 53, 159, 236);
		contentPane.add(listaLocales);
		listaLocales.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Apéndice de método generado automáticamente
				TLocal loc =listaLocales.getSelectedValue();
				setLocal(loc);
				if (loc != null) {
					textIdLocalSelect.setText(loc.toString());
				}
			}

		});

		JLabel lblDiseoSeleccionado = new JLabel("Dise\u00F1o seleccionado:");
		lblDiseoSeleccionado.setBounds(744, 66, 120, 16);
		contentPane.add(lblDiseoSeleccionado);
		
		textIdDiseñoSelect = new JTextField();
		textIdDiseñoSelect.setBounds(744, 95, 116, 22);
		textIdDiseñoSelect.setColumns(10);
		textIdDiseñoSelect.setEditable(false);
		contentPane.add(textIdDiseñoSelect);
		

		JLabel lblImpresoraSeleccionada = new JLabel("Impresora seleccionada:");
		lblImpresoraSeleccionada.setBounds(744, 130, 141, 16);
		contentPane.add(lblImpresoraSeleccionada);

		textIdImpresoraSelect = new JTextField();
		textIdImpresoraSelect.setColumns(10);
		textIdImpresoraSelect.setBounds(744, 152, 116, 22);
		textIdImpresoraSelect.setEditable(false);
		contentPane.add(textIdImpresoraSelect);

		JLabel lblLocalSeleccionado = new JLabel("Local seleccionado:");
		lblLocalSeleccionado.setBounds(749, 187, 141, 16);
		contentPane.add(lblLocalSeleccionado);

		textIdLocalSelect = new JTextField();
		textIdLocalSelect.setColumns(10);
		textIdLocalSelect.setBounds(744, 216, 116, 22);
		textIdLocalSelect.setEditable(false);
		contentPane.add(textIdLocalSelect);

		chckbxRecogerDomicilio = new JCheckBox(
				"Env\u00EDo a domicilio");
		chckbxRecogerDomicilio.setBounds(755, 266, 123, 25);
		chckbxRecogerDomicilio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (chckbxRecogerDomicilio.isSelected()){
				listaLocales.setEnabled(false);
				textIdLocalSelect.setText("");
				setLocal(null);
				}
				else{
					listaLocales.setEnabled(true);
				}
			}
		});
		contentPane.add(chckbxRecogerDomicilio);
		

		botonContinuar = new JButton("CONTINUAR");
		botonContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guiAlta= new GUIAltaPedidoImpresion(user, imp, dis, loc);
				guiAlta.setVisible(true);
				dispose();
				
			}
		});
		botonContinuar.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonContinuar.setBounds(755, 300, 133, 29);
		contentPane.add(botonContinuar);

	}

	// Diseños
	public void setListD(List<TDiseño> diseños) {
		this.listaModeloD.setList(diseños);
		//listaDiseños = new JList<TDiseño>(this.listaModeloD);
		// this.listaDiseños.setListData(listaModeloD);
		if (diseños.isEmpty()) {
			this.listaModeloD.clear();
		} else {
			// this.listaModeloD.set
		}
	}

	public TDiseño getSelectedItem() {
		return this.listaDiseños.getSelectedValue();
	}

	// Impresoras
	public void setListI(List<TImpresora> impresoras) {
		this.listaModeloI.setList(impresoras);
		if (impresoras.isEmpty()) {
			texto.setText("");
		} else {

		}
	}

	// Locales
	public void setListL(List<TLocal> locales) {
		this.listaModeloL.setList(locales);
		if (locales.isEmpty()) {
			texto.setText("");
		} else {

		}
	}

	public void update(int event, Object res) {
		// TODO Apéndice de método generado automáticamente
		// GUIMensaje res_mensaje = new GUIMensaje();
		switch (event) {
		case Events.ALTA_PEDIDO_IMPRESION_LISTADISENIOS_OK:
			this.setListD((List<TDiseño>) res);
			break;
		case Events.ALTA_PEDIDO_IMPRESION_LISTADISENIOS_KO:
			JOptionPane.showMessageDialog(null, "Error al listar los diseños");
			break;
		case Events.ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS_OK:
			this.setListI((List<TImpresora>) res);
			break;

		case Events.ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS_KO:
			JOptionPane.showMessageDialog(null, "Error al listar los diseños");
			break;

		case Events.ALTA_PEDIDO_IMPRESION_LISTALOCALES_OK:
			this.setListL((List<TLocal>) res);
			break;
		case Events.ALTA_PEDIDO_IMPRESION_LISTALOCALES_KO:
			JOptionPane.showMessageDialog(null, "Error al listar los diseños");
			break;
			
//		case Events.ALTA_PEDIDO_IMPRESION_OK:
//			guiAlta.update(event, res);
//		case Events.ALTA_PEDIDO_IMPRESION_KO:
//			guiAlta.update(event, res);
		}

	}

}
