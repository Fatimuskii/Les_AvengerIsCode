package Negocio.Plataforma;

public class TCompra {
	private int idCompra;
	private int idUsuario;
	private int idDiseño;
	private int precio;
	
	public TCompra(int idCompra, int idUsuario, int idDiseño){
		this.idCompra=idCompra;
		this.idUsuario=idUsuario;
		this.idDiseño=idDiseño;
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
	
	public String listaToString(){
		String text = "";
		text += "ID de la compra: "+String.valueOf(this.idCompra) + System.lineSeparator();
		text += "ID del usuario: "+String.valueOf(this.idUsuario) + System.lineSeparator();
		text += "ID del diseño: "+String.valueOf(this.idDiseño) + System.lineSeparator();
		return text;
	}
	public String toString(){
		return String.valueOf(this.idCompra);
	}
}
