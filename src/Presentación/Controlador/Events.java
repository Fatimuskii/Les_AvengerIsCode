/**
 * 
 */
package Presentaci�n.Controlador;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Events {
	/* Eventos de Local*/
	public static final int ALTA_LOCAL = 150;
	public static final int ALTA_REPRESENTANTE = 151;
	public static final int BAJA_LOCAL = 152;
	public static final int BAJA_REPRESENTANTE = 153;
	public static final int MODIFICAR_LOCAL = 154;
	public static final int MODIFICAR_REPRESENTANTE = 155;
	public static final int BUSCAR_LOCAL = 156;
	public static final int BUSCAR_REPRESENTANTE = 157;
	public static final int LISTAR_LOCALES = 158;
	public static final int LISTAR_REPRESENTANTES = 159;
	
	
	/*RESULTADO DE LAS OPERACIONES DEL M�DULO local*/
	
	public static final int ALTA_LOCAL_OK = 200;
	public static final int ALTA_LOCAL_KO = 201;
	public static final int ALTA_REPRESENTANTE_OK = 203;
	public static final int ALTA_REPRESENTANTE_KO = 204;
	/*public static final int BAJA_LOCAL_OK = 202;
	public static final int BAJA_LOCAL_KO = 203;
	public static final int MODIFICAR_LOCAL_OK = 204;
	public static final int MODIFICAR_LOCAL_KO = 205;
	public static final int BUSCAR_LOCAL_OK = 206;
	public static final int BUSCAR_LOCAL_KO = 207;
	public static final int LISTAR_LOCALES_OK = 208;
	public static final int LISTAR_LOCALES_KO = 209;*/
	
	
	/*EVENTOS PARA LAS VISTAS*/
	public static final int GUI = 100; // LA INICIAL DEL PROGRAMA
	public static final int GUI_LOGIN= 101;
	public static final int GUI_MENUADMIN=102;
	public static final int GUI_MENUUSER=103; 
	
	public static final int OPEN_GUI_LOCAL_MENU = 102;
	
	public static final int OPEN_GUI_USUARIO_MENU = 104;	
	public static final int OPEN_GUI_IMPRESORA_MENU = 105;	
	
	public static final int OPEN_GUI_ALTA_LOCAL = 110;
	public static final int OPEN_GUI_BAJA_LOCAL = 111;
	public static final int OPEN_GUI_MODIFICAR_LOCAL = 112;
	public static final int OPEN_GUI_BUSCAR_LOCAL = 113;
	public static final int OPEN_GUI_LISTAR_LOCALES = 114;
	public static final int	OPEN_GUI_REPRESENTANTE= 115;
	
	
	public static final int OPEN_GUI_ALTA_USUARIO = 116;
	public static final int OPEN_GUI_BAJA_USUARIO = 117;
	public static final int OPEN_GUI_MODIFICAR_USUARIO = 118;
	public static final int OPEN_GUI_BUSCAR_USUARIO = 119;
	public static final int OPEN_GUI_LISTAR_USUARIO = 120;
	public static final int OPEN_GUI_ACCESO_USUARIO = 121;//TODO OSCAR
	public static final int OPEN_GUI_DATOS_BANCARIOS_USUARIO = 122;
	public static final int OPEN_GUI_PERFIL_USUARIO = 123;
	
	public static final int OPEN_GUI_ALTA_IMPRESORA = 124;
	public static final int OPEN_GUI_BAJA_IMPRESORA = 125;
	public static final int OPEN_GUI_MODIFICAR_IMPRESORA = 126;
	public static final int OPEN_GUI_BUSCAR_IMPRESORA = 127;
	public static final int OPEN_GUI_LISTAR_IMPRESORA = 128;
	public static final int OPEN_GUI_BUSCAR_USUARIO_IMPRESORA = 129;
	
}