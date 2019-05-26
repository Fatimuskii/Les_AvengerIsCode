/**
 * 
 */
package Negocio.Local;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author Fatimuskii
 * @generated 
 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TLocal {
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int IdLocal;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String nombre;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int telefono;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int CIF;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String direccion;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int CP;
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String localidad;
	private String representante;

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean activo;

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

	public TLocal(int IdLocal, String nombre, int telefono, int CIF,
			String direccion, int CP, String localidad, String repre,
			boolean activo) {

		this.IdLocal = IdLocal;
		this.nombre = nombre;
		this.telefono = telefono;
		this.CIF = CIF;
		this.direccion = direccion;
		this.CP = CP;
		this.localidad = localidad;
		this.representante = repre;
		this.activo = activo;

	}

	public TLocal(String nombre, int telefono, int CIF, String direccion,
			int CP, String localidad, String representante, boolean activo) {

		this.nombre = nombre;
		this.telefono = telefono;
		this.CIF = CIF;
		this.direccion = direccion;
		this.CP = CP;
		this.localidad = localidad;
		this.representante = representante;
		this.activo = activo;

	}

	public int getIdLocal() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return IdLocal;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNombreLocal() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return nombre;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getTelefono() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return telefono;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getCIF() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return CIF;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getDireccion() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return direccion;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getCP() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return CP;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @return
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getLocalidad() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return localidad;
		// end-user-code
	}

	public String getRepresentante() {
		return representante;
	}

	/**
	 * ´ <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean getActivo() {
		return activo;
		// begin-user-code
		// TODO Apéndice de método generado automáticamente

		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @param nombre
	 * @param telefono
	 * @param CIF
	 * @param direccion
	 * @param CP
	 * @param localidad
	 * @param representante
	 * @generated 
	 *            "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDatos(String nombre, int telefono, int CIF,
			String direccion, int CP, String localidad, String representante) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		this.nombre = nombre;
		this.telefono = telefono;
		this.CIF = CIF;
		this.direccion = direccion;
		this.CP = CP;
		this.localidad = localidad;
		this.representante = representante;
		// end-user-code
	}
}