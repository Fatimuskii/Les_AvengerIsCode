import java.awt.Dimension;

import Presentaci�n.Controlador.Controlador;
import Presentaci�n.Controlador.Events;


public class main {

	/**
	 * @param args
	 */
		// TODO Ap�ndice de m�todo generado autom�ticamente

		public static Dimension WINDOW_DIM = new Dimension(1000, 75);
		public static void main(String[] args) {
			//Controlador.getInstance().accion(Events.GUI, null);
			Controlador.getInstance().accion(Events.OPEN_GUI_LOCAL_MENU, null);
		}

}
