package Negocio.Plataforma;

public class TCompra {
	private int idCompra;
	private int idUsuario;
	private String nombreUsuario;
	private int idDiseño;
	private String nombreDiseño;
	private int precio;
	
	public TCompra(int idCompra, int idUsuario,String nombreUsuario, int idDiseño,String nombreDiseño){
		this.idCompra=idCompra;
		this.idUsuario=idUsuario;
		this.nombreUsuario=nombreUsuario;
		this.idDiseño=idDiseño;
		this.nombreDiseño=nombreDiseño;
	}
	
	public int getIdCompra(){
		return this.idCompra;
	}
	public int getIdDiseño(){
		return this.idDiseño;
	}
	public int getIdUsuario(){
		return this.idUsuario;
	}
	public String getNombreUsuario(){
		return this.nombreUsuario;
	}
	public String getNombreDiseño(){
		return this.nombreDiseño;
	}
	
	public String listaToString(){
		String text = "";
		text += "ID de la compra: "+String.valueOf(this.idCompra) + System.lineSeparator();
		text += "ID del usuario: "+String.valueOf(this.idUsuario) + System.lineSeparator();
		text += "Nombre del usuario: "+this.nombreUsuario + System.lineSeparator();
		text += "ID del diseño: "+String.valueOf(this.idDiseño) + System.lineSeparator();
		text += "Nombre del diseño: "+this.nombreDiseño + System.lineSeparator();
		return text;
	}
	public String toString(){
		return String.valueOf(this.idCompra);
	}
}
