/**
 * 
 */
package Presentación.Controlador;

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
	
	
	/*RESULTADO DE LAS OPERACIONES DEL MÓDULO local*/
	
	public static final int ALTA_LOCAL_OK = 200;
	public static final int ALTA_LOCAL_KO = 201;
	public static final int ALTA_REPRESENTANTE_OK = 202;
	public static final int ALTA_REPRESENTANTE_KO = 203;
	public static final int BAJA_LOCAL_OK = 204;
	public static final int BAJA_REPRESENTANTE_OK = 205;
	public static final int BAJA_REPRESENTANTE_KO = 206;
	public static final int BAJA_LOCAL_KO = 207;
	public static final int MODIFICAR_LOCAL_OK = 208;
	public static final int MODIFICAR_REPRESENTANTE_OK = 209;
	public static final int MODIFICAR_REPRESENTANTE_KO= 2010;
	public static final int MODIFICAR_LOCAL_KO = 2011;
	public static final int BUSCAR_LOCAL_OK = 2012;
	public static final int BUSCAR_REPRESENTANTE_OK = 2013;
	public static final int BUSCAR_REPRESENTANTE_KO= 2014;
	public static final int BUSCAR_LOCAL_KO = 2015;
	public static final int LISTAR_LOCALES_OK = 2016;
	public static final int LISTAR_LOCALES_KO = 2017;
	
	//DISEÑO
	//GUI Diseño
	
	public static final int ALTA_DISEÑO = 301;
	public static final int BAJA_DISEÑO = 302;
	public static final int MODIFICAR_DISEÑO = 303;
	public static final int BUSCAR_DISEÑO_ID = 304;
	public static final int BUSCAR_DISEÑO_PALABRA_CLAVE = 305;
	public static final int LISTAR_DISEÑOS = 306;
	public static final int LISTAR_DISEÑOS_USU = 307;
	public static final int MODIFICAR_DISEÑO_COMPROBAR = 333;
	
	public static final int ALTA_DISEÑO_OK = 308;
	public static final int ALTA_DISEÑO_KO = 309;
	public static final int BAJA_DISEÑO_OK = 310;
	public static final int BAJA_DISEÑO_KO = 320;
	public static final int MODIFICAR_DISEÑO_OK = 321;
	public static final int MODIFICAR_DISEÑO_KO = 322;
	public static final int BUSCAR_DISEÑO_ID_OK = 323;
	public static final int BUSCAR_DISEÑO_ID_KO = 324;
	public static final int BUSCAR_DISEÑO_PALABRA_CLAVE_OK = 325;
	public static final int BUSCAR_DISEÑO_PALABRA_CLAVE_KO = 326;
	public static final int LISTAR_DISEÑOS_OK = 327;
	public static final int LISTAR_DISEÑOS_KO = 328;
	public static final int LISTAR_DISEÑOS_USU_OK = 329;
	public static final int LISTAR_DISEÑOS_USU_KO = 330;
	public static final int MODIFICAR_DISEÑO_COMPROBAR_OK = 331;
	public static final int MODIFICAR_DISEÑO_COMPROBAR_KO = 332;
	
	
	//IMPRESORA
	public static final int ALTA_IMPRESORA = 401;
	public static final int BAJA_IMPRESORA = 402;
	public static final int MODIFICAR_IMPRESORA = 403;
	public static final int BUSCAR_IMPRESORA = 404;
	public static final int LISTAR_IMPRESORAS = 405;
	public static final int BUSCAR_USUARIO_IMPRESORA = 406;
	public static final int MODIFICAR_IMPRESORA_COMPROBAR = 419;
	
	public static final int ALTA_IMPRESORA_OK = 407;
	public static final int ALTA_IMPRESORA_KO = 408;
	public static final int BAJA_IMPRESORA_OK = 409;
	public static final int BAJA_IMPRESORA_KO = 410;
	public static final int MODIFICAR_IMPRESORA_OK  = 411;
	public static final int MODIFICAR_IMPRESORA_KO = 412;
	public static final int BUSCAR_IMPRESORA_OK  = 413;
	public static final int BUSCAR_IMPRESORA_KO = 414;
	public static final int LISTAR_IMPRESORAS_OK  = 415;
	public static final int LISTAR_IMPRESORAS_KO = 416;
	public static final int BUSCAR_USUARIO_IMPRESORA_OK  = 417;
	public static final int BUSCAR_USUARIO_IMPRESORA_KO = 418;
	public static final int MODIFICAR_IMPRESORA_COMPROBAR_OK = 420;
	public static final int MODIFICAR_IMPRESORA_COMPROBAR_KO = 421;

	
	/*EVENTOS PARA LAS VISTAS*/
	public static final int GUI = 100; // LA INICIAL DEL PROGRAMA
	public static final int GUI_LOGIN= 101;
	public static final int GUI_MENUADMIN=102;
	public static final int GUI_MENUUSER=103; 
	
	public static final int OPEN_GUI_LOCAL_MENU = 104;
	public static final int OPEN_GUI_USUARIO_MENU = 105;	
	public static final int OPEN_GUI_IMPRESORA_MENU = 106;	
	public static final int OPEN_GUI_DISEÑO_MENU = 107;
	
	/*public static final int OPEN_GUI_ALTA_LOCAL = 110;
	public static final int OPEN_GUI_BAJA_LOCAL = 111;
	public static final int OPEN_GUI_MODIFICAR_LOCAL = 112;
	public static final int OPEN_GUI_BUSCAR_LOCAL = 113;
	public static final int OPEN_GUI_LISTAR_LOCALES = 114;
	public static final int	OPEN_GUI_REPRESENTANTE= 115;*/
	
	
	public static final int OPEN_GUI_ALTA_USUARIO = 116;
	public static final int OPEN_GUI_BAJA_USUARIO = 117;
	public static final int OPEN_GUI_MODIFICAR_USUARIO = 118;
	public static final int OPEN_GUI_BUSCAR_USUARIO = 119;
	public static final int OPEN_GUI_LISTAR_USUARIO = 120;
	public static final int OPEN_GUI_ACCESO_USUARIO = 121;//TODO OSCAR
	public static final int OPEN_GUI_DATOS_BANCARIOS_USUARIO = 122;
	public static final int OPEN_GUI_PERFIL_USUARIO = 123;
	

		
	
}