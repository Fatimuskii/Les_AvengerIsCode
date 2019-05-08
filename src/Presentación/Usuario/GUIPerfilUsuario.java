package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUIPerfilUsuario extends JFrame {

	private JPanel contentPane;
	
	public GUIPerfilUsuario(JPanel contentPane) throws HeadlessException {
		super();
		this.contentPane = contentPane;
	}

	public void initGUI(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUIPerfilUsuario.class.getResource("/logo.png")));
		setTitle("Perfil Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GUIPerfilUsuario.class.getResource("/logo.png")));
		lblNewLabel.setBounds(10, 11, 78, 74);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 93, 68, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnImpresora = new JButton("Impresora");
		btnImpresora.setBounds(10, 141, 99, 23);
		panel.add(btnImpresora);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(119, 69, 56, 21);
		panel.add(menuBar);
		
		JMenu mnDiseos = new JMenu("Dise\u00F1os");
		menuBar.add(mnDiseos);
		
		JMenuItem mntmComprados = new JMenuItem("Comprados");
		mnDiseos.add(mntmComprados);
		
		JMenuItem mntmCreados = new JMenuItem("Creados");
		mnDiseos.add(mntmCreados);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(233, 51, 56, 43);
		panel.add(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(GUIPerfilUsuario.class.getResource("/carr.png")));
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmDiseos = new JMenuItem("Dise\u00F1os");
		mnNewMenu.add(mntmDiseos);
		
		JMenuItem mntmPedidosImpresin = new JMenuItem("Pedidos impresi\u00F3n");
		mnNewMenu.add(mntmPedidosImpresin);
	}
	
}
