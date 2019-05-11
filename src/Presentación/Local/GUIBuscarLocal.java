package Presentación.Local;

import javax.swing.JTextField;

import Negocio.Local.TLocal;

@SuppressWarnings("serial")
public class GUIBuscarLocal extends GUILocalImp {

	private JTextField IdLocalField;
	private JTextField nombreField;
	private JTextField telField;
	private JTextField CIFField;
	private JTextField dirField;
	private JTextField cpField;
	private JTextField locField;
	private JTextField repreField;
	private JTextField activoField;

	private TLocal local;
	String id, nombre, tel, CIF, dir, cp, loc, repre, activo;
	
	public GUIBuscarLocal(TLocal local){
		
		this.local= local;
		this.id = ""+this.local.getIdLocal();
		this.nombre= this.local.getNombreLocal();
		this.tel=""+this.local.getTelefono();
		this.CIF=""+this.local.getCIF();
		this.dir= this.local.getDireccion();
		this.cp=""+this.local.getCP();
		this.loc=this.local.getLocalidad();
		this.repre=""+this.local.getRepresentante();
		
		if (this.local.getActivo())
			this.activo= "SI";
		else
			this.activo ="NO";
		
		
		initGUI();
	}
	
	public void initGUI(){
		
		// tabla con todos los datos del Local 
		// SALDRÁ BOTON EDITAR Y BORRAR. 
		
		
		
		
	}
}
