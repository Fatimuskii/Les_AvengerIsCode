/**
 * 
 */
package Presentación.Usuario;

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
import Negocio.Usuario.TUsuario;
import Presentación.Controlador.Events;


@SuppressWarnings("serial")
public class GUIListarUsuarios extends JFrame {
	
	private JPanel contentPane;
	private String[] columnNames = { "#", "Id", "Nombre","Apellidos","Direccion","Fecha de Nacimiento","E-mail"," Titular Cuenta", "Numero de Cuenta"}; 
	private DefaultTableModel tableModel;
	private JTable table;
	
	public GUIListarUsuarios(){
		super();
		contentPane = new JPanel();
		initGUI();
	}
	
	@SuppressWarnings("serial")
	private void initGUI(){
		setTitle("Listar Usuarios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 300);
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
		
		tableModel = new DefaultTableModel(){
			@Override
		    public boolean isCellEditable(int row, int column) {
		       return false;
		    }
		};
		
		tableModel.setColumnCount(0);
		
		for (int i = 0; i < columnNames.length; ++i)
			tableModel.addColumn(columnNames[i]);
		table.setModel(tableModel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(231, Short.MAX_VALUE)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnAceptar))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	public void clearData() {
		// begin-user-code
		tableModel.setRowCount(0);
		table.setModel(tableModel);
		// end-user-code
	}
	
	public void update(int event, ArrayList<TUsuario> usu){
		switch (event) {
		case Events.LISTAR_USUARIO_OK:
			 tableModel.setRowCount(0);
			 for (int i = 0; i < usu.size(); i++) 
				 tableModel.insertRow(i, new Object[] 
						 { i+1, usu.get(i).getIdUsuario(), usu.get(i).getNombre(), usu.get(i).getApellidos(), 
						 usu.get(i).getDireccion(), usu.get(i).getEmail(), usu.get(i).getFechaNacimiento(), usu.get(i).getTitularCuenta(),
						 usu.get(i).getNumeroCuenta(), usu.get(i).getFechaCaducidad()});
			 table.setModel(tableModel);
			break;
		case Events.LISTAR_USUARIO_KO:
			JOptionPane.showMessageDialog(null, "Error al listar usuarios", "Error al listar", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}

}
	
	
