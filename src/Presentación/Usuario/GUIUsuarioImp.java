/**
 * 
 */
package Presentación.Usuario;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */

public class GUIUsuarioImp extends GUIUsuario {

	private GUIModificarUsuario GUI_ModificarUsuario;
	private GUIBajaUsuario GUI_BajaUsuario;
	private GUIPerfilUsuario GUI_PerfilUsuario;

	private JPanel contentPane;
	private JTextField txtBuscarUsuario;
	private boolean press;

	public GUIUsuarioImp() {
		super();
		this.contentPane = new JPanel();
		this.txtBuscarUsuario = new JTextField();
		this.GUI_PerfilUsuario = new GUIPerfilUsuario();
		this.press = false;
		initGUI();
	}

	public void initGUI() {
		setTitle("Men\u00FA Usuario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				GUIUsuarioImp.class.getResource("/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		press = false;

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 22, 77, 64);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(GUIUsuarioImp.class
				.getResource("/logoUsu.png")));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Perfil");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_PerfilUsuario.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		mnNewMenu.add(mnConfiguracin);

		JMenuItem mntmModificarUsuario = new JMenuItem("Modificar usuario");
		mntmModificarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI_ModificarUsuario.setVisible(true);
			}
		});
		mnConfiguracin.add(mntmModificarUsuario);

		JMenuItem mntmDarseDeBaja = new JMenuItem("Darse de baja");
		mntmDarseDeBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_BajaUsuario.setVisible(true);
			}
		});
		mnConfiguracin.add(mntmDarseDeBaja);

		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar sesi\u00F3n");
		mnNewMenu.add(mntmCerrarSesin);

		txtBuscarUsuario = new JTextField();
		txtBuscarUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (!press) {
					txtBuscarUsuario.setText("");
					press = true;
				}
			}
		});
		txtBuscarUsuario.setForeground(Color.GRAY);
		txtBuscarUsuario.setText("Buscar usuario");
		txtBuscarUsuario.setBounds(234, 43, 282, 20);
		contentPane.add(txtBuscarUsuario);
		txtBuscarUsuario.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(262, 85, 89, 23);
		contentPane.add(btnBuscar);

		JButton btnMostrarTodos = new JButton("Mostrar todos");
		btnMostrarTodos.setBounds(371, 85, 118, 23);
		contentPane.add(btnMostrarTodos);
	}
}
