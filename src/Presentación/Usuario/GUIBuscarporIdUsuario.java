/**
 * 
 */
package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;

import Negocio.Diseño.TDiseño;
import Negocio.Impresora.TImpresora;
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @param <T>
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIBuscarporIdUsuario<T> extends JFrame {

	private String[] columnNames = { "#", "Id", "Nombre", "Descripcion",
			"Dimensiones", "Precio" };// diseños
	private String[] columnNames_1 = { "#", "Id", "Nombre", "Dimensiones",
			"Materiales" };// impresoras
	private JTable table;
	private JTable table_1;
	private DefaultTableModel model;
	private DefaultTableModel model_1;

	private int id;

	public GUIBuscarporIdUsuario(int id) {
		this.table = new JTable();
		this.table_1 = new JTable();
		this.id = id;
		initGUI();
	}

	@SuppressWarnings("serial")
	public void initGUI() {
		setTitle("Buscar Usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 430);
		getContentPane().setLayout(null);

		// TABLA DISEÑOS
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.black, 2), "Diseños",
				TitledBorder.LEFT, TitledBorder.TOP));
		scrollPane.setBounds(10, 101, 564, 120);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		model.setColumnCount(0);

		for (int i = 0; i < columnNames.length; ++i)
			model.addColumn(columnNames[i]);

		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(133);
		table.getColumnModel().getColumn(5).setPreferredWidth(61);

		// TABLA IMPRESORAS
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.black, 2), "Impresoras",
				TitledBorder.LEFT, TitledBorder.TOP));
		scrollPane_1.setBounds(10, 235, 564, 120);
		getContentPane().add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		model_1 = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		model_1.setColumnCount(0);

		for (int i = 0; i < columnNames_1.length; ++i)
			model_1.addColumn(columnNames_1[i]);

		table_1.setModel(model_1);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(15);
		table_1.getColumnModel().getColumn(0).setMinWidth(7);

		// PERFIL
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes\\logo-REDM-REDM.png"));

		JLabel lblIdusuario = new JLabel(String.valueOf(id));
		lblIdusuario.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblEmail = new JLabel();
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addGap(28)
						.addGroup(
								groupLayout
										.createParallelGroup(
												Alignment.TRAILING, false)
										.addComponent(label, Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblIdusuario,
												Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addGap(29)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE,
								156, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(318, Short.MAX_VALUE)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(label,
												GroupLayout.PREFERRED_SIZE, 49,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblIdusuario)
														.addComponent(
																lblEmail,
																GroupLayout.PREFERRED_SIZE,
																15,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(311, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);
	}

	public void clearData() {
		model.setRowCount(0);
		table.setModel(model);

		model_1.setRowCount(0);
		table_1.setModel(model_1);
	}

	@SuppressWarnings("unchecked")
	public void update(int event, Object res) {//ArrayList<T> res
		switch (event) {

		case Events.LISTAR_DISEÑOS_USU_LOG_OK:
		//	res = (ArrayList<T>) res;
			model.setRowCount(0);
			for (int i = 0; i < ((ArrayList<TDiseño>) res).size(); i++)
				model.insertRow(
						i,
						new Object[] {
								i + 1,
								(((ArrayList<TDiseño>) res).get(i)).getId_diseño(),
								(((ArrayList<TDiseño>) res).get(i)).getNombre(),
								(((ArrayList<TDiseño>) res).get(i)).getDescripcion(),
								(((ArrayList<TDiseño>) res).get(i)).getAlto()
										+ "x"
										+ (((ArrayList<TDiseño>) res).get(i)).getAncho()
										+ "x"
										+ (((ArrayList<TDiseño>) res).get(i))
												.getProfundidad(),
								(((ArrayList<TDiseño>) res).get(i)).getPrecio() });
			table.setModel(model);
			break;
		case Events.LISTAR_IMPRESORAS_USU_LOG_OK:
			model_1.setRowCount(0);
			for (int i = 0; i < ((ArrayList<TImpresora>) res).size(); i++)
				model_1.insertRow(
						i,
						new Object[] {
								i + 1,
								(((ArrayList<TImpresora>) res).get(i)).getId_impresora(),
								(((ArrayList<TImpresora>) res).get(i)).getUsuario(),
								(((ArrayList<TImpresora>) res).get(i)).getAlto()
										+ "x"
										+ (((ArrayList<TImpresora>) res).get(i)).getAncho()
										+ "x"
										+ (((ArrayList<TImpresora>) res).get(i))
												.getProfundidad(),
								(((ArrayList<TImpresora>) res).get(i)).getMaterial() });
			table_1.setModel(model_1);
			break;

		case Events.LISTAR_DISEÑOS_USU_LOG_KO:
			JOptionPane.showMessageDialog(null,
					"Error al listar los diseños del usuario", "Error Listar",
					JOptionPane.ERROR_MESSAGE);
			break;
		case Events.LISTAR_IMPRESORAS_USU_LOG_KO:
			JOptionPane.showMessageDialog(null,
					"Error al listar las impresoras del usuario",
					"Error Listar", JOptionPane.ERROR_MESSAGE);
			break;

		case Events.BUSCAR_USUARIO_OK:
			JOptionPane.showMessageDialog(null, "Usuario encontrado",
					"Buscar usuario", JOptionPane.INFORMATION_MESSAGE);
			Controlador.getInstance().accion(Events.LISTAR_DISEÑOS_USU_LOG, id);
			Controlador.getInstance().accion(Events.LISTAR_IMPRESORAS_USU_LOG,
					id);
			this.setVisible(true);
			this.toFront();
			break;
		case Events.BUSCAR_USUARIO_KO:
			JOptionPane.showMessageDialog(null, "El usuario " + id
					+ " no existe", "Error buscar usuario",
					JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}