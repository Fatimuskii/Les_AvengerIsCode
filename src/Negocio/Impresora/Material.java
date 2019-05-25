package Negocio.Impresora;

public enum Material {

	ABS("ABS"), PAL("PAL"), PETG("PETG"), NYLON("NYLON");

	private String parameterName;

	private Material(String param) {
		parameterName = param;
	}

	public static Material parse(String param) {
		for (Material m : Material.values()) {
			if (m.parameterName.equals(param)) {
				return m;
			}
		}
		return null;
	}
	
	
}
