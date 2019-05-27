/**
 * 
 */
package Presentaci�n.Controlador;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Events {
	/* Eventos de Local */
	public static final int ALTA_LOCAL = 150;
	public static final int BAJA_LOCAL = 152;
	public static final int MODIFICAR_LOCAL = 154;
	public static final int BUSCAR_LOCAL = 156;
	public static final int LISTAR_LOCALES = 158;

	/* RESULTADO DE LAS OPERACIONES DEL M�DULO local */

	public static final int ALTA_LOCAL_OK = 200;
	public static final int ALTA_LOCAL_KO = 201;
	public static final int BAJA_LOCAL_OK = 204;
	public static final int BAJA_LOCAL_KO = 207;
	public static final int MODIFICAR_LOCAL_OK = 208;
	public static final int MODIFICAR_LOCAL_KO = 2011;
	public static final int BUSCAR_LOCAL_OK = 2012;
	public static final int BUSCAR_LOCAL_KO = 2015;
	public static final int LISTAR_LOCALES_OK = 2016;
	public static final int LISTAR_LOCALES_KO = 2017;

	// DISE�O
	// GUI Dise�o

	public static final int ALTA_DISE�O = 301;
	public static final int BAJA_DISE�O = 302;
	public static final int MODIFICAR_DISE�O = 303;
	public static final int BUSCAR_DISE�O_ID = 304;
	public static final int BUSCAR_DISE�O_PALABRA_CLAVE = 305;
	public static final int LISTAR_DISE�OS = 306;
	public static final int LISTAR_DISE�OS_USU = 307;
	public static final int MODIFICAR_DISE�O_COMPROBAR = 333;

	public static final int ALTA_DISE�O_OK = 308;
	public static final int ALTA_DISE�O_KO = 309;
	public static final int BAJA_DISE�O_OK = 310;
	public static final int BAJA_DISE�O_KO = 320;
	public static final int MODIFICAR_DISE�O_OK = 321;
	public static final int MODIFICAR_DISE�O_KO = 322;
	public static final int BUSCAR_DISE�O_ID_OK = 323;
	public static final int BUSCAR_DISE�O_ID_KO = 324;
	public static final int BUSCAR_DISE�O_PALABRA_CLAVE_OK = 325;
	public static final int BUSCAR_DISE�O_PALABRA_CLAVE_KO = 326;
	public static final int LISTAR_DISE�OS_OK = 327;
	public static final int LISTAR_DISE�OS_KO = 328;
	public static final int LISTAR_DISE�OS_USU_OK = 329;
	public static final int LISTAR_DISE�OS_USU_KO = 330;
	public static final int MODIFICAR_DISE�O_COMPROBAR_OK = 331;
	public static final int MODIFICAR_DISE�O_COMPROBAR_KO = 332;

	// IMPRESORA
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
	public static final int MODIFICAR_IMPRESORA_OK = 411;
	public static final int MODIFICAR_IMPRESORA_KO = 412;
	public static final int BUSCAR_IMPRESORA_OK = 413;
	public static final int BUSCAR_IMPRESORA_KO = 414;
	public static final int LISTAR_IMPRESORAS_OK = 415;
	public static final int LISTAR_IMPRESORAS_KO = 416;
	public static final int BUSCAR_USUARIO_IMPRESORA_OK = 417;
	public static final int BUSCAR_USUARIO_IMPRESORA_KO = 418;
	public static final int MODIFICAR_IMPRESORA_COMPROBAR_OK = 420;
	public static final int MODIFICAR_IMPRESORA_COMPROBAR_KO = 421;

	// USUARIO
	public static final int ALTA_USUARIO = 501;
	public static final int BAJA_USUARIO = 502;
	public static final int MODIFICAR_USUARIO = 503;
	public static final int BUSCAR_USUARIO = 504;
	public static final int LISTAR_USUARIO = 505;
	// public static final int ACCESO_USUARIO = 121;//TODO OSCAR
	public static final int MODIFICAR_USUARIO_OK = 122;
	public static final int MODIFICAR_USUARIO_KO = 123;
	public static final int MODIFICAR_USUARIO_COMPROBAR = 125;
	public static final int MODIFICAR_USUARIO_COMPROBAR_OK = 126;
	public static final int MODIFICAR_USUARIO_COMPROBAR_KO = 127;
	public static final int ALTA_USUARIO_OK = 511;
	public static final int ALTA_USUARIO_KO = 512;
	public static final int BAJA_USUARIO_OK = 513;
	public static final int BAJA_USUARIO_KO = 514;
	public static final int BUSCAR_USUARIO_OK = 132;
	public static final int BUSCAR_USUARIO_KO = 133;
	public static final int LISTAR_USUARIO_OK = 134;
	public static final int LISTAR_USUARIO_KO = 135;
	// PEDIDO IMPRESION

	public static final int ALTA_PEDIDO_IMPRESION = 601;

	public static final int ALTA_PEDIDO_IMPRESION_OK = 602;
	public static final int ALTA_PEDIDO_IMPRESION_KO = 603;

	/* EVENTOS PARA LAS VISTAS */
	public static final int GUI = 100; // LA INICIAL DEL PROGRAMA
	public static final int GUI_LOGIN = 101;
	public static final int GUI_MENUADMIN = 102;
	public static final int GUI_MENUUSER = 103;

	public static final int OPEN_GUI_LOCAL_MENU = 104;
	public static final int OPEN_GUI_USUARIO_MENU = 105;
	public static final int OPEN_GUI_IMPRESORA_MENU = 106;
	public static final int OPEN_GUI_DISE�O_MENU = 107;
	public static final int OPEN_GUI_PEDIDO_IMPRESION_MENU = 108;


	// PLATAFORMA
	public static final int ACCESO_USUARIO = 701;
	public static final int ALTA_CARRITO = 702;
	public static final int MODIFICAR_CARRITO = 703;
	public static final int MODIFICAR_CARRITO_ANNADIR = 707;
	public static final int BAJA_CARRITO = 704;
	public static final int ACCESO_USUARIO_OK = 705;
	public static final int ACCESO_USUARIO_KO = 706;

}