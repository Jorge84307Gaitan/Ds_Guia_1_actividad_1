package actividad1;

public class Lacteo extends TipoProducto {

	private String mensaje;
	
	public Lacteo() 
	{
		this.mensaje = "Lacteos altos en Grasa";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
