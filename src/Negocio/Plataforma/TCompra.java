package Negocio.Plataforma;

public class TCompra {
	private int idCompra;
	private int idUsuario;
	private int idDise�o;
	private int precio;
	
	public TCompra(int idCompra, int idUsuario, int idDise�o){
		this.idCompra=idCompra;
		this.idUsuario=idUsuario;
		this.idDise�o=idDise�o;
	}
	
	public int getIdCompra(){
		return this.idCompra;
	}
	public int getIdDise�o(){
		return this.idDise�o;
	}
	public int getIdUsuario(){
		return this.idUsuario;
	}
	
	public String listaToString(){
		String text = "";
		text += "ID de la compra: "+String.valueOf(this.idCompra) + System.lineSeparator();
		text += "ID del usuario: "+String.valueOf(this.idUsuario) + System.lineSeparator();
		text += "ID del dise�o: "+String.valueOf(this.idDise�o) + System.lineSeparator();
		return text;
	}
	public String toString(){
		return String.valueOf(this.idCompra);
	}
}
