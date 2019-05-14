/**
 * 
 */
package Presentación.Impresora;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Presentación.Controlador.Events;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Marina
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@SuppressWarnings("serial")
public class GUIModificarImpresora extends JFrame {

	private JPanel contentPane;
	private int id;

	public GUIModificarImpresora() {
		super();
		contentPane = new JPanel();
		initGUI();
	}

	private void initGUI() {

	}

	public void update(int events, Object res) {
		switch (events) {
		case Events.MODIFICAR_IMPRESORA_OK:
			JOptionPane.showMessageDialog(null,
					"Éxito al modificar la impresora id: " + id);
			dispose();
			break;
		case Events.MODIFICAR_IMPRESORA_KO:
			JOptionPane.showMessageDialog(null,
					"Error al modificar la impresora id: " + id,
					"Error Impresora", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}