/**
 * 
 */
package Presentación.Factoria;

import Presentación.Controlador.Controlador;
import Presentación.Controlador.Events;
import Presentación.Diseño.GUIDiseño;
import Presentación.Impresora.GUIImpresora;
import Presentación.Local.GUILocal;
import Presentación.PedidoImpresion.GUIPedidoImpresion;
import Presentación.Plataforma.GUIPlataforma;
import Presentación.Usuario.GUIUsuario;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GUIFactoriaImp extends GUIFactoria {


	public GUIFactoriaImp(){
		super();
		initGUI();
	}
	
	private void initGUI() {
		// PANTALLA DE INICIO MENU PRINCIPAL
		//Controlador.getInstance().accion(Events.GUI, null);
		
		//para probar Local voy a crear un boton solo con local
		Controlador.getInstance().accion(Events.OPEN_GUI_LOCAL_MENU, null);
	}
}