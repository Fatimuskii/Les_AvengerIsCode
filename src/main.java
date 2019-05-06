import java.awt.Dimension;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;


public class main {

	/**
	 * @param args
	 */
		// TODO Apéndice de método generado automáticamente

		public static Dimension WINDOW_DIM = new Dimension(1000, 75);
		
		public static void main(String[] args) {
			Controlador.getInstance().accion(Events.GUI, null);
			//Controlador.getInstance().accion(Events.OPEN_GUI_LOCAL_MENU, null);
		}

}


//NOTA*
/*HE PUESTO EL MENU DE gui, CON LA OPCION QUE CUANDO DE A OK EN EL LOGIN PASE AL MENU PRINCIPAL, 
ESO LUEGO LO CAMBIAREMOS OF COURSE*/