/**
 * 
 */
package Presentación.Impresora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Negocio.Impresora.TImpresora;
import Presentación.Controlador.Events;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Marina
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIBuscarUsuarioImpresora extends JFrame{
	
	private JPanel contentPane;
	private String[] columnNames = { "#", "Id", "Usuario", "Dimensiones", "Material" };
	private DefaultTableModel tableModel;
	private JTable table;
	
	public GUIBuscarUsuarioImpresora() {
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	private void initGUI() {
		setTitle("Listar Impresoras");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

		JScrollPane scrollPane = new JScrollPane();

		table = new JTable();
		scrollPane.setViewportView(table);

		tableModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; // Las celdas no se pueden editar
			}
		};

		tableModel.setColumnCount(0);

		for (int i = 0; i < columnNames.length; ++i)
			tableModel.addColumn(columnNames[i]);
		table.setModel(tableModel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(5)
								.addComponent(scrollPane,
										GroupLayout.DEFAULT_SIZE, 414,
										Short.MAX_VALUE).addGap(5))
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addContainerGap(231, Short.MAX_VALUE)
								.addComponent(btnAceptar,
										GroupLayout.PREFERRED_SIZE, 193,
										GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane
						.createSequentialGroup()
						.addGap(6)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE,
								211, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(btnAceptar)));
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void clearData() {
		// begin-user-code
		tableModel.setRowCount(0);
		table.setModel(tableModel);
		// end-user-code
	}

	public void update(int event, ArrayList<TImpresora> res) {
		switch (event) {
		case Events.BUSCAR_USUARIO_IMPRESORA_OK:
			tableModel.setRowCount(0);
			for (int i = 0; i < res.size(); i++)
				tableModel.insertRow(i, new Object[] {
						i + 1,
						res.get(i).getId_impresora(),
						res.get(i).getUsuario(),
						res.get(i).getAlto() + "x" + res.get(i).getAncho()
								+ "x" + res.get(i).getProfundidad(),
						res.get(i).getMaterial()
						});
			table.setModel(tableModel);
			this.setVisible(true);
			this.toFront();
			break;
		case Events.BUSCAR_USUARIO_IMPRESORA_KO:
			JOptionPane.showMessageDialog(null,
					"Error al listar las impresoras", "Error Listar",
					JOptionPane.ERROR_MESSAGE);
			break;
		}

	}


}