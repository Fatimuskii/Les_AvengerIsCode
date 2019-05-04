/**
 * 
 */
package Presentaci�n.Factoria;

import Presentaci�n.Controlador.Controlador;
import Presentaci�n.Controlador.Events;
import Presentaci�n.Dise�o.GUIDise�o;
import Presentaci�n.Impresora.GUIImpresora;
import Presentaci�n.Local.GUILocal;
import Presentaci�n.PedidoImpresion.GUIPedidoImpresion;
import Presentaci�n.Plataforma.GUIPlataforma;
import Presentaci�n.Usuario.GUIUsuario;

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