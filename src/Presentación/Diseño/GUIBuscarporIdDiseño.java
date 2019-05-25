/**
 * 
 */
package Presentación.Diseño;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;

import Negocio.Diseño.TDiseño;
import Presentación.Controlador.Events;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIBuscarporIdDiseño extends JFrame{
	
	private JPanel contentPane;
	private JTextField textDiseño;
	private JTextField textNombre;
	private JLabel lblDescripcin;
	private JScrollPane scrollPane;
	private JTextPane textPane;
	private JLabel lblDimensiones;
	private JTextField textDimensiones;
	private JLabel lblPuntuacin;
	private JTextField textPuntuacion;
	private JButton btnAceptar;
	

	public GUIBuscarporIdDiseño(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI(){
		setTitle("Buscar Diseño");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIdDiseño = new JLabel("ID Diseño:");
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		textDiseño = new JTextField();
		textDiseño.setEditable(false);
		textDiseño.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		
		JLabel lblaltoXAncho = new JLabel("(alto x ancho x profundidad)");
		
		lblDescripcin = new JLabel("Descripción:");
		
		scrollPane = new JScrollPane();
		
		lblDimensiones = new JLabel("Dimensiones:");
		
		textDimensiones = new JTextField();
		textDimensiones.setEditable(false);
		textDimensiones.setColumns(10);
		
		lblPuntuacin = new JLabel("Puntuación:");
		
		textPane = new JTextPane();
		textPane.setBackground(SystemColor.menu);
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);
		
		textPuntuacion = new JTextField();
		textPuntuacion.setEditable(false);
		textPuntuacion.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblIdDiseño, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(textDiseño, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
					.addGap(184))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(textNombre, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
					.addGap(184))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDescripcin, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
					.addGap(50))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDimensiones, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textDimensiones, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
					.addGap(184))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addComponent(lblaltoXAncho, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblPuntuacin, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(textPuntuacion, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
					.addGap(95)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIdDiseño))
						.addComponent(textDiseño, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNombre))
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescripcin)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDimensiones))
						.addComponent(textDimensiones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(lblaltoXAncho)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPuntuacin))
						.addComponent(textPuntuacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);	
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		textDiseño.setText("");
		textNombre.setText("");
		textDimensiones.setText("");
		textPuntuacion.setText("");
		textPane.setText("");
		// end-user-code
	}
	
	public void update(int event, TDiseño res){
		switch (event) {
		case Events.BUSCAR_DISEÑO_ID_OK:
			textDiseño.setText("" + res.getId_diseño());
			textNombre.setText("" + res.getNombre());
			textDimensiones.setText("" + res.getAlto() + "x" + res.getAncho() + "x" + res.getProfundidad());
			textPuntuacion.setText("" + res.getPropietario());
			textPane.setText("" + res.getDescripcion());
			
			textDiseño.setEnabled(true);
			textNombre.setEnabled(true);
			textDimensiones.setEnabled(true);
			textPuntuacion.setEnabled(true);
			textPane.setEnabled(true);
			break;
		case Events.BUSCAR_DISEÑO_ID_KO:
			this.dispose();
			JOptionPane.showMessageDialog(null, "Error al buscar el diseño");
			break;
		}
		
	}

}