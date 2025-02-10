package actividad1;

public class Fruta extends TipoProducto {
		
	private String mensaje;
	
	public Fruta() 
	{
		this.mensaje = "Fratas altas en Vitamiana C";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
