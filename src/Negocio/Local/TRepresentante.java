package Negocio.Local;

public class TRepresentante {
	private int IdRepresentante;
	private String nombreCompleto; 
	private int tel; 
	private String email;
	
	
	public TRepresentante(int IdRepresentante, String nombreCompleto, int tel, String email){
		
		this.IdRepresentante= IdRepresentante;
		this.nombreCompleto=nombreCompleto;
		this.tel=tel;
		this.email=email;
	}
	
	public TRepresentante(String nombreCompleto, int tel, String email){
		this.nombreCompleto=nombreCompleto;
		this.tel=tel;
		this.email=email;
	}
	
	public int getIdRepresentante(){
		return IdRepresentante;
	}
	public String getNombreCompleto(){
		return nombreCompleto;
	}
	public int getTel(){
		return tel;
	}
	public String getEmail(){
		return email;
	}
}
