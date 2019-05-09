package Presentación.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

public class GUIDatosBancariosUsuario extends JFrame{

	private JPanel contentPane;
	private JTextField txtNmeroDeTarjeta;
	private JTextField txtNombreEnLa;
	private boolean press;
	private boolean press2;
	public GUIDatosBancariosUsuario() {
		super();
		this.contentPane = new JPanel();
		this.txtNmeroDeTarjeta = new JTextField();
		this.txtNombreEnLa = new JTextField();
		this.press = false;
		this.press2 = false;
		initGUI();
	}
	
	public void initGUI(){
		setTitle("Alta Usuario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUIDatosBancariosUsuario.class.getResource("/logo.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos bancarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(25, 34, 152, 23);
		panel.add(lblNewLabel);
		
		txtNmeroDeTarjeta = new JTextField();
		press = false;
		txtNmeroDeTarjeta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!press) {
					txtNmeroDeTarjeta.setText("");
					press = true;
				}
			}
		});
		txtNmeroDeTarjeta.setForeground(Color.DARK_GRAY);
		txtNmeroDeTarjeta.setText("N\u00FAmero de tarjeta");
		txtNmeroDeTarjeta.setBounds(25, 78, 152, 20);
		panel.add(txtNmeroDeTarjeta);
		txtNmeroDeTarjeta.setColumns(10);
		
		txtNombreEnLa = new JTextField();
		press2 = false;
		txtNombreEnLa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!press2) {
					txtNombreEnLa.setText("");
					press2 = true;
				}
			}
		});
		txtNombreEnLa.setText("Nombre en la tarjeta");
		txtNombreEnLa.setForeground(Color.DARK_GRAY);
		txtNombreEnLa.setColumns(10);
		txtNombreEnLa.setBounds(25, 119, 152, 20);
		panel.add(txtNombreEnLa);
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento");
		lblFechaDeVencimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaDeVencimiento.setBounds(25, 153, 138, 14);
		panel.add(lblFechaDeVencimiento);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner.setBounds(25, 178, 46, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(2018, 2018, 2030, 1));
		spinner_1.setBounds(81, 178, 66, 20);
		panel.add(spinner_1);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtNmeroDeTarjeta.getText().length() != 16) {
					JOptionPane.showMessageDialog(new JFrame(), "El numero de la tarjeta debe tener 16 dígitos");
				}
			}
		});
		btnConfirmar.setBounds(311, 217, 89, 23);
		panel.add(btnConfirmar);
	}
}
