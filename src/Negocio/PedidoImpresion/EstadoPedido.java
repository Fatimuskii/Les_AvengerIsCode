package Negocio.PedidoImpresion;

public enum EstadoPedido {

	PEN("PENDIENTE"), PAG("PAGADO"), ENV("ENVIADO"), RECIB("RECIBIDO"),CANC("CANCELADO");

	private String parameterName;

	private EstadoPedido(String param) {
		parameterName = param;
	}

	public static EstadoPedido parse(String param) {
		for (EstadoPedido m : EstadoPedido.values()) {
			if (m.parameterName.equals(param)) {
				return m;
			}
		}
		return null;
	}

}
