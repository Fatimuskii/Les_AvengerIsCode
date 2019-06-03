/**
 * 
 */
package Presentación.Controlador;

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

	/* RESULTADO DE LAS OPERACIONES DEL MÓDULO local */

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

	// DISEÑO
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
	public static final int LISTAR_DISEÑOS_USU_LOG = 506;
	public static final int LISTAR_IMPRESORAS_USU_LOG = 507;
	// public static final int ACCESO_USUARIO = 121;//TODO OSCAR
	public static final int MODIFICAR_USUARIO_OK = 122;
	public static final int MODIFICAR_USUARIO_KO = 123;
	public static final int MODIFICAR_USUARIO_COMPROBAR = 125;
	public static final int MODIFICAR_USUARIO_COMPROBAR_OK = 126;
	public static final int MODIFICAR_USUARIO_COMPROBAR_KO = 127;
	public static final int LISTAR_IMPRESORAS_USU_LOG_OK = 515;
	public static final int LISTAR_IMPRESORAS_USU_LOG_KO = 508;
	public static final int LISTAR_DISEÑOS_USU_LOG_OK = 509;
	public static final int LISTAR_DISEÑOS_USU_LOG_KO = 510;
	public static final int ALTA_USUARIO_OK = 511;
	public static final int ALTA_USUARIO_KO = 512;
	public static final int BAJA_USUARIO_OK = 513;
	public static final int BAJA_USUARIO_KO = 514;
	public static final int BUSCAR_USUARIO_OK = 132;
	public static final int BUSCAR_USUARIO_KO = 133;
	public static final int LISTAR_USUARIO_OK = 134;
	public static final int LISTAR_USUARIO_KO = 135;
	
	
	// PEDIDO IMPRESION

	public static final int ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS=601;
	public static final int ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS_OK=601;
	public static final int ALTA_PEDIDO_IMPRESION_LISTAIMPRESORAS_KO=602;
	public static final int ALTA_PEDIDO_IMPRESION_LISTADISENIOS=603;
	public static final int ALTA_PEDIDO_IMPRESION_LISTADISENIOS_OK=604;
	public static final int ALTA_PEDIDO_IMPRESION_LISTADISENIOS_KO=605;
	public static final int ALTA_PEDIDO_IMPRESION_LISTALOCALES=606;
	public static final int ALTA_PEDIDO_IMPRESION_LISTALOCALES_OK=606;
	public static final int ALTA_PEDIDO_IMPRESION_LISTALOCALES_KO=607;
	
	public static final int ALTA_PEDIDO_IMPRESION = 608;

	public static final int ALTA_PEDIDO_IMPRESION_OK = 609;
	public static final int ALTA_PEDIDO_IMPRESION_KO = 6010;

	/* EVENTOS PARA LAS VISTAS */
	public static final int GUI = 100; // LA INICIAL DEL PROGRAMA
	public static final int GUI_LOGIN = 101;
	public static final int GUI_MENUADMIN = 102;
	public static final int GUI_MENUUSER = 103;

	public static final int OPEN_GUI_LOCAL_MENU = 104;
	public static final int OPEN_GUI_USUARIO_MENU = 105;
	public static final int OPEN_GUI_IMPRESORA_MENU = 106;
	public static final int OPEN_GUI_DISEÑO_MENU = 107;
	public static final int OPEN_GUI_PEDIDO_IMPRESION_MENU = 108;


	// PLATAFORMA
	public static final int ACCESO_USUARIO = 701;
	public static final int ALTA_CARRITO = 702;
	public static final int MODIFICAR_CARRITO = 703;
	public static final int MODIFICAR_CARRITO_ANNADIR = 707;
	public static final int MODIFICAR_CARRITO_ANNADIR_OK = 715;
	public static final int MODIFICAR_CARRITO_ANNADIR_KO = 716;
	public static final int BAJA_CARRITO = 704;
	public static final int ACCESO_USUARIO_OK = 705;
	public static final int ACCESO_USUARIO_KO = 706;
	public static final int ALTA_COMPRAS = 708;
	public static final int ALTA_COMPRAS_OK = 709;
	public static final int REGISTRO_USUARIO = 710;
	public static final int HISTORIAL_COMPRAS =711;
	public static final int HISTORIAL_ANNADIR_COMPRAS=714;
	public static final int HISTORIAL_ANNADIR_COMPRAS_OK=717;
	public static final int HISTORIAL_ANNADIR_COMPRAS_KO=718;
	public static final int HISTORIAL_COMPRAS_OK =713;

}