package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		setBounds(100, 100, 450, 300);
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
		
		JButton btnNewButton = new JButton("Dise\u00F1os");
		btnNewButton.setBounds(120, 62, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnImpresora = new JButton("Impresora");
		btnImpresora.setBounds(228, 62, 89, 23);
		panel.add(btnImpresora);
		
		JButton btnCompras = new JButton("Compras");
		btnCompras.setBounds(10, 128, 89, 23);
		panel.add(btnCompras);
		
		JButton btnVentas = new JButton("Ventas");
		btnVentas.setBounds(10, 168, 89, 23);
		panel.add(btnVentas);
	}
	
}
