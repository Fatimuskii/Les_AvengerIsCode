/**
 * 
 */
package Integración.Plataforma;

import java.util.ArrayList;

import Negocio.Plataforma.TCompra;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Fatimuskii
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface DAOCompra {
	
	public int alta(TCompra compra);
	
	public ArrayList<TCompra> listarPorUsuario(int idUsuario);



}