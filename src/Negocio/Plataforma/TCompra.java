package Negocio.Plataforma;

public class TCompra {
	private int idCompra;
	private int idUsuario;
	private String nombreUsuario;
	private int idDise�o;
	private String nombreDise�o;
	private int precio;
	
	public TCompra(int idCompra, int idUsuario,String nombreUsuario, int idDise�o,String nombreDise�o){
		this.idCompra=idCompra;
		this.idUsuario=idUsuario;
		this.nombreUsuario=nombreUsuario;
		this.idDise�o=idDise�o;
		this.nombreDise�o=nombreDise�o;
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
	public String getNombreUsuario(){
		return this.nombreUsuario;
	}
	public String getNombreDise�o(){
		return this.nombreDise�o;
	}
	
	public String listaToString(){
		String text = "";
		text += "ID de la compra: "+String.valueOf(this.idCompra) + System.lineSeparator();
		text += "ID del usuario: "+String.valueOf(this.idUsuario) + System.lineSeparator();
		text += "Nombre del usuario: "+this.nombreUsuario + System.lineSeparator();
		text += "ID del dise�o: "+String.valueOf(this.idDise�o) + System.lineSeparator();
		text += "Nombre del dise�o: "+this.nombreDise�o + System.lineSeparator();
		return text;
	}
	public String toString(){
		return String.valueOf(this.idCompra);
	}
}
